# Clyde River Dashboard: Technical Competency Demonstrator

## Introduction

This application has a very limited scope and does not represent the quality or functionality of the final application. It was developed solely to demonstrate our team's capability to:

1. Develop a [React Native](https://reactnative.dev/) application and use the [React Native for Web](https://necolas.github.io/react-native-web/) library (in addition to other tools such as [Babel](https://babeljs.io/) and [Webpack](https://webpack.js.org/)) to build it as a web single page application (SPA).
2. Interact with, and retrieve telemetry data from, the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) using the provided OAuth 2.0 client credentials.
3. Utilise infrastructure as code (within an [AWS CloudFormation](https://aws.amazon.com/cloudformation/) template) to deploy the application using an AWS resource stack (inclusive of [CloudFront](https://aws.amazon.com/cloudfront/) and [S3](https://aws.amazon.com/s3/)).
4. Automate the build and deploy processes via command line interface (CLI) scripting.

The final application will enhance and expand on the above by:

1. Building and deploying as a native application for major mobile platforms (Android and iOS).
2. Obfuscating the provided OAuth 2.0 client credentials via an intermediary API (developed using additional AWS resources, inclusive of [API Gateway](https://aws.amazon.com/api-gateway/) and [Lambda](https://aws.amazon.com/lambda/)) to prevent potential misuse by the end-user.
3. Increasing the maintainability of the infrastructure as code by utilising the [AWS Cloud Development Kit (CDK)](https://aws.amazon.com/cdk/).
4. Improving the automation of the build and deploy processes by utilising a continuous integration continuous delivery (CI/CD) pipeline comprised of [AWS CodePipeline](https://aws.amazon.com/codepipeline/) and [BitBucket](https://bitbucket.org/).
5. Registering, and directing end-users to, a custom domain name via [AWS Route 53](https://aws.amazon.com/route53/).
6. Utilising charts and graphs to display the telemetry data in a meaningful format which satisfies the defined use cases.

## Accessing the Application

The application has been deployed to: [https://d3or1vfatpya2v.cloudfront.net/](https://d3or1vfatpya2v.cloudfront.net/)

## Configuring the Development Environment

### Installing NodeJS, NPM, and Package Dependencies

The core packages ([react](https://www.npmjs.com/package/react), [react-dom](https://www.npmjs.com/package/react-dom), [react-native](https://www.npmjs.com/package/react-native), and [react-native-web](https://www.npmjs.com/package/react-native-web)) required to develop React Native applications are distributed via the [NodeJS package manager (NPM)](https://www.npmjs.com/). Due to this, the latest long term support (LTS) version of [NodeJS](https://nodejs.org/) needs to be downloaded and installed. Once this is done, verify that the installation was successful by executing the following commands within a CLI instance (such as Command Prompt for Windows or Bash for Linux/MacOS):

    $ node --version
    v14.16.1

    $ npm --version
    6.14.12

Whilst the previously mentioned core packages can be manually installed and managed, an alternate (and more convenient) approach is to utilise [Expo](https://expo.io/), which greatly simplifies the development, build, and deployment processes for cross-platform [React Native](https://reactnative.dev/) applications. It is installed as follows:

    $ npm install --global expo-cli

Once this is done, verify that the installation was successful by executing the following command within a CLI instance:

    $ expo --version
    4.4.3

Optionally, a local [HTTP server](https://www.npmjs.com/package/http-server) can be used to serve the bundled/packaged web SPA files for testing prior to deployment. It is installed as follows:

    $ npm install --global http-server

Once this is done, verify that the installation was successful by executing the following command within a CLI instance:

    $ http-server --version
    v0.12.3

At this point, the development environment has been appropriately configured to build the application.

### Installing Python and Package Dependencies

The package required to provision and manage AWS resources is distributed via the [Python package manager (PIP)](https://pypi.org/). Due to this, the latest version of [Python 3](https://www.python.org/) needs to be downloaded and installed. Once this is done, verify that the installation was successful by executing the following commands within a CLI instance:

    $ python --version
    python 3.9.4

    $ pip --version
    pip 21.0.1 ...

The [AWS CLI](https://pypi.org/project/awscli/) package is required. It is installed as follows:

    $ pip install awscli

(Note: it is generally considered best practice to install packages within isolated [virtual environments](https://docs.python.org/3/tutorial/venv.html), rather than globally.)

Once this is done, verify that the installation was successful by executing the following command within a CLI instance:

    $ aws --version
    aws-cli/1.19.57 ...

At this point, the development environment has been appropriately configured to deploy the application.

### Creating and Configuring an AWS Account

[Create a free-tier AWS account](https://portal.aws.amazon.com/billing/signup) and complete the verification process. Once this is done, log in to the [AWS console](https://console.aws.amazon.com/) and navigate to the [IAM security credentials](https://console.aws.amazon.com/iam/home#/security_credentials) webpage.

Expand the *access keys* section and select *create new access key*. Download the CSV (`*.csv`) key file and/or note the *access key ID* and *secret access key* values. Beyond this point, the *secret access key* value will be inaccessible, so if it's misplaced, the process will need to be repeated.

AWS configuration and credential files need to be created. To do this, execute the following command within a CLI instance:

    $ aws configure

When prompted, enter the values for the *access key ID* (as generated above), *secret access key* (as generated above), *default region* (set to `ap-southeast-2`), and *default output format* (leave blank).

An `.aws` directory and two associated files (`config` and `credentials`) will be created within the user's home directory (`%USERPROFILE%` for Windows or `~` for Linux/MacOS) for the `default` profile.

The previously set configuration and credential properties can be temporarily overridden by exporting/setting environment variables (`AWS_ACCESS_KEY_ID`, `AWS_SECRET_ACCESS_KEY`, `AWS_DEFAULT_REGION`, `AWS_DEFAULT_OUTPUT`, `AWS_CONFIG_FILE`, `AWS_SHARED_CREDENTIALS_FILE`, and `AWS_PROFILE`), which is convenient when provisioning and managing resources in different regions or for different profiles, but shouldn't be necessary for this project.

To verify that the configuration and credential files are functioning correctly, execute the following command within a CLI instance:

    $ aws sts get-caller-identity

If successful, "stringified" JSON containing the user ID, account ID, and Amazon resource name (ARN) will be returned. If unsuccessful, an error message (such as `InvalidClientTokenId` or `SignatureDoesNotMatch`) will be returned, indicating an issue with the *access key ID* and *secret access key* values.

At this point, the development environment has been appropriately configured to authenticate with AWS.

## Building the Application

Clone the version control repository for the application by executing the following command within a CLI instance:

    $ git clone https://johndoe@bitbucket.org/cclark55/itc303.git

(Note: replace `johndoe` with your [BitBucket](https://bitbucket.org/) username.)

An `itc303` directory will be created within the present working directory. Navigate to the root directory for the application by executing the following command within a CLI instance:

    $ cd itc303/demo/application

(Note: the directory structure may differ in the final application.)

Install the NPM package dependencies for the application by executing the following command (which references the `package-lock.json` file) within a CLI instance:

    $ npm ci

Open the configuration file for the application (`config.json`) and set values for the `clientId` and `clientSecret` properties. For example:

    $ cat config.json

    {
        "farmDecisionTech": {
            "baseUrl": "https://api.farmdecisiontech.net.au",
            "clientId": "johndoe",
            "clientSecret": "topsecret",
            "recordLimit": 50
        }
    }

(Note: the client credentials are generated via the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/).)

Build the application as a web SPA by executing the following command within a CLI instance:

    $ expo build:web

A `web-build` directory will be created containing the bundled/packaged files.

Optionally, the web SPA can be served and tested via a local HTTP server by executing the following command within a CLI instance:

    $ http-server web-build/

The web SPA can be accessed within a browser by navigating to: [http://localhost:8080](http://localhost:8080)

To terminate the local HTTP server, use the keyboard shortcut `CTRL+C` within the same CLI instance.

At this point, the application has been successfully built, packaged, and tested as a web SPA.