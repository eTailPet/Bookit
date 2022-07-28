Feature: Etailpet Web features

  @Smoke2
  Scenario: BKI-Documents
    Given user is in landing page
    When user enters valid username
    And user enters valid  password
    And clicks on Sign-in button
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on Documents
    Then user click on Add new button
    Then user enter the name of  document
    And user enter the index value
    Then user click signature required
    Then click on description require
    Then upload the document
    And click on save
    Then verify whether the user is able to inactive the document from the document listing page
    Then verify whether the user is able to active the document from the document listing page 
    Then Verify whether the user is able to edit the document 
    Then verify Whether the user is able to create a document with existing name 
    Then verify whether the user is able to delete a document 
    Then verify whether the user is able to delete a document with appointment