# Clyde River Dashboard Project
## Project Plan

## 1. Introduction
This document will outline the plan for completion of the Clyde River app project. We have been commissioned by the NSW Department of Primary Industries to develop a mobile application to display publicly available data from IoT sensors.

## 2. Project Organisation
This project will be completed by students of the ITC303/309 Software Development subjects. The members of "Team 2" are;
- Chris Clark cclark55@postoffice.csu.edu.au
- Benjamin Cummings bsk888@postoffice.csu.edu.au
- Sam Johnson sjohns85@postoffice.csu.edu.au
- Naomi Thompson nthomp10@postoffice.csu.edu.au 

We will meet a minimum of once per week at a scheduled time, with the possibility of additional meetings on an ad-hoc basis as required. In addition, we will have a fortnightly progress and update meeting the our project supervisor. Communication with the stakeholder will occur on an *as needed* basis with the possibility of scheduled recurring meetings if desired or required. 

The team will maintain contact through the Discord application for community communication. Supervisor meetings will occur using the CSU instance of Zoom videoconferencing, and our stakeholder meetings will occur through Microsoft Teams.

## 3. Project practices and measurements 
This project will follow the Unified Process development methodology. This methodology sits between waterfall and agile, and is defined by four phases. Inception, Elaboration, Construction, and Transition.

* Inception: creating the concept of what the project will achieve, and demonstrating the team has the competency to achieve it.
* Elaboration: creating and validating an architecture and design to support implementation.
* Construction: developing and testing the majority of project software.
* Transition: demonstrating that the product is fit-for purpose and handing the product over for use and maintenance in a production environment.

We intend to operate an Agile method within the Unified Process and will conduct iterations (sprints) of two weeks each. In addition to this Project Plan, we will develop an Iteration Plan for each sprint, and will conduct an assessment at the end of each iteration. We will manage and report each iteration using the *Jira Issue and Project Tracking* software. We will manage our source code repository with *BitBucket* which has integration with *Jira*.

The timeline for this project is dictated by the university semester, and the project must be completed prior to the end of Semester 2 around 11th October 2021. 

## 4. Deployment
Source code will be held in an Atlassian BitBucket version control repository, and Amazon Web Services (AWS) CodePipeline will be used as the CI/CD pipeline, which will automate the build, test, and deployment processes.

The application will be deployed to AWS and will utilise a number of their services to ensure reliable, secure, and efficient operation.
Amazon Web Services (AWS) will be utilised as the IaaS/PaaS provider. Route 53 will be used to register the custom domain name (to be determined) and create a domain name system (DNS) alias record to associate the CloudFront distribution. CloudFront will be used as the content delivery network (CDN), 
S3 will be used as the CloudFront origin and storage medium for the dashboard SPA, which is configured with redundancy that is automatically repaired when degradation of data integrity is detected and is able to accommodate at minimum 5,500 fetch requests per second (and more with performance optimisation techniques). API Gateway will be used to create an intermediary REST API which is utilised by the dashboard SPA. 
Lambda functions will be used for business logic and data operations and attached to the API Gateway endpoints. CloudFormation and the associated Cloud Development Kit (CDK) will be used to automate the provisioning of resources via infrastructure as code, which eliminates the manual process of doing so through the AWS console or command line interface.

Further investiation will be required to determine how updates will be deployed to native apps.

## 5. Project milestones and objectives
The schedule for iterations in the Elaboration Phase consist of 12-day sprints to remediate delays at the start of semester. The schedule for other iterations may evolve as more information becomes available in the Elaboration Phase.


