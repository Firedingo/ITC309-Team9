# Project Proposal - Clyde River Dashboard

## Objective
Our project is to provide a mobile friendly dashboard to access data from the Clyde River sensors.

## Background
This project is provided by [NSW Department of Primary Industries (DPI)](https://www.dpi.nsw.gov.au/) as part of the Climate Smart Pilots program designed for "Demonstrating the role of digital technology to manage climate variability" (FarmDecisionTECH, 2021). The engagement of our team to participate in this project demonstrates a clear business need for this product.
"In the Climate Smart Pilots project, digital technologies are being used to help farmers develop adaptation strategies" (Department of Primary Industries, 2021). The users of the current dashboard have reported difficulty in accessing and viewing the sensor outputs. Our team has been tasked with developing a more user-friendly mobile option for viewing this information. The Clyde River pilot now has 17 of the 22 oyster growers in the area using the system.

*This is for our demonstration site on the Clyde River using IoT weather, water salinity and temperature data students would create a Mobile App to display the data from our API.* 

*The App would display all publicly available Clyde River sensors on a map view with the ability to select a specific sensor to view the most recent telemetry. The app should also allow the user to specify a date range to view historical timeseries data for both the water quality and weather station data. Weather station data should be formatted to display with the correct aggregates (e.g. 9am to 9am 24hr rainfall sum).*

## Scope
The team will need to have further discussions to determine the features and use cases. This may require individual research, and additional meetings with the stakeholders to more adequately understand the range of sensors and the information that they wish to see displayed from the sensor array.

We propose to develop a Progressive Web Application (PWA) with *React* or *React Native* to ensure functionality and support for a variety of devices. The team has been informed most farmers use iOS (source?) however a PWA will ensure support for a variety of platforms.
Time may need to be allocated for team members who are unfamiliar with React to complete training to learn this framework

The application will contain authenticated access to the existing API to provide data from the sensors. This will allow users to view publicly available sensors without the need to login.
We can potential expand the scope by adding user management for farmers to access sensors specific to their farm. This would require a login portal, security considerations, and would need to integrate with the existing DPI user account management.

Conduct research to determine the most suitable software library for displaying the data as charts and graphs. The current dashboard uses ChartJS to produce charts, however there are other options such as ApexCharts that we can investigate.

The stakeholders have indicated they would like to see the data presented in different ways. The wind graph is not currently understood easily, and we should investigate better ways to visualise this data.
They stressed the importance of ensuring the aggregations are done correctly when using the date range selectors to filter the data. The information must be calculated with a 24-hour day commencing at 0900h.

The current dashboard displays each sensor individually, however it may be beneficial to display information across a range of sensors, such as showing the salinity levels along the length of the river.
Graphs available on the current dashboard include salinity, rainfall, wind, temperature. It may be combine additional data from alternative sources, such as the BOM, which could further enhance the information we can display. We will need to investigate alternative ways to display the sensor data, and different graph types. This should then be discussed further with the stakeholders to ensure the product meets the needs of the users.

Alerts can be activated for each of the sensors, with limits that are specific to the estuary which are set by the NSW Food Authority. Rainfall is collected at Budd Island, and growers watch their upstream salinity levels after rain.  Rainfall limits of >40ml within 24 hours or >100ml in 7 days will close the estuary. Salinity <22000ppt will close the estuary, and the salinity levels to open the estuary can vary.

The application should provide a way to enable/disable alerts for individual sensors. These alerts are currently issued as email and text messages, so we need to interface with that system. We will need to gain an understanding of this process.

## Approach

This project will follow the Unified Process development methodology. This methodology sits between waterfall and agile, and is defined by four phases.

* Inception: creating the concept of what the project will achieve, and demonstrating the team has the competency to achieve it.
* Elaboration: creating and validating an architecture and design to support implementation.
* Construction: developing and testing the majority of project software.
* Transition: demonstrating that the product is fit-for purpose and handing the product over for use and maintenance in a production environment.

We intend to operate an Agile method within the Unified Process and will conduct iterations (sprints) of two weeks each. We will run approximately twelve iterations which will be defined by the Project Plan, and individual Iteration Plans. We will manage and report each iteration using the *Jira Issue and Project Tracking* software. We will manage our source code repository with *BitBucket* which has integration with *Jira*.

We will be utilising the existing NSW Department of Primary Industries [FarmDecisionTECH(tm)](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) API to access the Clyde River sensors. 

The timeline for this project is dictated by the university semester, and the project must be completed prior to the end of Semester 2 around 11th October 2021. 

## Team
This group project will be completed as a team. We identify as Team 02 and consist of the following members.
* Chris Clark
* Benjamin Cummings
* Sam Johnson
* Naomi Thompson

We will meet a minimum of once per week at a scheduled time, with the possibility of additional meetings on an ad-hoc basis as required. In addition, we will have a fortnightly progress and update meeting the our project supervisor. Communication with the stakeholder will occur on an *as needed* basis with the possibility of scheduled recurring meetings if desired or required. 

The team will maintain contact through the Discord application for community communication. Supervisor meetings will occur using the CSU instance of Zoom videoconferencing, and our stakeholder meetings will occur through Microsoft Teams.

Documents will be published into BitBucket, although other collaboration tools (such as Google Docs) may be utilised for draft versions. Hyperlinks and duplicates of some documents will be placed in the Team Wiki on the CSU Interact site.

## Outcomes
* Deliver a web application which allows mobile access to the Clyde River sensors
* Meet the milestones as set in the Project Plan.


***
### References
Department of Primary Industries. DPI. (2021). Retrieved 22 March 2021, from https://www.dpi.nsw.gov.au/.

Department of Primary Industries. (2021, March). *FarmDecisionTECH*. https://www.farmdecisiontech.net.au/

DPI. (2021, March). *Climate Smart Pilots*. NSW Department of Primary Industries. https://www.farmdecisiontech.net.au/climate-smart-pilots/

Project proposal. University of Wollongong. (2021). Retrieved 21 March 2021, from https://www.uow.edu.au/student/learning-co-op/assessments/project-proposal/.