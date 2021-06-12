# 	                                                                                                                   Master Test Plan

 

## Version Information

| **Version** | **Remarks**                                                  | **Author**     | **Date**   |
| ----------- | ------------------------------------------------------------ | -------------- | ---------- |
| 0.1         | Document Creation & Conversion                               | Naomi Thompson | 2021-04-20 |
| 0.2         | Change TOC to be auto generated                              | Sam Johnson    | 2021-04-24 |
| 1.0         | Revised Master Test Plan's Existing Risks, title and version info layout, & Included Some Additional Risks Added To The Revised Risk List | Naomi Thompson | 2021-06-06 |

 

## Executive summary

|                                                              |
| ------------------------------------------------------------ |
| **Project objective:**  Create a mobile application that can display data from sensors on the Clyde River and surrounding area. |
| **Test approach:**  Primarily Unit Testing on the code, some Integration and System testing will be necessary to be through and a decent number of User Acceptance Tests also. |
| **Test objectives:**  Risks: Application Crashes, Application Fails To Work, Water Quality Data is (Not Up To Date/Inaccurate/Displayed Incorrectly/Not Displayed At All), Location Setting Doesn't Work, Notifications Don't Work, Sensors aren't visible, Sensors aren't on a map. |
| **Outcomes:** The application does not crash, does not fail to work, Has Up to Date/Accurate/Displayed Data, Functions behave as intended, Sensors are visible and accessible & Notifications Are Handled Appropriately. |

 

## Table of Contents

[TOC]

# 1	Introduction

## 1.1	Project and project objective

A mobile application that takes data already being returned from sensors on the Clyde River and surrounding area and display it in a format that's much easier and nicer to understand. The application will interface with a pre-existing API supplied by the sponsor in order to access this data. The main aim is to take what already exists and just make it better, ie more accessible, user friendly and easier to understand and interpret. Also more practical for farmers in the field to use.

## 1.2	Objective of the master test plan

The objective of the Master Test Plan (MTP) is to inform all who are involved in the test process about the approach, the activities, including the mutual relations and dependencies, and the (end) products to be delivered.

The master test plan describes the test approach, the activities and (end) products.

# 2	Documentation

This chapter describes the documentation used in relation with the master test plan. The described documentation concerns a first inventory and will be elaborated, actualized and detailed at a later stage, during the separate test levels.

## 2.1	Basis for the master test plan

The following documents are used as basis for this master test plan.

| **Document  name**                                  | **Version** | **Date** | **Author**     |
| --------------------------------------------------- | ----------- | -------- | -------------- |
| risk-list.md                                        | 0.2         | 19-4-21  | Naomi Thompson |
| architecture-notebook.md                            | 1.0         | 19-4-21  | Ben Cummings   |
| project-plan.md                                     | 1.0         | 20-4-21  | Chris Clark    |
| project-vision.md                                   | 1.0         | 19-4-21  | Chris Clark    |
| Clyde River Mobile Application Requirement Model.md | 0.1         | 15-4-21  | Sam Johnson    |

## 2.2	Test basis

The test basis contains the documentation that serves as basis for the tests that have to be executed. The overview below describes the documentation that is the starting point for testing. 

| **Document  name**                                  | **Version** | **Date** | **Author**     |
| --------------------------------------------------- | ----------- | -------- | -------------- |
| Clyde River Mobile Application Requirement Model.md | 1.0         | 21-04-22 | Sam Johnson    |
| risk-list.md                                        | 1.0         | 21-05-28 | Naomi Thompson |
| architecture-notebook.md                            | 1.0         | 21-06-11 | Ben Cummings   |

# 3	Test strategy

The time available for testing is limited; not everything can be tested with equal thoroughness. This means that choices have to be made regarding the depth of testing. Also, it is strived to divide test capacity as effective and efficient as possible over the total test project. This principle is the basis of the test strategy.

The test strategy is based on risks: a system has to function in practice to an extent that no unacceptable risks for the organization arise from it. If the delivery of a system brings along many risks, thorough testing needs to be put in place; the opposite of the spectrum is also true: 'no risk, no test'.

The first step in determining the test strategy is the execution of a product risk analyses. This is elaborated in §3.1.

The test strategy is subsequently based on the results of the risk analyses. The test strategy lays down what, how and when (in which test level) is being tested and is focused in finding the most important defects as early as possible for the lowest costs. This can be summarized as testing with an optimal use of the available capacity and time. The test strategy is described in §3.3.

## 3.1	Risk analyses

### 3.1.1	Product Risk Analysis

The product risks are determined in cooperation with the client and the other parties involved. Product risks are those risks associated with the final product failing to meet functional requirements and required system quality characteristics (NFRs) This product risk analyses (PRA) is comprised of two steps:

 

