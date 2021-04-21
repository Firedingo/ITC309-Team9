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
