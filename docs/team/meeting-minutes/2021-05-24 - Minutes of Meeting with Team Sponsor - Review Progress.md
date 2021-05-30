# Team 2 

## Meeting Minutes - Meeting with Project Sponsor

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Naomi Thompson (NT); Samuel Johnson (SJ); Ben Sefton (BS); Matt Pierce (MP); David Taylor (DT); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 24th of May 2021 at 18:00 AEST                               |
| **Method/Location** | Microsoft Teams (link provided by DPI)                       |
| **Minutes by**      | Sam Johnson                                                  |
| **Apologies**       |                                                              |

Meeting opened at 16:00 AEST.

### Documentation Review

DPI have reviewed the documentation provided by the team. They are happy with the document and direction. Noted that the documentation provided was 'comprehensive'. Have some questions in order to understand some items.

DPI are happy with what the team is trying to produce. They may offer the application to the NSW Food Authority. The Food Authority has a private supplier that they currently aren't that happy with.

### Harvest Area Status - Food Authority Website

- DPI are happy for a web scraping approach to getting the status from that website. 
- Don't think that the Food Authority has an API for that information
- DPI could ask if one could be created, scrape in the meantime
- Team noted that it would be easy to change to an API later

### Mobile Focus

DPI wanted to ensure that the team's focus was on mobile development rather than web development.

- 'Mobile Friendly' is **THE** **priority**
- Will be used mainly on phones
- Want to present to DPI executives that way
- anything else is secondary
- web app not the priority

### Backend Services

DPI don't use Amazon Web Services (AWS), rather they have a Virtual Private Server (VPS). They are happy for us to proceed if we are committed to AWS however. There was quite a bit of discussion on this matter. The team made it clear that it could switch to using a VPS if needed. It would be easier to switch from a monolithic design to an AWS microservices design if migration needed. BS made it clear that it was up to the team as to how to proceed. However, on balance it was decided to continue with AWS.

- DPI will need to know how to access/administer
- Team might provide a 'migration guide' to discuss what might be needed to switch backend hosting.

### Deployment Diagrams

DT raised the differences between the React Native and Web app deployment diagrams. Reiterated that Mobile is the focus. 

Discussed usage of expo.io as the framework being used with React Native.

### Handover

Team will hand over:

	- AWS Resources
	- Access/details

### DPI Support

DPI will provide:

- Internal document that outlines styles, branding, and colous.
- create an internal domain: estuaries.farmdecisiontech.nsw.gov.au

### Current API Issues

The team and DPI discussed issues with the current API. DPI explained that because part of their research is to determine if the LOWRAN devices are research grade they don't purge errors from their data set. The app will need to filter this information.

- Some timestamps are coming through as null
- Low tide reading is important
  - Decisions to close/reopen harvest areas is made following a physical measurement of salinity at low tide

Discussed the difference between the high and medium salinity requirements. SJ explained that the medium requirement is for a graph that shows all salinity sensors. DPI mentioned could be a table. Discussed also showing level at last low tide.

The maintenance message on one of the sensors was a manual change. No API equivalent.

DPI is considering adding a quality data point to the rainfall time series. 1 would equal 'valid', less than one once quality degrades. Occurs when measurement differs from nearby measurements.

The weather station will sometimes report errors when the pad gets wet. Errors are standard. Example is -999 for rainfall. 

The valid range for salinity is 0-55g per Kg.

Sensors update as often as every 15 minutes. Salinity sensors are once an hour, but not on the hour. It's based on when the device is switched on.

DT asked if the team will cache data. The team explained that we will cache data, will note for users. DT requested that we mention if the cache size is left unbounded.

### Map

DPI appreciated that some information currently shown for sensors on the map view would not be displayed (battery, solar).

### Tides

If the team gets tidal information a tide chart would be good to display.

The team has looked at some weather APIs. BS suggested Willyweather. DPI are ok to cover some costs if needed. 



Everyone agreed to try to catch up in a couple of weeks.

Meeting finished at 16:59 AEST.