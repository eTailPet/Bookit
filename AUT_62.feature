Feature: Etailpet POS dashboard

Scenario: User logs into POS dashboard

Given user is in landing page
When user enters a valid username
When user enters a valid password
And user clicks on Sigin button
Then user switches to etailpet
#Then user enters the drawer amount
#Then verify user is able to search the products by applying the filters
#Then verify user is able to search an item
#Then verify user is able to edit the price of an item
#Then verify user is able to edit the QOH of an item
#Then verify user is able to perform the actions show on website taxable and delivery methods on an item
Then verify user is able to perform the actions show on website taxable and delivery methods on list of items
#Then verify user is able to click on clear selection
#Then verify user is able to reset to the default option
#Then verify user is able to export the file
#Then verify user is able to print one label