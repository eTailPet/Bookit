Feature: Retailer Portal Bookit

  #Scenario: SERVICE HISTORY APPOINTMENT NOTES- EDIT
  #Given user is in landing page
    #When user enter username
    #When user enter password
    #Then user click signin
    #Then user select Bookit from dashboard
    #Then user click on booking tab
    #Then user click on customer tab
    #Then user search customer name
    #Then Click on the menu service History
    #Then Choose the Notes icon
    #Then Verify Appointment id is shown on the top of the pop up
    #Then Click on the Edit Button corresponding to the Note to Edit
    #Then Submit the Notes edit
@Smoke
  Scenario: pet type creation
    Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user enter pet name
    Then user insert image
    Then check pet type name is visible in pet weight page when click on next button
    Then Check retailer is able to select the weight range option as no / exact weight and weight ranges
    Then verify add hair length option and click on add new hair length
    Then verify retailer is able to next hair lenght by clicking on the add new hair length option
    Then verify without specifying the data
    Then Verify retailr is able  active and deactive the hair length options
    Then Verify after clicking on the next button retailer is directing to hair texture section
    Then Verfiy add new hair texture by clicking on the add new hair texture link
    Then Verify retiler is able to give hair texture with new option by clicking on the add new  texture
    Then Verify retailer is able to give hair texture wthout name and click on save button
    Then Verify retailer by clicking on the next button will directing to deisred hair length page and pet name in the top
    Then Verify retailer is able to seelct any option from the deired hair length option
    Then Verify retailer while clicking the addnewlink will open new filed enter the hair texture and by clicking on the add button will able to save the hair texture
    Then Verify after clciking on the next button user is direting to combs and blades section
    Then Verify user is able to select any option from the combs and blades
    Then Verify retailer by clicking on add new option inside the combs will able to give data
    Then Verify retailer is able to give blades options
    Then Verify retailer by clicking on the next button will directing to Temperament
    Then Verify retailer is able to select option no/yes
    Then Verify retailer is able to add temperment by clicking on the add new link- click add button
    Then Verify by clicking on next button it will directing to next section
    Then Verify user is able to select any option
    Then Verify user is able to click on addnewvaccine link by clicking newtable will open to addvaccination details
    Then Verify user enter vaccine name clickanadd create vaccine option adminstration,expiry and document uploadcheckboxes  based retailer wish ableto configureit
    Then Verify by clicking on the next buttom it will  directing to next page
    Then Verify by selecting the option as -yes and click on next will directing to ext page
    Then Verify by seelcting the third  option - input filed will generated for giving the data
    Then Verify by add vet information by select yes
    Then Verify retailer is selected the option as yes -able to document upload
    Then Verify by clicking on next button it will directing to Emergency Contact
    Then Verify by  selectng as -yes - able to add emergency conatct info
    Then Verify by clicking on the next is directing to Decease Date
    Then Verify by  selectng as yes click on save buton, pet creation is competed or not
    Then Verify by pet created is successfully or not

  Scenario: pet list are showing in dropdown select one of them
   Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on customer tab
    Then user search customer name
    Then user click on pet profiles
    Then user click on add new pet
    Then user select pet type

  Scenario: Verify wheter retailer is able to configure the  pet type from the retailer dashboard
    Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then verify retailer able to configure petType from the retailer dashboard
