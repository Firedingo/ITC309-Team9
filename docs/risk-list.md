# Risk List



## Document Control

| Version | Changes                                                      | Author         | Date       |
| ------- | ------------------------------------------------------------ | -------------- | ---------- |
| 0.1     | Document creation and conversion.                            | Naomi Thompson | 2021-04-19 |
| 0.2     | Document partially completed.                                | Naomi Thompson | 2021-04-19 |
| 0.3     | Minor formatting and additional risks added.                 | Naomi Thompson | 2021-04-21 |
| 0.4     | Corrected formatting, grammar, and wording.                  | Ben Cummings   | 2021-04-21 |
| 1.0     | Added a Table Of Contents, Revised Existing Risks And Added 9 Additional Risks | Naomi Thompson | 2021-05-28 |



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
| 3    | Open           | Low         | Low                       | Green    | Sensors are offline or unable to report/update data | Minimal impact. Application provides stale data to the user. Some testing may become difficult to perform. | Schedule, Budget, Delivery                         | Primarily factors outside the control of the team, also poor communication. Dashboard data remains unchanged. | Sensors remain offline or continue to fail to update for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts, use last available viable data for testing. | Source data from alternate sources where possible.           |
| 4   | Open           | Medium      | Low                       | Green    | Water quality data not up to date in application.            | Mild impact. May cause other data points to be stale or inaccurate. Additional time required to fix. | Schedule, Resources                                | Application data doesn't match the data from the dashboard, application unable to establish a connection for updates. | If through the mitigation strategy it becomes clear the issue is outside the team's control. | Mitigation             | Test and identify why the data isn't up to date and take appropriate action as necessary. | Notify project sponsor (i.e. DPI) contacts if issue is outside team control. |
| 5   | Open           | High        | Low                       | Yellow   | Water quality data is inaccurate in application, is displayed incorrectly in application, does not display in application. | Moderate impact. May cause other data to be inaccurate also. Additional time required to fix. May cause issues with other parts of the application such as notifications. Testing likely to be impacted | Schedule, Resources                                | Lack of testing, no oversight, no sponsor input, no care.    | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback and setting reasonable work load. | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it or the project supervisor). |
| 6   | Open           | Low         | Low                       | Green    | Farmer (i.e. user) location can't be set.                    | Minor impact. Additional time required to fix.               | Resources                                          | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 7  | Open           | High        | Low                       | Yellow   | Sensors can't be viewed or do not display on a map.         | Mild impact. Some testing may be impacted. Additional time required to fix. | Schedule, Resources                                | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 8  | Open           | High        | Medium                    | Red      | FarmDecisionTech API is down/broken or returns errors/garbage data. | Critical impact. Project can not proceed until rectified.    | Schedule, Delivery, Budget                         | External factors to the team.                                | API remains down or continues to throw errors/produce garbage data for extended periods of time (more than 1 iteration) despite executing mitigation strategy. | Escalate Risk          | Notify project sponsor (i.e. DPI) contacts.                  | Notify project supervisor and potentially subject coordinator. |
| 9  | Open           | Medium      | Low                       | Green    | Notifications don't display.                                 | Minor impact. Additional time required to fix.               | Resources                                          | Lack of testing.                                             | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Regular and ongoing testing.                                 | Review code and water quality data with independent eyes (such as a team member who hasn't worked on it). |
| 10 | Open           | High        | Low                       | Yellow   | Team skills are inadequate to deliver the project or team members become incapacitated. | Moderate-critical impact. Project may not be able to proceed until rectified. Project likely to be severely hampered if it does proceed. Loss of team members may result in a failure to deliver the project. | Schedule, Delivery, Resources, Budget, Technology  | Poor education, lack of self-reflection, lack of oversight, lack of communication, unequal project loads, additional constraints from life on team members, unexpected misadventures. | Failure to meet milestones and objectives. Failure to maintain schedule timing. Failure of team member to complete assigned work and failure to respond within a reasonable amount of time to provide an explanation. | Mitigation             | Seek additional education, open communication, notify project sponsor and/or project supervisor, make adjustments to project plan. | Notify project sponsor (i.e. DPI) and/or project supervisor and/or subject coordinator. |
| 11 | Open           | High        | Medium                    | Red      | Application isn't maintainable.                              | Moderate impact. May cause the project to drift off-course or become undeliverable. | Project, Schedule, Delivery, Resources             | Poor oversight, lack of team standards, lack of feedback, no reference to planning and design documents. | Stakeholder/sponsor negative feedback on multiple occasions. | Mitigation             | Regular meetings with the team, supervisor, and project sponsor (i.e. DPI). Taking onboard feedback and enacting changes as needed. | Notify project supervisor, commence immediate rectification, additional time required. |
| 12 | Open           | Medium      | Low                       | Green    | Application doesn't comply with Android/iOS standards for design. | Moderate impact. Could cause the project to miss NFRs, may cause poor performance, likely to result in an unmaintainable code base and project. | Schedule, Delivery, Resources                      | Poor oversight, lack of team standards, non feedback, no stakeholder involvement. | Feedback indicating that the application is not on task and does not comply with known standards. | Mitigation             | Team review of application code base, review of Android/iOS design standards. | Notify project supervisor, potentially notify project sponsor (i.e. DPI), seek further assistance as needed. |
| 13 | Open           | Medium      | Medium                    | Yellow   | Other types of data beyond water quality are not available (e.g. wind speed, rainfall, etc.). | Mild impact. May cause issues with calculating other data points, may cause errors with other parts of the application. May impact testing. | Project, Schedule                                  | Possible external factors outside team control, poor oversight, poor communication. | If over an extended period of time (such as 2 consecutive iterations) and the mitigation strategy has had minimal impact. | Mitigation             | Set regular meetings with project supervisor, ongoing testing, seek project sponsor (i.e. DPI) feedback and setting reasonable work load. Also regular testing. | Review code and data with independent eyes (such as a team member who hasn't worked on it or the project supervisor). |
| 14 | Open | High | Low | Yellow | AWS Is Down or Otherwise Inaccessible | Significant Impact on the server side of the application, minimal impact on the client side. May become a more serious issue if the outage is prolonged. Would impact testing and delivery | Project, Technology, Schedule, Delivery | External Factors, Server-side resources are unresponsive, Data not updated on Client side | Pressing timeline and extended down time or short down time but no clarity when it will be fixed. | Mitigation | If AWS remains down then attempt to move to an alternate provider if a timely solution can't be provided. | If a solution or migration have not or cannot fix the issue, then bring the server-side components in house onto a managed VPS |
| 15 | Open | High | Low | Yellow | The Simple Storage Service (S3) is misconfigured to allow unauthorized access | Unauthorized access could result in any number of issues depending on actions taken by the person with said access. As such, the impact could be minor or quite high. They could do nothing or they could delete everything. | Project, Schedule, Resources, Budget, Delivery | Could be a reference in a log through to the server-side resources being completely inaccessible. | An alert or other indication something is not right | Avoid | Check the Simple Storage Service (S3) is appropriately configured, test potential entry points. Have backups of the contents as necessary or where practical | Restrict All Access, Verify the s3 bucket's contents are ok, then reconfigure the access policy |
| 16 | Open | High | Medium | Red | Lambda Functions Fail To Perform As Expected Due To An Issue Of Some Kind With Them | The impacts here could be broad. From failure to access the FarmDecisionTech API and therefore fail to provide data to incorrect locations and even inaccurate or incorrect data due to a failure to update cached data. | Project, Schedule, Resources, Delivery | Data not updating, errors being returned, Data missing, inaccurate Data | Testing Consistently Fails, the application performs unexpectedly or erratically, Errors are apparent | Mitigate | Check the logic and syntax of the lambda functions, check the status of other components such as FarmDecisionTech API and the CodePipeline | Rewrite the entire lambda functions and seek further help and guidance from other sources |
| 17 | Open | High | Low | Yellow | The CodePipeline Fails Due to Poor Testing And Allows a Dysfunctional Version Of The Application Through | This would be bad, very very bad. Because the impact could easily knock on through large parts of the project and eventually into the end users if not caught and addressed | Project, Schedule, Resources, Budget, Delivery | Poorly defined test cases | Clearly ill defined test cases, poor understanding of what needs testing, the application coming through the CodePipeline with clearly obvious issues. | Avoid | Check the test cases before implementing, Ensure there is a well defined scope and that all aspects of that scope are understood | Implement a Rollback procedure, revisit test cases and implement smoke testing and canary deployments |
| 18 | Open | High | Low | Yellow | The CodePipeline fails at the build/test servers and the Application can't come through | This would be bad as a failure in the CodePipeline would be uncommon and problematic. | Project, Schedule, Resources, Budget, Technology, Delivery | Build/Test Servers Unavailable, errors produced, no application | Servers remain down, solution unable to rectify the problem, project progress is halted | Mitigate | Identify the cause of the downtime, take appropriate action to address this issue | Remove and replace the problematic parts of the build/test servers, up to and including the servers themselves. |
| 19 | Open | High | Low | Yellow | BitBucket Goes Down or otherwise becomes Inaccessible | Big Impact issue but relatively simple fix. | Project, Schedule, Delivery | External Factors Primarily, Repository becomes unavailable or inaccessible | Inaccessible Repository for a longer than desired time - for example 3 days. | Mitigate | Seek clarification on down time and whether work can be continued locally in the mean time. Have a backup repository. | Move local files to a new repository and/or access the backup repository |
| 20 | Open | High | Medium | Red | Inappropriately Configured IAM roles that allow unauthorised access to server-side resources | Potentially Big Impact. Unauthorized access is bad but impact is heavily dependent on what the person does once they have access | Project, Schedule, Budget, Resources, Delivery | Could be a reference in a log through to the server-side resources being completely inaccessible. | An alert or other indication something is not right | Mitigate | Confirm that unauthorized access has happened, identify how that occurred and adjust the IAM role permissions as necessary to remove the issue | Restrict All Access, check all IAM roles and allocated permissions and adjust each one individually as necessary until the issue no longer remains. |
| 21 | Open | Medium | Low | Green | Leakage of OAuth 2.0 tokens or credentials from the API Gateway & OAuth 2.0 credentials blocked by the FarmDecisionTech API | The impact of such tokens would be highly problematic if they fell into the hands of someone untoward. The FarmDecisionTech API could then be spammed thus getting the credentials blocked and preventing data from being retrieved. | Project, Schedule, Resources,  Delivery | Errors returned from the FarmDecisionTech API, Data Not Updating, Other functions not performing as expected | OAuth 2.0 Credentials still being inappropriately used and still getting blocked temporarily by the FarmDecisionTech API | Both Mitigate & Escalate | Remove or Quarantine the leaked OAuth 2.0 credentials, allow the FarmDecisionTech API to remove the restriction on them if applicable and test after some time if the credentials are still being inappropriately used | Remove the leaked OAuth 2.0 credentials and contact DPI to get new OAuth 2.0 credentials for the FarmDecisionTech API |
| 22 | Open | High | Medium | Red | Conflicts Between Team Members Prevent Progress & Delivery of the Project | Big Issue, the impact is quite severe and could potentially cause the failure of the project. | Schedule, Delivery, Resources, Budget, Technology, Project | Poor Communication, Lack Of Respect, Favouritism, Prioritization of certain member's works, Deliberate Actions to Hinder the work of another team member | Little to No Progress happening on the project. Unable to Resolve conflicts and issues between members. | Mitigate | Have a well defined team code of conduct or charter, ensure all members understand and know what is in the charter, ensure accurate records are kept, ensure that dispute resolution mechanisms are included in the team charter and deployed early when issues become apparent. Ensure issues are raised respectfully and promptly. | Source external mediation, Address all members concerns fairly and responsibly and try to find an equitable resolution. Implement a discipline system if and when it is necessary. Remove uncooperative members when and if all other options have been exhausted. |
| 23 | Open | Medium | Low | Green | React Native Charts Wrapper Library is no longer fit for purpose | Impact is problematic but not a project breaker. It has a decent impact on the client side of the application but very little on the server side of the application. | Schedule, Delivery, Resources, Technology, Project | Data is unable to be displayed, Data is slow to display, data is inaccurate when displayed due to the handling by the graph | The React native Charts Wrapper Library is not performing as required and no other solution or fix has addressed the issue | Mitigate | Identify alternative charting and graphing libraries that are compatible, fall back on tables if and as needed. | Replace React Native Charts Wrapper Library with alternative |



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