# Team 2 

## Meeting Minutes

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Samuel Johnson (SJ); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 8th of April 2021 at 18:00 AEDT                              |
| **Method/Location** | Team Discord (voice channel)                                 |
| **Minutes by**      | Sam Johnson                                                  |
| **Apologies**       | Naomi Thompson (NT)                                          |

Meeting opened at 18:00 AEDT.

### Application Concepts

SJ raised the idea of displaying sensor information such as salinity and temperature in the map markers for the map view. May help farmers visualise the salinity levels across an estuary where a graph may misrepresent the distance between sensors.

Discussed background information about commercial oyster production in NSW. Currently there is only one estuary (or location) being used in the pilot. Estuaries contain harvest areas, which have harvest area management plans managed by the NSW Food Authority. The management plan defines the triggers which close or open the harvest area for safe commercial production. Within harvest areas farmers manage stock in leases. 

The NSW Food Authority maintains a list of harvest area statuses and any reasons for closure. It may be possible to pull this information into the application to provide additional benefit to farmers.

Links provided during discussion:
[DPI: Oyster Industry in NSW](https://www.dpi.nsw.gov.au/fishing/aquaculture/publications/oysters/oyster-industry-in-nsw)
[Clyde River Map showing leases](https://www.dpi.nsw.gov.au/__data/assets/pdf_file/0006/638259/OISAS2014_Clyde-River.PDF)
[NSW Food Authority: Harvest Area Status](https://www.foodauthority.nsw.gov.au/industry/shellfish/status)

### Requirements, Architecture, and Vision Documents

The team discussed the current state of the requirements document, architecture document, and vision document. 

NT has suggested that she take on the Master Test Plan document now that the Iteration Plan documents have been updated.

Will aim to finish up current documents by Saturday.

Discussed whether the application might need to make use of local device caching. Also discussed whether the application would use push or pull for updates. Decided that local device caching might be likely, but that push notifications would not be necessary as the sensors do not update often enough. It may be possible to display a 'last checked' message to indicate when data was last updated. Users could then make use of a 'pull to refresh' style feature.

### New Git Repository

The new repository is available. The team needs to recommit documents to the new repository. Discussion regarding best process/branching focused mainly on whether to use individual branches per document or branches for each group of documents. The latter would be to allow a team member to cross-reference between documents  being developed.

[**Decision:**](#Decision-Table) Create a **feature/docs** branch with individual branches that are both branched from and merged back to that branch.

[**Action:**](#Action-Register) All team members should recommit documents to the new repository in individual commits.

[**Action:**](#Action-Register) BC to give Mostafa access to the new repository.

[**Action:**](#Action-Register) CC to update links in the Team Wiki to the new repository.

### Implementation Plan Document

Document has been uploaded to the old wiki. Currently uses integer numbering for tasks in the document which restart for each document. Suggestion is to replace the numbers with the IDs used for the tasks in the Jira board.

[**Action:**](#Action-Register) NT to replace the IDs in the Implementation Plans with the Jira board IDs.

[**Action:**](#Action-Register) NT to update the Jira board with Implementation Plan tasks, create sprints for iterations.

### Authentication/React Native

Ben discussed a potential issue with the current FarmDecisionTech API with React Native. It seems like it will not be possible to obfuscate the key used to authenticate with the API. Discussed the potential risks such as a DDOS attack, key would only be short-lived. Need to obfuscate the key is an assumption the team has made. A possible solution may be to use our own API to 'wrap' the FarmDecisionTech API. Could raise with the Sponsor to get guidance as to which solution they would prefer.

### Tech Demonstrator

Discussed the requirements for the Tech Demonstrator. BC will aim to have a simple React Native app that will contact the FarmDecisionTech API.

### Critical Core Use Case

Use case should be Critical, Core, Difficult, and/or Difficult (CCRD). Discussed the use cases identified in the Requirements document. Decision was between a use case involving a map view and a use case involving the environmental sensor graphs.

[**Decision:**](#Decision-Table) The **View Environmental Conditions** use case will be the critical core use case.

Meeting closed at 19:49 AEDT.

## Action Register

| Action                                                       | Owner        | Status | Due        |
| ------------------------------------------------------------ | ------------ | ------ | ---------- |
| Recommit documents to the new repository in individual commits | All          | New    | 2021-04-12 |
| Give Mostafa access to the new repository                    | Ben          | New    | 2021-04-11 |
| Update links in the Team Wiki to the new repository          | Chris        | New    | 2021-04-12 |
| Replace the IDs in the Implementation Plans with the Jira board IDs | Naomi        | New    | 2021-04-12 |
| Update the Jira board with Implementation Plan tasks, create sprints for iterations | Naomi        | New    | 2021-04-12 |
| Complete minutes and upload to existing repository tonight   | Sam          | Done   | 2021-04-01 |
| Email DPI (and cc Mostafa) requesting review of requirements once initial draft is complete | Ben          | WIP    | 2021-04-07 |
| Email DPI (and cc Mostafa) to check if non-disclosure or privacy agreements are required | Ben          | Done   | 2021-04-05 |
| Review the Project Proposal document                         | All          | Done   | 2021-03-29 |
| Add tasks to the Jira board                                  | Chris, Naomi | WIP    | 2021-03-28 |
| Review the Iteration Plan documents                          | All          | Done   | 2021-03-29 |
| Review the Team Charter document again                       | All          | Done   | 2021-03-29 |
| Update the links on the team wiki                            | Sam          | WIP    | 2021-03-29 |
| Start Project Vision document                                | Chris        | Done   | 2021-04-01 |
| Start Requirements documents                                 | Sam          | Done   | 2021-04-01 |
| Start Technology Stack documents                             | Ben          | Done   | 2021-04-01 |



## Decision Table

| ID   | Description                                                  |
| ---- | ------------------------------------------------------------ |
| 1    | Create a **feature/docs** branch with individual branches that are both branched from and merged back to that branch. |
| 2    | The **View Environmental Conditions** use case will be the critical core use case. |

