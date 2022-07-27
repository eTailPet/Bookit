Feature: Etailplus Register Workflow

  Scenario: Etailplus Guest Checkout
    Given user is in signin page
    When user enters a valid username
    When user enters a valid password
    And user clicks on sigin button
    Then user selects etailplus
    Then user clicks new sale option
    #Then user clicks on set as guest
    Then user enters upc of an item