| **Product Risk** | **Characteristic** | **Description**                                              | Probability | Impact | **Risk  Class** |
| ---------------- | ------------------ | ------------------------------------------------------------ | --------------- | --------------- | --------------- |
| 1              | Usability | Farmers unable to see if rainfall has exceeded the defined 24 hour limit | Medium | High | B |
| 2               | Usability               | The interface does not indicate when data is being retrieved | Medium       | Medium         | C              |
| 3               | Usability               | The interface does not filter erroneous and outlier data points | Low            | Medium         | D              |
| 4              | Usability               | The interface does not display graph information within 10 seconds | Medium         | Low            | D              |
| 5             | Usability | Farmers have to authenticate to see public sensors. | Low | Low | E |
| 6             | Accessibility | Farmers cannot access the application on Android and/or iOS devices | Low | Medium | D |
| 7              | Accessibility | The application cannot be used on phones and tablets | Low | Medium | D |
| 8              | Maintainability    | The application technology stack is not maintainable for staff employed at the Department of Primary Industries | Medium      | Medium | C               |
| 9 | Maintainability | The Application isn't maintainable | Medium | High | B |
| 10              | Maintainability    | The application is not highly available, durable, scalable, and cost effective | Low         | High   | C               |
| 11            | Maintainability | The application does not comply with and utilise Android/iOS design conventions and styles on Android/iOS devices respectively. | Low | Low | E |
| 12 | Security | Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | Low | Medium | D |
| 13 | Security | Inappropriately Configured IAM roles that allow unauthorized access to server-side resources | Medium | High | B |
| 14 | Security | The Simple Storage Service (S3) is misconfigured to allow unauthorized access | Low | High | C |
| 15 | Availability | AWS is Down or Otherwise Inaccessible | Low | High | C |
| 16 | Usability | Other types of data beyond water quality are not available (e.g. wind speed, rainfall etc) | Medium | Medium | C |

The extent of the risk (the risk class) is dependent on the chance of failure (how big the chance is that it goes wrong?) and it depends on the damage for the organization if it actually occurs.

Key:

- A = HH (High, High)
- B = HM (High, Medium), MH (Medium, High)
- C = MM (Medium, Medium), LH (Low, High), HL (High, Low)
- D = LM (Low, Medium), ML (Medium, Low)
- E = LL (Low, Low)

 

### 3.1.2	Technical Risk Analysis

Technical risks are determined in cooperation with the analyst/designers and programmers involved. Technical risks are development risks associated with failing to create a system that behaves according to specifications derived from requirements. (I.E. those aspects of development that pose particular challenges.) This technical risk analyses (TRA) is comprised of two steps:

 

| **Technical risk** | **Risk  Area**          | **Description**                                              | Probability | Impact | **Risk  Class** |
| ------------------ | ----------------------- | ------------------------------------------------------------ | ----------- | ------ | --------------- |
| 1                  | Usability               | Farmers unable to view the current salinity level recorded by a single water quality sensor or all water quality sensors | Medium      | High   | B               |
| 2                  | Usability               | Farmers unable to view the current temperature recorded by a water quality sensor | Medium      | High   | B               |
| 3                  | Usability               | Farmers unable to view the current temperature levels recorded by all water quality sensors in the estuary | Medium      | High   | B               |
| 4                  | Usability               | Farmers unable to view the salinity levels for a specified time period as recorded by a water quality sensor | Medium      | High   | B               |
| 5                  | Usability               | Farmers unable to view the temperatures for a specified time period as recorded by a water quality sensor | Medium      | High   | B               |
| 6                  | Usability               | Farmers unable to see if salinity has fallen below or exceed defined limits | Medium      | High   | B               |
| 7                  | Usability               | Farmers unable to see if rainfall has exceeded the defined 7 day limit | Medium      | High   | B               |
| 8                  | Usability               | Farmers unable to select a location/estuary                  | Medium      | Medium | C               |
| 9                  | Usability               | Farmers unable to view the precipitation for a specified time period as recorded for a location | Low         | Medium | D               |
| 10                 | Usability               | Farmers unable to view the current conditions (temperature, ‘feels like’ temperature, humidity, wind speed, wind gust, rain, light,  lightning strikes) for a location | Low         | Low    | E               |
| 11                 | Usability               | Farmers unable to see sensor locations on a map              | Low         | Low    | E               |
| 12                 | Usability Accessibility | The application does not adjust the interface to suit the device size and orientation | Low         | Low    | E               |
| 13                 | Security                | The application does not obfuscate the credentials used for authorising requests to APIs | Low         | High   | C               |
| 14                 | Maintainability         | The application does not integrate and utilise the FarmDecisionTech REST API | Low         | High   | C               |
| 15                 | Reliability             | Lambda functions fail to perform as expected due to an issue of some kind with them | Medium      | High   | B               |
| 16                 | Reliability             | React Native Charts Wrapper Library is no longer fit for purpose | Low         | Medium | D               |
| 17                 | Security                | Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | Low         | Medium | D               |
| 18                 | Security                | Inappropriately Configured IAM roles that allow unauthorized access to server-side resources | Medium      | High   | B               |
| 19                 | Security                | The Simple Storage Service (S3) is misconfigured to allow unauthorized access | Low         | High   | C               |
| 20                 | Availability            | Bitbucket goes down or otherwise becomes inaccessible        | Low         | High   | C               |
| 21                 | Availability            | The CodePipeline fails at the build/test servers and the application can't come through | Low         | High   | C               |
| 22                 | Availability            | AWS is Down or Otherwise Inaccessible                        | Low         | High   | C               |
| 23                 | Testability             | The CodePipeline fails due to poor testing and allows a dysfunctional version of the application through | Low         | High   | C               |

  Key:

