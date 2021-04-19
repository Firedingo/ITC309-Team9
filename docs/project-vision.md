# Project Vision

## Introduction
The [NSW Department of Primary Industries (DPI)](https://www.dpi.nsw.gov.au/) have commissioned this project to support their Climate Smart Pilot program. This program uses technology to help farmers develop strategies to manage climate variability. The Clyde River site uses IoT weather, water salinity and temperature sensors which are accessibly through an API. They are seeking an improved and mobile friendly way for Clyde River oyster farmers to access environmental information (such as salinity, rainfall, etc.) from data captured by DPI sensors.

We will be utilising the existing NSW Department of Primary Industries [FarmDecisionTECH(tm)](https://www.farmdecisiontech.net.au/farmdecisiontech-api/) API to access the Clyde River sensors. There is currently a basic dashboard provided, however the users have reported difficulty in accessing and viewing the information. The stakeholders have suggested they would like to see the data presented in different ways. 


*The App would display all publicly available Clyde River sensors on a map view with the ability to select a specific sensor to view the most recent telemetry. The app should also allow the user to specify a date range to view historical timeseries data for both the water quality and weather station data. Weather station data should be formatted to display with the correct aggregates (e.g. 9am to 9am 24hr rainfall sum).*

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
Matt Pierce     | Agricultural Sensing Technician        | Questions regarding oyster farming
Mostafa Dashan  | Project Supervisor| Assessor. Monitors the project's progress.

### 3.2 User Environment
Users will primarily be Oyster Farmers on the Clyde River. We have been advised the majority use iOS. 
It is understood a farmer will use this application individually to view sensor data to inform decisions around management of the oyster farm. It is currently unclear how often or how much time is spend viewing this information.

The application will be required to run on various mobile devices with iOS specifically mentioned. The graphs and information will need to be able to scale to be viewed on smaller displays. It is assumed that the application may be accessed outdoors, so contrast and colours should be taken into account to ensure the data can be viewed more easily regardless of external light and glare.

This application is required to integrate with the FarmDecisionTECH API.

## 4. Product Overview
### 4.1 Needs and Features

 Need                            | Priority  | Features                                                                 | Planned Release 
---------------------------------|-----------|--------------------------------------------------------------------------|----------------
Users can access on any mobile device | High | Support for iOS, Android, and Web browser.                               | 16-09-2021 
Public access                    | High      | Ability to view sensor data without needing to login                     | 16-09-2021
|                                |           | Choose a region/estuary                                                  |
|                                | Low       | Display sensor locations on map                                          | 
Display Sensor data              | High      | Individual sensors and aggregated data                                   | 16-09-2021
|                                |           | Current salinity, and temperature for each sensor                        | 
|                                |           | Current salinity, and temperature for all sensors (combined)             | 
|                                |           | View historical salinity, and temperature for a given time period.       | 
Display climate information      | High      | Show current conditions (temperature, humidity, wind, rain, lightning)   | 16-09-2021
|                                |           | View precipitation for specified time period.                            | 
|                                |           | View wind speed, and wind gusts for specified time period.               | 
|                                |           | View air temperature and relative humidity for specified time period.    | 
|                                |           | View amount of sunshune and diffused light for specified time period.    | 
|                                |           | View atmospheric pressure for specified time period.                     | 
Check threshold values           | High      | Check if salinity has exceeded or fallen below definied limit            | 16-09-2021
|                                |           | Check if rainfall has exceed the 24h or 7day limits                      | 

## 5. Other Product Requirements

Requirement                                           | Priority  | Planned Release
------------------------------------------------------|-----------|----------------
Availability to public (no login required)            | High      | ?
Accessibility phones and tablets                      | High      | ?
Accessibility on iOS, Android, and Browser            | High      | ?
Availability - indicate when data is being retrieved  | Medium    | ?
Reliability - Show info within 10 seconds             | Medium    | ?



