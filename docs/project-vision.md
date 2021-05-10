# Project Vision

## Introduction
The [NSW Department of Primary Industries (DPI)](https://www.dpi.nsw.gov.au/) have commissioned this project to support their Climate Smart Pilot program. This program uses technology to help farmers develop strategies to manage climate variability. The Clyde River site uses IoT weather, water salinity and temperature sensors which are accessibly through an API. They are seeking an improved and mobile friendly way for Clyde River oyster farmers to access environmental information (such as salinity, rainfall, etc.) from data captured by DPI sensors.

We will be utilising the existing NSW Department of Primary Industries [FarmDecisionTECH(tm)](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) API to access the Clyde River sensors. There is currently a basic dashboard provided, however the users have reported difficulty in accessing and viewing the information. The stakeholders have suggested they would like to see the data presented in different ways. They have also highlighted the importance of ensuring the aggregations are done correctly when using date range selectors to filter the data. The information must be calculated with a 24-hour day commencing at 0900h.

The application will contain authenticated access to the existing API to provide data from the sensors. This will allow users to view publicly available sensors without the need to login. We can potential expand the scope by adding user management for farmers to access sensors specific to their farm. This would require a login portal, security considerations, and would need to integrate with the existing DPI user account management.

## Positioning

### Problem Statement
**The problem of** information from DPI sensors is difficult to access  
**affects** Oyster farmers on the Clyde River, and members of the public who wish to access the sensor data for education, research, or other purposes  
**the impact of which is** underutilisation of DPI information, which impacts planning and production value of the farm.  
**a successful solution would be** a mobile application to improve access for farmers to easily view climate and weather information provided by the DPI sensors.

### Product Position Statement
**For** oyster farmers on the Clyde river  
**Who** rely on quick and easy access to climate and weather information  
**The** Clyde River Dashboard is a progressive web application  
**That** offers a responsive and modern user interface to display the required information in the most accessible way  
**Unlike** the current dashboard which requires users to register for an account, and displays data from each sensor as one long webpage.  
**Our product** will provide an easy to access solution with mobile friendly navigation for viewing information from the DPI sensors.


## Stakeholder Descriptions

### 3.1 Stakeholder Summary
The primary stakeholder is the NSW Department of Primary Industries.

Name            | Description       | Responsibilites
----------------|-------------------|----------------
Ben Sefton      |  Assistant Software Developer - Climate Applications & Digital Agriculture           | Information involving the Clyde River Dashboard and the FarmDecisionTECH API
Matt Pierce     | Agricultural Sensing Technician        | Questions regarding Climate Smart Pilot, and oyster farming
Mostafa Dashan  | Project Supervisor| Assessor. Monitors the project's progress.

### 3.2 User Environment
Users will primarily be Oyster Farmers on the Clyde River. We have been advised the majority use iOS. We propose to develop a Progressive Web Application (PWA) with React or React Native to ensure functionality and support for a variety of devices.
It is understood a farmer will use this application individually to view sensor data to inform decisions around management of the oyster farm. It is currently unclear how often or how much time is spend viewing this information.

The graphs and information will need to be able to scale to be viewed on a variety of devices, including smaller displays. The team will conduct research to determine the most suitable software library (such as ChartJS or ApexCharts) for displaying the data as charts and graphs. It is assumed that the application may be accessed outdoors, so contrast and colours should be taken into account to ensure the data can be viewed more easily regardless of external light and glare.

Alerts can be activated for each of the sensors, with limits that are specific to the estuary which are set by the NSW Food Authority. Rainfall is collected at Budd Island, and growers watch their upstream salinity levels after rain. Rainfall limits of >40ml within 24 hours or >100ml in 7 days will close the estuary. Salinity <22000ppt will close the estuary, and the salinity levels to open the estuary can vary.
The application should provide a way to enable/disable alerts for individual sensors. These alerts are currently issued as email and text messages, so we need to interface with that system. We will need to gain an understanding of this process. It may also be possible to include push notifications from the application.


## 4. Product Overview

### Capabilities:
The new system should be capable of:
* Operating on a variety of different devices
* Displaying public information from the FarmDecisionTECH(tm) API
* Handling authentication for access to the API (user login not required)
* Displaying sensors on a map view
* Selecting specific sensors to view recent telemetry
* Displaying graphical views of the data
* Calculating aggregates of the sensor data
* Allowing selection of specific date ranges for timeseries data

### Business Benefits:
It is anticipated the following benefits will be provided to DPI:
* A more friendly experience for the end users will improve access to the data
* Increased adoption and utilisation of the service
* Modern web framework for ease of support and future development
* Cloud architecture for scalable deployment to manage costs and availability 

### 4.1 Needs and Features

 Need                            | Priority  | Features                                                                 |
---------------------------------|-----------|--------------------------------------------------------------------------|
Users can access on any mobile device | High | Support for iOS, Android, and Web browser.                               |
Public access                    | High      | Ability to view sensor data without needing to login                     |
.                                | Low       | Choose a region/estuary                                                  |
.                                | Low       | Display sensor locations on map                                          |
Display Sensor data              | High      | Individual sensors and aggregated data                                   |
.                                |           | Current salinity, and temperature for each sensor                        |
.                                |           | Current salinity, and temperature for all sensors (combined)             |
.                                |           | View historical salinity, and temperature for a given time period.       |
Display climate information      | High      | Show current conditions (temperature, humidity, wind, rain, lightning)   |
.                                |           | View precipitation for specified time period.                            |
.                                |           | View wind speed, and wind gusts for specified time period.               |
.                                |           | View air temperature and relative humidity for specified time period.    |
.                                |           | View amount of sunshune and diffused light for specified time period.    |
.                                |           | View atmospheric pressure for specified time period.                     |
Check threshold values           | High      | Check if salinity has exceeded or fallen below defined limit            |
.                                |           | Check if rainfall has exceed the 24h or 7day limits                      |

## 5. Other Product Requirements

Requirement                                             | Priority  |
--------------------------------------------------------|-----------|
Availability to public (no login required)              | High      |
Accessibility phones and tablets                        | High      |
Accessibility on iOS, Android, and Browser              | High      |
Availability - indicate when data is being retrieved    | Medium    |
Usability - Adhere to design conventions                | Medium    |
Usability - Responsive design for varying display sizes | Medium    |
Security - API credentials will be obfuscated           | High      |
Reliability - interface will filter outlier data points | Low       |