| Subject    | Phase        | Iteration | Dates         | Primary Objectives                                                                                                                                                                                                                                                                                                                                         |
|------------|--------------|-----------|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ITC303     | Inception    | I-1       | 13/03 - 06/04 | Establish Vision. Establish Initial Use Case Model. Complete Preliminary Non-functional Requirement Analysis. Identify/Document Candidate Architectures. Establish Version Control.                                                                                                                                                                        |
|            |              | I-2       | 07/04 - 20/04 | Establish Risk List. Complete Full Description for Critical Core Risky Difficult (CCRD) Use Case - View Environmental Conditions. Implement Technical Competency Demonstrator. Create Test Plan. Establish Initial Project Plan. Deliver Life Cycle Objectives Milestone (LCOM). Complete Inception Phase Project Assessment.                                                              |
|            | Elaboration  | E-1       | 21/04 - 02/05 | Highest Priority Risks: Ensure team members are adequately skilled in the chosen technology (React Native). Mitigate Highest Priority Risk(s). Implement Highest Priority Architectural Element(s) to Support View Environmental Conditions (CCRD Use Case). Complete Development Testing for Highest Priority Architectural Element(s).                                                                                                                                                                 |
|            |              | E-2       | 03/05 - 13/05 | 2nd Highest Priority Risks: Ensure architecture deploys correctly and API can be accessed. Mitigate 2nd Highest Priority Risk(s). Implement 2nd Highest Priority Architectural Element(s) to Support View Environmental Conditions (CCRD Use Case). Complete Development and Integration Testing for 2nd Highest Priority Architectural Element(s).                                                                                                                                   |
|            |              | E-3       | 14/05 - 25/05 | 3rd Highest Priority Risks: *See risk list*. Mitigate 3rd Highest Priority Risk(s). Implement 3rd Highest Priority Architectural Element(s) to Support View Environmental Conditions (CCRD Use Case). Complete Development and Integration Testing for 3rd Highest Priority Architectural Element(s). Deploy Executable Architecture in Trial Environment Complete Internal User Acceptance Testing for CCRD Use Case in Trial Environment.|
|            |              | E-4       | 26/05 - 06/06 | Contingency. Deliver Life Cycle Architecture Milestone (LCAM). Complete Elaboration Phase Project Assessment.                                                                                                                                                                                                                                              |
| ITC309     | Construction | C-1       | 10/07 - 23/07 | 2nd Highest Prioirty Use Cases: View Estuary Water Quality, and View Sensor. Implement 2nd Highest Priority Use Case(s).  Complete Development and Integration Testing for 2nd Highest Priority Use Case(s). Complete Internal User Acceptance Testing for 2nd Highest Priority Use Case(s).                                                                                                                                             |
|            |              | C-2       | 24/07 - 06/08 | 3rd Highest Priority Use Cases: View Sensor History, View Environmental History, and View Rainfall Triggers. Implement 3rd Highest Priority Use Case(s). Complete Development and Integration Testing for 3rd Highest Priority Use Case(s). Complete Internal User Acceptance Testing for 3rd Highest Priority Use Case(s).                                                                                                                                             |
|            |              | C-3       | 07/08 - 20/08 | 4th Highest Priority Use Cases: Set Current Location, Add Favourite Location, View Map of Locations, and View Map of Sensors. Implement 4th Highest Priority Use Case(s). Complete Development and Integration Testing for 4th Highest Priority Use Case(s). Complete Internal User Acceptance Testing for 4th Highest Priority Use Case(s).                                                                                                                                             |
|            |              | C-4       | 21/08 - 03/09 | Contingency. Deliver Initial Operation Capability Milestone (IOCM). Complete Construction Phase Project Assessment.                                                                                                                                                                                                                                        |
|            | Transition   | T-1       | 04/09 - 17/09 | Deploy Application in Trial Environment. Complete 1st Round External User Acceptance Testing. Resolve Any Identified Issues.                                                                                                                                                                                                                               |
|            |              | T-2       | 18/09 - 01/10 | Complete 2nd Round External User Acceptance Testing. Resolve Any Identified Issues.                                                                                                                                                                                                                                                                        |
|            |              | T-3       | 02/10 - 13/10 | Contingency. Deliver Product Release Milestone (PRM). Complete Final Project Assessment.                                                                                                                                                                                                                                                                   |