

# Clyde River Dashboard Application: Wireframes




## Document Control

| Version | Changes                                                      | Author      | Date       |
| ------- | ------------------------------------------------------------ | ----------- | ---------- |
| 0.1     | Created initial set of hand drawn images with notes for discussion | Sam Johnson | 2021-04-29 |
| 1.0     | Created markdown document for upload to git repository.      | Sam Johnson | 2021-05-02 |
|         |                                                              |             |            |

## Table of Contents


[TOC]

## Wireframes

### Introduction

As an explanation, users would arrive on the Select Location screen (2nd image) the first time they opened the app. After selecting a location (estuary) then they would be taken to the Location Screen (1st image). After a location is cached location the Location Screen would be the first displayed. 

##### Image 1

![2021-04-29_mockups_1](images\2021-04-29_mockups_1.png)



##### Image 2

![2021-04-29_mockups_2](images\2021-04-29_mockups_2.png)



### Location Screen 

This displays a bunch of cards with different information. I envisage that on a mobile this would scroll down and on a bigger screen form a grid. 

### Water Sensor List Screen 

Displays a list of water sensors (obvs) with basic information. Clicking/tapping on a sensor takes the user to a detail page for that sensor. 

### Water Sensor Screen 

Time series graph of key metrics with date selection. Could display cards with other information about the sensor below (battery etc). Note: One of the buoys is currently broken if you check the current dashboard. There's a message with the date it will be serviced. Not sure if we have to support that as a feature? 

### Select Location 

List of (oyster producing) estuaries in NSW. Can switch to map view to select. 

### Weather Sensor Metric Screen 

Not sure if I'm set on this as an idea but for this screen a single type of weather data is displayed in a time series graph with date selection. Some metrics might display together (temperature and feels like temp) and some might have additional info (rainfall triggers as in this example). Originally I had thought all of the weather data might be on a single screen.  

### Harvest Area Status Screen 

Display simple information taken from the Food Authority website (maybe). 

### Map Screens

I haven't drawn any of the Map screens (because they look like a map) but the Select Location and Sensor List screens might have tabs at the bottom to switch to a map view displaying the relevant items.