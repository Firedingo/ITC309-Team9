# Team 2 

### Meeting Minutes

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Samuel Johnson (SJ); Naomi Thompson (NT); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 25th of March 2021 at 18:30 AEDT                             |
| **Method/Location** | Team Discord (voice channel)                                 |
| **Minutes by**      | Sam Johnson                                                  |

Meeting opened at 18:19 AEDT.



#### Project Documents

##### Project Proposal

CC discussed the difficulties experienced in generating the Project Proposal document. Some areas are still incomplete. Areas of overlap between the project proposal and Iteration Plan were discussed.  

**Action:** All members to review the Project Proposal document again.

The team discussed whether to have formal roles for team members, for example, did the team want a project manager? The team decided that task allotment would be done on Jira based on group consensus. A short standup held on Discord would be used to track task status. CC suggested adding a Review category to the Jira board.

**Action:** CC to create a Review column on the Jira board.

##### Iteration Plan

The current Iteration Plan document was done for tasks prior to the Inception Iteration 1 tasks. The team will keep this document as a record of the task done to date and create another Iteration Plan document for the first Inception Iteration. The team noted that the Inception Iteration 1 Plan document is due on the 27th of March. The tasks in the Iteration Plan will closely resemble those on the Jira board.

**Action:** NT to update the first Iteration Plan document.

**Action:** NT to create an Iteration Plan document for Inception Iteration 1.

**Action:** CC and NT to add tasks to the Jira board.

**Action:** All members to review the Iteration Plan documents.

##### Team Charter

The team discussed updates to the Team Charter document and the need for all members to review the document again.

**Action:** All members to review the Team Charter document again.

##### Team Wiki

The team discussed the need to check that the links on the team wiki were up to date.

**Action:** SJ to update the links on the team wiki.



#### Git Repository

The discussed the state of the current repository, its use, and the need to recreate it. It was decided that the team should recreate the repository with the discussed branch strategy (master, develop, feature branches off of develop), set a master branch restricted merging policy, and replay existing commits on the correct branches. This can proceed once current documents are finalised.

**Action:** BC and CC to recreate the repository with new policies.



#### API

The team discussed the API that has been provided by the project sponsor, DPI. Matt Pierce has provided a list of device ids which can be used to query the API. Both BC and CC report issues when attempting to query the API which may be caused by malformed requests. BC asked if the team would be happy to use Postman for API testing. CC suggested that he was familiar with a different tool but happy to use Postman.

CC had questions about whether there was additional information available from the salinity sensors that was not shown on the current dashboard.

**Motion:** That the team adopts Postman for API testing. Passed.

**Action:** BC to create a Postman collection.

**Action:** BC to test API endpoints.

**Action:** BC to provide test results and feedback to DPI.



#### Requirements

The team discussed the known and unknown requirements for the project. It was decided that the team should contact Matt Pierce to conduct further requirements gathering. Prior to that, the team should brainstorm questions. For this a new Discord channel could be created to keep comments together.

**Action:** CC to create a new Discord channel.

The team discussed what information provided by the API might be the most useful to oyster growers. Suggestions included: 

- seeing all salinity sensors on a single graph;
- being able to "drill down" by tapping on a single sensor;
- use of map views; and,
- combining third-party API data such as:
  - observed rainfall with forecast rainfall; and
  - high and low tide information.



#### Inception Iteration 1

##### Architecture/Technology Stack

The team discussed the current feeling on the technology stack options. The project sponsor would like a Progressive Web App (PWA) and indicated that the ability to compile to both Android and iOS apps may be needed. BC suggested that React Native fulfils these requirements. SJ suggested that Flutter, for which version 2.0 was just released, now also supports PWAs and could be an alternative. The team decided that, given that the project app design would not be complex and that the focus would be on informative charts and ease of use, that the quality and availability of charting libraries would likely be the deciding factor. This would seem to favour React Native at this stage. Both options will be evaluated in the coming iterations.

##### Deployment

BC suggested the use of AWS for hosting the PWA. The other option would be cheaper CPanel hosting. It was decided that AWS would be the primary candidate for hosting as:

- BC has experience with deployment;
- it is a common deployment option that the team would like experience with; and
- AWS has options for developers to work side by side with their own environments.

##### Documents

The team discussed the next set of documents to be produced. The team allocated the initial creation of each document or set of documents as follows:

- Project Vision document to CC;
- Requirements documents to SJ;
- Iteration Plan to NT; and,
- Technology Stack to BC.

**Action:**   CC to start Project Vision document.

**Action:**   SJ to start Requirements documents.

**Action:**   BC to start Technology Stack documents.



Meeting closed at 20:12 AEDT.



### Action Register

| Action                                                      | Owner        | Status | Due        |
| ----------------------------------------------------------- | ------------ | ------ | ---------- |
| Review the Project Proposal document                        | All          | New    | 2021-03-29 |
| Create a Review column on the Jira board                    | Chris        | New    | 2021-03-29 |
| Update the first Iteration Plan document                    | Naomi        | WIP    | 2021-03-27 |
| Create an Iteration Plan document for Inception Iteration 1 | Naomi        | New    | 2021-03-27 |
| Add tasks to the Jira board                                 | Chris, Naomi | New    | 2021-03-28 |
| Review the Iteration Plan documents                         | All          | New    | 2021-03-29 |
| Review the Team Charter document again                      | All          | New    | 2021-03-29 |
| Update the links on the team wiki                           | Sam          | New    | 2021-03-29 |
| Recreate the repository with new policies.                  | Ben, Chris   | New    | 2021-04-01 |
| Create a new Discord channel                                | Chris        | Done   | 2021-03-25 |
| Start Project Vision document                               | Chris        | New    | 2021-04-01 |
| Start Requirements documents                                | Sam          | New    | 2021-04-01 |
| Start Technology Stack documents                            | Ben          | New    | 2021-04-01 |
| Review and finalise team charter                            | All          | WIP    | 2021-03-14 |
| Initiate a draft Project Plan document                      | Chris        | WIP    | 2021-03-14 |

