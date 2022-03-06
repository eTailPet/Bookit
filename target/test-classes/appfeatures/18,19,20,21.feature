Feature: Etailpet Web features 

Scenario: Check pet type able to deactive from the pet list
Given user is in landing page
When user enter username
When user enter password
Then user click signin
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Configuration
Then user click on  pet type
Then verify  pet type able to deactive from the pet list
Then user Check deactivated pet type are able to activate
Then user click on Configuration in pet type
Then user click on weight
Then user Check all options are updating based on the updation from the pet type configuration
Then user click on save button
Then Verify all options are updating based on the updation from the pet type configuration