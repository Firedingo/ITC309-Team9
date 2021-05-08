# Team 2 

## Meeting Minutes

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Naomi Thompson (NT); Samuel Johnson (SJ); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 6th of May 2021 at 18:00 AEST                                |
| **Method/Location** | Team Discord (voice channel)                                 |
| **Minutes by**      | Sam Johnson                                                  |
| **Apologies**       |                                                              |

Meeting opened at 18:00 AEDT.

### Wireframes

The team discussed the PDF versions of the wireframes that CC created from the initial drawings and discussions. The team also discussed some initial tablet and PC layouts created by SJ.

The PDF wireframes were well received by the team. CC noted a couple of potential improvements. BC and NT both did not realise that there were clickable sections of the images that replicated some user behaviour. There is a concern that the project sponsor might also not realise if these were provided as is. Will mitigate by explictly mentioning. Also CC will see if there is an easier way to indicate that there are clickable regions. 

There was a suggestion to create some storyboard diagrams to indicate flow between different screens.

[**Action:**](#Action-Register) SJ to create user story storyboards in Visio before Monday.

### Sponsor Meeting

Delays to providing design material to the project sponsor will block work on the Risk List document. The main reason to provide the design documents is to confirm that the team is working in the correct direction and that we haven't overlooked something.

Aim for contact with sponsor by Monday.

### Iteration Plan

The team reviewed the latest Iteration Plan created by NT. The team discussed changing the dates on the document.  

- Reviewed  the objectives and eval criteria sections
- 'Outline' rather than 'Develop' the Executable Architecture this iteration
- Reviewed Items and Issues sections
- Discussed breaking down the Executable Architecture task into smaller tasks.

### Iterations

Priorities for the current iteration mentioned were as follows:

- CC: Vision document, wireframes, learning React Native
- SJ: Requirements document, storyboard diagrams, Tablet/PC wireframes, learning React Native with focus on unit testing
- BC: Architecture document

There was a discussion on the length of the upcoming iterations.

- E1 (current) - 26/04 to 09/05 (2 weeks) [Project Vision, Req. Model, Arch. Notebook]
- E2 - 10/05 to 23/05 (2 weeks) [Executable Architecture, Test Plan]
- E3 - 24/05 to 30/05 (1 week)
- E4 - 30/05 to 06/06 (1 week)

### Executable Architecture

BC provided a breakdown of the expected Executable Architecture tasks based on the current state of the design.

1. Server Side - AWS / Lambda resources (API Gateway)
2. React Native app talking to the API
3. Deployment

#### Server Side

- Update Infrastructure as code
  - API Gateway
  - Lambda resources
- Define request/response models
- Lambda for managing access tokens
- Write lamdas
  - Retrieve FarmDecisionTech API data
  - Other third party APIs
  - May be quite a few lamdas

#### Frontend React Native App

- Create app
- Business logic for requests
- UI pages
- Graphs for displaying data
- Mapping
  - not needed for the Critical Core Use Case

#### Misc

- Do we need to register a production domain? SSL?
  - Could DPI do this for us? May take some time.
  - BC would prefer we own it for expediency
- Testing



Meeting closed at 20:27 AEST.

## Action Register

| Action                                                       | Owner | Status | Due        |
| ------------------------------------------------------------ | ----- | ------ | ---------- |
| Create user story storyboards in Visio                       | Sam   | New    | 2021-05-10 |
| Email DPI (and cc Mostafa) requesting review of requirements once initial draft is complete | Ben   | WIP    | 2021-04-07 |
| Add actions from the minutes as tasks on the Jira board.     | Sam   | Done   | 2021-05-03 |



## Decision Table

| ID   | Description |
| ---- | ----------- |
| 8    |             |
|      |             |

