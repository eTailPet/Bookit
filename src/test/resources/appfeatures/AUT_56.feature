Feature: Bookit form Retailer Dashboard

Scenario: Venue configuration in the Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
When user enters valid password
And user clicks on signin button
Then user selects bookit dashboard
Then user clicks configuration
Then user clicks on venue 
Then verify user can create a venue
Then verify user can edit the venue details
Then verify user can search a venue
Then verfiy user can delete the venue
Then verify user can delete the venue with service
