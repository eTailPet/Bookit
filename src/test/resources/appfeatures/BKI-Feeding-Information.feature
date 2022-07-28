Feature: Etailpet Web features


  Scenario: BKI-Feeding-Information
    Given user is in landing page
    When user enters valid username
    And user enters vaid  password
    And clicks on Sign-in button
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on Feeding Information
    Then user click on Gain Free
    And user click on Gain Full
    And user enter charge
    Then click on save