- A = HH (High, High)
- B = HM (High, Medium), MH (Medium, High)
- C = MM (Medium, Medium), LH (Low, High), HL (High, Low)
- D = LM (Low, Medium), ML (Medium, Low)
- E = LL (Low, Low)



## 3.2	Test strategy

For each risk from the product and technical risk analysis the risk class determines the thoroughness of the test. Risk class A is the highest risk class and E the lowest. The test strategy is subsequently focused on covering the risks with the highest risk class as early as possible in the test project.

NOTE: 

- A = At least 1 \*\*\*\*\*
- B = At least 1 \*\*\*\*
- C = At least 1 \*\*\*
- D = At least 1 \*\*
- E = At least 1 \*

 

| Risk             | Description                                       | Risk Cat |      |      | Test Levels |      |      |      |
| ---------------- | ------------------------------------------------- | -------- | ---- | ---- | :---------- | ---- | ---- | ---- |
|                  |                                                   |          | SR   | Unit | Int         | FAT  | UAT  | ST   |
| Usability               | Farmers unable to see if rainfall has exceeded the defined 7 day limit | B               | \* | \*\*\*\* | \*\*\* |      | \* | \* |
| Usability | Farmers unable to see if rainfall has exceeded the defined 24 hour limit | B ||\*\*\*\*|\*\*||||
| Usability               | Farmers unable to see if salinity has fallen below or exceed defined limits | B               | \* | \*\*\*\* | \*\*\* |      | \* | \* |
| Usability               | Farmers unable to view the salinity levels for a specified time period as recorded by a water quality sensor | B               | \* | \*\*\* | \* |      |      | \*\*\*\* |
| Usability               | Farmers unable to view the current salinity level recorded by a single water quality sensor or all water quality sensors | B               | \* | \*\*\* | \** |      |      | \*\*\*\* |
| Usability               | Farmers unable to view the current temperature recorded by a water quality sensor | B               | \* | \*\*\* | \* |      |      | \*\*\*\* |
| Usability               | Farmers unable to view the current temperature levels recorded by all water quality sensors in the estuary | B               | \* | \*\*\* | \*\* |      |      | \*\*\*\* |
| Usability               | Farmers unable to view the temperatures for a specified time period as recorded by a water quality sensor | B               | \* | \*\*\* | \* |      |      | \*\*\*\* |
| Usability               | Farmers unable to select a location/estuary                  | C               | \*\* | \*\*\* |                    | \* | \* |      |
| Usability               | The interface does not indicate when data is being retrieved | C              |\*|\*\*\*||\*\*|||
| Usability | Other types of data beyond water quality are not available (e.g. wind speed, rainfall etc) | C |  | * | ** | | | *** |
| Usability               | The interface does not filter erroneous and outlier data points | D              |\*|\*\*||\*|||
| Usability               | The interface does not display graph information within 10 seconds | D              ||\*|\*\*|||\*\*|
| Usability               | Farmers unable to view the precipitation for a specified time period as recorded for a location | D               | \* | \*\* | \* |      |      |      |
| Usability | Farmers have to authenticate to see public sensors. | E ||\*|||\*||
| Usability               | Farmers unable to view the current conditions (temperature, ‘feels like’ temperature, humidity, wind speed, wind gust, rain, light,  lightning strikes) for a location | E               |             | \* | \* |      |      | \* |
| Usability               | Farmers unable to see sensor locations on a map              | E               | \* | \* | \* | \* | \* | \* |
| Usability Accessibility | The application does not adjust the interface to suit the device size and orientation | E               | \* | \* |                    | \* | \* |      |
| Accessibility | Farmers cannot access the application on Android/iOS devices | D |\*|\*|\*||\*\*|\*|
| Accessibility | The application cannot be used on phones and tablets | D |\*|\*|\*||\*\*|\*|
| Maintainability    | The application technology stack is not maintainable for staff employed at the Department of Primary Industries | C               |\*\*\*|||\*\*||\*|
| Maintainability    | The application is not highly available, durable, scalable, and cost effective | C               |\*\*\*|\*|\*||\*|\*|
| Maintainability         | The application does not integrate and utilise the FarmDecisionTech REST API | C               | \*\*\* |        |                    | \* | \*\*\* |      |
| Maintainability | The application does not comply with and utilise Android/iOS design conventions and styles on Android/iOS devices respectively | E |\*\*||||||
| Security | Inappropriately Configured IAM roles that allow unauthorized access to server-side resources | B |  |  | **** | | | *** |
| Security                | The application does not obfuscate the credentials used for authorising requests to APIs | C               | \* | \*\*\* | \*\* |      |      | \* |
| Security | The Simple Storage Service (S3) is misconfigured to allow unauthorized access | C |  |  | ** | | | *** |
| Security | Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | D | ** | ** | * | | | * |
| Reliability | Lambda functions fail to perform as expected due to an issue of some kind with them | B |  | **** | ** | | | * |
| Reliability | React Native Charts Wrapper Library is no longer fit for purpose | D | * |  |  | ** | |  |
| Availability | AWS is Down or Otherwise Inaccessible | C |  |  | * | | | *** |
| Availability | The CodePipeline fails at the build/test servers and the application can't come through | C |  |  | *** | | | * |
| Availability | Bitbucket goes down or otherwise becomes inaccessible | C |  |  | *** | | | * |
| Testability | The CodePipeline fails due to poor testing and allows a dysfunctional version of the application through | C | *** | ** | ** | | | * |


