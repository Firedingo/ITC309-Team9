### Meeting Minutes - Meeting with Project Sponsor

| **Attendees**       | Christopher Clark (CC); Benjamin Cummings (BC); Samuel Johnson (SJ); Naomi Thompson (NT); Ben Sefton (BS); Matt Pierce (MP); |
| ------------------- | ------------------------------------------------------------ |
| **Date and Time**   | 17th of March 2021 at 16:00 AEDT                             |
| **Method/Location** | Microsoft Teams (link provided by DPI)                       |
| **Minutes by**      | Sam Johnson                                                  |

Meeting opened at 16:00 AEDT.



BS and MP provided an overview of their area within DPI:

- part of Climate Smart Pilots
  - Sits under the Climate Branch, which is part of the Agriculture Division (one of seven in DPI).
  - Project was a 4 year project, now extended to June 2023
- They develop pilot sites in three areas:
  - Livestock
  - Horticulture 
  - Fisheries
- One of the fisheries pilot sites involves Oyster growers in the Clyde River Estuary (near Bateman's Bay)
- Questions regarding Oyster farming should go to Matt
- Questions regarding website should go to Ben



BS and MP provided an overview of current pilot and issues:

- Have 17 of the 22 oyster growers in the area on board at this stage (good result)
- There are water quality and environmental sensors distributed in the Clyde River
  - Also temperature sensors attached to oyster beds - but these are only relevant for the owner of that farm. Requires authentication.
- They can log onto the FarmDecisionTech dashboard to access environmental and water quality information
- Data comes from Things Board, which has a separate login to the FarmDecisionTech login
- Farmers have issues with login, initial password complexity, sessions timing out, and how data is currently displayed
- Needs to be an easier way to view data
- Notifications/Alerts (via text and email) are already provided by the dashboard



**Project overview**

- Provide an app for users to view data
- Should simplify access to data
  - app should log in (auth to api) so users don't need to
- There are two classes of users (potentially), as some users have additional temperature sensors on their oyster beds. Would require authentication for those users.
- Current charts are produced with ChartJS, but they have also looked at ApexCharts. DPI can assist with cost if a commercial package is required
- Device Compatibility: Android and iOS, phones and tablets. Most of the farmers use iOS while the developers mostly have Androids.
  - BS suggested that a web app would be one way to build for all targeted platforms.
- MP and BS are looking to make sure that 'aggregations' are done correctly (e.g. from 9AM to 9PM)
- Could display historical data
- Current wind graph is not well understood by the users, could be replaced by a better visualisation
- Would like to see the data presented in a different way
- Question about whether there is an existing display of the salinity level of all buoys in the estuary



**Sensor data/Impact on Fisheries**

- Every estuary has different limits on salinity/rainfall
- limits are set by the NSW Food Authority
- Rainfall limits that close the estuary:
  - Greater than 100mL within a 7 day period
  - Greater than 40mL within 24 hours
- Salinity:
  - Less than 22000 ppt will close the estuary
  - More than ??ppt will open the estuary (this varies the most)
- There are three different harvest areas in the Clyde River area.
- Growers watch the salinity levels upstream to know when to close their operations (after rainfall which lowers the salinity), then the watch the salinity rise with the tide as it goes back upstream
- Rainfall is only collected at one point (Budd Island), this is an improvement over the previous sensor which was 20km away.





Meeting closed at 16:32 AEDT