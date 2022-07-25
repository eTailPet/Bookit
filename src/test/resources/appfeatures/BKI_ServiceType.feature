Feature: Configuration Service Type in a Bookit form Retailer Dashboard

@Smoke
  Scenario: BKI-Service Type
    Given Launch the web application
    When Sign in to popup
    When Login Screen 
    Then Switch to Bookit
    When Verify whether user is able to delete the Service Types
    When Verify whether user is able to delete the Service Types with appointment
    When Verify whether retailer is able to create Service Type
   	When Verify whether retailer is able to create Service Type with Existing name
    When Verify whether Service Type is able to inactive from the Service Type listing page
   	When Verify whether Service Type is able to active from the Service Type listing page
    When Verify whether Service Type is able to search from the Service Type name in listing page