Legend for the table above:

| RC          | Risk class (from product and technical  risk analysis, where A=high risk, B=Medium-High risk, C=medium risk, D=Medium-Low risk, E=Low risk) |
| ----------- | ------------------------------------------------------------ |
| SR          | Static Review of the various  intermediary products (requirements, functional design, technical design). Checking and examining artefacts without executing the  software |
| Unit        | Unit test and Unit integration test                          |
| Integration | Integration tests (low level (L), high level(H))             |
| FAT         | Functional acceptance test (alpha stage UAT)                 |
| UAT         | User acceptance test (Beta stage UAT)                        |
| ST          | System test (functional scenario testing (F), system quality scenario testing (S)) |
| \*          | Limited thoroughness of the test                             |
| \*\*        | Low-Medium thoroughness of the test                          |
| \*\*\*      | Medium thoroughness of the test                              |
| \*\*\*\*    | Medium-High thoroughness of the test                         |
| \*\*\*\*\*  | High thoroughness of the test                                |
| <blank>     | If a cell is blank, it  means that the relevant test or evaluation level does not have to be concerned with the characteristic |

 

# 4	Test Levels

For this MTP the following test levels are acknowledged:

| **Test level**        | **Goal**                                                     |
| --------------------- | ------------------------------------------------------------ |
| Unit testing:         | The aim is to test each part of the software by separating it. It checks that component are fulfilling functionalities or not |
| Integration  testing: | In this testing  phase, different software modules are combined and tested as a group to make sure that integrated system is ready for system testing. Integrating testing checks the data flow from one module to other modules. |
| System testing:       | System testing is  performed on a complete, integrated system. It allows checking system's  compliance as per the requirements. It tests the overall interaction of components. It involves load, performance, reliability and security testing. |
| Acceptance  testing:  | Acceptance testing is a test conducted to find if the requirements of a specification or contract are met as per its delivery. |

 

## 4.1	The Unit Testing Level 

The primary goal of unit testing is to identify any issues if they exist and to otherwise give confidence in the quality and reliability of individual units of the application.

### 4.1.1	Entrance and Exit Criteria

Entry:

- Fleshed out, thorough, complete unit tests
- Set-up & Functioning Test Environment
- Sufficient Test Data Whether Real Or Fake

Exit:

- Tests provide sufficient coverage of the code
- All tests pass
- No identified critical bugs remain outstanding
- No defects remain unaddressed and open

### 4.1.2	Test Environment

A testing framework likely coupled with a mocking framework so that system components can be mocked. Further details still need to be worked out.

### 4.1.3	Test Objectives

