# Transition Phase Iteration Plan 2

## Document Control

| Version |      Changes       |     Author     |    Date    |
| :-----: | :----------------: | :------------: | :--------: |
|   0.1   | Document Creation  | Naomi Thompson | 2021-10-18 |
|   1.0   | Document Completed | Naomi Thompson | 2021-10-19 |



## Table Of Contents


- [Transition Phase: Iteration Plan 2](#transition-phase-iteration-plan-2)
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

| **Milestone**    | **Date**   |
| ---------------- | ---------- |
| Iteration Start  | 2021-10-08 |
| Overview Meeting | 2021-10-14 |
| Iteration Stop   | 2021-10-16 |

## 2. High-Level Objectives

1. Complete Foundational Functionality For The Core Of The Project
2. Build Upon The Foundational Functionality To Add A Collection Of Complementary Features To The Project
3. Complete Necessary Supporting Documentation As Required Up To This Point Of The Project's Lifecycle
4. Complete Necessary Sponsor Sign Off Tasks

## 3. Evaluation Criteria

1. Completed & Working Charts
2. Options To Customize The Data Displayed By The Charts
3. Provided Option To Make Data More User Centric Through A Location Personalization Option
4. Provided More Contextually helpful information On Sensor Location Statuses
5. Completed Programmer Manual, UATs, Project Status Assessment.
6. A Completed and Uploaded Demonstration Video

## 4. Work Item Assignments

The following work items will be addressed within this iteration:

| **Work Item ID** | **Name, Keywords, or Description**                           | **Outcome**                                                  | **State**  | **Assigned To** | **Estimated Hours** | **Hours Worked** | **Estimated Hours Remaining** |
| ---------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | --------------- | ------------------- | ---------------- | ----------------------------- |
| 11               | Update The Chart To Use The New Data Read From File          | A Working Dynamically Generated Chart Using Data Read From File | Complete   | Naomi Thompson  | 5                   | 18               | 0                             |
| 14               | Create Complementary  Charts For Rainfall & Temperature Data | Functioning Charts Displaying Rainfall & Temperature Data From File | Complete   | Naomi Thompson  | 10                  | 6                | 0                             |
| 15               | Create & Implement A Time Series Function For Rainfall Data  | The Rainfall Chart Allows For Custom Time Ranges & They Work | Incomplete | Naomi Thompson  | 30                  | 0                | 30                            |
| 16               | Create A Custom Zoom Function For The CategoryChart Type     | The CategoryChart can be zoomed in and out                   | Incomplete | Naomi Thompson  | 10                  | 0                | 0                             |
| 17               | Provide Harvest Area Status Based On Data                    | Update a visual info field to show harvest Area status based on the current data levels. | Incomplete | Naomi Thompson  | 5                   | 0                | 0                             |
| 18               | Select A Favourite Location                                  | Allow the user to select a favourite location                | Complete   | Naomi Thompson  | 5                   | 5                | 0                             |
| 19               | Display Favourite location Info on dashboard home            | Allow a user to view a summary of their favourite location on the dashboard | Complete   | Naomi Thompson  | 10                  | 5                | 0                             |
| 27               | Complete User Acceptance Testing                             | Complete User Acceptance Testing to verify the project is meeting business objectives. | Incomplete | Naomi Thompson  | 10                  | 0                | 0                             |
| 28               | Complete Programmer Manual                                   | A Completed manual targeted towards future developers to aide with long term development and maintenance | Incomplete | Naomi Thompson  | 12                  | 8                | 4                             |
| 29               | Create A Demonstration Video                                 | A complete demonstration video designed to replicate a demonstration to project sponsors | Incomplete | Naomi Thompson  | 5                   | 0                | 0                             |
| 30               | Complete Project Status Assessment                           | A Completed Status Assessment that reflects, analyzes and states the current status of the project. | Incomplete | Naomi Thompson  | 5                   | 0                | 0                             |

## 5. Issues

| **Issue**                                       | **Status** | **Notes**                                                    |
| ----------------------------------------------- | ---------- | ------------------------------------------------------------ |
| Small Charts Can't Render Large Amounts Of Data | Unresolved | Too much data on small charts causes the application to break. Additional functionality will be needed in order to reduce the amount of data sent to small aka summary charts. Data is uploaded about every 15 minutes. Proposal to use a quarter of that data aka 1 data point per hour or thereabouts. |
|                                                 |            |                                                              |

## 6. Assessment

|                   |                                 |
| ----------------- | ------------------------------- |
| Assessment Target | Product Release Milestone (PRM) |
| Assessment Date   | 2021-10-28                      |
| Participants      | Naomi Thompson                  |
| Project Status    | Yellow                          |

### Objectives Assessment

Objective 1 has been successfully met on account of the fact that criteria 1 was completed. This has enabled the project to move forward but there is little good news beyond this. Many work items were not completed and therefore objectives not met.

- Objective 1 is dependent on Criteria 1.
- Objective 2 is dependent on Criteria 2, 3 & 4.
- Objective 3 is dependent on Criteria 5.
- Objective 4 is dependent on Criteria 6.

### Work Items Assessment

Significant progress has been made with the completion of work items 11 & 14. It has been discovered that additional functionality to summarize the data will be necessary to add in order for the summary charts on the all sensors and dashboard/home screens to work properly.

Work Items 18 & 19 were also completed. These were relatively easy to finish and required little extra work to complete. The functionality added has minimal impact but is progress none the less.

Work Items 15 & 16 remain outstanding. Both are significant and at this point may be well beyond the team's capability to deliver.

Work Item 17 is of minimal consequence and is therefore of low priority.

Work Items 27, 28, 29 & 30 are of high significance and are being worked on. In particular 27 & 29 are heavily dependent on the completed functionality of the application and are therefore likely to be one of the last items completed, simply because they are so heavily dependent on the application functionality.

### Evaluation Criteria Assessment

Criteria 1 has been successfully completed due to Work Items 11 & 14 finally being completed. Criteria 3 was also met due to Work Items 18 & 19 being completed. No other criteria were met. It was not expected that criteria 5 or 6 would be completed in this iteration though.

- Criteria 1 is dependent on Work Items 11 & 14.
- Criteria 2 is dependent on Work Items 15 & 16.
- Criteria 3 is dependent on Work Items 18 & 19.
- Criteria 4 is dependent on Work Item 17.
- Criteria 5 is dependent on Work Items 27, 28 & 30.
- Criteria 6 is dependent on Work Item 29.

### Concerns and Deviations

Serious concerns remain still about whether the team can complete the application in time. It is and has been the view of this assessment for some time that the team will not complete the required functionality in time.

While it is encouraging to see some progress being made, there is not enough progress being made and certainly not enough being made quickly enough to ensure the team will make delivery. This is highly likely due to the team's lack of skill to actually deliver such a project.

A major issue has also been the constant growing of functionality requirements. As new problems and issues arise, more functionality has been needed to be added to the application in order to deal with the new problems. This has also cost in time that can not be spared at this point.

Many of these issues may have been discovered earlier on if time had allowed a more fuller exploration of the chosen charting library which while being very easy to use and has facilitated significant progress to even allow the project to be vaguely close to finish, has also been a major source of issues and has significantly slowed the team and development down.