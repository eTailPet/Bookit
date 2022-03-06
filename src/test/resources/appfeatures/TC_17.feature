
Feature: Retailer Portal Bookit

Scenario: Verify whether pet type created is able to view under the new pet type page
Given user is in landing page
When user enter username
When user enter password
Then user click signin
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Configuration
Then user click on  pet type 
Then check in pet type is able to view under the pet types  page