| **Risk**                                                     | **Test Goals**                                               | **Risk Verification**                                        | **Schedule**                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| The interface does not filter erroneous and outlier data points | Ensure that the interface only displays accurate and relevant data points | That Appropriate methods are implemented into the application and are called by the interface | During implementation of the interface                       |
| The interface does not display graph information within 10 seconds | Ensure that the graph information is displayed within a reasonable and timely manner | Interface provides meaningful feedback and uses old data where new data cannot be obtained | During implementation of the interface                       |
| The interface does not indicate when data is being retrieved | Ensure the interface provides timely and meaningful feedback to the user about what it's doing | appropriate methods to give feedback and that the interface calls them | During implementation of the interface                       |
| Farmers unable to see if rainfall has exceeded the defined 24 hour limit | Ensure that farmers are able to access accurate and relevant rainfall data for a time period | Appropriate methods to calculate rainfall total and compare to 24 hour limit & that both are called | During implementation of the data management class           |
| Farmers have to authenticate to see public sensors.          | Ensure that public sensors are publicly accessible           | That the application can display graphs, sensors and maps without requiring a login, that the login method isn't prematurely called. | During implementation of the map/interface                   |
| Farmers cannot access the application on Android/iOS devices | Ensure that the application is platform compatible           | Check that the appropriate boilerplate code to compile to Android/iOS is present and used. | During initial implementation  of boilerplate code           |
| The application cannot be used on phones and tablets         | Ensure that the application is device/hardware compatible    | Check that the appropriate boilerplate code to compile to/run on mobile is present and used. That hardware is compatible | During initial implementation  of boilerplate code           |
| The application is not highly available, durable, scalable, and cost effective | Ensure that the application is durable, scalable and cost effective | Check that the application is accessible on demand as needed, is resilient to demand and has a flexible design and is cost effective at scale | During implementation of all parts                           |
| Farmers unable to select a location/estuary                  | Ensure farmers are able to select a location to get area specific and relevant data | Check appropriate methods are included and called, check values are stored | During implementation of the interface & location data.      |
| Farmers unable to view the current salinity level recorded by a single water quality sensor or all water quality sensors | Ensure that farmers are able to access accurate and relevant data from a sensor | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. | During implementation of the data management class           |
| Farmers unable to view the current temperature recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data from a sensor | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. | During implementation of the data management class           |
| Farmers unable to view the current temperature levels recorded by all water quality sensors in the estuary | Ensure that farmers are able to access accurate and relevant data from all sensors | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. | During implementation of the data management class           |
| Farmers unable to view the salinity levels for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. That a time period can be specified and is stored. That appropriate methods apply the time period to the data. | During implementation of the data management class           |
| Farmers unable to view the temperatures for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. That a time period can be specified and is stored. That appropriate methods apply the time period to the data. | During implementation of the data management class           |
| Farmers unable to view the current conditions (temperature, ‘feels like’ temperature, humidity, wind speed, wind gust, rain, light,  lightning strikes) for a location | Ensure that farmers are able to access accurate and relevant data from a nominated location | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. | During implementation of the data management class           |
| Farmers unable to view the precipitation for a specified time period as recorded for a location | Ensure that farmers are able to access accurate and relevant data from a nominated location | appropriate methods are included to access the FarmDecisionTech API and update the data, that said methods are called. That methods for displaying the data are present and called. That a time period can be specified and is stored. That appropriate methods apply the time period to the data. | During implementation of the data management class           |
| Farmers unable to see sensor locations on a map              | Ensure that farmers are able to access sensors by locating them on a map | appropriate methods to access and display stored info on sensors are implemented and called. | During implementation of the map/interface                   |
| Farmers unable to see if salinity has fallen below or exceed defined limits | Ensure farmers are able to access relevant salinity data to make informed decisions | appropriate methods to calculate salinity totals and compare them to limits, that said methods are called. That methods to display all that are included and called. | During implementation of the data management class & interface |
| Farmers unable to see if rainfall has exceeded the defined 7 day limit | Ensure farmers are able to access relevant rainfall data to make informed decisions | appropriate methods to calculate salinity totals and compare them to limits, that said methods are called. That methods to display all that are included and called. | During implementation of the data management class & interface |
| The application does not obfuscate the credentials used for authorising requests to APIs | Ensure that API credentials are appropriately handled to look after the system for all vested parties | Check that appropriate methods for obfuscating credentials are implemented and called by the application | During implementation of the data access and request classes |
| The application does not adjust the interface to suit the device size and orientation | Ensure that the application is broadly compatible with various devices for accessibility reasons | check that appropriate methods are implemented and called that determine device size and orientation and that then adjust the application interface appropriately | During implementation of the interface                       |
| Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | Ensure that at no point the credentials used for requests can be captured & accessed. | Check that other components are not able to access or interfere with API requests by ensuring that the credentials are appropriately obfuscated, methods for this are included and that access to requests are restricted to the necessary classes and objects only. | During implementation of the data access and request classes |
| Lambda functions fail to perform as expected due to an issue of some kind with them | Ensure the various lambda functions perform their required tasks individually. | Check that desired results are returned from each of the functions and that a typical use case can successfully run and interact with each of the functions and that the correct results are returned. | During implementation and post-implementation                |
| Other types of data beyond water quality are not available (e.g. wind speed, rainfall etc) | Ensure that other important data not related to water quality is available | Check that the methods to fetch the data are present and working, that the methods to update what is displayed are present and working. | During implementation of the data management class           |
| The CodePipeline fails due to poor testing and allows a dysfunctional version of the application through | Ensure that testing is adequate and coverage is sufficient to identify all bugs and defects. | Identify the areas where issues are present, review the test cases for those areas and/or test coverage for the areas and redo the testing as necessary | During implementation and post-implementation of the application |



## 4.2	The Integration  Testing Level 

The primary goal of Integration testing is to identify any issues if they exist and to otherwise give confidence in the quality and reliability of individual units of the application as they interconnect and work together to form larger blocks of the application.

### 4.2.1	Entrance and Exit Criteria

Entry:

- Successful completion of Unit testing
- Previous bugs that were identified have been addressed and closed.
- Test Cases are written.

Exit:

- Tests provide sufficient coverage of the code
- All tests pass
- No identified critical bugs remain outstanding
- No defects remain unaddressed and open

### 4.2.2	Test Environment

A testing framework likely coupled with a mocking framework so that system components can be mocked. Further details still need to be worked out.

### 4.2.3	Test Objectives

