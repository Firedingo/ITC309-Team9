# Risk List

## Document Control

| Version | Changes                                      | Author         | Date       |
| ------- | -------------------------------------------- | -------------- | ---------- |
| 0.1     | Document creation and conversion.            | Naomi Thompson | 2021-04-19 |
| 0.2     | Document partially completed.                | Naomi Thompson | 2021-04-19 |
| 0.3     | Minor formatting and additional risks added. | Naomi Thompson | 2021-04-21 |
| 0.4     | Corrected formatting, grammar, and wording.  | Ben Cummings   | 2021-04-21 |
| 0.5     | Added a Table Of Contents, Additional Risks  | Naomi Thompson | 2021-05-28 |

## Table Of Contents

- [Risk List](#risk-list)
  - [Document Control](#document-control)
  - [Table Of Contents](#table-of-contents)
  - [Project Information](#project-information)
  - [Risk Management Log](#risk-management-log)
  - [Key](#key)

## Project Information

**Application:** Clyde River Dashboard

**Organisation/Sponsor:** Department of Primary Industries (NSW Government)

**Manager:** Mostafa Dahshan

**Description:** To create a dashboard application that makes device and sensor telemetry data from the Clyde River accessible to farmers and other vested stakeholders.

## Risk Management Log

| ID   | Current Status | Risk Impact | Probability of Occurrence | Risk Map | Risk Description                                             | Project Impact                                               | Risk Area                                          | Symptoms                                                     | Triggers                                                     | Risk Response Strategy | Response Strategy                                            | Contingency Plan                                             |
| ---- | -------------- | ----------- | ------------------------- | -------- | ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1    | Open           | High        | Medium                    | Red      | Application crashes at any point when trying to perform any action. | Complete failure. Application is effectively unusable and delivery of the project was unsuccessful. | Schedule, Delivery                                 | Delivery date approaches and no testing has been conducted.  | Delivery date is approaching, mitigation strategy hasn't been successful. | Mitigation             | Regular and ongoing testing, and checking designed to identify issues early. | Dedicated testing and bug fixing time before delivery.       |
| 2    | Open           | High        | Low                       | Yellow   | Application doesn't work at all.                             | Complete failure. Application is effectively unusable and delivery of the project was unsuccessful. | Schedule, Delivery                                 | No testing, no oversight, no care.                           | Delivery date is approaching, mitigation strategy hasn't been successful. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, clearly defined objectives and scope, reasonable work load. | Dedicated testing and bug fixing time before delivery. Seek further assistance from project supervisor. |
| 3    | Open           | Low         | Low                       | Green    | Sensors are offline.                                         | Minimal impact. Application provides stale data to the user. Some testing may become difficult to perform. | Schedule, Budget                                   | Primarily factors outside the control of the team, also poor communication. | Sensors remain offline for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts, use last available viable data for testing. | Source data from alternate sources where possible.           |
| 4    | Open           | Low         | Low                       | Green    | Sensors are unable to report/update data.                    | Minimal impact. Some testing may become difficult to perform. | Schedule, Delivery, Budget                         | Dashboard data remains unchanged.                            | Sensors continue to fail to update the data for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts.                  | Source data from alternate sources where possible.           |
| 5    | Open           | Medium      | Low                       | Green    | Water quality data not up to date in application.            | Mild impact. May cause other data points to be stale or inaccurate. Additional time required to fix. | Schedule, Resources                                | Application data doesn't match the data from the dashboard, application unable to establish a connection for updates. | If through the mitigation strategy it becomes clear the issue is outside the team's control. | Mitigation             | Test and identify why the data isn't up to date and take appropriate action as necessary. | Notify project sponsor (i.e. DPI) contacts if issue is outside team control. |
| 6    | Open           | High        | Low                       | Yellow   | Water quality data is inaccurate in application.             | Moderate impact. May cause other data to be inaccurate also. Additional time required to fix. | Schedule, Resources                                | Lack of testing, no oversight, no sponsor input, no care.    | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback and setting reasonable work load. | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it or the project supervisor). |
| 7    | Open           | High        | Low                       | Yellow   | Water quality data displayed incorrectly in application.     | Moderate impact. May cause issues with other parts of the application such as notifications. Additional time required to fix. | Schedule, Resources                                | Lack of testing, no oversight, no sponsor input.             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback. | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it or the project supervisor or sponsor). |
| 8    | Open           | High        | Low                       | Yellow   | Water quality data not displayed at all in application.      | Moderate impact. Testing likely to be impacted, other aspects of the application may also break. Additional time required to fix. | Schedule, Resources                                | Lack of testing, no oversight, no sponsor input, no care.    | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback and setting reasonable work load. | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it or the project supervisor). |
| 9    | Open           | Low         | Low                       | Green    | Farmer (i.e. user) location can't be set.                    | Minor impact. Additional time required to fix.               | Resources                                          | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 10   | Open           | High        | Low                       | Yellow   | Sensors can't be viewed.                                     | Mild impact. Some testing may be impacted. Additional time required to fix. | Schedule, Resources                                | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 11   | Open           | High        | Low                       | Yellow   | Sensors don't display on a map.                              | Mild impact. Some testing may be impacted. Additional time required to fix. | Schedule, Resources                                | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 12   | Open           | High        | Medium                    | Red      | FarmDecisionTech API is down/broken.                         | Critical impact. Project can not proceed until rectified.    | Schedule, Delivery, Budget                         | External factors to the team.                                | API remains down for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts.                  | Notify project supervisor and potentially subject coordinator. |
| 13   | Open           | High        | Medium                    | Red      | FarmDecisionTech API returns errors/garbage data.            | Critical impact. Project can not proceed until rectified.    | Schedule, Delivery, Budget                         | External factors to the team.                                | API continues to throw errors or produce garbage data for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts.                  | Notify project supervisor and potentially subject coordinator. |
| 14   | Open           | Medium      | Low                       | Green    | Notifications don't display.                                 | Minor impact. Additional time required to fix.               | Resources                                          | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 15   | Open           | High        | Low                       | Yellow   | Team skills are inadequate to deliver the project.           | Moderate impact. Project may not be able to proceed until rectified. Project likely to be severely hampered if it does proceed. | Schedule, Delivery, Resources, Budget, Technology  | Poor education, lack of self-reflection, lack of oversight, lack of communication. | Failure to meet milestones and objectives. Failure to maintain schedule timing. | Mitigation             | Seek additional education, open communication, notify project sponsor and/or project supervisor, make adjustments to project plan. | Notify project sponsor (i.e. DPI) and/or project supervisor and/or subject coordinator. |
| 16   | Open           | Medium      | Medium                    | Yellow   | Team members become incapacitated.                           | Moderate-critical impact. Loss of team members may result in a failure to deliver the project. | Project, Schedule, Delivery, Resources, Technology | Poor oversight, unequal project loads, additional constraints from life on team members, unexpected misadventures. | Failure of team member to complete assigned work and failure to respond within a reasonable amount of time to provide an explanation. | Mitigation             | Regular team meetings, open communication, fair work loads.  | Notify project sponsor (i.e. DPI) and/or project supervisor and/or subject coordinator. |
| 17   | Open           | High        | Medium                    | Red      | Application isn't maintainable.                              | Moderate impact. May cause the project to drift off-course or become undeliverable. | Project, Schedule, Delivery, Resources             | Poor oversight, lack of team standards, lack of feedback, no reference to planning and design documents. | Stakeholder/sponsor negative feedback on multiple occasions. | Mitigation             | Regular meetings with the team, supervisor, and project sponsor (i.e. DPI). Taking onboard feedback and enacting changes as needed. | Notify project supervisor, commence immediate rectification, additional time required. |
| 18   | Open           | Medium      | Low                       | Green    | Application doesn't comply with Android/iOS standards for design. | Moderate impact. Could cause the project to miss NFRs, may cause poor performance, likely to result in an unmaintainable code base and project. | Schedule, Delivery, Resources                      | Poor oversight, lack of team standards, non feedback, no stakeholder involvement. | Feedback indicating that the application is not on task and does not comply with known standards. | Mitigation             | Team review of application code base, review of Android/iOS design standards. | Notify project supervisor, potentially notify project sponsor (i.e. DPI), seek further assistance as needed. |
| 19   | Open           | Medium      | Medium                    | Yellow   | Other types of data beyond water quality are not available (e.g. wind speed, rainfall, etc.). | Mild impact. May cause issues with calculating other data points, may cause errors with other parts of the application. May impact testing. | Project, Schedule                                  | Possible external factors outside team control, poor oversight, poor communication. | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback and setting reasonable work load. Also regular testing. | Review code and data with independent eyes (such as a team member who hasn't worked on it or the project supervisor). |
| 20 | Open | High | Low | Yellow | AWS Is Down or Otherwise Inaccessible |      |     |     |    |  | |   |
| ID | Current Status | Risk Impact | Probability of Occurrence | Risk Map | Risk Description | Project Impact | Risk Area | Symptoms | Triggers | Risk Response Strategy | Response Strategy | Contingency Plan |
| 21 | Open | High | Low | Yellow | The Simple Storage Service (S3) is misconfigured to allow unauthorized access |      |     |     |    |  | |   |
| 22 | Open | High | Medium | Red | Lambda Functions Fail To Perform As Expected Due To An Issue Of Some Form With Them |      |     |     |    |  | |   |
| 23 | Open | High | Low | Yellow | The CodePipeline Fails Due to Poor Testing And Allows a Dysfunctional Version Of The Application Through |      |     |     |    |  | |   |
| 24 | Open | High | Low | Yellow | The CodePipeline fails and the Application can't come through |      |     |     |    |  | |   |
| 25 | Open | High | Low | Yellow | BitBucket Goes Down or otherwise becomes Inaccessible |      |     |     |    |  | |   |
| 26 | Open | High | Medium | Red | Inappropriately Configured IAM roles that allow unauthorised access to server-side resources |      |     |     |    |  | |   |
| 27 | Open | Medium | Low | Green | Leakage of OAuth 2.0 tokens or credentials from the API Gateway |      |     |     |    |  | |   |
| 28 | Open | Medium | Low | Green | OAuth 2.0 credentials blocked by the FarmDecisionTech API |      |     |     |    |  | |   |
| 29 |      |    |     |       |   |      |     |     |    |  | |   |
| 30 |      |    |     |       |   |      |     |     |    |  | |   |
| 31 |      |    |     |       |   |      |     |     |    |  | |   |
| 32 |      |    |     |       |   |      |     |     |    |  | |   |
| 33 |      |    |     |       |   |      |     |     |    |  | |   |
| 34 |      |    |     |       |   |      |     |     |    |  | |   |
| 35 |      |    |     |       |   |      |     |     |    |  | |   |
| 36 |      |    |     |       |   |      |     |     |    |  | |   |
| 37 |      |    |     |       |   |      |     |     |    |  | |   |
| 38 |      |    |     |       |   |      |     |     |    |  | |   |
| 39 |      |    |     |       |   |      |     |     |    |  | |   |
| 40 |      |    |     |       |   |      |     |     |    |  | |   |
| 41 |      |    |     |       |   |      |     |     |    |  | |   |
| 42 |      |    |     |       |   |      |     |     |    |  | |   |
| 43 |      |    |     |       |   |      |     |     |    |  | |   |
| 44 |      |    |     |       |   |      |     |     |    |  | |   |
| 45 |      |    |     |       |   |      |     |     |    |  | |   |
| 46 |      |    |     |       |   |      |     |     |    |  | |   |
| 47 |      |    |     |       |   |      |     |     |    |  | |   |
| 48 |      |    |     |       |   |      |     |     |    |  | |   |
| 49 |      |    |     |       |   |      |     |     |    |  | |   |
| 50 |      |    |     |       |   |      |     |     |    |  | |   |
| 51 |      |    |     |       |   |      |     |     |    |  | |   |

## Key

**ID:** A unique ID number used to identify the risk within the tracking log.

**Current Status:**

* Open: the risk is currently open but is not yet an issue.
* Closed: the risk is no longer considered an active project threat and can be closed with or without resolution.

**Risk Impact:**

* High: risk has the potential to greatly impact project cost, schedule, and/or performance.
* Medium: risk has the potential to slightly impact project cost, schedule, and/or performance.
* Low: risk has relatively little impact on project cost, schedule, and/or performance.

**Probability of Occurrence:** Estimates the probability that the risk will at some point become a project issue.

**Risk Map:**

* Green:
    * LL (Low  Probability, Low Impact)
    * LM (Low Probability, Medium Impact)
    * ML (Medium Probability, Low Impact)
* Yellow:
    * LH (Low Probability, High Impact)
    * MM (Medium Probability, Medium Impact)
    * HL (High Probability, Low Impact)
* Red:
    * MH (Medium Probability, High Impact)
    * HM (High Probability Medium Impact)
    * HH (High Probability, High Impact)

**Risk Description:** A description of the risk.

**Project Impact:** A description of the potential project impact as a result of the risk.

**Risk Area:** May include project, budget, schedule, delivery, technology, resources, and/or miscellaneous.

**Symptoms:** Specifies the symptoms of risk that may eventually lead to the execution of a risk contingency plan.

**Triggers:** The requirement(s) to execute the contingency plan(s).

**Risk Response Strategy:** Preferred risk response strategy. May include mitigate, avoid, transfer, actively accept, passively accept, and escalate.

**Response Strategy:** An appropriate response strategy to prevent the risk from becoming an issue.

**Contingency Plan:** A description of the risk contingency plan.