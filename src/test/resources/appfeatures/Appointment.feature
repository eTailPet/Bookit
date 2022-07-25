Feature: Check Appointment 


  Scenario: BKI-Check Appointment
  Given Launch the web application
  When Sign in to popup
  Then Login Screen
  And Switch to Bookit
  Then Verify whether user is able to delete the shampoo
  Then Verify whether user is able to search the appointment with using customer name
  Then Verify whether user is able to search the appointment with using Attendant name 
  Then Verify whether user is able to search the appointment with using Venue name 
  Then Verify whether user is able to search the appointment with using calendar start date 
  Then Verify whether user is able to reset the data by clicking on reset button