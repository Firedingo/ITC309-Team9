# Inception Phase: Iteration Plan 2

## Document Control

| Version | Changes                                    | Author         | Date       |
| ------- | ------------------------------------------ | -------------- | ---------- |
| 0.1     | Document creation and conversion.          | Naomi Thompson | 2021-04-07 |
| 1.0     | Added Document Control + Table Of Contents | Naomi Thompson | 2021-05-28 |
|         |                                            |                |            |

## Table Of Contents

- [Inception Phase: Iteration Plan 2](#inception-phase-iteration-plan-2)
  - [Document Control](#document-control)
  - [Table Of Contents](#table-of-contents)
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

| **Milestone**                      | **Date**   |
| ---------------------------------- | ---------- |
| Iteration Start                    | 2021-04-07 |
| Team Meeting                       | 2021-04-08 |
| Team Meeting                       | 2021-04-15 |
| Team Meeting                       | 2021-04-22 |
| Iteration Stop                     | 2021-04-25 |

## 2. High-Level Objectives

1. Complete outstanding work items from the previous iteration.
2. Evaluate and select from candidate architectures.
3. Identify critical, core, risky, or difficult (CCRD) use case.
4. Identify project risks and formulate mitigation strategies.
5. Establish project plan.
6. Demonstrate technical competency through demonstration application.
7. Assess project progress.

## 3. Evaluation Criteria

1. Architecture notebook document is completed and includes the proposed architecture.
2. Requirement model document is completed and includes the finalised requirements (functional and non-functional) and use cases.
3. The risk list document is completed and includes prioritised risks and appropriate mitigation strategies.
4. The master test plan document is completed and includes an appropriate testing strategy.
5. The project plan document is completed and includes an achievable schedule for satisfying the project outcomes.
6. The demonstration application is developed, built, and deployed and exemplifies technical competency in all major architectural areas.
7. The project status assessment document for the inception phase is completed.
8. An iteration plan for the second iteration of the inception phase is created.

## 4. Work Item Assignments

The following work items will be addressed within this iteration:

| **Work Item ID**                                                   | **Name, Keywords, or Description**  | **Outcome**                                                                                                                          | **State**  | **Assigned To** | **Estimated Hours** | **Hours Worked** | **Estimated Hours Remaining** |
| ------------------------------------------------------------------ | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ---------- | --------------- | ---------------- -- | ---------------- | ----------------------------- |
| [ITC303-16](https://chris-clark327.atlassian.net/browse/ITC303-16) | Requirement Model Document          | Requirement model document created, uploaded to the version control repository, and linked via the Wiki.                             | Complete   | Sam Johnson     | 10                  | 10               | 0                             |
| [ITC303-8](https://chris-clark327.atlassian.net/browse/ITC303-8)   | Architecture Notebook Document      | Architecture notebook document created, uploaded to the version control repository, and linked via the Wiki.                         | Complete   | Ben Cummings    | 10                  | 10               | 0                             |
| [ITC303-9](https://chris-clark327.atlassian.net/browse/ITC303-9)   | Risk List Document                  | Risk list document created, uploaded to the version control repository, and linked via the Wiki.                                     | Complete   | Naomi Thompson  | 10                  | 10               | 0                             |
| [ITC303-10](https://chris-clark327.atlassian.net/browse/ITC303-10) | Master Test Plan Document           | Master test plan document created, uploaded to the version control repository, and linked via the Wiki.                              | Complete   | Naomi Thompson  | 30                  | 30               | 0                             |
| [ITC303-11](https://chris-clark327.atlassian.net/browse/ITC303-11) | Project Plan Document               | Project plan document created, uploaded to the version control repository, and linked via the Wiki.                                  | Complete   | Chris Clark     | 15                  | 25               | 0                             |
| [ITC303-17](https://chris-clark327.atlassian.net/browse/ITC303-17) | Technical Demonstration Application | Technical demonstration application developed, built, deployed, uploaded to the version control repository, and linked via the Wiki. | Complete   | Ben Cummings    | 30                  | 35               | 0                             |
| [ITC303-18](https://chris-clark327.atlassian.net/browse/ITC303-18) | Project Status Assessment Document  | Project status assessment document created, uploaded to the version control repository, and linked via the Wiki.                     | Complete   | Chris Clark     | 10                  | 15               | 0                             |
| [ITC303-14](https://chris-clark327.atlassian.net/browse/ITC303-14) | Iteration Plan Document             | Iteration plan document created, uploaded to the version control repository, and linked via the Wiki.                                | Complete   | Naomi Thompson  | 5                   | 5                | 0                             |

## 5. Issues

| **Issue**                                                                                           | **Status** | **Notes**                                                                                                                                                                                                                                                        |
| --------------------------------------------------------------------------------------------------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| FarmDecisionTech API returning invalid responses.                                                   | Unresolved | The endpoint `/tenant/assets` endpoint throws an exception when an optional offset isn't specified. The endpoint `/asset/{assetId}` returns a `200 (OK)` response when an invalid asset ID is specified, where as it should return a `404 (Not Found)` response. |
| FarmDecisionTech API client credentials blocked.                                                    | Unresolved | A bug in an early build of the application resulted in the FarmDecisionTech API being flooded with access token requests. Due to this, Ben's client credentials were blocked (it's unclear whether this is temporary or permanent).                              |
| Two team members (Naomi and Sam) experienced health complications towards the end of the iteration. | Unresolved | The health complications resulted in delays to the delivery of the work items.                                                                                                                                                                                   |

## 6. Assessment

|                   |                                       |
| ----------------- | ------------------------------------- |
| Assessment Target | Life Cycle Objective Milestone (LCOM) |
| Assessment Date   | 2021-04-25                            |
| Participants      | Sam, Naomi, Chris, Ben                |
| Project Status    | Yellow                                |

### Objectives Assessment

The high-level objectives were fully achieved.

### Work Items Assessment

All work items were completed. Many of the work items took longer than initially estimated.

### Evaluation Criteria Assessment

All evaluation criteria was satisfied.

### Concerns and Deviations

Many of the documents will need to be revised and synced. The project continues to be behind schedule.