//package stepdefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import com.pages.Extended_behavior_information;
//import com.pages.HomePage;
//import com.pages.LoginPage;
//import com.pages.PetWeight;
//import com.pages.SignupPage;
//import com.pages.general_pet_sizes;
//import com.pages.petHairLength;
//import com.pages.petType;
//
//import appHooks.ApplicationHooks;
//import cucumberAutomation.Base;
//import io.cucumber.java.en.And;
//
////import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class BKI_Pettype {
//
//	public WebDriver driver;
//	
//	HomePage h;
//	LoginPage l;
//	SignupPage s;
//	Extended_behavior_information EBI;
//	petType PT;
//	PetWeight PW;
//	petHairLength PHL;
//	general_pet_sizes GPS;
////	ProductStore ps;
////	Add_on_service ADD;
//	//ApplicationHooks hooks;
//	
//
//	@Given("^user is in landing page$")
//	public void user_is_in_landing_page() throws Throwable
//	{
//		System.out.println("User is in landing page");
//		
//		Base base = new Base();
//		driver= base.getDriver();
//		driver.manage().window().maximize();
//	Thread.sleep(3000);
//	
//	}
//	
//	
//	  
//	   
//	   @When("^user enters valid username$")
//	  
//	    public void user_enters_valid_Username() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.enter_username().sendKeys("jibutest@getnada.com");
////	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @When("^user enters vaid  password$")
//		  
//	    public void user_enters_valid_password() throws Throwable {
//	        
//	    	
//  l=new LoginPage(driver);
//  l.enterpassword().sendKeys("etail_1202");
// 
// 	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @And("^clicks on Sign-in button$")
//		  
//	    public void known_user_clicks_signin() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.Rememberme().click();
//  l.clicksignIn().click();
//
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	   
//		@Then("^user select Bookit from dashboard$")
//		public void user_select_Bookit_from_dashboard() throws Throwable
//		{	
//			WebElement Source = driver.findElement(By.id("dashboard-toggle"));
//			  Select dd1=new Select(Source);
//			  dd1.selectByValue("bookit_only");
//			  System.out.println("Switch to bookit");
//	
//			Thread.sleep(5000);
//		
//		}
//		@Then("^user click on booking tab$")
//	    public void user_clicks_signinlink() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//        h.user_click_booking().click();	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	 @Then("^user click on Configuration$")
//	    public void  user_click_on_Configuration() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//        h.user_click_configuration().click();
//	     Thread.sleep(7000);
//	    h.user_click_Pet_Types().click();
//	    Thread.sleep(7000);
//	    }
//	 @Then("^user enter pet name$")
//	  public void user_enter_petname() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_enter_petname().sendKeys("labsdogs");
//			   Thread.sleep(3000);
//			   System.out.println("user Enter petname");
//		    	
//		    }
//	 @Then("^user insert image$")
//	  public void user_insert_image() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_enter_petimage().sendKeys("C:\\Users\\manis\\OneDrive\\Desktop\\etailpet\\labrador-retriever-dog-breed-info.jpg");
//		  PT.user_click_next().click();
//		  System.out.println("user Enter Pet image");
//		  Thread.sleep(3000);	
//		    }
//	  @Then("^Check retailer is able to select the weight range option as no / exact weight and weight ranges$")
//	  public void user_click_on_nextbutton_weightpage() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  
//		  PW=new PetWeight(driver);
//		  Thread.sleep(3000);
//		  PW.user_click_on_yes().click();
//		  Thread.sleep(4000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  PW.user_enter_min_weight().sendKeys("10");
//		  Thread.sleep(3000);
//		  PW.user_enter_max_weight().sendKeys("20");
//		  Thread.sleep(3000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
// 		  js.executeScript("window.scrollBy(0,350)", "");
// 		 Thread.sleep(4000);
//		  PW.user_enter_max_weight1().sendKeys("30");
//		  Thread.sleep(3000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  PW.user_enter_max_weight2().sendKeys("40");
//		  Thread.sleep(3000);
//		  PT.user_click_next().click();
//		  Thread.sleep(4000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Configure the given ranges to standardize some things in your system for the genernal sizing of the pet type, any weight that is entered that is larger than the large pet type will be considered as extra large']"));
//		  String text1 = title.getText();
//		  String text2 = "Configure the given ranges to standardize some things in your system for the genernal sizing of the pet type, any weight that is entered that is larger than the large pet type will be considered as extra large";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text1, text2);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	  }
//	  @Then("^Check retailer is able to enter the size$")
//	  public void Check_retailer_is_able_to_enter_the_size() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//	  
//		  GPS=new general_pet_sizes(driver);
//		  GPS.user_enter_size().sendKeys("10");
//		  Thread.sleep(3000);
//		  GPS.user_enter_size1().sendKeys("20");
//		  Thread.sleep(3000);
//		  GPS.user_enter_size2().sendKeys("30");
//		  Thread.sleep(4000);
//		  PT.user_click_next().click();
//		  Thread.sleep(4000);
////		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"));
////		  String text1 = title.getText();
////		  String text2 = "Set the Hair Lengths options you wish to offer for Pet Parents to describe this ";
////		  //Assert.assertEquals(text1, text2);		
////		  try{
////	          Assert.assertEquals(text1, text2);
////	          System.out.println( " - passed");
////	     }catch(AssertionError e){
////	          System.out.println( " - failed");
////
////	        throw e;
////	     }
//	  }
//	  @Then("^check retailer by clicking on the add new hair length option will open a text box and add button were retailer can able to give data.$")
//	  public void user_verify_retailer_directedtohair_lengthpage() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHL=new petHairLength(driver);
//		  PHL.user_click_add_new_hair_lenght().click();
//		  Thread.sleep(3000);
//		  PHL.user_add_new_hair_lenght().sendKeys("medium");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("20");
//		  Thread.sleep(3000);
//		  PHL.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_active().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_deactive().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"));
//		  String text3 = title.getText();
//		  String text4 = "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
////	  @Then("^verify retailer is able to next hair lenght by clicking on the add new hair length option$")
////      public void user_verify_retailer_clicking_addnew() throws Throwable {
////	        
////		  Thread.sleep(3000);
////		    //ps=new ProductStore (driver);
////		   // ps.addtoCart2().click();
////		  PHL=new petHairLength(driver);
////		  PHL.user_add_new_hair_lenght().sendKeys("medium");
////		  Thread.sleep(3000);
////		  PHL.user_click_on_add().click();
////		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"));
////		  String text9 = title.getText();
////		  String text8 = "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs";
////		  //Assert.assertEquals(text1, text2);		
////		  try{
////	          Assert.assertEquals(text9, text8);
////	          System.out.println( " - passed");
////	     }catch(AssertionError e){
////	          System.out.println( " - failed");
////
////	        throw e;
////	        
////	     }
////		  		    	
////	    }
//	   
//////	 @Then("^Verify the changes When user selects “NO”$")
//////	    public void  Verify_the_changes_When_user_selects_NO() throws Throwable {
//////	        
//////	    
//////	    EBI=new Extended_behavior_information (driver);
//////        EBI.click_on_no().click();
//////	    	Thread.sleep(5000);
//////	    EBI.click_on_save().click();
//////	    Thread.sleep(3000);
//////    	WebElement title = driver.findElement(By.xpath("//div[text()='Extended behavior information updated successfully!']"));
//////		  String text5 = title.getText();
//////		  Thread.sleep(3000);
//////		  String text6 = "Extended behavior information updated successfully!";
//////		 Assert.assertEquals(text5, text6);		
//////		  try{
//////	          Assert.assertEquals(text5, text6);
//////	          System.out.println( " - passed");
//////	     }catch(AssertionError e){
//////	          System.out.println( " - failed");
//////	
//////	        throw e;
//////	     }
//////	    	
//////	    }
//////		
//////	 @Then("^Verify the changes When user selects “Yes”$")
//////	    public void  Verify_the_changes_When_user_selects_Yes() throws Throwable {
//////	        
//////	    h.user_click_extended_behavior().click();
//////	    Thread.sleep(3000);
//////	    EBI=new Extended_behavior_information (driver);
//////        EBI.click_on_yes().click();
//////	    	Thread.sleep(5000);
//////	    EBI.user_sclick_on_allselect().click();
//////	        Thread.sleep(3000);
//////	    EBI.user_select_by_touchingtail().click();
//////        JavascriptExecutor js = (JavascriptExecutor) driver;
//////		js.executeScript("window.scrollBy(0,350)", "");
//////		EBI.user_feels_threatened_selectall().click();
//////		Thread.sleep(3000);
//////		EBI.user_select_never_bitten().click();
//////		Thread.sleep(3000);
//////	    EBI.click_on_save().click();
//////	    Thread.sleep(3000);
////	    try { 
////	         if(
////	         driver.findElement(By.xpath("//div[text()='Extended behavior information updated successfully!']"))!= null){
////
////	          System.out.println("Extended behavior information updated successfully!");  
////	          System.out.println("Passed!");
////	                }
////	         }
////
////	         catch (Exception e) {
////	          if(driver.findElement(By.xpath("//div[text()='At least one behavior out of each section should be selected!']"))!= null){
////	        	  System.out.println("At least one behavior out of each section should be selected!");  
////	                  System.out.println("Failed"); 
////	     
////	             
////	         }
//////		  driver.quit();
//////	    	
//////	    }
////		
//
//	   @Then("^user clicks on signup link$")
//	    public void user_clicks_signuplink() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.clicksignin().click();
////	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters firstname$")
//	    public void user_enters_firstname() throws Throwable {
//	        
//	    
////	    s=new SignupPage(driver);
////	    s.enterfirstname().sendKeys("Rah");
////	  
//	    	
//	    	
//	    }
//	   @When("^user enters lastname$")
//	    public void user_enters_lastname() throws Throwable {
////		   s=new SignupPage(driver);
////		    s.enterlastname().sendKeys("Karth");
////	
//		   Thread.sleep(3000);
//		    
//	    }
//	   @When("^user enters Email$")
//	    public void user_enters_mail() throws Throwable {
//	        
//	    	
////		   s=new SignupPage(driver);
////		    s.enteremail().sendKeys("rahul12karthik@gmail.com");
//		    Thread.sleep(3000);
//	    	
//	    	
//	    }
//	   @When("^user enters phonenum$")
//	    public void user_enters_phoenum() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.enterphonenum().sendKeys("9123456789");
////		    
//		   Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters externalID$")
//	    public void user_enters_externaid() throws Throwable {
//	            	
////		   s=new SignupPage(driver);
////		    s.enterexternalID().sendKeys("etailpet123456");
////		    
//		    Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters seconID$")
//	    public void user_enters_secondid() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.secondID().sendKeys("91234567891");
//		   Thread.sleep(5000);
////	    	
//	    }
//	   @When("^user enters first pwd$")
//	    public void user_enters_firstpwd() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.enterpwd().sendKeys("Rahul123@!");
//		   Thread.sleep(5000);
//		   
////	    	
//	    }
//	   @When("^user enters second pwd$")
//	    public void user_enters_secondpwd() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.entersecondpwd().sendKeys("Rahul123@!");
//		   Thread.sleep(5000);
////	  
//	    	
//	    }
//	   @When("^user clicks on signup button$")
//	    public void user_clicks_on_signup_button() throws Throwable {
//		   
////		   s=new SignupPage(driver);
////		    s.signup().click();
//		   Thread.sleep(5000);
////	    	
//	    }
//	   
//	   
//	   @When("^user enters Invalid username$")
//		  
//	    public void user_enters_invalid_Username() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.enter_username().sendKeys("Rahul@123");
////	  
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	   @When("^user enters Invaid  password$")
//		  
//	    public void user_enters_invalid_password() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.enterpassword().sendKeys("qcbdekd!");
////	  
//	    	Thread.sleep(5000);
//	    	
//	    }
//	
//	   
//	   @And("^clicks on Add to cart in product view screen$")
//		  
//	    public void add_to_cart1() throws Throwable {
//	        
//	    	
//	  //  pl=new ProductlistPage (driver);
//	  //  pl.addtoCart1().click();
// 
//	    	//Thread.sleep(5000);
//		   System.out.println("User selected product to add it to cart");
//	    	
//	    }
//	   
//	   @And("^confirms add to cart$")
//	    public void add_to_cart2() throws Throwable {
//	        
//	    	
//	    //ps=new ProductStore (driver);
//	   // ps.addtoCart2().click();
//		   System.out.println("User added product to cart ");
//
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	  @And("^User clicks on logout button$")
//	  public void add_logout_check() throws Throwable {
//	        
//	    	
////		   ps=new ProductStore (driver);
////		    ps.addtoCart2().click();
//			   System.out.println("User sucessfuly logged out  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	  @Then("^check for Product tab and apply filters$")
//	  public void checK_UI_elements() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("Apply filters and Ui tabs are displayed as expected ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	   
//	   
//	 
//	  @Given("^user is in Product list page$")
//	  public void user_in_productlist_page() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("user is in product list page  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	  @Then("^clicks on Dropdown Menu$")
//	  public void click_dropdown_menu() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("drop down list displayed ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	 
//	  @Then("^clicks on SignOut$")
//	  public void clicks_on_signout() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("user signed out succesfully  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	   
//	   
//	   
//	   
//}
