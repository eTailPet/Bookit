Feature: Etailpet Web features

  Scenario: FUNCTIONALITIES-BOOK AN APPOINTMENT-RETAILER -CONFIRMATION MAIL
 
    Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on schedule tab
    Then Check whether New Appointment button is displayed
    Then Click on the New Appointment button
    Then Check the book a schedule page is shown
    Then Select Customer from the drop down
    Then Verify Service Details Section is displayed
    Then Choose Service Type dropdown is displayed
    Then Choose Service Namedropdown is displayed
    Then Verify Pet details section is displayed
    Then Select a Pet from Pet dropdown
    Then Verify Other Details section is displayed
    Then Enter Vet information
    Then Enter the Emergency Contact information
    Then Enter Feeding information
    Then Check the option whether you need recurring option or not optional
    Then Verify a pop up is shown
    Then Click on Checkout to confirm Booking.

  Scenario: Retailer25
    Given user is in landing page
    When user enter username
    When user enter password
    Then user click signin
    Then user select Bookit from dashboard
    Then user click on customer tab
    Then user search customer name
    Then user click on pet profiles
    Then user click on add new pet
    Then user select pet type

  Scenario: customer24
    Given user add url
    Then user click on dash board
    Then user click on petprofile and add pet
    Then Select the pet type as-test pet

  Scenario: Verify whether pet type is editable from the pet type listing page21
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user click on Configuration
    Then user click on weight
    Then user Check all options are updating based on the updation from the pet type configuration
    Then user click on save button

  Scenario: Verify whether pet type is editable from the pet type listing page19
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then verify  pet type able to deactive from the pet list
    Then user Check deactivated pet type are able to activate

  Scenario: Verify whether pet type is editable from the pet type listing page20
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user click on Configuration in pet type

  Scenario: Verify whether pet type is editable from the pet type listing page18
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then verify  pet type able to deactive from the pet list

  Scenario: Verify whether pet type created is able to view under the new pet type page17
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user click on Configuration

  Scenario: Verify whether retailer is able to create pet type4
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user enter pet name
    Then user insert image

  Scenario: Verify whether retailer is able to create pet type5
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user enter pet name
    Then user insert image
    Then check pet type name is visible in pet weight page when click on next button

  Scenario: Verify whether retailer is able to create pet type6
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
    Then user select Bookit from dashboard
    Then user click on booking tab
    Then user click on Configuration
    Then user click on  pet type
    Then user enter pet name
    Then user insert image
    Then check pet type name is visible in pet weight page when click on next button
    Then Check retailer is able to select the weight range option as no / exact weight and weight ranges

  Scenario: verify retailer is directed to hair length page7
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
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

  Scenario: Verify check whether retailer is able to give hair texture8
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
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

  Scenario: Desired hair length9
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
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

  Scenario: Combs and blades10
    Given user is in landing page
    When user clicks on signin link
    When user enters valid username
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

  Scenario: Temperment11
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

  Scenario: Vaccination12
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

  Scenario: Allergies13
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

  Scenario: Document14
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

  Scenario: Emergency contact15
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

  Scenario: Deceased date16
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
