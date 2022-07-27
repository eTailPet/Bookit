Feature: Bookit form Retailer Dashboard

Scenario: Cologne Selection in a Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
When user enters valid password
And user clicks on signin button
Then user selects bookit dashboard
Then user clicks configuration
Then user clicks on cologne selection
Then verify user can create new cologne selection
Then verify user can create cologne selection with existing name
Then verfiy user can serach from cologne selection page
Then verify user can inactive from cologne selection
Then verify user can active from cologne selection
Then verify user can delete a cologne selection
Then verify user can delete a cologne selection with appointment

