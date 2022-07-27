Feature: Bookit form Retailer Dashboard

Scenario: Service configuration in the Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
When user enters valid password
And user clicks on signin button
Then user selects bookit dashboard
Then user clicks configuration
Then user clicks on services
Then verify whether user is able to create a new service
Then verify whether user is able to create a service with existing name
Then verify whether user is able to edit the service
Then verify whether user is able to delete a service
Then verify whether user is able to delete a service with appointment