| **Risk**                                                     | **Test Goals**                                               | **Risk Verification**                                        | **Schedule**                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| The interface does not display graph information within 10 seconds | Ensure that the graph information is displayed within a reasonable and timely manner | check that other components aren't delaying the display of the graph data | During the implementation of the interface                   |
| Farmers unable to see if rainfall has exceeded the defined 24 hour limit | Ensure that farmers are able to access accurate and relevant rainfall data for a time period | check that other components aren't impacting data update and display as well as total rainfall calculations. | During the implementation of the interface & data management class |
| Farmers cannot access the application on Android/iOS devices | Ensure that the application is platform compatible           | check that other components aren't breaking the boilerplate code | During the initial implementation of boilerplate code        |
| The application cannot be used on phones and tablets         | Ensure that the application is device/hardware compatible    | check that other components aren't breaking the boilerplate code, making hardware compatibility | During the implementation of the interface & application     |
| The application is not highly available, durable, scalable, and cost effective | Ensure that the application is durable, scalable and cost effective | Check that the various components don't impact on each other's performance nor apply unnecessary restrictions. | Ongoing, Throughout all implementation                       |
| Farmers unable to view the current salinity level recorded by a single water quality sensor or all water quality sensors | Ensure that farmers are able to access accurate and relevant data from a sensor | Check that other components aren't interfering or impacting on the methods updating and displaying salinity levels | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the current temperature recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data from a sensor | Check that other components aren't interfering or impacting on the methods updating and displaying water temp levels | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the current temperature levels recorded by all water quality sensors in the estuary | Ensure that farmers are able to access accurate and relevant data from all sensors | Check that other components aren't interfering or impacting on the methods updating and displaying water temp levels | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the salinity levels for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | Check that other components aren't interfering or impacting on the methods updating and displaying water quality data, nor the imputed time period | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the temperatures for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | Check that other components aren't interfering or impacting on the methods updating and displaying water temp data, nor the imputed time period | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the current conditions (temperature, ‘feels like’ temperature, humidity, wind speed, wind gust, rain, light,  lightning strikes) for a location | Ensure that farmers are able to access accurate and relevant data from a nominated location | Check that other components aren't interfering or impacting on the methods updating and displaying other data points. | During the implementation of the interface & Data Management Classes |
| Farmers unable to view the precipitation for a specified time period as recorded for a location | Ensure that farmers are able to access accurate and relevant data from a nominated location | Check that other components aren't interfering or impacting on the methods updating and displaying rainfall data, nor the imputed time period | During the implementation of the interface & Data Management Classes |
| Farmers unable to see sensor locations on a map              | Ensure that farmers are able to access sensors by locating them on a map | Check that other components aren't interfering with methods to access and display sensor details | During the implementation of the interface & Map             |
| Farmers unable to see if salinity has fallen below or exceed defined limits | Ensure farmers are able to access relevant salinity data to make informed decisions | Check that other components aren't interfering with methods to get and compare to defined limits, check that other components aren't interfering with the defined levels | During the implementation of the interface & Data Management Classes |
| Farmers unable to see if rainfall has exceeded the defined 7 day limit | Ensure farmers are able to access relevant rainfall data to make informed decisions | Check that other components aren't interfering with methods to get and compare to defined limit, check that other components aren't interfering with the defined limit | During the implementation of the interface & Data Management Classes |
| The application does not obfuscate the credentials used for authorising requests to APIs | Ensure that API credentials are appropriately handled to look after the system for all vested parties | check that components aren't interfering with methods to obfuscate credentials | During the implementation of the login method                |
| Inappropriately Configured IAM roles that allow unauthorized access to server-side resources | Ensure that no IAM role can be exploited through inappropriate configuration | Check that no other components are able to exploit and take advantage of any of the IAM roles. | During the implementation of server-side resources           |
| The Simple Storage Service (S3) is misconfigured to allow unauthorized access | Ensure that the S3 bucket can't be accessed and exploited through inappropriate configuration | Check that no other components are able to exploit and take advantage of the access permissions for the S3 bucket and therefore gain access. | During the implementation of server-side resources           |
| Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | Ensure that at no point the credentials used for requests can be captured & accessed. | Check that other components are not able to access or interfere with API requests. | During implementation of the data access and request classes |
| Lambda functions fail to perform as expected due to an issue of some kind with them | Ensure the various lambda functions perform their required tasks together & with other system components. | Check that the Lambda function perform their required tasks when connected to each other and other system components. | During the implementation of server-side resources           |
| AWS is Down or Otherwise Inaccessible                        | Ensure that the server-side resources are accessible and that access is not hindered by other system components. | Check that other system components are not unexpectedly adversely impacted by the loss of access to server-side resources, ensure that other system components are able to create a valid albeit futile connection and function despite loss of server-side resources. | During the implementation of server-side resources           |
| The CodePipeline fails at the build/test servers and the application can't come through | Ensure that the build/test servers are online and working and are able to perform their requisite task. | Check that the build/test servers are able to connect with other system components successfully and without issue and that data transfer between components works. | During the implementation & post implementation of the application |
| Bitbucket goes down or otherwise becomes inaccessible        | Ensure that application development is not hindered by source code storage being unavailable. | Ensure that the loss of the source code repository does not undermine the functioning of the rest of the system and development process. | During the implementation & post implementation of the application as a whole |
| Other types of data beyond water quality are not available (e.g. wind speed, rainfall etc) | Ensure that other important data not related to water quality is available | Check whether other components are interfering with the functions that obtain this data as well as display it | During implementation of the data management class           |
| The CodePipeline fails due to poor testing and allows a dysfunctional version of the application through | Ensure that testing is adequate and coverage is sufficient to identify all bugs and defects. | Check that other system components are not temporarily altering key variables and conditions and thus causing the application to pass testing and allow a dysfunctional application through. Ensure that other system components aren't somehow modifying test cases. | During the implementation & post implementation of the application |


## 4.3	The System Testing Level 

The primary goal of System testing is to identify any issues if they exist and to otherwise give confidence in the quality and reliability of the application as a whole.

### 4.3.1	Entrance and Exit Criteria

Entry:

- Successful completion of Integration testing
- Previous bugs that were identified have been addressed and closed.
- Test Cases are written.

Exit:

