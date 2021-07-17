# Team 2 

## Meeting Minutes

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Naomi Thompson (NT); Samuel Johnson (SJ); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 13th of May 2021 at 18:00 AEST                               |
| **Method/Location** | Team Discord (voice channel)                                 |
| **Minutes by**      | Sam Johnson                                                  |
| **Apologies**       |                                                              |

Meeting opened at 18:00 AEDT.

### Review Jira Board 

The Team reviewed the tasks on the Jira Board. The sprint was rolled over to the Elaboration Iteration 2 Sprint. Discussed outstanding items from the first Elaboration Iteration.  

NT noted that the Iteration Plan is finished but hasn't been uploaded yet. Will be uploaded tonight.

BC will approve the outstanding pull requests.

### Elaboration Iteration 2 Priorities

Discussed priorities for the second elaboration iteration. Will be focussed on the Executable Architecture and the Test Plan. Executable Architecture should be broken down into tasks and put on the Jira board. Testing tasks should be created alongside those tasks.

[**Action:**](#Action-Register) BC to add Executable Architectures to the Jira board under Elaboration Iteration 2 sprint.

### Assessment 2 Feedback

Good feedback, the team was happy with our performance.

#### Project Vision

CC has been updating the Project Vision with feedback from Mostafa for a while. Will discuss the feedback further and implement changes. Discussed expanding acronyms.

#### Requirements Document

SJ will update the diagrams as discussed in the feedback. 

#### Risk List

NT will look at consolidating risks with the same causes and remediations.

#### Overall

Documents need to be more consistent. Discussed creating a style guide document. Standardise use of Table of Contents, Document Control, Heading content and sizes. 

### Review Application Flow and Design

The team reviewed the application flow diagram. 

#### Sensor page

SJ had questions about how the sensor history page might work. Summary information is available on previous screens for both water and information screens. Question was whether the sensor screen should show current information or times series history for a default period. The team decided that the summary information on the previous screen would be sufficient and that the default times series information should be shown, for the last 24 hours for example. 

NT suggested the sensor page should show the time last checked.

Suggestion that current information for other data such as battery level might be displayed in 'cards' below the primary data graph.

[**Decision:**](#Decision-Table) The Sensor Information Screen will show a time series graph for a default period of time.

#### Environmental Use Case

SJ asked for feedback on whether to split the View Environmental History use case into separate use cases for each type of environmental data. The team agreed to split the use case into separate use cases.

[**Decision:**](#Decision-Table) Split the View Environmental History use case into separate use cases.

[**Action:**](#Action-Register) SJ to split the View Environmental History use case into separate use cases in the requirements document.

#### Locations

BC queried whether DPI's API provided the list of Locations. SJ explained that the FarmDecisionTech API provided 'Sites' but that not all sites were Locations (estuaries) and some were farms or other locations. The API does not differentiate between these types of sites. The team resolved to ask DPI if they could add a type parameter to sites that would allow us to identify estuaries. This would allow the team to avoid hardcoding the Locations list. For the Executable Architecture the Location list will be hardcoded.

### Executable Architecture

Will be building the View Environmental Conditions use case. 

- Will only need to create the Select Location screen and the Location Screen. 
- Will hardcode the location list. 
- Priorities for the Location Screen will be:
  - Environmental Conditions graphs
  - Salinity graph (across an estuary)
  - Harvest area status cards (scraping from Food Authority website)

Need to understand how many Lambdas to create, will need to know how many types of cards will appear on the Location Screen. Likely one Lambda per card.

[**Action:**](#Action-Register) SJ to list the items/cards that will appear on the Location Screen.

Discussed which team members would focus on what tasks. 

- CC would like to focus on getting a graphing library to function
- BC wants to focus on the backend services
- SJ will work on displaying cards on the Location Screen
- NT will build the Harvest Area status cards. 

Members will mock data in the short term. Can use the Technical demonstrator to get started. Will build separately for now and combine efforts later. BC mentioned expo.io as a possible tool for use.

Meeting closed at 19:35 AEST.

## Action Register

| Action                                                       | Owner | Status | Due        |
| ------------------------------------------------------------ | ----- | ------ | ---------- |
| Add Executable Architectures to the Jira board under Elaboration Iteration 2 sprint | Ben   | New    | 2021-05-18 |
| Split the View Environmental History use case into separate use cases in the requirements document | Sam   | New    | 2021-05-20 |
| List the items/cards that will appear on the Location Screen | Sam   | New    | 2021-05-18 |
| Create user story storyboards in Visio                       | Sam   | Done   | 2021-05-10 |
| Email DPI (and cc Mostafa) requesting review of requirements once initial draft is complete | Ben   | Done   | 2021-04-07 |



## Decision Table

| ID   | Description                                                  |
| ---- | ------------------------------------------------------------ |
| 8    | The Sensor Information Screen will show a time series graph for a default period of time. |
| 9    | Split the View Environmental History use case into separate use cases. |

