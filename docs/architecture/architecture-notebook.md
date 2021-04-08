# Architecture Notebook

## Executive Summary

The key goal of the Clyde River Dashboard project is to process device and sensor telemetry data (which relates to the environmental characteristics of the estuaries and surrounding areas) and display it in a meaningful format for oyster farmers to facilitate their operations. To achieve this, the proposed application will be cross-device and cross-platform compatible, and designed and developed to be intuitive for the end-user. This document details the supporting architecture.

## Architectural Goals and Philosophy

* The dashboard will be publicly accessible and the end-user will not have to authenticate by providing security credentials.
* The dashboard will be intuitive for the end-user.
* The dashboard will display the device and sensor telemetry data in a meaningful format and expand on the capabilities of the [existing dashboard](https://www.farmdecisiontech.net.au/clyde-river-dashboard/).
* The dashboard may provide additional telemetry data (e.g. tide heights and times, weather forecasts, etc.).
* The dashboard will visually indicate when the telemetry data is being requested and processed, and will gracefully handle unsuccessful requests (e.g. exceeded quota, failed authorisation, timeout, etc.).
* The dashboard will display cached telemetry data (if available) when internet connectivity is unavailable on the end-user's device.
* The dashboard will filter erroneous and outlier data points.
* The dashboard theme will be consistent with other Department of Primary Industries and NSW Government applications and products.
* The dashboard layout will be responsive and progressively enhanced based on the capabilities, resolution, and scale of the end-user's device.
* The dashboard theme and and associated components will be adaptive to be consistent with the platform of the end-user's device.
* The dashboard will be distributed as a web application that is accessible on any device with a modern web browser.
* The dashboard will be distributed as a compiled native application for mobile platforms (i.e. Android and iOS) that is accessible on associated phone and tablet devices.
* The dashboard will integrate and utilise the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/).
* The dashboard will obfuscate the client credentials (OAuth 2.0) used for authorising requests to the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/).
* The dashboard will be performant and reduce latency regardless of the end-user's location.
* The dashboard will be highly available, durable, scalable, and cost effective.
* The dashboard build and deployment processes will be automated.
* The dashboard technology stack will be maintainable for staff employed at the Department of Primary Industries.

## Assumptions and Dependencies

* The dashboard assumes that the end-user's device will have internet connectivity (according to Telstra's network coverage map, the Clyde River area has extensive 3G and 4G coverage, as well as partial 5G coverage).
* The dashboard assumes that the end-user has limited technical capabilities, but has a basic understanding of how to operate their device (e.g. using touch gestures).
* The dashboard depends on the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) to provide the device and sensor telemetry data.
* The dashboard depends on third-party APIs to provide additional telemetry data (e.g. tide heights and times, weather forecasts, etc.).
* The dashboard development process depends on the project team being familiar with the fundamentals of mobile and web application development.

## Architecturally Significant Requirements

* The dashboard will be publicly accessible and the end-user will not have to authenticate by providing security credentials. This will limit the device and sensor telemetry data to what is available within the public domain (i.e. any user-specific devices and sensors will be excluded).
* The dashboard will display the device and sensor telemetry data in a meaningful format and expand on the capabilities of the [existing dashboard](https://www.farmdecisiontech.net.au/clyde-river-dashboard/). This will require a charting/graphing library that is able to display the data sets as forecasts, relationships, time-series, and so on.
* The dashboard will provide additional telemetry data (e.g. tide heights and times, weather forecasts, etc.). This will require integrating and utilising third-party APIs (in addition to the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/)). Resultingly, any upstream issues (i.e. faults, outages, etc.) will need to be accounted for and appropriately handled.
* The dashboard will display cached telemetry data (if available) when internet connectivity is unavailable on the end-user's device. This will require the use of service workers.
* The dashboard will filter erroneous and outlier data points. This will require processing (i.e. validating, sanitising, and removing) the device and sensor telemetry data retrieved from the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) in accordance with business rules that dictate the valid range of values.
* The dashboard layout will be responsive and progressively enhanced based on the capabilities, resolution, and scale of the end-user's device. This will require device specification detection and associated styling rules (e.g. media queries and defined breakpoints).
* The dashboard will be distributed as a web application that is accessible on any device with a modern web browser, as well as a compiled native application for mobile platforms (i.e. Android and iOS) that is accessible on associated phone and tablet devices. This will require maintaining separate platform-specific codebases or utilising a framework that is compatible with (and can compile for) multiple platforms.
* The dashboard will integrate and utilise the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/). This will require the `content-type` to be JSON (i.e. `application/json`) for associated requests and responses. Additionally, any upstream issues (i.e. faults, outages, etc.) will need to be accounted for and appropriately handled.
* The dashboard will obfuscate the client credentials (OAuth 2.0) used for authorising requests to the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/). This will require an intermediary back-end (i.e. server-side) application that acts as a proxy between the dashboard single page application (SPA) and the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) (and, possibly, third-party APIs), as the client credentials (and the associated bearer access token used within the `authorization` request header) cannot otherwise be obfuscated due to the untrusted nature of front-end (i.e. client-side) applications.
* The dashboard will be performant and reduce latency regardless of the end-user's location. This will require deployment to a content delivery network (CDN) which comprises of multiple data centres located within geographically distinct regions and has caching capabilities.
* The dashboard will be highly available, durable, scalable, and cost effective. This will require a load balancer that evenly distributes the traffic between a group of application instances that can be horizontally scaled on-demand. Additionally, the storage medium will need to be configured with redundancy that is automatically repaired when degradation of data integrity is detected.
* The dashboard build and deployment processes will be automated. This will require utilising an infrastructure as a service (IaaS) or platform as a service (PaaS) provider, which will facilitate the provisioning of resources through infrastructure as code, version control, and continuous integration continuous deployment (CI/CD) pipelines.
* The dashboard technology stack will be maintainable for staff employed at the Department of Primary Industries. This will require the use of common programming and markup languages, frameworks, and technologies that are widely adopted within the industry and have been sufficiently documented and supported.

