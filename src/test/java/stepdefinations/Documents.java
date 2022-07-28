package stepdefinations;

import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SignupPage;
import com.pages.BKI_Documents;



import cucumberAutomation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Documents {

public WebDriver driver;

	HomePage h;
	LoginPage l;
   SignupPage s;
 BKI_Documents D; 
@Given("user is in landing page")
	public void user_is_in_landing_page() throws InterruptedException, IOException {
	System.out.println("User is in landing page");
	 Base base = new Base();
	 driver= base.getDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	   
	    
	}
   @When("user enters valid username")
    public void user_enters_valid_username() throws InterruptedException {
	System.out.println("enter a valid user id");
	l=new LoginPage(driver);
  l.enter_username().sendKeys("jibutest@getnada.com");
	  
  Thread.sleep(3000);
	
	
    
    
     }

   @When("user enters valid  password")
   public void user_enters_valid_password() throws InterruptedException {
	   System.out.println("enter a valid password");
	   l=new LoginPage(driver);
	  l.enterpassword().sendKeys("etail_1202");

   	Thread.sleep(3000);
	   
       
   }
   
   @And("clicks on Sign-in button")
   public void clicks_on_sign_in_button() throws InterruptedException {
	   System.out.println("click on Sign in button");
	   l=new LoginPage(driver);
       l.Rememberme().click();
	   l.clicksignIn().click();

    	Thread.sleep(5000);
       
   }
   
   @Then("user select Bookit from dashboard")
   public void user_select_bookit_from_dashboard() throws InterruptedException {
	   System.out.println("choose Bookit from the dash board");
	   WebElement Source = driver.findElement(By.id("dashboard-toggle"));
		  Select dd1=new Select(Source);
      	  dd1.selectByValue("bookit_only");
		  System.out.println("Switch to bookit");

		Thread.sleep(5000);
      
   }
   @Then("user click on booking tab")
   public void user_click_on_booking_tab() throws Throwable {
	 System.out.println("click on booking tab");
	 h=new HomePage(driver);
     h.user_click_booking().click();	  
   	Thread.sleep(3000);
   }
   
   @Then("^user click on Configuration$")
   public void  user_click_on_Configuration1() throws Throwable {      
    h=new HomePage(driver);
   h.user_click_configuration().click();
    Thread.sleep(7000);
 
   }
   @Then("user click on Documents")
   public void user_click_on_documents() throws InterruptedException {
	   System.out.println("click on documents");
	    D=new BKI_Documents(driver);
       D.user_click_on_Documents().click();
	     Thread.sleep(7000);
	   
   }
   @Then("user click on Add new button")
   public void user_click_on_add_new_button() throws InterruptedException {
	 System.out.println("click on Add new button");   
	 D=new BKI_Documents(driver);
     D.user_click_on_Add_New().click();
     Thread.sleep(3000);
   }
  

@Then("user enter the name of  document")
   public void user_enter_the_name_of_document() throws InterruptedException {
	   System.out.println("user enter the Document name"); 
	  String randomStr =UUID.randomUUID().toString();
	   driver.findElement(By.id("documentTypeName")).sendKeys(randomStr);
	   Thread.sleep(3000);
   }
   
   @And("user enter the index value")
   public void user_enter_the_index_value() throws InterruptedException {
	   System.out.println("user enter the index value"); 
	    driver.findElement(By.xpath("//input[@placeholder='Enter document type index value']")).sendKeys("1");
	   Thread.sleep(3000);
   }
   @Then("user click signature required")
   public void user_click_signature_required() throws InterruptedException {
	   System.out.println("click on Signature required"); 
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div/form/div[1]/div[3]/label")).click();
	   Thread.sleep(3000);
   }
   
   @Then("click on description require")
   public void click_on_description_require() throws InterruptedException {
	   System.out.println("click on descrption require"); 
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div/form/div[1]/div[4]/label")).click();
	   Thread.sleep(3000);
}
   @Then("upload the document")
   public void upload_the_document() throws InterruptedException {
	   System.out.println("upload the documnet"); 
      driver.findElement(By.id("inputGroupFile01")).sendKeys("C:\\Users\\NUZHAT\\Desktop\\cv2.pdf");
      Thread.sleep(3000);
   }

   @Then("click on save")
   public void click_on_save() throws InterruptedException {
	   System.out.println("click on save"); 
	   D=new BKI_Documents(driver);
	     D.click_on_Save().click();
	     Thread.sleep(3000);
	     
   }
   
   

@Then("verify whether the user is able to inactive the document from the document listing page")
public void  verify_whether_the_user_is_able_to_inactive_from_the_document_listing_page() throws InterruptedException {
	   System.out.println("click on inactive button");
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[2]/label/div/div[2]")).click();
	   Thread.sleep(3000);
}

@Then("verify whether the user is able to active the document from the document listing page")
public void verify_whether_the_user_is_able_to_active_from_the_document_listing_page() throws InterruptedException {
	   System.out.println("click on active button");
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[2]/label/div/div[2]")).click();
	   Thread.sleep(3000);
}
@Then("Verify whether the user is able to edit the document")
public void verify_whether_the_user_is_able_to_edit_the_document() throws InterruptedException {
	System.out.println("click on edit");
     driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
     driver.findElement(By.xpath("//*[@id=\"documentTypeName\"]")).clear();
     driver.findElement(By.xpath("//*[@id=\"documentTypeName\"]")).sendKeys("11auto");
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("2");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
     Thread.sleep(3000);
}


  @Then("verify Whether the user is able to create a document with existing name" ) 
  public void verify_whether_the_user_is_able_to_create_a_document_with_existing_name() throws InterruptedException { System.out.println("click on edit");
  D=new BKI_Documents(driver); 
  D.user_click_on_Add_New().click(); 
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"documentTypeName\"]")).sendKeys( "11auto");
  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/form/div[1]/div[2]/div/input" )).sendKeys("2");
  Thread.sleep(3000);
  driver.findElement(By.id("inputGroupFile01")).sendKeys("C:\\Users\\NUZHAT\\Desktop\\cv2.pdf");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div/form/div[3]/button")).click(); 
  Thread.sleep(3000);
  WebElement title = driver.findElement(By.className("Toastify__toast-body"));
  String text5 = title.getText();
  Thread.sleep(3000);
  String text6 = "A document with name \"11aut\" already exists. Please provide a different name";
 // Assert.assertEquals(text1, text2);		
 try{
     Assert.assertEquals(text5, text6);
     System.out.println( " - passed");
}catch(AssertionError e){
    System.out.println( " - failed");

  
  
  System.out.println("Document already exist with this name "); 
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
  Thread.sleep(3000);
  D=new BKI_Documents(driver);
  D.user_click_on_Documents().click();
  Thread.sleep(3000);
  }
 
  }
  
  
  
  @Then("verify whether the user is able to delete a document")
  public void verify_whether_the_user_is_able_to_delete_a_document() throws Throwable {
      driver.findElement(By.xpath("//button[text()='Delete']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/button[2]")).click();
      System.out.println("Document Deleted Successfully "); 
      Thread.sleep(3000);
    
    
  }
  
  
  @Then("verify whether the user is able to delete a document with appointment")
  public void verify_whether_the_user_is_able_to_delete_a_document_with_appointment() throws Throwable {
	  driver.findElement(By.xpath("//button[text()='Delete']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/button[2]")).click();
	  Thread.sleep(3000);
	  WebElement title = driver.findElement(By.className("Toastify__toast-body"));
	  String text5 = title.getText();
	  System.out.println(text5);
      Thread.sleep(3000);
	  String text6 = "Please delete associated appointments for deleting this document option.";
	  
		  //Assert.assertEquals(text1, text2);		
	  try{
	          Assert.assertEquals(text5, text6);
	          System.out.println( " - passed");
	     }catch(AssertionError e){
          System.out.println( " - failed");

        throw e;
     }
	  driver.findElement(By.xpath("//button[text()= 'No']")).click();
  }
}
  
  

