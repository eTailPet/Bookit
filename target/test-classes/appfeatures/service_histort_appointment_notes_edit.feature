Feature: Etailpet Web features

  Scenario: SERVICE HISTORY APPOINTMENT NOTES- EDIT							
    Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on customer tab
    Then user search customer name
    Then Click on the menu service History
    Then Choose the Notes icon
    Then Verify Appointment id is shown on the top of the pop up
    Then Click on the Edit Button corresponding to the Note to Edit
    Then Submit the Notes edit