## Decisions, Constraints, and Justifications

**Decision #1:** Amazon Web Services (AWS) will be utilised as the IaaS/PaaS provider, who offers the following benefits and services:
* On-demand (i.e. pay as you go) pricing with no upfront costs and free fetch requests between AWS resources, which improves cost effectiveness.
* Micro-service architecture that is loosely coupled, which improves maintainability.
* Route 53 will be used to register the custom domain name (to be determined) and create a domain name system (DNS) alias record to associate the CloudFront distribution.
* CloudFront will be used as the content delivery network (CDN), which is comprised of a global network of [edge locations](https://aws.amazon.com/cloudfront/features/#Global_Edge_Network) and improves performance by reducing latency (regardless of the end-user's location), minimising requests to the origin by utilising a caching layer and collapsing requests, and automatically scaling based on traffic fluctuations.
* Certificate Manager will be used to create and attach the secure sockets layer (SSL) certificate to the CloudFront distribution, facilitating secure network communications via HTTPS.
* S3 will be used as the CloudFront origin and storage medium for the dashboard SPA, which is configured with redundancy that is automatically repaired when degradation of data integrity is detected and is able to accommodate at minimum 5,500 fetch requests per second (and more with performance optimisation techniques).
* API Gateway will be used to create an intermediary REST API which is utilised by the dashboard SPA. This allows the client credentials (and the associated bearer access token used within the `authorization` request header) for the [FarmDecisionTech REST API](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) (and third-party APIs) to be obfuscated from the end-user.
* Lambda functions (which can be developed in numerous programming languages, but will use JavaScript for consistency and maintainability) will be used for business logic and data operations and attached to the API Gateway endpoints.
* CloudFormation and the associated Cloud Development Kit (CDK) will be used to automate the provisioning of resources (as detailed above) via infrastructure as code, which eliminates the manual process of doing so through the AWS console or command line interface (CLI).
* CodePipeline will be used as the CI/CD pipeline, which will automate the build, test, and deployment processes.

**Justification #1:** As an alternative to AWS, a virtual private server (VPS) provider could have been opted for. However, doing so would incur upfront costs and require careful analysis of the projected usage (with regards to storage capacity and network traffic) for the application, which could be detrimental to cost effectiveness, availability, and scalability if the analysis is inaccurate. Additionally, the provisioning and management of resources would be more time consuming, shifting the focus away from the development efforts (which are paramount).

**Decision #2:** Atlassian BitBucket will be utilised for the version control repository, which offers the following benefits:
* Free private repositories.
* Integration with Atlassian Jira for project management and issue tracking.
* Compatibility with AWS CodePipeline as part of the CI/CD pipeline.

**Justification #2:** As an alternative to Atlassian BitBucket, AWS CodeCommit or GitHub could have been opted for. However, the Atlassian product suite is tightly integrated and is familiar to the project team.

**Decision #3:** React Native will be utilised as the framework for the dashboard SPA, which offers the following benefits:
* Ability to compile an application for mobile platforms (i.e. Android and iOS, both with native components) and web.
    * The [React Native Web](https://github.com/necolas/react-native-web) library is required to build the web application.
    * The [React Native Charts Wrapper](https://github.com/wuxudong/react-native-charts-wrapper) library will be used for charts and graphs.
* Based on JavaScript and uses a paradigm similar to web development, which improves maintainability.
* Uses asynchronous requests and callback functions to prevent blocking the main UI thread.
    * For requests, the `content-type` header needs to be set to `application/json` and the body needs to be "stringified" JSON.
    * For responses, the body needs to be parsed JSON.
* Widely adopted within the industry with good quality documentation.

**Justification #3:** As an alternative to React Native, Flutter or Ionic could have been opted for. However, the former uses niche technologies (such as Dart) and lacks native components for mobile platforms, where as the latter isn't as performant due to rendering via a web view component (essentially, an embedded/integrated web browser).

**Decision #4:** The dashboard theme will comply with colour, typography, and style guidelines provided by the NSW Government and the Department of Primary Industries.

**Justification #4:** This will improve the user experience by creating consistency between the dashboard and other Department of Primary Industries applications and products.
