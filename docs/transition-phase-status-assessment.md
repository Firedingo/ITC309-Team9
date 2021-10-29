# Transition Phase Status Assessment

## Version History

| Version | Change              | Author         | Date       |
| ------- | ------------------- | -------------- | ---------- |
| 0.1     | Document Creation   | Naomi Thompson | 2021-10-28 |
| 1.0     | Document Completion | Naomi Thompson | 2021-10-29 |

# Table of contents

- [Transition Phase Status Assessment](#transition-phase-status-assessment)
  - [Version History](#version-history)
  - [Introduction](#introduction)
  - [Executive Summary](#executive-summary)
    - [1.1.  Production Ready Version of the Product](#11--production-ready-version-of-the-product)
    - [1.2.  Beta Test Results](#12--beta-test-results)
    - [1.3.   Programmer Documentation](#13---programmer-documentation)
    - [1.4.  Sponsor Demonstration](#14--sponsor-demonstration)
    - [1.5.   Sponsor Stakeholder Signoff](#15---sponsor-stakeholder-signoff)
  - [2. Iterations](#2-iterations)
    - [2.1.  Transition Iteration 1](#21--transition-iteration-1)
    - [2.2.  Transition Iteration 2](#22--transition-iteration-2)
    - [2.3.  Transition Iteration 3 (if required)](#23--transition-iteration-3-if-required)
  - [3. General Issues](#3-general-issues)
    - [3.1.  <General Issue 1 – identify prioritised general issues if any>](#31--general-issue-1--identify-prioritised-general-issues-if-any)
  - [4. Overall Assessment Against Project Objectives](#4-overall-assessment-against-project-objectives)
    - [4.1.  Functional Requirements](#41--functional-requirements)
    - [4.2.  Non-Functional Requirements](#42--non-functional-requirements)

## Introduction

The key aims of the Transition Phase are to:

- Conduct beta testing in the production environment to ensure product is fit for purpose.
- Remedy any critical and significant defects and usability issues.
- Obtain sponsor and/or stakeholder acceptance that the product is complete.

Achievement of these aims is embodied in the deliverables of the Product Release Milestone. PRM is achieved by:

1. Developing a final production version of the system that is ready for operational use.

2. Conducting and recording beta tests verifying that all critical and significant defects and usability issues have been remedied.

3. Producing programmer documentation sufficient for passing off to another development team to efficiently come to understand and maintain the final product.

4. Conducting a demonstration of the final version of the system to sponsors and stakeholders.

5. Obtaining sponsor/stakeholder acceptance of the final product

This report assesses current project progress against these outcomes. It also summarises progress and issues faced during each iteration of the Transition Phase. Finally it assesses final project outcomes against initial project aims.

## Executive Summary

-  Has a final version of the application been deployed into production use? Is it fit for purpose?
- Has a product demonstration been carried out?
- Is the final version of the product (relatively) bug free? What defects were found, and have they been remedied?
- Does programmer documentation sufficient for an independent team to efficiently come to understand and maintain the product exist?
- Has sponsor/stakeholder signoff been obtained?

 While much progress has been made on the final version of the application, ultimately however the final version of the software remains feature incomplete.

The software although incomplete has been thoroughly demonstrated to the point that it is at and has successfully demonstrated implemented functionality thus far.

The software is relatively bug free. Some bugs due to incomplete functionality remain. 

There is sufficient and effective documentation to allow further development and ongoing maintenance of the application.

While sponsor feedback and sign off has been sought, said signoff is ultimately still outstanding at the time of writing.

 The primary concern at this point is for skill level and time. As to whether the team has sufficient skill to finish the last remaining outstanding items for the application and deliver them in such a short time.

The big issues the team have consistently faced include:

- Lack Of Skill - Ongoing
- Unstable Code - Ongoing - This is code that the team has written which does not perform or behave consistently.



1. ## Deliverables

 

### 1.1.  Production Ready Version of the Product

 So the application seeks to implement a number of system qualities and use cases. System qualities such as: 

- Consistency & Reliability
- Ease Of Use
- Dependability & predictability

These system qualities have as a result produced a number of use cases that have been sought to be implemented in order to satisfy these system qualities. These use cases include:

- Return To Home Dashboard
- View All Sensors
- View A Water Quality Metric Across All Sensors
- View All Water Quality Metrics On A Single Sensor
- View A Single Water Quality Metric On A Single Sensor
- Move From One Sensor To Another
- Change Time Range For Rainfall Data
- Create A Favourited Sensor
- Change Favourited Sensor

Much Of this can be found in the repository: https://github.com/Firedingo/ITC309-Team9

### 1.2.  Beta Test Results

 As part of ensuring the application is fit for purpose, the application has sought testing on a use case and "business scenario" level. As such the testing has sought to perform a number of tests such as:

- "Change A Favourited Sensor Test"
- "Move From One Sensor To Another Test"
- "View & Scroll All Sensors Test"

By And large, the tests generally pass. It is known that is edge case conditions were applied to the application that it is likely to perform not as intended. Edge conditions consist of things like:

- Failing To Provide Any Files With Data To Be Read
- Removing Required Files Such As data files or the preference file.

Testing was unable to be completed due to the required functionality being unable to be completed in time.

### 1.3.   Programmer Documentation

 There is an extensive programmer manual that has been created that aims to explain the system and how to maintain and be productive on it, not only to a future development to team, but to literally anyone who picks up the manual and reads it.

The programmer manual seeks to meet the reader wherever they're at and provide them with the skills to immediately get to grips with the application.

This includes explaining the development environment used, libraries and dependencies used and their relevant versions, detailed design decisions, how and why they're relevant, detailed application structure and connections as well as providing the user with further details on mentioned items and deliberately does not assume familiarity with any particular element mentioned with the preceding sections of the document.

### 1.4.  Sponsor Demonstration

 Due to the turbulent history of this project, it currently does not have a sponsor but equivalent documentation has been provided in the form of a recorded video which provides a demonstration of the application.

The demonstration is however brief due to the fact that the application was unable to be completed functionally and therefore that has limited what can be demonstrated.

### 1.5.   Sponsor Stakeholder Signoff

No Sponsor signoff has been achieved. This is not an indication of rejection either. Simply a statement of fact. Demonstration of the software has been provided and the decision of the outcome of signoff yet to be decided.

## 2. Iterations

### 2.1.  Transition Iteration 1

 The key aim of this iteration was to essentially achieve the missed targets of the Construction Phase. This included reaching full implementation of the software and full implementation of all known use cases and business scenarios and to ensure that such use cases and business scenarios are met, perform consistently and that the outcome matches desired outcome at all times. 

Unfortunately, despite best efforts to achieve these goals, the goals were still left outstanding at the end of the iteration. This was primarily the result of 2 major issues, including:

- Lack Of Team Skill
- Poorly Developed Code

### 2.2.  Transition Iteration 2

  The key aim of this iteration was to essentially achieve the missed targets of the Construction Phase. This included reaching full implementation of the software and full implementation of all known use cases and business scenarios and to ensure that such use cases and business scenarios are met, perform consistently and that the outcome matches desired outcome at all times.

Due to the aforementioned issues, once again the objectives were not met. While significant progress was made to ensure further delivery of the application use cases and business scenarios, complete development was again not reached resulting in further delays to other aspects of the system development such as testing.

### 2.3.  Transition Iteration 3 (if required)

As such the above issues have carried into this third and final iteration. It has been a mad scramble by the team to develop the application to such a sufficient level that other aspects of delivery can be carried out alongside the ongoing development of the application.

This need to "multitask" has been one of the few things that have allowed ongoing progress to ensure project delivery despite full application implementation having not yet been achieved.

Get effort has been sought to ensure testing is adequate and that a stable and well rounded application is delivered despite whether it ever becomes functionally complete.

## 3. General Issues

### 3.1.  General Issue 1 – Poorly Developed Code

The major issue the software has often faced has been poorly developed code. This has included code that's too rigid and unable to adapt, code that was not robust enough to handle errors properly produced by it or code that in the end was rewritten because it was inadequate for purpose.

Steps taken have primarily consisted of trying to visualize where the fail points of the code might be and designing around those points such as thinking about non-standard actions by an end user and trying to adjust to said actions.

Additional thought has also been given to future code to ensure that it is broadly flexible but highly specific in application. This is a challenge to write code that can be both general and specific at the same time. Dynamic code is hard because it means designing for anything and everything. 

## 4. Overall Assessment Against Project Objectives

Overall, given the turbulent history of this project, this project does a very good job of applying the business case for this project. The initial issue was difficulty to access/use data provided by the DPI and therefore resulting in underutilization of said data.

This project significantly addresses this problem by having easy to use charts, much simpler access and data which is much easier to understand. To aide with this solution, reliability and consistency of the application has also been of significant importance.

A major hurdle has been ensuring reliability such that it does not compromise the consistency of the application and therefore undermine the adherence to the project vision.

### 4.1.  Functional Requirements

Due to the turbulent past of this project, there is no *elaboration-phase-status-assessment.md* to refer to here. However key use cases that should have been completed by the end of the elaboration phase would consist of:

- User Can Load The Application
- User Can View A Chart
- Chart Can display Data From A File

This would have been covered by the following functionality being implemented:

- A Loading Application
- Very basic Charting
- Very Basic File Loading/Reading
- A Dynamically Updating Chart that uses the data read from the File

Due to the history of this project, this was not achieved at the end of elaboration and has been a battle through Construction and Transition Phases to ensure that it has been achieved.

### 4.2.  Non-Functional Requirements

There were not too many NFRs associated with this project but notable ones include:

- Reliability
- Consistency
- Ease Of Use
- Performance (To A Lesser Extent)
- Maintainability

Primarily Reliability and Consistency coupled with Ease Of Use were of most importance.

The overly simple nature of the application means that it is quite easy to use and comprehend at a glance.

Reliability and Consistency have at times been challenging to maintain due to poor quality code.

Efforts to ensure code is maintainable has posed challenges to the project but is not awful. There is definitely room for improvement, including more commenting within the code.