Feature: Bookit form Retailer Dashboard

Scenario: Shampoo Selection in a Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
When user enters valid password
And user clicks on signin button
Then user selects bookit dashboard
Then user clicks configuration
Then user clicks on shampoo selection
Then verify user can create new shampoo
Then verify user can create shampoo with existing name
Then verify user can inactive from shampoo listing page
Then verify user can active from shampoo listing page
Then verify user can delete shampoo
Then verify user can delete a shampoo with appointment
