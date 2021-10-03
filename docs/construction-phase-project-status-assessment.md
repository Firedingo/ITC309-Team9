# Construction Phase Status Assessment

## Version History

| Version | Change              | Author         | Date       |
| ------- | ------------------- | -------------- | ---------- |
| 0.1     | Document Creation   | Naomi Thompson | 2021-09-21 |
| 1.0     | Document Completion | Naomi Thompson | 2021-10-04 |

# Table of contents

- [Construction Phase Status Assessment](#construction-phase-status-assessment)
- [Version History](#version-history)
- [Table of contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Executive Summary](#executive-summary)
  - [Key System Qualities & Functionality](#key-system-qualities--functionality)
    - [System Qualities](#system-qualities)
    - [Functional Requirements](#functional-requirements)
  - [1. Deliverables](#1-deliverables)
    - [1.1 Beta Ready Version Of The Product](#11-beta-ready-version-of-the-product)
    - [1.2 Supporting Test Evidence](#12-supporting-test-evidence)
      - [1.2.1 Functional Acceptance Tests](#121-functional-acceptance-tests)
      - [1.2.2 System Quality Scenarios](#122-system-quality-scenarios)
    - [1.3 Beta Test Materials](#13-beta-test-materials)
    - [1.4 User Manual](#14-user-manual)
  - [2. Iterations](#2-iterations)
    - [2.1 Construction Iteration 1](#21-construction-iteration-1)
    - [2.2 Construction Iteration 2](#22-construction-iteration-2)
    - [2.3 Construction Iteration 3](#23-construction-iteration-3)
    - [2.4 Construction Iteration 4](#24-construction-iteration-4)
  - [3. General Issues](#3-general-issues)
    - [3.1  <General Issue 1 – identify prioritised general issues if any>](#31--general-issue-1--identify-prioritised-general-issues-if-any)

## Introduction

The key aims of the Construction Phase are to:

- Develop the product to be sufficiently stable and mature that it can be deployed in the user community for beta user acceptance testing.
- Demonstrate that all planned functionality has been developed by successfully passing alpha stage functional acceptance testing and key system quality scenario testing.
- Produce a user manual to support beta testing
- Develop test materials to support beta testing

Achievement of these aims is embodied in the deliverables of the Initial Operational Capability Milestone. IOCM is achieved by:

1. Developing and deploying 'beta ready' version of the final application that embodies:

> *“feature complete, no known bugs”.*

The beta ready version of the application demonstrates that all intended functionality is complete and ready for end user acceptance testing to the best of the development team’s knowledge.

2. Providing supporting test evidence to justify an assertion that IOCM has been achieved.
3. Preparing test materials to support beta testing and analyse the results.
4. Delivering an attractive and informative user manual to support beta testing and eventual production operation of the application by end users.

This report assesses current project progress against these outcomes. It also summarises progress and issues faced during each iteration of the Construction Phase.

## Executive Summary

- Is the product ready for beta testing? 
- Is there a suite of functional acceptance test results that justifies that assertion?
- Is there a user manual ready?
- Are beta test materials and feedback forms available?

## Key System Qualities & Functionality

Initial requirement analysis identified the following critical and significant system quality and functional requirements:

### System Qualities

\1.    <identify high priority system qualities (NFRs) >

- The application shall allow farmers to access the application on desktop
- The application should comply with and utilise Java design conventions, styles and best practices.
- The application should be usable on desktop computers.
- The application should reliably display graph information
- The application should reliably read data from a file

<briefly summarise status of NFRs>

More or less the high priority NFRs have been met. Some polish is still required to ensure that the reliability of some functionality is consistent but it is mostly there.

### Functional Requirements

\1.    <identify high priority functional requirements (Use cases)>

- The system shall allow farmers to view the current salinity level recorded by a water quality sensor.
- The system shall allow farmers to view the current temperature recorded by a water quality sensor.
- The system shall allow farmers to view the precipitation for a specified time period as recorded for a location.
- The system shall read/write data from a file

< briefly summarise status of use cases>

Most of the use cases consist of the user being able to view data which is in turn read from files. In a very limited capacity the use case may consist of writing to a file instead of reading from the file. All other remaining cases are navigational based.

File reading/writing is functioning and data graphing is also working, some polish is still needed with connecting the two.

There is however no time range function but it is also a lower priority item to be implemented.

<Very briefly summarise the status of the key deliverables for the Construction Phase>

The Key deliverables for the Construction Phase consist of:

- A functionally complete, bug free application
- Adequate Testing that supports the application moving into beta testing
- A user manual that supports the aforementioned beta testing
- A Project Status Assessment

#### The Application

The application is not functionally complete but could be said to have major functionality as required to be deemed fit for purpose. The application has a number of minor things and polish that still needs to be completed.

To the best of the team's ability, the application is deemed to be bug free at this stage. This is supported by a number of the unit tests that have been written to verify that the application is meeting the functional requirements in a bug free way.

#### Testing



#### User Manual

The user manual is functionally complete at this stage. A number of screenshots still need to be added and it is likely some of the content will be reworked on feedback but the user manual should be sufficient with its written instructions on how to do things and it should therefore be adequate to support beta testing at this stage.

For a good well rounded user manual, it will need the requisite screenshots to be added to the troubleshooting section. No screenshots are missing from the "how to" section of the manual. Some minor instruction on installation and configuration will need to be added but at this stage the application needs some work still to be able to speak specifically on that front.

#### Project Status Assessment

The project status assessment has been successfully completed. It provides a reasonably detailed although brief look at the project as it stands at the end of the construction phase.

It addresses identified and known functional and non-functional requirements, ongoing project risks, current deliverables and a reflection on the iterations that have passed including any issues that have arisen.

<Very briefly summarise any remaining risks faced by the project and their current status>

#### Ongoing Risks

Ongoing risks that impact the project consist of the following:

|  ID  |                         Risk                         |    Status     |
| :--: | :--------------------------------------------------: | :-----------: |
|  1   | The team lacks adequate skill to deliver the project |  Open - High  |
|  2   |         The team is otherwise incapacitated          |  Open - High  |
|  3   |            The application does not work             | Open - Medium |
|  4   |   Data displayed in the application is inaccurate    |  Open - Low   |
|  5   |       No data is displayed in the application        |  Open - Low   |
|  6   |    The charting library becomes unfit for purpose    |  Open - Low   |

NOTE: Status consists of whether the risk is open or closed ie ongoing or not and what impact the risk is likely to have on the project such as high, medium, low.

 <Very briefly summarise the key issues faced by the team and their current status>

#### Team Issues

The main issues the team is facing right now is inadequate skill and reduced capacity due to health conditions. As well as being behind schedule and under pressure.

By having to rescope and reshape the project the team was put behind schedule and has never been able to get in front since then. The increased pressure as a result of this has had a negative impact on the health and wellbeing of the team which has in turn reduced the capacity the team is able to work at.

This coupled with potentially inadequate skill by the team means tasks also take longer contributing to the pressure, poor health and wellbeing as well as being unable to get ahead of the schedule.

The lack of time and outstanding work that needs to be done coupled with the potentially inadequate team skill means also that there is a potential that the team will be unable to meet the final deadline.

## 1. Deliverables

### 1.1 Beta Ready Version Of The Product

<Identify system qualities and use cases implemented and their status. Explain any mismatch between intended outcomes and outcomes achieved. Refer to version control repository where source code for application can be found, and a link for a ‘walk through’ video recording demonstrating achieved functionality>

|                        System Quality                        |                          Use Cases                           |                            Status                            |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| The application shall allow farmers to access the application on desktop |                        All Use Cases                         | There is no reason there should be any issue with this system quality and all use cases |
| The application should comply with and utilise Java design conventions, styles and best practices. |                        All Use Cases                         | There is no reason there should be any issue with this system quality and all use cases |
|    The application should be usable on desktop computers.    |                        All Use Cases                         | There is no reason there should be any issue with this system quality and all use cases |
|  The application should reliably display graph information   | View All Sensors, View A Water Quality Metric Across All Sensors, View A Water Quality Metric On A Single Sensor, Change Time Range For Rainfall Data | Currently the mismatch here occurs with the reliability factor. While the functionality is there, it cannot be deemed to be reliable yet |
|    The application should reliably read data from a file     | View All Sensors, View A Water Quality Metric Across All Sensors, View A Water Quality Metric On A Single Sensor, Change Time Range For Rainfall Data, Create A Favourite Sensor, Change A Favourite Sensor | Currently the mismatch here occurs with the reliability factor. While the functionality is there, it cannot be deemed to be reliable yet |



### 1.2 Supporting Test Evidence

### 1.2.1 Functional Acceptance Tests

<Identify the FATs carried out to test successful completion of beta ready system. Include links to evidence>

### 1.2.2 System Quality Scenarios

<Identify any system quality scenario testing carried out to test successful support of key NFRs in the beta ready system. Include links to evidence>

### 1.3 Beta Test Materials

<Identify the ‘business scenarios’ beta testers are asked to complete. Reference the beta test materials and the feedback form used to gather and analyse the results.>

### 1.4 User Manual

<Comment on the completion status, method of delivery and quality of the user manual to be supplied to beta testers. Reference the completed user manual.>

The user manual in question can be found at: https://github.com/Firedingo/ITC309-Team9/blob/master/docs/user%20manual.docx

The user manual is almost 100% complete. The only things obviously in need of finishing is the troubleshooting section which requires additional info and screenshots as well as the install and configuration section. Beyond that the user manual is complete.

It is fully expected that page numbers will also need rejigging once screenshots are added. It is also expected that further feedback would result in minor reworks of some written content.

## 2. Iterations

### 2.1 Construction Iteration 1

<Briefly identify the key objectives for this iteration. Summarise how the team went against those objectives. Identify and discuss any issues the team encountered achieving the objectives for this iteration>

This iteration primarily consisted of rejigging and rescoping of the project due to a massive shift in the team size.

As a result this iteration required covering the functional and non-functional requirements to fit the new scope, a complete redesign of the technical requirements as well as new wireframes to suit the new form of the project.

Due to the change in the technology used, some research was required to select a charting library that could be used.

No issues were encountered in this iteration.

### 2.2 Construction Iteration 2

<Briefly identify the key objectives for this iteration. Summarise how the team went against those objectives. Identify and discuss any issues the team encountered achieving the objectives for this iteration>

This iteration was for the most part reasonably successful.

This iteration consisted mostly of getting setup and getting a basic chart running in a working application. This was mostly successful. File reading was not completed and therefore the chart could not be updated to use the data read from the file, however the chart was successfully displaying data from hardcoded data.

A major issue encountered at this point in this iteration has been a mismatch between data being read in from the file and the types of data the chart type accepted. The original chart type did not accept string data and due to the time data being in the format of HH:MM:SS, it was deemed that string was probably the most accurate type of data to store the time format in. However the chart type did not support strings meaning a decision had to be made. Do we change the string type to something else or do we change the chart type to one that supports string?

### 2.3 Construction Iteration 3

<Briefly identify the key objectives for this iteration. Summarise how the team went against those objectives. Identify and discuss any issues the team encountered achieving the objectives for this iteration>

The aims of this iteration were to finish the remaining items that carried over from the last iteration as well as achieve the 2nd highest priority for implementation. As such this consisted of finishing file reading, connecting that to the chart as well as navigation through a menu and creating multiple windows.

No items were completed and the project essentially ground to a halt in this iteration as the project became bogged down in the major issue of file reading and chart creation. As well as the lack of confidence and possibly skill of the team.

All objectives in this iteration were interconnected and dependent on one another and therefore the failure to clear the previous carried work items resulted in nothing else getting done this iteration. This iteration cemented in the behind schedule nature of the team and the inability to get in front and ahead of the schedule.

The issue with the file reading and chart type mismatch continued through this iteration.

### 2.4 Construction Iteration 4

<Briefly identify the key objectives for this iteration. Summarise how the team went against those objectives. Identify and discuss any issues the team encountered achieving the objectives for this iteration>

The objectives for this iteration could be summarized as finish everything. This included finalizing the file reading and charting, finishing the menu navigation, multiple windows, allowing multiple types of data to be displayed as well as a functioning location system. Along with supplementary testing and documentation.

The issue with the chart type mismatch and data reading was resolved however it was discovered the zoom method no longer worked and therefore a custom zoom method would need to be implemented as well.

It quickly became clear that not all functionality would be able to be implemented into the application within this iteration period.

The team is now also in poor condition health and wellbeing wise and this has severely limited the team's capacity to complete work, including losing days to literal physical exhaustion.

Objectives were met in varying degrees with the high priority ones being met and the low priority ones not being met.

## 3. General Issues

### 3.1  <General Issue 1 – identify prioritised general issues if any>

<Identify and summarise any general issues the team encountered during the inception phase. If possible, describe any actions taken to remedy the issue>