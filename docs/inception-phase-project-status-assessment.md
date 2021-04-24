# Inception Phase Project Status Assessment

## Table of Contents

[TOC]

## 1. Assessment against Objectives of the Inception Phase 

### 1.1 Do we know what we are trying to achieve?
The aim of the project is to develop a mobile application to provide quick and easy access to graphically represented climate data from IoT sensors. This is embodied in the completed Vision Document.
We understand the main functional requirements of the project which are:

- View Estuary Water Quality 
- View Environmental Conditions (CCRD) 
- View Sensor 
- View Sensor History 
- View Environmental History 
- View Rainfall Triggers 
- Set Current Location 
- Add Favourite Location 
- View Map of Locations 
- View Map of Sensors

This is shown in the completed Functional Requirement model embodied in the [Clyde River Mobile Application: Requirements Model](https://bitbucket.org/cclark55/itc303/src/develop/docs/requirements/Clyde%20River%20Mobile%20Application%20Requirement%20Model.md) document. 

We understand the main Non-Functional requirements of the project which are:

- The system will be publicly accessible.
- The system shall allow farmers to access the application on Android devices.
- The system shall allow farmers to access the application on iOS devices.
- The system should be usable on modern phones.
- The system should be usable on modern tablets.
- Farmers should not have to authenticate to see public sensors.
- The application will integrate and utilise the FarmDecisionTech REST API

This is shown in the completed Non-Functional Requirement model embodied in the [Clyde River Mobile Application: Requirements Model](https://bitbucket.org/cclark55/itc303/src/develop/docs/requirements/Clyde%20River%20Mobile%20Application%20Requirement%20Model.md) document. 

### 1.2 Do we know how we are going to achieve it?
We have a good idea of how we are going to achieve our aims.

The architecture will consist of a React Native client (i.e. front-end) application that will be deployed natively to major mobile platforms (i.e. Android and iOS) and as a web single page application (SPA) for non-mobile platforms. Additionally, a server (i.e. back-end) application will act as an intermediary API between the client and FarmDecisionTech REST API (and other third-party APIs, if required) to address security concerns. AWS resources (i.e. micro-services) will be heavily utilised throughout. The architecture is comprehensively covered within the architecture notebook document, and technical competency and feasibility has been demonstrated through a proof of concept.

We have a good understanding of the project specific risks facing our project and how we are going to deal with them. The risks are:

1. The Team lacks the required skills to deliver the project
2. The Application fails to work
3. The project fails to use the FarmDecisionTech API
4. The sensors on the Clyde River and surrounding areas go offline
5. The project malforms data received from the FarmDecisionTech API
6. The application displays no data from the FarmDecisionTech API
7. The application displays inaccurate data from the FarmDecisionTech API

Our evolving understanding of risks is shown in the ongoing risk list and discussed further below in Section 4.
We have a good understanding of how we are going to check that our application delivers the intended functionality and system properties. Our key areas of concern and the test strategies we will use to address these concerns are as follows:

1. Usability - Test Strategies will involve Static Reviews, Unit, Integration, System & Acceptance Testing
2. Maintainability - Test Strategies will involve Static Reviews, Unit, Integration System & Acceptance Testing
3. Security - Test Strategies will involve Static Reviews, Unit, Integration & System Testing
4. Accessibility - Test Strategies will involve Static Reviews, Unit & Acceptance Testing

This is shown in the completed Master Test Plan
We have a good understanding of the dependencies and likely completion times for different parts of the project. Target completion dates for key aspects of the project are as follows:

  - **6th June** Life Cycle Architecture Milestone (LCAM) and completion of Elaboration Phase 
  - **3rd September**  Initial Operation Capability Milestone (IOCM) and completion of Construction Phase 
  - **13th October** Product Release Milestone (PRM) and completion of Transition Phase / Project End 

This is shown in the Initial Project Plan.

### 1.3 Skills required
Our project requires skills using the following key tools and technologies:

- React Native application 
- Amazon Web Services (AWS) 
- FarmDecisionTech REST API. 
- BitBucket Source Code Repository 
- Jira Project Management Software 

We have demonstrated that we have the skills to use these technologies through the implementation of a technology competency demonstrator.


## 2. Deliverables
For each deliverable:
### 2.x <insert Document/Artefact name here>. 
`<identify any key points you wish to make about this particular deliverable>`
`<identify any issues encountered in producing the Document/Artefact, otherwise report as ‘No Issues’>`

### 2.1 Project Vision
The project vision proved challenging due to a large level of variation between the Assessment Outline, the provided template, and the textbook resource. Following the template guide and attempting a combination of the requirements listed in the subject outline and method provided in the textbook, the Project Vision is a best attempt. The project vision requires further work in the Elaboration phase to ensure the business case is clear.

### 2.2 Initial Requirement Model

The requirements model was difficult to complete due to a lack of a clearly defined scope. The project sponsor has given the team wide latitude with respect to the actual design of the application and seems interested in how the team decides to display information. As discussed in the following section, the lack of a clear design requirement for either a native mobile application, a web application usable on phones and tablets, or a single source application compiled to both native and web code.


### 2.3 Proposed Architecture

Whilst there were no major issues encountered whilst defining the architecture, it became evident after the initial sponsor meeting that the proposed project (i.e. mobile application to display telemetry data from the FarmDecisionTech REST API) was not the entire scope. Whilst the mobile application was a cornerstone of the project, the sponsor indicated the desire for it to be cross-platform compatible, and deployed and distributed as a native application for major mobile platforms (i.e. Android and iOS) and as a progressive web application for non-mobile platforms (i.e. Linux, MacOS, and Windows).

There were three suitable candidates for the cross-platform framework: Flutter, Ionic, and React Native. When looking solely at simplifying the development, deployment, and distribution processes, Ionic would have been the preference. However, due to the nature of the application (i.e. frequently updated telemetry data with associated computation of the document object model and rendering of the user interface), the performance benefits of React Native (in comparison to Ionic) were too advantageous to overlook, and the development paradigm and technologies maintained a familiarity that was lacking with Flutter.

Obfuscating the OAuth 2.0 client credentials used to authenticate requests to the FarmDecisionTech REST API created the requirement of implementing an intermediary API within the architecture. Whilst this increases the total complexity of the project, it also improves flexibility and security. Additionally, utilising AWS micro-services (which are inherently loosely-coupled) offers considerable benefits with regards to availability, scalability, and maintainability.

Overall, the chosen architecture is appropriate for the project and well within the technical capabilities of our team.

### 2.4 Risk List
No major issues were encountered with the risk list. That said it became clear as progress on the document was made that while many of the risks are easy enough to identify, they can really only be spoken about in broad generic terms, in part due to the lack of clarity around what's required explicitly.

There was a minor issue with the formatting and layout of the document itself and the markdown used to create it but after a short while it was able to be resolved.

### 2.5 Master Test Plan
No major issues were encountered with the master test plan. That said it became clear as progress on the document was made that while many of the risks & associated test plans are easy enough to identify, they can really only be spoken about in broad generic terms, in part due to the lack of clarity around what's required explicitly.

For example, it's easy enough to assume there will be a testing and likely mocking framework for the test environment but at this stage we can't be more specific about what is required.

There was a minor issue with getting the table of contents to render appropriately on Bitbucket.

### 2.6 Initial Project Plan
The project plan had to account for delays at the start of semester. As such the project is currently behind schedule. The plan has been updated and sprints during the Elaboration phases will be only 12 days, which is less convenient for scheduling sprint conclusion and assessments, however is necessary to ensure completion of the assessment by the end of semester.
The plan only covers a high-level overview of project objectives, however

### 2.7 Technical Competency Demonstrator

The technical competency demonstrator application successfully demonstrates the capabilities of our team with regards to developing a React Native application (and utilising build and packaging tools such as Babel and Webpack), interacting with (and retrieving telemetry data from) the FarmDecisionTech REST API, provisioning AWS resources via infrastructure as code, and automating the build and deployment processes via command line interface (CLI) scripting. Successful implementation of these major components of the proposed architecture is a significant milestone and indicates with high probability that our team will be able to realise the complete architecture.

At this stage, investigation and implementation is still required for the charting and graphing library, native mobile application deployment and distribution processes, intermediary API, and CI/CD pipeline, all of which will be addressed within the elaboration phase.

## 3. General Issues
For each issue

### 3.1 Team Communication
Whilst recognising the chaotic and delayed start to semester, and the external pressures (such as work, family, etc.) it remains important to keep the team updated on progress of work items. This is an ongoing issue to be monitored and discussed at team meetings.

### 3.2 Requirements
The stakeholders have given the team a large amount of freedom in determining the best solution. Whilst it is exciting to creatively develop a new product, there is a lot of information gathering necessary to determine the requirements. Unfortunately, due to the relatively short time frame of the Inception phases, this research was not thorough. Our understanding of the requirements has been a best guess effort based on publicly accessible information on the DPI websites, and our meeting with the stakeholder. Further clarification is needed to confirm our understanding of the requirements is correct. This is an ongoing issue to be raised in the team meeting and communicated with the stakeholders.

### 3.3 Potential lack of cohesiveness
Due to the rush to complete this overdue assessment there has potentially been inadequate discussion amongst the team to ensure tasks and documents are aligned. The documents all support each other and rely on the same information, and we have not taken due time to ensure we have a shared understanding of this information. This issue will be monitored as we develop improved versions of these documents during the Elaboration phase.


### 3.x `<insert Issue name here>`
`<identify any key points you wish to make about this particular non-deliverable-associated issue>`
`<say whether the issue is ongoing or resolved – if ongoing say what you are doing to monitor and manage it>`
## 4. Risks
For each risk (max 7)8

`<identify any key points you wish to make about this particular risk>`
`<state the mitigation strategy you are using to address the risk>`
`<say whether the risk is ongoing or resolved>`

### 4.1  The Team lacks the required skills to deliver the project
This would be by far the biggest risk. While some members have prior experience with mobile application development and AWS deployments, other team members have minimal to no experience and will therefore require time getting skilled up in order to help deliver the project.

This risk is likely to remain an ongoing risk for the duration of the project. Mitigation of this risk is therefore highly advisable. This will include upskilling team members, ensuring the application technology stack is compatible and appropriate thus allowing the project to be successfully delivered.

### 4.2  The Application fails to work

This risk is the second biggest risk the project faces. If the application fails to work then all the effort is for naught. This is likely to remain an ongoing risk. Therefore mitigation of this risk is highly advisable.

Mitigation of this risk will entail good definition of the scope of the project, regular testing, oversight and good communication between team members.

### 4.3  The project fails to use the FarmDecisionTech API

While this risk is highly unlikely to eventuate, the impact of it should it happen would be profound. This risk is likely to remain ongoing until development has been completed.

Mitigation of this risk will primarily involve good design documents, regular oversight meeting, communication with stakeholders and strong communication among team members. On top of this, regular testing with reference to the FarmDecisionTech API documentation is also highly recommended.

### 4.4  The sensors on the Clyde River and surrounding areas go offline

While this risk is unlikely to eventuate, it is not improbable as the sensors have previously been taken offline due to bushfires that have passed through the area in the past. Loss of sensor data would impact on a number of areas including testing.

This risk is likely to remain ongoing for the duration of the project also. In the event of this risk occurring, mitigation is not really an option, thus the response to this risk has been indicated as escalate risk as stated in the risk list. Primarily this is due to the fact the risk involves hardware external to the team and of which the team has no control over. Should the sensors remain offline over an extended period of time, the team should be prepared to generate data that can simulate data from the sensors for the purposes of testing.

### 4.5  The project malforms data received from the FarmDecisionTech API

This risk is of mild concern. By malform, it is to be inferred that the data returned by the FarmDecisionTech API is somehow modified such that it is no longer accurate. This could mean the data is altered and therefore inaccurate, the data is handled incorrectly and therefore the wrong data is displayed, the data is overridden by nothing and therefore nothing is displayed etc.

This is of concern as inaccurate or missing data will impact other parts of the project such as graphs displaying rainfall totals. Missing or inaccurate rainfall data would result in an inaccurate graph and therefore impact on business decisions taken by the farmers.

This is likely to remain an ongoing risk for the duration of development. Mitigation will involve clearly defined scope and requirements, ongoing regular testing, strong and clear communication between team and stakeholders & project supervisor oversight.

### 4.6  The application displays no data from the FarmDecisionTech API

This risk is closely tied up with "4.5  The project malforms data received from the FarmDecisionTech API" as well as "4.7  The application displays inaccurate data from the FarmDecisionTech API".

This risk is likely to remain an ongoing risk. What denotes this risk as an individual risk as opposed to being included with "4.5  The project malforms data received from the FarmDecisionTech API" exclusively is that the data received from the FarmDecisionTech API is not malformed by the project and yet still suffers from not being displayed. An example of this may be that the method to display the data is simply not called.

Mitigation of this risk is comparable to "4.5  The project malforms data received from the FarmDecisionTech API". Primarily entailing regular testing, consultation with stakeholders and strong and clear communication.

### 4.7  The application displays inaccurate data from the FarmDecisionTech API

This risk is closely tied up with "4.5  The project malforms data received from the FarmDecisionTech API" as well as "4.6  The application displays no data from the FarmDecisionTech API".

This risk is likely to remain an ongoing risk. What denotes this risk as an individual risk as opposed to being included with "4.5  The project malforms data received from the FarmDecisionTech API" exclusively is that the data received from the FarmDecisionTech API is not malformed by the project and yet still suffers from becoming inaccurate.

An example of this may be that the application caches multiple versions of updated data but the method that fetches the cached data for displaying fetches any of the cached data other than the latest instance. The displayed data would therefore be inaccurate. As mentioned above, this would impact on business decisions by the farmer.

Mitigation of this risk is comparable to "4.5  The project malforms data received from the FarmDecisionTech API". Primarily entailing regular testing, consultation with stakeholders and strong and clear communication.


## 5 Summary – Overall Project Progress
`<Summarise your progress against the aims of the Inception Phase>`
The project is currently behind schedule. The project plan has been updated to reflect shorter iterations to ensure the project can still be completed by the end of the course, however diligence is required to maintain this schedule.
`<Summarise the status of any ongoing issues>`  
Issues are mainly regarding project management, and will be discussed at the team meeting.   
`<Summarise the status of any ongoing risks>`