- Application is compatible with hardware and software
- All tests pass
- No identified critical bugs remain outstanding
- No defects remain unaddressed and open
- Functional and Non-Functional Requirements have been addressed and met.

### 4.3.2	Test Environment

<Describe the test environment that will be used at this level of testing and the procedures used to carry out the testing.>

A testing framework likely coupled with a mocking framework so that system components can be mocked. Further details still need to be worked out.

### 4.3.3	Test Objectives

| **Risk**                                                     | **Test Goals**                                               | **Risk Verification**                                        | **Schedule**                                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| The interface does not display graph information within 10 seconds | Ensure that the graph information is displayed within a reasonable and timely manner | Check that other parts of the system aren't breaking the interface and graph methods | After Successful Unit & Integration Test, Post-Implementation |
| Farmers cannot access the application on Android/iOS devices | Ensure that the application is platform compatible           | Check that other parts of the system aren't breaking compatibility with the hardware | After Successful Unit & Integration Test, Post-Implementation |
| The application cannot be used on phones and tablets         | Ensure that the application is device/hardware compatible    | Check that other parts of the system aren't breaking the boilerplate code and interface | After Successful Unit & Integration Test, Post-Implementation |
| The application technology stack is not maintainable for staff employed at the Department of Primary Industries | Ensure that the application technology stack is maintainable for DPI employed staff in the long run | Ensure that the application technology stack doesn't become unwieldy, resource heavy, poorly documented or otherwise a monstrosity as a result of other parts of the system | After Successful Unit & Integration Test, Post-Implementation |
| The application is not highly available, durable, scalable, and cost effective | Ensure that the application is durable, scalable and cost effective | Ensure that the application technology stack doesn't become unwieldy, resource heavy, poorly documented or otherwise a monstrosity as a result of other parts of the system | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the current salinity level recorded by a single water quality sensor or all water quality sensors | Ensure that farmers are able to access accurate and relevant data from a sensor | Check that other parts of the system aren't breaking or interfering with methods to update & display water quality data | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the current temperature recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data from a sensor | Check that other parts of the system aren't breaking or interfering with methods to update & display water quality data | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the current temperature levels recorded by all water quality sensors in the estuary | Ensure that farmers are able to access accurate and relevant data from all sensors | Check that other parts of the system aren't breaking or interfering with methods to update & display water temperature data | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the salinity levels for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | Check that other parts of the system aren't breaking or interfering with methods to update & display water quality data, nor with the time period inputed | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the temperatures for a specified time period as recorded by a water quality sensor | Ensure that farmers are able to access accurate and relevant data for a nominated time period | Check that other parts of the system aren't breaking or interfering with methods to update & display water temperature data, nor with the time period inputed | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to view the current conditions (temperature, ‘feels like’ temperature, humidity, wind speed, wind gust, rain, light,  lightning strikes) for a location | Ensure that farmers are able to access accurate and relevant data from a nominated location | Check that other parts of the system aren't breaking or interfering with methods to update & display other data | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to see sensor locations on a map              | Ensure that farmers are able to access sensors by locating them on a map | Check that other parts of the system aren't breaking or interfering with methods to access & display sensor information on a map. | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to see if salinity has fallen below or exceed defined limits | Ensure farmers are able to access relevant salinity data to make informed decisions | Check that other parts of the system aren't breaking or interfering with methods to update & display salinity data as well as the defined limits | After Successful Unit & Integration Test, Post-Implementation |
| Farmers unable to see if rainfall has exceeded the defined 7 day limit | Ensure farmers are able to access relevant rainfall data to make informed decisions | Check that other parts of the system aren't breaking or interfering with methods to update & display rainfall data and defined limit | After Successful Unit & Integration Test, Post-Implementation |
| The application does not obfuscate the credentials used for authorising requests to APIs | Ensure that API credentials are appropriately handled to look after the system for all vested parties | Check that other parts of the system aren't breaking or interfering with methods to obfuscate credentials | After Successful Unit & Integration Test, Post-Implementation |
| Inappropriately Configured IAM roles that allow unauthorized access to server-side resources | Ensure that the IAM Roles Cannot be changed or exploited  to allow unauthorized access by any part of the system at any time | Check that the IAM roles can not be exploited at any point during normal operation of the system. | After Successful Unit & Integration Test, Post-Implementation |
| The Simple Storage Service (S3) is misconfigured to allow unauthorized access | Ensure that no part of the system has unauthorized access to the  S3 bucket during the course of normal operation | Check that the S3 bucket can only be accessed by the appropriate service at the appropriate time and that no other system components have access at any point during operation. | After Successful Unit & Integration Test, Post-Implementation |
| Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | Ensure that no other components of the system have access to the credentials and cannot read them at any time | Check that no System components can access the credentials when requests are made. Check that no system components are interfering with the requests and thus gaining access. Check that no system component has unobfuscated access to the credentials | After Successful Unit & Integration Test, Post-Implementation |
| Lambda functions fail to perform as expected due to an issue of some kind with them | Ensure that the lambda functions are not being broken by other system components | Check that function inputs are as desired and that function outputs are also as desired throughout normal operation of the system. Ensure that other system components are not interfering with the functions during operation. | After Successful Unit & Integration Test, Post-Implementation |
| AWS is Down or Otherwise Inaccessible                        | Ensure that the server-side resources are accessible and that access is not hindered by other system components. | Check that connections and requests are not hindered or interfered with by other system components during normal operation. Ensure the System is able to handle loss of access appropriately. | After Successful Unit & Integration Test, Post-Implementation |
| The CodePipeline fails at the build/test servers and the application can't come through | Ensure that other system components are not interfering with or hindering the data transfer to the build/test servers as well as the out from said servers. | Check that transfer from repository to build/test servers and results out is as expected and desired, check that other system components do not interfere with the process during normal operation. | After Successful Unit & Integration Test, Post-Implementation |
| Bitbucket goes down or otherwise becomes inaccessible        | Ensure that lack of access to the Bitbucket repository does not hamper development and testing of the wider system | Check that other system components are not adversely impacted by the unavailability of the Bitbucket repository during normal system wide operation and testing. | After Successful Unit & Integration Test, Post-Implementation |
| Other types of data beyond water quality are not available (e.g. wind speed, rainfall etc) | Ensure that farmers are able to access accurate and relevant data that isn't related to water quality. | Check that the non-water quality data fetching methods are present and working as desired. Ensure that no other system components are interfering with said functions. Repeat said checks with display methods for the same data. | After Successful Unit & Integration Test, Post-Implementation |
| The CodePipeline fails due to poor testing and allows a dysfunctional version of the application through | Ensure that testing is adequate and coverage is sufficient to identify all bugs and defects and that no other system components interfere with this testing. | Check that test cases cover all functional and relevant non-functional requirements, that all test cases pass during normal operation of the system, check that test input conditions and output conditions are not interfered with by other system components immediately before and after testing during normal operation. | After Successful Unit & Integration Test, Post-Implementation |


