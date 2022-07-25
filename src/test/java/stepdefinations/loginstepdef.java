/*
 * package stepdefinations;
 * 
 * import java.io.IOException; import java.time.LocalDateTime; import
 * java.time.LocalTime; import java.util.Random; import
 * java.util.concurrent.ThreadLocalRandom; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait; import org.testng.Assert;
 * 
 * import com.pages.Appointment; import com.pages.Bookappointmentpage; import
 * com.pages.BookingconfigPage; import com.pages.Configurationpage; import
 * com.pages.Customer; import com.pages.Customer_info; import
 * com.pages.HomePage; import com.pages.LoginPage; import com.pages.PetWeight;
 * import com.pages.ProductStore; import com.pages.ProductlistPage; import
 * com.pages.Retailerdashboardpage; import com.pages.SignupPage; import
 * com.pages.petHairLength; import com.pages.petHairTexture; import
 * com.pages.petType; import com.pages.pet_Allergies; import
 * com.pages.pet_Combs_blades; import com.pages.pet_Decease_date; import
 * com.pages.pet_Docs; import com.pages.pet_Emergency_contact; import
 * com.pages.pet_Temperament; import com.pages.pet_Vaccination_Records; import
 * com.pages.pet_Vet; import com.pages.pettype_Desired_Hair_Length; import
 * com.pages.schedule;
 * 
 * import appHooks.ApplicationHooks; import cucumberAutomation.Base; import
 * io.cucumber.java.en.And;
 * 
 * //import com.qa.factory.DriverFactory;
 * 
 * import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * 
 * public class loginstepdef {
 * 
 * public WebDriver driver;
 * 
 * HomePage h; LoginPage l; SignupPage s; BookingconfigPage bp;
 * Retailerdashboardpage Rdb; Configurationpage C; petType PT; PetWeight PW;
 * petHairLength PHL; petHairTexture PHT; pettype_Desired_Hair_Length PDHL;
 * pet_Combs_blades PCB; pet_Temperament PTP; pet_Vaccination_Records PVR;
 * pet_Allergies PA; pet_Vet PV; pet_Docs PD; pet_Emergency_contact PEC;
 * pet_Decease_date PDD; Appointment Ap; Bookappointmentpage BAP; schedule SC;
 * Customer CU; Customer_info CI; //ApplicationHooks hooks;
 * 
 * @Given("^user is in landing page$") public void user_is_in_landing_page()
 * throws Throwable { Base base = new Base(); driver= base.getDriver();
 * System.out.println("User is in Retailer Portal");
 * System.out.println("User is in Retailer Portal1");
 * System.out.println("User is in Retailer Portal2");
 * System.out.println("User is in Retailer Portal3");
 * 
 * 
 * 
 * }
 * 
 * @When("^user enter username$") public void user_enter_username() throws
 * Throwable { l=new LoginPage (driver);
 * l.enter_username().sendKeys("jibutest@getnada.com"); Thread.sleep(2000);
 * driver.manage().window().maximize(); }
 * 
 * @When("^user enter password$") public void user_enter_password() throws
 * Throwable { l=new LoginPage(driver);
 * l.enter_password().sendKeys("etail_1202"); Thread.sleep(2000);
 * 
 * }
 * 
 * @Then("^user click signin$") public void user_click_signin() throws Throwable
 * { l=new LoginPage(driver); l.clicksignIn().click(); Thread.sleep(2000);
 * 
 * }
 * 
 * @Then("^verify retailer able to configure petType from the retailer dashboard$"
 * ) public void
 * verify_retailer_able_to_configure_petType_from_the_retailer_dashboard()
 * throws Throwable { WebElement ele1 =
 * driver.findElement(By.xpath("//h5[text()='New Pet Type']")); String
 * str=ele1.getText(); String str1="New Pet Type";
 * 
 * try{ Assert.assertEquals(str1, str); System.out.println(" - passed");
 * }catch(AssertionError e){ System.out.println(" - failed");
 * 
 * throw e; } Thread.sleep(2000); } // @Given("^user is in landing page$") //
 * public void user_is_in_landing_page() throws Throwable // { //
 * System.out.println("User is in landing page"); // // Base base = new Base();
 * // driver= base.getDriver(); //
 * //driver.findElement(By.linkText("SIGN IN")).click(); //
 * driver.findElement(By.name("username")).sendKeys("jibutest@getnada.com"); //
 * driver.findElement(By.name("password")).sendKeys("etail_1202"); //
 * driver.manage().window().maximize(); // Thread.sleep(2000); //
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * js.executeScript("window.scrollBy(0,350)", ""); //
 * driver.findElement(By.className("btn-block")).click(); // Thread.sleep(3000);
 * // // }
 * 
 * @Then("^user select Bookit from dashboard$") public void
 * user_select_Bookit_from_dashboard() throws Throwable { WebElement Source =
 * driver.findElement(By.id("dashboard-toggle")); Select dd1=new Select(Source);
 * dd1.selectByValue("bookit_only"); Thread.sleep(5000);
 * 
 * }
 * 
 * @Then("^user click on booking tab$") public void click_on_booking_tab()
 * throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); Rdb=new
 * Retailerdashboardpage(driver); Rdb.user_click_booking().click();
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on schedule tab$") public void click_on_schedule_tab()
 * throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); Rdb=new
 * Retailerdashboardpage(driver); Rdb.user_click_schedule().click();
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Select the appointment booked$") public void
 * select_the_appointment_booked() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); SC=new
 * schedule(driver); SC.user_select_date().click();
 * System.out.println("user Select date");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Check whether New Appointment button is displayed$") public void
 * check_whether_new_appointment_button_is_displayed() throws Throwable {
 * 
 * Thread.sleep(5000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); String str="New Appointment"; WebElement title =
 * driver.findElement(By.xpath("//button[text()='New Appointment']")); String
 * str1 = title.getText(); //Assert.assertEquals(text1, text2); try{
 * Assert.assertEquals(str, str1); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Click on the New Appointment button$") public void
 * click_on_the_new_appointment_button() throws Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); Ap=new
 * Appointment(driver); Ap.user_click_appointment().click(); Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Check the book a schedule page is shown$") public void
 * check_the_book_a_schedule_page_is_shown() throws Throwable {
 * 
 * Thread.sleep(5000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); String str="Book Appointment"; WebElement title =
 * driver.findElement(By.xpath("//h5[text()='Book Appointment']")); String str1
 * = title.getText(); //Assert.assertEquals(text1, text2); try{
 * Assert.assertEquals(str, str1); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Select Customer from the drop down$") public void
 * select_customer_from_the_drop_down() throws Throwable { BAP=new
 * Bookappointmentpage(driver);
 * driver.findElement(By.xpath("//div[text()='Select...']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//div[text()='ATLEY VARGHESE']")).click();
 * Thread.sleep(3000);
 * 
 * //BAP.user_enter_customer().click();
 * 
 * 
 * }
 * 
 * @Then("^Verify Service Details Section is displayed$") public void
 * verify_service_details_section_is_displayed() throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); WebElement ele1 =
 * driver.findElement(By.xpath("//h5[text()='Service Details']")); String
 * str=ele1.getText(); String str1="Service Details"; try{
 * Assert.assertEquals(str1, str); System.out.println(" - passed");
 * }catch(AssertionError e){ System.out.println("deletion - failed");
 * 
 * throw e; } Thread.sleep(3000); }
 * 
 * @Then("^Choose Service Type dropdown is displayed$") public void
 * choose_service_type_dropdown_is_displayed() throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); Thread.sleep(5000);
 * BAP.user_Select_service_type().click(); Thread.sleep(3000);
 * BAP.user_Select_service().click(); Thread.sleep(3000); }
 * 
 * @Then("^Choose Service Namedropdown is displayed$") public void
 * choose_service_namedropdown_is_displayed() throws Throwable { BAP=new
 * Bookappointmentpage(driver); Thread.sleep(5000);
 * BAP.user_service_name().click(); Thread.sleep(3000);
 * BAP.user_select_service_name().click(); Thread.sleep(4000);
 * BAP.user_click_on_attandent().click(); Thread.sleep(3000);
 * BAP.user_select_attandent().click(); Thread.sleep(3000);
 * BAP.user_select_timeSlot().click(); // Random randomDays =
 * ThreadLocalRandom.current(); // LocalDateTime date =
 * LocalDateTime.now().plusDays(randomDays.nextInt(365) + 1); //
 * System.out.println(date); BAP.user_select_date().click(); Thread.sleep(3000);
 * BAP.user_select_time().click(); Thread.sleep(3000);
 * BAP.user_Enter_tip_amount().sendKeys("20");
 * 
 * }
 * 
 * @Then("^Verify Pet details section is displayed$") public void
 * verify_pet_details_section_is_displayed() throws Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); BAP=new
 * Bookappointmentpage(driver); Thread.sleep(5000);
 * BAP.user_click_on_petdetails().click(); Thread.sleep(3000); WebElement ele1 =
 * driver.findElement(By.xpath("//h5[text()='Pet Details']")); String
 * str1="Pet Details"; String str=ele1.getText(); try{ Assert.assertEquals(str1,
 * str); System.out.println("Shown pet Details"); }catch(AssertionError e){
 * System.out.println(" - failed");
 * 
 * throw e; } }
 * 
 * @Then("^Select a Pet from Pet dropdown$") public void
 * select_a_pet_from_pet_dropdown() throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); Thread.sleep(5000);
 * BAP.user_select_pet().click(); Thread.sleep(3000);
 * BAP.user_Select_pet_name().click(); Thread.sleep(3000);
 * BAP.user_click_Temperament().click(); Thread.sleep(3000);
 * BAP.user_Select_temperament().click(); Thread.sleep(3000);
 * BAP.user_click_hairlength().click(); Thread.sleep(3000);
 * BAP.user_select_hairlength().click();
 * 
 * 
 * }
 * 
 * @Then("^Verify Other Details section is displayed$") public void
 * verify_other_details_section_is_displayed() throws Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); BAP=new
 * Bookappointmentpage(driver); Thread.sleep(5000);
 * BAP.user_click_on_otherdetails().click(); Thread.sleep(3000); WebElement ele1
 * = driver.findElement(By.xpath("//h5[text()='Other Details']")); String
 * str1="Other Details"; String str=ele1.getText(); try{
 * Assert.assertEquals(str1, str); System.out.println("shown Other Details");
 * }catch(AssertionError e){ System.out.println(" - failed");
 * 
 * throw e; } }
 * 
 * @Then("^Enter Vet information$") public void enter_vet_information() throws
 * Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); BAP.user_enter_vetname2().clear();
 * BAP.user_enter_vetname2().sendKeys("testdog"); Thread.sleep(3000);
 * BAP.user_enter_vetname1().clear();
 * BAP.user_enter_vetname1().sendKeys("testdog1");
 * 
 * }
 * 
 * @Then("^Enter the Emergency Contact information$") public void
 * enter_the_emergency_contact_information() throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); BAP.user_enter_emergency().clear();
 * BAP.user_enter_emergency().sendKeys("testdog2"); Thread.sleep(3000);
 * BAP.user_enter_emergency_number().clear();
 * BAP.user_enter_emergency_number().sendKeys("9896565983"); JavascriptExecutor
 * js = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,450)",
 * ""); }
 * 
 * @Then("^Enter Feeding information$") public void enter_feeding_information()
 * throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver);
 * BAP.user_click_how_many_times_food().click(); Thread.sleep(3000);
 * BAP.user_click_service_auto_booked().click(); Thread.sleep(3000); }
 * 
 * @Then("^Check the option whether you need recurring option or not optional$")
 * public void
 * check_the_option_whether_you_need_recurring_option_or_notoptional() throws
 * Throwable {
 * 
 * BAP=new Bookappointmentpage(driver);
 * BAP.user_click_enter_number_of_time().sendKeys("5"); Thread.sleep(3000);
 * BAP.user_click_on_booknow().click(); }
 * 
 * @Then("^Verify a pop up is shown$") public void verify_a_pop_up_is_shown()
 * throws Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); BAP=new
 * Bookappointmentpage(driver); Thread.sleep(5000); Thread.sleep(3000);
 * WebElement ele1 =
 * driver.findElement(By.xpath("(//h5[text()='Service Details'])[2]")); String
 * str1="Service Details"; String str=ele1.getText(); try{
 * Assert.assertEquals(str1, str); System.out.println("POP is Shown");
 * }catch(AssertionError e){ System.out.println(" - failed");
 * 
 * throw e;
 * 
 * } }
 * 
 * @Then("^Click on Checkout to confirm Booking.$") public void
 * click_on_checkout_to_confirm_booking()throws Throwable {
 * 
 * BAP=new Bookappointmentpage(driver); JavascriptExecutor js =
 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,650)", "");
 * BAP.user_click_on_checkout().click(); Thread.sleep(3000);
 * 
 * try { if( driver.findElement(By.
 * xpath("//div[text()='Appointment created successfully']"))!= null){
 * 
 * System.out.println("Appointment created successfully"); } }
 * 
 * catch (Exception e) { if(driver.findElement(By.
 * xpath("//div[text()='Selected pet has another appointment at selected time']"
 * ))!= null){
 * 
 * System.out.println("Selected pet has another appointment at selected time");
 * } } }
 * 
 * @Then("^check whether retailer is able to delete pet or pet is used for attanndants$"
 * ) public void
 * check_pet_already_having_schedule_for_appointmnet_able_to_delete() throws
 * Throwable { bp=new BookingconfigPage(driver); bp.user_click_delete().click();
 * bp.click_yes().click(); Thread.sleep(3000); try { if( driver.findElement(By.
 * xpath("//div[text()='Pet Type is currently used by Attendants']"))!= null){
 * 
 * System.out.println("Pet Type is currently used by Attendants"); } if(
 * driver.findElement(By.
 * xpath("//div[text()='Pet Type is currently used by Venues']"))!= null){
 * 
 * System.out.println("Pet Type is currently used by Venues"); } }
 * 
 * catch (Exception e) { if(driver.findElement(By.
 * xpath("//div[@class='Toastify__toast Toastify__toast--success']//div[1]"))!=
 * null){
 * 
 * System.out.println("Pet type deleted successfully"); } } Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on customer tab$") public void click_on_customer_tab()
 * throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); CU = new
 * Customer(driver); CU.user_click_on_customer().click();
 * System.out.println("user click on customer  ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user search customer name$") public void user_search_customername()
 * throws Throwable {
 * 
 * 
 * 
 * CU = new Customer(driver); CU.user_Search_customer().sendKeys("Anu s");
 * CU.user_click_on_submit().click(); CU.user_select_on_customer().click();
 * System.out.println("user select customer  ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Click on the menu service History$") public void
 * click_on_the_menu_service_history() throws Throwable { CI = new
 * Customer_info(driver); CI.user_click_on_service_history().click();
 * 
 * System.out.println("user select customer  ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Choose the Notes icon$") public void choose_the_notes_icon() throws
 * Throwable { Thread.sleep(3000); JavascriptExecutor js = (JavascriptExecutor)
 * driver; js.executeScript("window.scrollBy(0,+550)", ""); Thread.sleep(3000);
 * WebElement scrollArea =
 * driver.findElement(By.className("ag-body-horizontal-scroll-viewport")); //
 * Scroll to div's most right: ((JavascriptExecutor)
 * driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth",
 * scrollArea); // Or scroll the div by pixel number: ((JavascriptExecutor)
 * driver).executeScript("arguments[0].scrollLeft += 350", scrollArea);
 * Thread.sleep(5000); ((JavascriptExecutor)
 * driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth",
 * scrollArea); //Or scroll the div by pixel number: ((JavascriptExecutor)
 * driver).executeScript("arguments[0].scrollLeft -= 100", scrollArea);
 * Thread.sleep(3000);
 * 
 * driver.findElement(By.xpath("//div[@comp-id='202']")).click();
 * System.out.println("user select customer  ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Verify Appointment id is shown on the top of the pop up$") public
 * void verify_appointment_id_is_shown_on_the_top_of_the_pop_up() throws
 * Throwable {
 * 
 * Thread.sleep(3000); WebElement title = driver.findElement(By.
 * xpath("//p[text()='No General Notes for this service!']")); String
 * str="No General Notes for this service!"; String str1 = title.getText(); try{
 * Assert.assertEquals(str1, str); System.out.println(
 * " - pop Shown sucessfull"); }catch(AssertionError e){ System.out.println(
 * " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Enter the Notes$") public void enter_the_notes() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//textarea[@class='form-control']")).clear();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//textarea[@class='form-control']")).
 * sendKeys("add pet discription");
 * System.out.println("user click on pet profiles ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Submit the Notes$") public void submit_the_notes() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//button[text()='Add Notes']")).click();
 * Thread.sleep(3000); System.out.println("user click on add notes ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Click on the Edit Button corresponding to the Note to Edit$") public
 * void click_on_the_edit_button_corresponding_to_the_note_to_edit() throws
 * Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("(//button[text()='Edit Note'])[1]")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//textarea[@class='form-control']")).clear();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//textarea[@class='form-control']")).
 * sendKeys("edit the notes with discription");
 * System.out.println("user click on add notes ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Submit the Notes edit$") public void submit_the_notes_edit() throws
 * Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//button[text()='Save']")).click();
 * Thread.sleep(10000);
 * driver.findElement(By.xpath("//div[@class='modal-header']//button[1]")).click
 * (); System.out.println("user close the pop");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on pet profiles$") public void user_click_on_petprofile()
 * throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//a[text()='Pet Profiles']")).click();
 * System.out.println("user click on pet profiles ");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on add new pet$") public void user_click_on_addnewpet()
 * throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click();
 * driver.findElement(By.xpath("//button[text()='Add a new pet']")).click();
 * System.out.println("user click on add new pet");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user select pet type$") public void user_select_pettype() throws
 * Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * 
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//div[text()='select pet type']")).click();
 * Thread.sleep(3000); System.out.println("user click on add new pet");
 * driver.findElement(By.xpath("//div[text()='testpet']")).click();
 * 
 * Thread.sleep(3000); }
 * 
 * @Then("^check in pet type is able to view under the pet types  page$") public
 * void check_in_pet_type_is_able_to_view_under_the_pet_types_page() throws
 * Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * 
 * Thread.sleep(3000);
 * 
 * WebElement title =
 * driver.findElement(By.xpath("(//h6[text()='Select pet type']")); String
 * str="Select pet type"; String str1 = title.getText(); try{
 * Assert.assertEquals(str1, str); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * Thread.sleep(3000); }
 * 
 * @Given("^user add url$") public void user_add_url() throws Throwable { Base
 * base = new Base(); driver= base.getDriver2();
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("user add url"); driver.manage().window().maximize();
 * driver.findElement(By.xpath("(//li[@class='signin-nav']//i)[2]")).click();
 * Thread.sleep(3000);
 * //System.out.println("user enter valid user name and password");
 * driver.findElement(By.name("username")).sendKeys("manisha@etailpet.com");
 * driver.findElement(By.id("id_password")).sendKeys("manisha@etailpet");
 * Thread.sleep(3000); JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,350)", "");
 * driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
 * Thread.sleep(3000);
 * //driver.findElement(By.xpath("//*[@id=\'dropdownMenu1\']")).click();
 * 
 * 
 * }
 * 
 * @Then("^Choose the Book Appointment option$") public void
 * choose_the_book_appointment_option() throws Throwable { Thread.sleep(3000);
 * driver.findElement(By.xpath("//a[@title='BOOK APPOINTMENT']")).click();
 * System.out.println("user click on book appointment");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on dash board$") public void click_dasboard() throws
 * Throwable { //WebDriver driver = new ChromeDriver();
 * //driver.get("https://sandyspetstore.dev.etailpet.com/accounts/login/");
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//*[@id=\'dropdownMenu1\']")).click();
 * System.out.println("user click on dash board");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^user click on petprofile and add pet$") public void
 * click_on_petprofile_addpet() throws Throwable { //WebDriver driver = new
 * ChromeDriver();
 * //driver.get("https://sandyspetstore.dev.etailpet.com/accounts/login/");
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.xpath("//a[text()='Profile']")).click();
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,450)", ""); Thread.sleep(3000);
 * driver.findElement(By.cssSelector(
 * "a[href='/customers/booking/pet-profiles/']")).click();
 * 
 * driver.findElement(By.xpath("//a[text()='Add new pet ']")).click();
 * System.out.println("user click on dash board");
 * 
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Select the pet type as-test pet$") public void
 * Select_Pettype_as_testpet() throws Throwable { //WebDriver driver = new
 * ChromeDriver();
 * //driver.get("https://sandyspetstore.dev.etailpet.com/accounts/login/");
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * driver.findElement(By.id("pet_name")).sendKeys("labdogs");
 * System.out.println("user click on dash board");
 * driver.findElement(By.className("filter-option")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//span[text()='doggy dog']")).click();
 * 
 * }
 * 
 * 
 * @Then("^user click on Configuration$") public void click_on_Configuration()
 * throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); Rdb=new
 * Retailerdashboardpage(driver); Rdb.user_click_configuration().click();
 * Thread.sleep(3000);
 * System.out.println("user click on click configuration  "); }
 * 
 * 
 * @Then("^user click on  pet type$") public void click_on_Pet_type() throws
 * Throwable { Thread.sleep(3000);
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); C=new
 * Configurationpage(driver); C.user_click_petType().click();
 * Thread.sleep(3000);
 * 
 * System.out.println("user click on pet"); Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^verify  pet type able to deactive from the pet list$") public void
 * check_pet_type() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); PT=new
 * petType(driver); PT.user_click_on_switch().click(); Thread.sleep(3000);
 * WebElement title =
 * driver.findElement(By.xpath("//div[text()='Pet type updated successfully']"))
 * ; String str="Pet type updated successfully"; String str1 = title.getText();
 * try{ Assert.assertEquals(str1, str); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * System.out.println("Pet type updated successfully"); }
 * 
 * 
 * @Then("^user Check deactivated pet type are able to activate$") public void
 * check_pet_type_able_activate() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * Thread.sleep(5000); PT=new petType(driver);
 * PT.user_click_on_switch1().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.xpath("//div[text()='Pet type updated successfully']"))
 * ; String str="Pet type updated successfully"; String str1 = title.getText();
 * try{ Assert.assertEquals(str1, str); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * 
 * System.out.println("Pet type updated successfully"); }
 * 
 * 
 * 
 * @Then("^user click on Configuration in pet type$") public void
 * click_on_configuration() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); C=new
 * Configurationpage(driver); C.user_click_configuration().click();
 * Thread.sleep(3000);
 * 
 * System.out.println("user click on configuration");
 * 
 * 
 * }
 * 
 * @Then("^user click on weight$") public void click_on_weight() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PW=new PetWeight(driver);
 * PW.user_click_on_weight().click(); Thread.sleep(4000);
 * System.out.println("user click on weight");
 * 
 * }
 * 
 * @Then("^user Check all options are updating based on the updation from the pet type configuration$"
 * ) public void Update_weight_range() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PW=new PetWeight(driver);
 * PW.user_click_on_yes().click(); Thread.sleep(3000);
 * PW.user_click_on_addnewrange().click(); Thread.sleep(3000);
 * PW.user_enter_min_weight().clear(); PW.user_enter_min_weight().sendKeys("2");
 * Thread.sleep(3000); PW.user_enter_min_weight().clear();
 * PW.user_enter_max_weight().sendKeys("5"); }
 * 
 * @Then("^user click on save button$") public void user_click_on_save_button()
 * throws Throwable {
 * 
 * Thread.sleep(3000); JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,350)", ""); //ps=new ProductStore
 * (driver); // ps.addtoCart2().click(); PW=new PetWeight(driver);
 * PW.user_click_on_save().click(); Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("^Verify all options are updating based on the updation from the pet type configuration$"
 * ) public void
 * verify_all_options_are_updating_based_on_the_updation_from_the_pet_type_configuration
 * () throws Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * 
 * WebElement ele1 =
 * driver.findElement(By.xpath("//div[text()='Pet type updated successfully']"))
 * ; String str1="Pet type updated successfully"; String str=ele1.getText();
 * try{ Assert.assertEquals(str1, str); System.out.println(" - passed");
 * }catch(AssertionError e){ System.out.println(" - failed");
 * 
 * throw e; } }
 * 
 * @Then("^user enter pet name$") public void user_enter_petname() throws
 * Throwable {
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click(); PT=new
 * petType(driver); PT.user_enter_petname().sendKeys("labsdogs");
 * Thread.sleep(3000); System.out.println("user Enter petname");
 * 
 * }
 * 
 * @Then("^user insert image$") public void user_insert_image() throws Throwable
 * {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PT=new petType(driver);
 * PT.user_enter_petimage().sendKeys(
 * "C:\\Users\\manis\\OneDrive\\Desktop\\istockphoto-1161871064-612x612.jpg");
 * System.out.println("user Enter Pet image"); Thread.sleep(3000); }
 * 
 * @Then("^check pet type name is visible in pet weight page when click on next button$"
 * ) public void user_click_on_nextbutton_weightpage() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PT=new petType(driver);
 * PT.user_click_next().click();
 * 
 * WebElement title =
 * driver.findElement(By.xpath("//div[@class='mb-4']//p[1]")); String text1 =
 * title.getText(); String text2 =
 * "Do you wish to collect weight information for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text1, text2);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; } }
 * 
 * @Then("^Check retailer is able to select the weight range option as no / exact weight and weight ranges$"
 * ) public void user_click_on_nextbutton_weightpage_options_no() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PW=new PetWeight(driver);
 * PW.user_click_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"
 * )); String text4 =
 * "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs"
 * ; String text3 = title.getText(); //Assert.assertEquals(text1, text2); try{
 * Assert.assertEquals(text3, text4); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^verify add hair length option and click on add new hair length$")
 * public void user_verify_retailer_directedtohair_lengthpage() throws Throwable
 * {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHL=new petHairLength(driver);
 * PHL.user_click_add_new_hair_lenght().click(); Thread.sleep(3000); WebElement
 * title = driver.findElement(By.
 * xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"
 * )); String text3 = title.getText(); String text4 =
 * "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^verify retailer is able to next hair lenght by clicking on the add new hair length option$"
 * ) public void user_verify_retailer_clicking_addnew() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHL=new petHairLength(driver);
 * PHL.user_add_new_hair_lenght().sendKeys("medium"); Thread.sleep(3000);
 * PHL.user_click_on_add().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"
 * )); String text9 = title.getText(); String text8 =
 * "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text9,
 * text8); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e;
 * 
 * }
 * 
 * }
 * 
 * @Then("^verify without specifying the data$") public void
 * user_verify_retailer_clickon_buttonwothout_specifyingdata() throws Throwable
 * {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHL=new petHairLength(driver);
 * PHL.user_click_add_new_hair_lenght().click(); Thread.sleep(3000);
 * PHL.user_click_on_add().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.className("Toastify__toast-body")); String text5 =
 * title.getText(); Thread.sleep(3000); String text6 =
 * "Please Enter hair Length like Short/Medium/Long";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text5, text6);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailr is able  active and deactive the hair length options$"
 * ) public void
 * verify_retailr_is_able_active_and_deactive_the_hair_length_options() throws
 * Throwable { //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * PHL=new petHairLength(driver); PHL.user_click_on_active().click();
 * Thread.sleep(3000); PHL.user_click_on_deactive().click();
 * 
 * WebElement title = driver.findElement(By.
 * xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"
 * )); String text9 = title.getText(); String text8 =
 * "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text9,
 * text8); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e;
 * 
 * }
 * 
 * }
 * 
 * @Then("^Verify after clicking on the next button retailer is directing to hair texture section$"
 * ) public void
 * verify_after_clicking_on_the_next_button_retailer_is_directing_to_hair_texture_section
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHL=new petHairLength(driver);
 * PHL.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"
 * )); String text3 = title.getText(); String text4 =
 * "Set the Hair Texture options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verfiy add new hair texture by clicking on the add new hair texture link$"
 * ) public void
 * verfiy_add_new_hair_texture_by_clicking_on_the_add_new_hair_texture_link()
 * throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHT=new petHairTexture(driver);
 * PHT.user__click_add_new_texture().click(); Thread.sleep(3000); WebElement
 * title = driver.findElement(By.
 * xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"
 * )); String text3 = title.getText(); String text4 =
 * "Set the Hair Texture options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retiler is able to give hair texture with new option by clicking on the add new  texture$"
 * ) public void
 * verify_retiler_is_able_to_give_hair_texture_with_new_option_by_clicking_on_the_add_new_texture
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHT=new petHairTexture(driver);
 * PHT.user__Enter_add_new_texture().sendKeys("curly"); Thread.sleep(3000);
 * PHT.user_click_on_add().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"
 * )); String text3 = title.getText(); String text4 =
 * "Set the Hair Texture options you wish to offer for Pet Parents to describe this labsdogs"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is able to give hair texture wthout name and click on save button$"
 * ) public void
 * verify_retailer_is_able_to_give_hair_texture_wthout_name_and_click_on_save_button
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHT=new petHairTexture(driver);
 * PHT.user__click_add_new_texture().click(); Thread.sleep(3000);
 * PHT.user__Enter_add_new_texture().sendKeys(""); Thread.sleep(3000);
 * PHT.user_click_on_add().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.className("Toastify__toast-body")); String text5 =
 * title.getText(); String text6 =
 * "Please Enter hair texture options like Curly/Straight etc.";
 * Thread.sleep(3000); //Assert.assertEquals(text1, text2); try{
 * Assert.assertEquals(text5, text6); System.out.println( " - passed");
 * }catch(AssertionError e){ System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer by clicking on the next button will directing to deisred hair length page and pet name in the top$"
 * ) public void
 * verify_retailer_by_clicking_on_the_next_button_will_directing_to_deisred_hair_length_page
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PHT=new petHairTexture(driver);
 * PHT.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.xpath("//h6[text()='Pet Type: ']")); String text3 =
 * title.getText(); String text4 = "Pet Type: labsdogs - Desired Hair Length";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is able to seelct any option from the deired hair length option$"
 * ) public void
 * verify_retailer_is_able_to_seelct_any_option_from_the_deired_hair_length_option
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PDHL=new pettype_Desired_Hair_Length(driver);
 * PDHL.user_click_on_yes().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you wish to ask about desired hair lengths for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you wish to ask about desired hair lengths for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer while clicking the addnewlink will open new filed enter the hair texture and by clicking on the add button will able to save the hair texture$"
 * ) public void
 * verify_retailer_while_clicking_the_addnewlink_will_open_new_filed_enter_the_hair_texture_and_by_clicking_on_the_add_button_will_able_to_save_the_hair_texture
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PDHL=new pettype_Desired_Hair_Length(driver);
 * PDHL.user_click_on_add_new().click(); Thread.sleep(3000);
 * PDHL.user_enter_desired_hair_length().sendKeys("long"); Thread.sleep(3000);
 * PDHL.user_click_on_add().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='Do you wish to ask about desired hair lengths for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you wish to ask about desired hair lengths for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify after clciking on the next button user is direting to combs and blades section$"
 * ) public void
 * verify_after_clciking_on_the_next_button_user_is_direting_to_combs_and_blades_section
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PDHL=new pettype_Desired_Hair_Length(driver);
 * PDHL.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to maintain internal notes on combs and blades available to use for this pet type"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify user is able to select any option from the combs and blades$")
 * public void
 * verify_user_is_able_to_select_any_option_from_the_combs_and_blades() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PCB=new pet_Combs_blades(driver);
 * PCB.user_click_on_yes().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to maintain internal notes on combs and blades available to use for this pet type"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer by clicking on add new option inside the combs will able to give data$"
 * ) public void
 * verify_retailer_by_clicking_on_add_new_option_inside_the_combs_will_able_to_give_data
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PCB=new pet_Combs_blades(driver);
 * PCB.user_click_add_combs().click(); Thread.sleep(3000);
 * PCB.user_enter_value_on_combs().sendKeys("12"); Thread.sleep(3000);
 * PCB.user_click_on_add().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to maintain internal notes on combs and blades available to use for this pet type"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is able to give blades options$") public void
 * verify_retailer_is_able_to_give_blades_options() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PCB=new pet_Combs_blades(driver);
 * PCB.user_click_add_blades().click(); Thread.sleep(3000);
 * PCB.user_enter_value_on_blades().sendKeys("5"); Thread.sleep(3000);
 * PCB.user_click_on_add_blades(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to maintain internal notes on combs and blades available to use for this pet type"
 * ; //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3,
 * text4); System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer by clicking on the next button will directing to Temperament$"
 * ) public void
 * verify_retailer_by_clicking_on_the_next_button_will_directing_to_temperament(
 * ) throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PCB=new pet_Combs_blades(driver);
 * PCB.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you wish to ask about temperament for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is able to select option no/yes$") public void
 * verify_retailer_is_able_to_select_option_noyes() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PTP=new pet_Temperament(driver);
 * PTP.user_click_on_yes().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you wish to ask about temperament for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is able to add temperment by clicking on the add new link- click add button$"
 * ) public void
 * verify_retailer_is_able_to_add_temperment_by_clicking_on_the_add_new_link_click_add_button
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PTP=new pet_Temperament(driver);
 * PTP.user_click_on_addnew().click(); Thread.sleep(3000);
 * PTP.user_enter_temperament().sendKeys("Assertive"); Thread.sleep(3000);
 * PTP.user_click_on_add().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you wish to ask about temperament for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by clicking on next button it will directing to next section$"
 * ) public void
 * check_by_clicking_on_next_button_it_will_directing_to_next_section() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PTP=new pet_Temperament(driver);
 * PTP.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you need to have vaccination records for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you need to have vaccination records for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify user is able to select any option$") public void
 * verify_user_is_able_to_select_any_option() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PVR=new pet_Vaccination_Records(driver);
 * PVR.user_click_on_yes().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='Do you need to have vaccination records for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you need to have vaccination records for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify user is able to click on addnewvaccine link by clicking newtable will open to addvaccination details$"
 * ) public void
 * verify_user_is_able_to_click_on_addnewvaccine_link_by_clicking_newtable_will_open_to_addvaccination_details
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PVR=new pet_Vaccination_Records(driver);
 * PVR.user_click_on_add_new_vaccine().click(); Thread.sleep(3000); WebElement
 * title = driver.findElement(By.
 * xpath("//p[text()='Do you need to have vaccination records for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you need to have vaccination records for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify user enter vaccine name clickanadd create vaccine option adminstration,expiry and document uploadcheckboxes  based retailer wish ableto configureit$"
 * ) public void
 * verify_user_enter_vaccine_name_clickanadd_create_vaccine_option_adminstrationexpiry_and_document_uploadcheckboxes_based_retailer_wish_ableto_configureit
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PVR=new pet_Vaccination_Records(driver);
 * PVR.user_enter_vaccination_type().sendKeys("test"); Thread.sleep(3000);
 * PVR.user_click_on_add().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='Do you need to have vaccination records for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "Do you need to have vaccination records for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by clicking on the next buttom it will  directing to next page$"
 * ) public void
 * verify_by_clicking_on_the_next_buttom_it_will_directing_to_next_page() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PVR=new pet_Vaccination_Records(driver);
 * PVR.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.xpath("//div[@class='mb-4']//p[1]")); String text3 =
 * title.getText(); String text4 =
 * "Do you need to ask about allergies for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by selecting the option as -yes and click on next will directing to ext page$"
 * ) public void
 * verify_by_selecting_the_option_as_yes_and_click_on_next_will_directing_to_ext_page
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PA=new pet_Allergies(driver);
 * PA.user_click_on_yes().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.xpath("//div[@class='mb-4']//p[1]")); String text3 =
 * title.getText(); String text4 =
 * "Do you need to ask about allergies for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by seelcting the third  option - input filed will generated for giving the data$"
 * ) public void
 * verify_by_seelcting_the_third_option_input_filed_will_generated_for_giving_the_data
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PA=new pet_Allergies(driver);
 * PA.user_click_on_yes1().click(); Thread.sleep(3000);
 * PA.user_enter_allergies().sendKeys("test1"); Thread.sleep(3000);
 * PA.user_click_on_add().click(); Thread.sleep(3000);
 * PA.user_click_on_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.xpath("//div[@class='mb-4']//p[1]")); String text3 =
 * title.getText(); String text4 =
 * "Do you need to know who the vet is for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by add vet information by select yes$") public void
 * verify_by_add_vet_information_by_select_yes() throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PV=new pet_Vet(driver);
 * PV.user_click_on_yes().click(); Thread.sleep(3000);
 * PV.user_enter_vet().sendKeys("test12"); Thread.sleep(3000);
 * PV.user_click_on_add().click(); Thread.sleep(3000);
 * PV.user_click_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I also need to get the following other docs for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I also need to get the following other docs for this pet type";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify retailer is selected the option as yes -able to document upload$"
 * ) public void
 * verify_retailer_is_selected_the_option_as_yes_able_to_document_upload()
 * throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PD=new pet_Docs(driver);
 * PD.user_click_on_yes().click(); Thread.sleep(3000);
 * PD.user_click_on_addnewDocs().click(); Thread.sleep(3000);
 * PD.user_enter_docs().sendKeys("test25"); Thread.sleep(3000);
 * PD.user_click_on_add().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I also need to get the following other docs for this pet type']"
 * )); String text3 = title.getText(); String text4 =
 * "I also need to get the following other docs for this pet type";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by clicking on next button it will directing to Emergency Contact$"
 * ) public void
 * verify_by_clicking_on_next_button_it_will_directing_to_emergency_contact()
 * throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PD=new pet_Docs(driver);
 * PD.user_click_next().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='I would like to get an emergency contact for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to get an emergency contact for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by  selectng as -yes - able to add emergency conatct info$")
 * public void verify_by_selectng_as_yes_able_to_add_emergency_conatct_info()
 * throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PEC=new pet_Emergency_contact(driver);
 * PEC.user_click_on_yes().click(); Thread.sleep(3000);
 * PEC.user_click_on_add_new().click(); Thread.sleep(3000);
 * PEC.user_enter_emergency_contact().sendKeys("testest"); Thread.sleep(3000);
 * PEC.user_click_on_add().click(); WebElement title = driver.findElement(By.
 * xpath("//p[text()='I would like to get an emergency contact for this pet type?']"
 * )); String text3 = title.getText(); String text4 =
 * "I would like to get an emergency contact for this pet type?";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by clicking on the next is directing to Decease Date$") public
 * void verify_by_clicking_on_the_next_is_directing_to_decease_date() throws
 * Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PEC=new pet_Emergency_contact(driver);
 * PEC.user_click_next().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I would like to record decease date for this pet type']"))
 * ; String text3 = title.getText(); String text4 =
 * "I would like to record decease date for this pet type";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by  selectng as yes click on save buton, pet creation is competed or not$"
 * ) public void
 * verify_by_selectng_as_yes_click_on_save_buton_pet_creation_is_competed_or_not
 * () throws Throwable {
 * 
 * Thread.sleep(3000); //ps=new ProductStore (driver); //
 * ps.addtoCart2().click(); PDD=new pet_Decease_date(driver);
 * PDD.user_click_on_yes().click(); Thread.sleep(3000);
 * PDD.user_click_on_save().click(); Thread.sleep(3000); WebElement title =
 * driver.findElement(By.
 * xpath("//p[text()='I would like to record decease date for this pet type']"))
 * ; String text3 = title.getText(); String text4 =
 * "I would like to record decease date for this pet type";
 * //Assert.assertEquals(text1, text2); try{ Assert.assertEquals(text3, text4);
 * System.out.println( " - passed"); }catch(AssertionError e){
 * System.out.println( " - failed");
 * 
 * throw e; }
 * 
 * }
 * 
 * @Then("^Verify by pet created is successfully or not$") public void
 * verify_by_pet_created_is_successfully_or_not() throws Throwable {
 * 
 * 
 * try { if(
 * driver.findElement(By.xpath("//div[text()='Pet type added successfully!']"))!
 * = null){
 * 
 * System.out.println("Pet type added successfully!"); } }
 * 
 * catch (Exception e) { if(driver.findElement(By.
 * xpath("//div[text()='Pet type already exist with name labsdogs']"))!= null){
 * 
 * System.out.println("Pet type already exist with name labsdogs"); } } }
 * 
 * @When("^user clicks on signin link$") public void user_clicks_signinlink()
 * throws Throwable {
 * 
 * 
 * // h=new HomePage(driver); // h.clicksignin().click(); // Thread.sleep(3000);
 * 
 * }
 * 
 * @When("^user enters valid username$")
 * 
 * public void user_enters_valid_Username() throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); //
 * l.enter_username().sendKeys("Rahul@etailpet.com"); // Thread.sleep(5000);
 * 
 * }
 * 
 * @When("^user enters vaid  password$")
 * 
 * public void user_enters_valid_password() throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); // l.enterpassword().sendKeys("123456!");
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @And("^clicks on Sign-in button$")
 * 
 * public void known_user_clicks_signin() throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); // l.clicksignIn();
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * @Then("^user clicks on signup link$") public void user_clicks_signuplink()
 * throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); // l.clicksignin().click(); //
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @When("^user enters firstname$") public void user_enters_firstname() throws
 * Throwable {
 * 
 * 
 * // s=new SignupPage(driver); // s.enterfirstname().sendKeys("Rah"); //
 * 
 * 
 * }
 * 
 * @When("^user enters lastname$") public void user_enters_lastname() throws
 * Throwable { // s=new SignupPage(driver); //
 * s.enterlastname().sendKeys("Karth"); // Thread.sleep(3000);
 * 
 * }
 * 
 * @When("^user enters Email$") public void user_enters_mail() throws Throwable
 * {
 * 
 * 
 * // s=new SignupPage(driver); //
 * s.enteremail().sendKeys("rahul12karthik@gmail.com"); Thread.sleep(3000);
 * 
 * 
 * }
 * 
 * @When("^user enters phonenum$") public void user_enters_phoenum() throws
 * Throwable {
 * 
 * // s=new SignupPage(driver); // s.enterphonenum().sendKeys("9123456789"); //
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @When("^user enters externalID$") public void user_enters_externaid() throws
 * Throwable {
 * 
 * // s=new SignupPage(driver); //
 * s.enterexternalID().sendKeys("etailpet123456"); // Thread.sleep(3000);
 * 
 * }
 * 
 * @When("^user enters seconID$") public void user_enters_secondid() throws
 * Throwable {
 * 
 * // s=new SignupPage(driver); // s.secondID().sendKeys("91234567891");
 * Thread.sleep(5000); // }
 * 
 * @When("^user enters first pwd$") public void user_enters_firstpwd() throws
 * Throwable {
 * 
 * // s=new SignupPage(driver); // s.enterpwd().sendKeys("Rahul123@!");
 * Thread.sleep(5000);
 * 
 * // }
 * 
 * @When("^user enters second pwd$") public void user_enters_secondpwd() throws
 * Throwable {
 * 
 * // s=new SignupPage(driver); // s.entersecondpwd().sendKeys("Rahul123@!");
 * Thread.sleep(5000); //
 * 
 * }
 * 
 * @When("^user clicks on signup button$") public void
 * user_clicks_on_signup_button() throws Throwable {
 * 
 * // s=new SignupPage(driver); // s.signup().click(); Thread.sleep(5000); // }
 * 
 * 
 * @When("^user enters Invalid username$")
 * 
 * public void user_enters_invalid_Username() throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); // l.enter_username().sendKeys("Rahul@123"); //
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @When("^user enters Invaid  password$")
 * 
 * public void user_enters_invalid_password() throws Throwable {
 * 
 * 
 * // l=new LoginPage(driver); // l.enterpassword().sendKeys("qcbdekd!"); //
 * Thread.sleep(5000);
 * 
 * }
 * 
 * 
 * @And("^clicks on Add to cart in product view screen$")
 * 
 * public void add_to_cart1() throws Throwable {
 * 
 * 
 * // pl=new ProductlistPage (driver); // pl.addtoCart1().click();
 * 
 * //Thread.sleep(5000);
 * System.out.println("User selected product to add it to cart");
 * 
 * }
 * 
 * @And("^confirms add to cart$") public void add_to_cart2() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("User added product to cart ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @And("^User clicks on logout button$") public void add_logout_check() throws
 * Throwable {
 * 
 * 
 * // ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("User sucessfuly logged out  ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @Then("^check for Product tab and apply filters$") public void
 * checK_UI_elements() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("Apply filters and Ui tabs are displayed as expected ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * 
 * 
 * @Given("^user is in Product list page$") public void
 * user_in_productlist_page() throws Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("user is in product list page  ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @Then("^clicks on Dropdown Menu$") public void click_dropdown_menu() throws
 * Throwable {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("drop down list displayed ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * @Then("^clicks on SignOut$") public void clicks_on_signout() throws Throwable
 * {
 * 
 * 
 * //ps=new ProductStore (driver); // ps.addtoCart2().click();
 * System.out.println("user signed out succesfully  ");
 * 
 * Thread.sleep(5000);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */