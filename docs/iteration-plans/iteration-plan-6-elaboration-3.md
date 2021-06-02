# Elaboration Phase Iteration Plan 3

## Document Control

| Version | Changes                           | Author         | Date       |
| ------- | --------------------------------- | -------------- | ---------- |
| 0.1     | Document creation and conversion. | Naomi Thompson | 2021-05-27 |
| 1.0     | Document Finalized                | Naomi Thompson | 2021-06-02 |

## Table of Contents

- [Elaboration Phase Iteration Plan 3](#elaboration-phase-iteration-plan-3)
  - [Document Control](#document-control)
  - [Table of Contents](#table-of-contents)
  - [1. Key Milestones](#1-key-milestones)
  - [2. High-Level Objectives](#2-high-level-objectives)
  - [3. Evaluation Criteria](#3-evaluation-criteria)
  - [4. Work Item Assignments](#4-work-item-assignments)
  - [5. Issues](#5-issues)
  - [6. Assessment](#6-assessment)
    - [Objectives Assessment](#objectives-assessment)
    - [Work Items Assessment](#work-items-assessment)
    - [Evaluation Criteria Assessment](#evaluation-criteria-assessment)
    - [Concerns and Deviations](#concerns-and-deviations)

## 1. Key Milestones

| **Milestone**      | **Date**   |
| ------------------ | ---------- |
| Iteration Start    | 2021-05-24 |
| Team Meeting       | 2021-05-27 |
| Supervisor Meeting | 2021-05-27 |
| Iteration Stop     | 2021-05-30 |

## 2. High-Level Objectives

1. Complete Development on Server-side Resources
2. Complete Development on Client-Side Resources
3. Finalize Some Planning and Design Documents as known at this stage
4. Set the agenda and direction for the iteration

## 3. Evaluation Criteria

1. The chosen server-side resources are implemented
2. The chosen client-side components are created
3. The Requirements Model, Wireframes, Testing Report, Project Vision,  Architecture Notebook & Risk List are completed or finalized as understood at this time.
4. The Iteration Plan is completed

## 4. Work Item Assignments

The following work items will be addressed within this iteration:

| **Work Item ID**                                             | **Name, Keywords, or Description**                           | **Outcome**                                                  | **State**  | **Assigned To** | **Estimated Hours** | **Hours Worked** | **Estimated Hours Remaining** |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | --------------- | ------------------- | ---------------- | ----------------------------- |
| [ITC303-21](https://chris-clark327.atlassian.net/browse/ITC303-21) | Revise Architecture Notebook                                 | Refined & Finalized Architecture Notebook                    | Incomplete | Ben Cummings    | 10                  | 5                | 5                             |
| [ITC303-39](https://chris-clark327.atlassian.net/browse/ITC303-39) | Server-Side: Create API Gateway Resources via Infrastructure as Code (CloudFormation Template) | Create and Implement some server-side resources that will be  integrated into the executable architecture and support completion of [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Incomplete | Ben Cummings    | 25                  | 15               | 10                            |
| [ITC303-40](https://chris-clark327.atlassian.net/browse/ITC303-40) | Server-Side: Create Lambda Resources via Infrastructure as Code (CloudFormation Template) | Create and implement some lambda resources that will be integrated into the executable architecture and support completion of [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Incomplete | Ben Cummings    | 25                  | 10               | 15                            |
| [ITC303-41](https://chris-clark327.atlassian.net/browse/ITC303-41) | Server-Side: Create Lambda Function to Manage Access Tokens for FarmDecisionTech API | Create and implement some lambda resources that will be integrated into the executable architecture and support completion of [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Complete   | Ben Cummings    | 25                  | 25               | 0                             |
| [ITC303-47](https://chris-clark327.atlassian.net/browse/ITC303-47) | Review & Plan an outline for the Executable Architecture     | Review & Plan Executable Architecture including verifying/testing the outline in the architecture notebook is ok | Complete   | Ben Cummings    | 5                   | 5                | 0                             |
| [ITC303-20](https://chris-clark327.atlassian.net/browse/ITC303-20) | Revise Requirement Model                                     | Review & Update the Requirements Model & Associated Documents As Understood at this time | Complete   | Sam Johnson     | 10                  | 10               | 0                             |
| [ITC303-25](https://chris-clark327.atlassian.net/browse/ITC303-25) | Create Testing Report                                        | Completed Testing Report As Understood at this time          | Incomplete | Sam Johnson     | 35                  | 2                | 33                            |
| [ITC303-45](https://chris-clark327.atlassian.net/browse/ITC303-45) | Client-Side: Create Summary Cards for Environmental Conditions using React Native | Create and Implement Summary Card Component for Environmental  Conditions that will be integrated into the development architecture and aid with completion of [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Incomplete | Sam Johnson     | 35                  | 25               | 10                            |
| [ITC303-46](https://chris-clark327.atlassian.net/browse/ITC303-46) | Client-Side: Create Status Cards for Harvest Areas using React Native | Create and Implement Summary Card Component for Environmental  Conditions that will be integrated into the development architecture and aid with completion of [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Complete   | Sam Johnson     | 35                  | 35               | 0                             |
| [ITC303-19](https://chris-clark327.atlassian.net/browse/ITC303-19) | Revise Project Vision                                        | Finalized Project Vision As Understood at this time          | Incomplete | Chris Clark     | 15                  | 26               | 1                             |
| [ITC303-22](https://chris-clark327.atlassian.net/browse/ITC303-22) | Revise Risk List                                             | Finalized Risk List As Understood at this time               | Incomplete | Naomi Thompson  | 10                  | 2                | 8                             |
| [ITC303-50](https://chris-clark327.atlassian.net/browse/ITC303-50) | Create Iteration Plan 3 for Elaboration Phase                | Completed Iteration Plan for Elaboration 3                   | Complete   | Naomi Thompson  | 5                   | 2                | 0                             |
|                                                              |                                                              |                                                              |            |                 |                     |                  |                               |

## 5. Issues

| **Issue**                                         | **Status** | **Notes**                                                    |
| ------------------------------------------------- | ---------- | ------------------------------------------------------------ |
| FarmDecisionTech API returning invalid responses. | Unresolved | The endpoint `/tenant/assets` endpoint throws an exception when an optional offset isn't specified. The endpoint `/asset/{assetId}` returns a `200 (OK)` response when an invalid asset ID is specified, where as it should return a `404 (Not Found)` response. |
|                                                   |            |                                                              |
|                                                   |            |                                                              |

## 6. Assessment

|                   |                                          |
| ----------------- | ---------------------------------------- |
| Assessment Target | Life Cycle Architecture Milestone (LCAM) |
| Assessment Date   | 2021-06-07                               |
| Participants      | Sam, Naomi, Chris, Ben                   |
| Project Status    | Yellow                                   |

### Objectives Assessment

Of the 4 High level Objectives declared, 3 were partially achieved, 1 was fully achieved

### Work Items Assessment

Of the 12 work items assigned, 5 are deemed complete.

### Evaluation Criteria Assessment

Of the 4 Evaluation Criteria declared, 3 were partially achieved, 1 was fully achieved

### Concerns and Deviations

Due to issues within the team and the subsequent division of the team, much of the hours and work item completions are arbitrary and pure guesses.

Some items have been deliberately left incomplete so that they can be carried to the final iteration plan. This is not completely unrealistic of what the team would be like.