## 4.4	The Acceptance  Testing Level

The primary goal of Acceptance testing is to verify and validate that the application meets stakeholder and end user requirements, has the necessary functionality and behaves as the end users expect. 

### 4.4.1	Entrance and Exit Criteria

Entry:

- Successful completion of Unit, Integration & System Tests
- Previous bugs that were identified have been addressed and closed.
- Functional and Non-Functional Requirements have been addressed and met.
- Test Cases are written.

Exit:

- No critical defects remain unaddressed
- All tests pass
- Functional and Non-Functional Requirements have been met satisfactorily.
- Stakeholder/Management Sign-off

### 4.4.2	Test Environment

Primarily conducted through User Acceptance Test & Functional Acceptance Test Documents. Further details still need to be worked out.

### 4.4.3	Test Objectives

| **Risk**                                                     | **Test Goals**                                               | **Risk Verification**                                        | **Schedule**                                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------- |
| The interface does not filter erroneous and outlier data points | Ensure that the interface only displays accurate and relevant data points | Check that required functionality regarding filtering has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| The interface does not indicate when data is being retrieved | Ensure the interface provides timely and meaningful feedback to the user about what it's doing | Check that required functionality regarding feedback has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| Farmers have to authenticate to see public sensors.          | Ensure that public sensors are publicly accessible           | Check that required accessibility has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| Farmers cannot access the application on Android/iOS devices | Ensure that the application is platform compatible           | Check that required functionality & compatibility has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| The application cannot be used on phones and tablets         | Ensure that the application is device/hardware compatible    | Check that required compatibility has been implemented       | Post-Implementation, Before Handover         |
| The application technology stack is not maintainable for staff employed at the Department of Primary Industries | Ensure that the application technology stack is maintainable for DPI employed staff in the long run | Check that required functionality has been implemented and behaves as intended within acceptable bounds defined by the stakeholder | Post-Implementation, Before Handover         |
| The application is not highly available, durable, scalable, and cost effective | Ensure that the application is durable, scalable and cost effective | Check that required functionality has been implemented and behaves as intended and does not have spontaneous adversely impacted elements when under load, scaled and cost is reasonable | Post-Implementation, Before Handover         |
| Farmers unable to select a location/estuary                  | Ensure farmers are able to select a location to get area specific and relevant data | Check that required functionality has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| Farmers unable to see sensor locations on a map              | Ensure that farmers are able to access sensors by locating them on a map | Check that required functionality has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| Farmers unable to see if salinity has fallen below or exceed defined limits | Ensure farmers are able to access relevant salinity data to make informed decisions | Check that required functionality has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| Farmers unable to see if rainfall has exceeded the defined 7 day limit | Ensure farmers are able to access relevant rainfall data to make informed decisions | Check that required functionality has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| The application does not integrate and utilise the FarmDecisionTech REST API | Ensure that the application makes use of and integrates the existing FarmDecisionTech REST API | Check that required functionality has been implemented, is used and behaves as intended | Post-Implementation, Before Handover         |
| The application does not adjust the interface to suit the device size and orientation | Ensure that the application is broadly compatible with various devices for accessibility reasons | Check that required functionality has been implemented and behaves as intended | Post-Implementation, Before Handover         |
| React Native Charts Wrapper Library is no longer fit for purpose | Ensure that the React Native Wrapper Library is able to provide the requisite functionality and is compatible | Regularly check changelogs when updates are released, review functionality and documentation. | During & Post-Implementation Before Handover |