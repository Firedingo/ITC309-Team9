# Elaboration Phase: Iteration Plan 1

## Document Control

| Version | Changes                           | Author         | Date       |
| :------ | :-------------------------------- | :------------- | :--------- |
| 0.1     | Document creation and conversion. | Naomi Thompson | 2021-05-05 |
| 1.0     | Document Completed                | Naomi Thompson | 2021-05-28 |
|         |                                   |                |            |

## Table of Contents

- [Elaboration Phase: Iteration Plan 2](#clyde-river-dashboard--elaboration-phase-iteration-plan-2)
  * [Document Control](#document-control)
  * [Table of Contents](#table-of-contents)
  * [1. Key Milestones](#1-key-milestones)
  * [2. High-Level Objectives](#2-high-level-objectives)
  * [3. Evaluation Criteria](#3-evaluation-criteria)
  * [4. Work Item Assignments](#4-work-item-assignments)
  * [5. Issues](#5-issues)
  * [6. Assessment](#6-assessment)
    + [Objectives Assessment](#objectives-assessment)
    + [Work Items Assessment](#work-items-assessment)
    + [Evaluation Criteria Assessment](#evaluation-criteria-assessment)
    + [Concerns and Deviations](#concerns-and-deviations)

## 1. Key Milestones

| **Milestone**              | **Date**   |
| -------------------------- | ---------- |
| Iteration Start            | 2021-04-26 |
| Project Supervisor Meeting | 2021-04-29 |
| Team Meeting               | 2021-04-29 |
| Team Meeting               | 2021-05-06 |
| Iteration Stop             | 2021-05-09 |

## 2. High-Level Objectives

1. Confirm Project Requirements & Direction With Project Sponsor
2. Design & Document application wireframes for various aspects of the application
3. Refine & Finalize various existing design and planning documents
4. Set the agenda and direction for the iteration
5. Outline an executable architecture to support implementation of the critical, core, risky, or difficult (CCRD) use case.

## 3. Evaluation Criteria

1. The summary document for the sponsor (DPI) is completed and the corresponding document is emailed to them.
2. Initial wireframe designs are completed & all team members approve.
3. Digitized wireframes are completed after approval.
4. The project vision document is finalized and it aligns with other project design and planning documents. 
5. The Architecture notebook document is finalized and it aligns with other project design and planning documents. 
6. An iteration plan for elaboration phase - iteration 1 is completed.
7. Revise Requirements model document with regards to the proposed architecture
8. Outline subtasks of executable architecture and testing

## 4. Work Item Assignments

The following work items will be addressed within this iteration:

| **Work Item ID**                                             | **Name, Keywords, or Description**                           | **Outcome**                                                  | **State**  | **Assigned To** | **Estimated Hours** | **Hours Worked** | **Estimated Hours Remaining** |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | --------------- | ------------------- | ---------------- | ----------------------------- |
| [ITC303-15](https://chris-clark327.atlassian.net/browse/ITC303-15) | Create Iteration Plan 1 for Elaboration Phase                | Completed Iteration Plan for Elaboration 1                   | Complete   | Naomi Thompson  | 5                   | 3                | 0                             |
| [ITC303-19](https://chris-clark327.atlassian.net/browse/ITC303-19) | Revise Project Vision                                        | Refined & Finalized Project Vision                           | Incomplete | Chris Clark     | 15                  | 25               | 1                             |
| [ITC303-33](https://chris-clark327.atlassian.net/browse/ITC303-33) | Create digital versions of wireframes with discussed improvements | Draft wireframes are digitized and able to be shared with the sponsor. | Complete   | Chris Clark     | 5                   | 1                | 0                             |
| [ITC303-21](https://chris-clark327.atlassian.net/browse/ITC303-21) | Revise Architecture Notebook                                 | Refined & Finalized Architecture Notebook                    | Incomplete | Ben Cummings    | 10                  | 0                | 10                            |
| [ITC303-47](https://chris-clark327.atlassian.net/browse/ITC303-47) | Review & Plan an outline for the Executable Architecture     | Review & Plan Executable Architecture including verifying/testing the outline in the architecture notebook is ok | Incomplete | Ben Cummings    | 5                   | 2                | 3                             |
| [ITC303-35](https://chris-clark327.atlassian.net/browse/ITC303-35) | Create Summary Document For Project Sponsor (DPI)            | A completed summary document that can be used to get Sponsor feedback on. | Complete   | Ben Cummings    | 5                   | 5                | 0                             |
| [ITC303-31](https://chris-clark327.atlassian.net/browse/ITC303-31) | Contact Project Sponsor (DPI)                                | An email is sent to the project sponsor seeking confirmation on project direction and requirements. | Complete   | Ben Cummings    | 1                   | 1                | 0                             |
| [ITC303-32](https://chris-clark327.atlassian.net/browse/ITC303-32) | Create rough wireframes for initial design discussions       | Draft Wireframes Which Outline & Illustrate Application Design | Complete   | Sam Johnson     | 4                   | 4                | 0                             |
| [ITC303-34](https://chris-clark327.atlassian.net/browse/ITC303-34) | Create initial wireframes for tablet/PC layouts              | Draft Wireframes Which Outline & Illustrate layouts for tablets and PCs | Incomplete | Sam Johnson     | 4                   | 1                | 1                             |
| [ITC303-20](https://chris-clark327.atlassian.net/browse/ITC303-20) | Revise Requirement Model                                     | Review & Update the Requirements Model & Associated Documents As Understood at this time | Incomplete | Sam Johnson     | 10                  | 0                | 10                            |

## 5. Issues

| **Issue**                                                    | **Status** | **Notes**                                                    |
| ------------------------------------------------------------ | ---------- | ------------------------------------------------------------ |
| FarmDecisionTech API returning invalid responses.            | Unresolved | The endpoint `/tenant/assets` endpoint throws an exception when an optional offset isn't specified. The endpoint `/asset/{assetId}` returns a `200 (OK)` response when an invalid asset ID is specified, where as it should return a `404 (Not Found)` response. |
| FarmDecisionTech API client credentials blocked.             | Resolved   | Ben's client credentials are now working again, therefore the blocking must have been temporary |
| Two team members (Naomi and Sam) experienced health complications towards the end of the iteration. | Resolved   | The health complications have been resolved.                 |

## 6. Assessment

|                   |                                          |
| ----------------- | ---------------------------------------- |
| Assessment Target | Life Cycle Architecture Milestone (LCAM) |
| Assessment Date   | 2021-06-07                               |
| Participants      | Sam, Ben, Chris, Naomi                   |
| Project Status    | Yellow                                   |

### Objectives Assessment

Of the 5 High level Objectives set, 2 were achieved and 3 were not achieved.

### Work Items Assessment

Most work items were attempted and many that are incomplete are close to completion but due to underestimating time and effort required as well as other competing issues such as sponsor feedback on project direction has resulted in delays in completing all work items.

### Evaluation Criteria Assessment

Of the 8 evaluation criteria listed, 5 were met. It is not entirely clear what regarding the wireframes may or is still outstanding and so this item and associated work items may be more or less complete than specified at this time. Due to incomplete work items, the architecture notebook, requirements model and project vision are still outstanding.

### Concerns and Deviations

The project is definitely behind schedule and communication on work item status has not been fabulous. That said, it was recognized an initially assigned work item was significantly too huge and was therefore broken down into smaller child tasks to facilitate completion of said task.