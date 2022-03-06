
Feature: Retailer Portal Bookit

Scenario: Verify wheter retailer is able to configure the  pet type from the retailer dashboard
Given user is in landing page
When user enter username
When user enter password
Then user click signin
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Configuration
Then user click on  pet type
Then verify retailer able to configure petType from the retailer dashboard