# Clyde River Dashboard: Elaboration Phase Iteration Plan 1

## 1. Key Milestones

| **Milestone**              | **Date**   |
| -------------------------- | ---------- |
| Iteration Start            | 2021-04-21 |
| Team Meeting               | 2021-04-22 |
| Project Supervisor Meeting | 2021-04-29 |
| Team Meeting               | 2021-04-29 |
| Iteration Stop             | 2021-05-02 |

## 2. High-Level Objectives

1. Confirm Project Requirements & Direction With Project Sponsor
2. Design & Document application wireframes for various aspects of the application
3. Refine & Finalize various existing design and planning documents
4. Set the agenda and direction for the iteration
5. Develop an executable architecture to support implementation of the critical, core, risky, or difficult (CCRD) use case.

## 3. Evaluation Criteria

1. The summary document for the sponsor (DPI) is completed and the corresponding document is emailed to them.
2. Initial wireframe designs are completed & all team members approve.
3. Digitized wireframes are completed after approval.
4. The project vision document is completed and adequately defines and describes the purpose and objectives for the project and that it is harmonious and synchronizes with other project design and planning documents.
5. The Architecture notebook document is completed and includes the proposed architecture and that it is harmonious and synchronizes with other project design and planning documents.
6. An iteration plan for elaboration phase - iteration 1 is completed.
7. An initial executable architecture is completed.

## 4. Work Item Assignments

The following work items will be addressed within this iteration:

| **Work Item ID**                                             | **Name, Keywords, or Description**                           | **Outcome**                                                  | **State**  | **Assigned To** | **Estimated Hours** | **Hours Worked** | **Estimated Hours Remaining** |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | --------------- | ------------------- | ---------------- | ----------------------------- |
| [ITC303-15](https://chris-clark327.atlassian.net/browse/ITC303-15) | Create Iteration Plan 1 for Elaboration Phase                | Completed Iteration Plan for Elaboration 1                   | Incomplete | Naomi Thompson  | 5                   | 2                | 3                             |
| [ITC303-19](https://chris-clark327.atlassian.net/browse/ITC303-19) | Revise Project Vision                                        | Refined & Finalized Project Vision                           | Incomplete | Chris Clark     | 25                  | 0                | 25                            |
| [ITC303-33](https://chris-clark327.atlassian.net/browse/ITC303-33) | Create digital versions of wireframes with discussed improvements | Draft wireframes are digitized and able to be shared with the sponsor. | Incomplete | Chris Clark     | 10                  | 0                | 10                            |
| [ITC303-21](https://chris-clark327.atlassian.net/browse/ITC303-21) | Revise Architecture Notebook                                 | Refined & Finalized Architecture Notebook                    | Incomplete | Ben Cummings    | 35                  | 0                | 35                            |
| [ITC303-24](https://chris-clark327.atlassian.net/browse/ITC303-24) | Develop Executable Architecture                              | An executable architecture that will form the foundation of the project | Incomplete | Ben Cummings    | 25                  | 0                | 25                            |
| [ITC303-35](https://chris-clark327.atlassian.net/browse/ITC303-35) | Create Summary Document For Project Sponsor (DPI)            | A completed summary document that can be used to get Sponsor feedback on. | Incomplete | Ben Cummings    | 7                   | 0                | 7                             |
| [ITC303-31](https://chris-clark327.atlassian.net/browse/ITC303-31) | Contact Project Sponsor (DPI)                                | An email is sent to the project sponsor seeking confirmation on project direction and requirements. | Incomplete | Ben Cummings    | 2                   | 0                | 2                             |
| [ITC303-32](https://chris-clark327.atlassian.net/browse/ITC303-32) | Create rough wireframes for initial design discussions       | Draft Wireframes Which Outline & Illustrate Application Design | Complete   | Sam Johnson     | 10                  | 6                | 0                             |
| [ITC303-34](https://chris-clark327.atlassian.net/browse/ITC303-34) | Create initial wireframes for tablet/PC layouts              | Draft Wireframes Which Outline & Illustrate layouts for tablets and PCs | Incomplete | Sam Johnson     | 10                  | 0                | 10                            |

## 5. Issues

| **Issue**                                                    | **Status** | **Notes**                                                    |
| ------------------------------------------------------------ | ---------- | ------------------------------------------------------------ |
| FarmDecisionTech API returning invalid responses.            | Unresolved | The endpoint `/tenant/assets` endpoint throws an exception when an optional offset isn't specified. The endpoint `/asset/{assetId}` returns a `200 (OK)` response when an invalid asset ID is specified, where as it should return a `404 (Not Found)` response. |
| FarmDecisionTech API client credentials blocked.             | Unresolved | A bug in an early build of the application resulted in the  FarmDecisionTech API being flooded with access token requests. Due to  this, Ben's client credentials were blocked (it's unclear whether this  is temporary or permanent). |
| Two team members (Naomi and Sam) experienced health complications towards the end of the iteration. | Resolved?  | The health complications resulted in delays to the delivery of the work items. |

## 6. Assessment

|                   |      |
| ----------------- | ---- |
| Assessment Target |      |
| Assessment Date   |      |
| Participants      |      |
| Project Status    |      |

### Objectives Assessment



### Work Items Assessment



### Evaluation Criteria Assessment



### Concerns and Deviations

