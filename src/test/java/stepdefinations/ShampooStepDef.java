package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductStore;
import com.pages.ProductlistPage;
import com.pages.ShampooSelection;
import com.pages.SignupPage;

import appHooks.ApplicationHooks;
import cucumberAutomation.Base;
import io.cucumber.java.en.And;
//import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShampooStepDef {
	
	public WebDriver driver;
	LoginPage l;
	ShampooSelection s;
	HomePage h;


	
	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable
	{
		System.out.println("User is in landing page");
		
		Base base = new Base();
		driver= base.getDriver();
		driver.manage().window().maximize();
	Thread.sleep(3000);
	
	}
	   
	   @When("^user enters valid username$")
	  
	    public void user_enters_valid_Username() throws Throwable {
	        
	    	
   l=new LoginPage(driver);
   l.enter_username().sendKeys("jibutest@getnada.com");
//	  
	    	Thread.sleep(3000);
	    	
	    }
	   
	   @When("^user enters vaid  password$")
		  
	    public void user_enters_valid_password() throws Throwable {
	        
	    	
  l=new LoginPage(driver);
  l.enterpassword().sendKeys("etail_1202");
 
 	Thread.sleep(3000);
	    	
	    }
	   
	   @And("^clicks on Sign-in button$")
		  
	    public void known_user_clicks_signin() throws Throwable {
	        
	    	
   l=new LoginPage(driver);
   l.Rememberme().click();
  l.clicksignIn().click();

	    	Thread.sleep(5000);
	    	
	    }
	@Then("^user select Bookit from dashboard$")
	public void user_select_Bookit_from_dashboard() throws Throwable
	{	
		WebElement Source = driver.findElement(By.id("dashboard-toggle"));
		  Select dd1=new Select(Source);
		  dd1.selectByValue("bookit_only");
		Thread.sleep(5000);
		 System.out.println("Passed!");
	
	}
	 @Then("^user click on booking tab$")
	    public void user_clicks_signinlink() throws Throwable {
	        
	    
	    h=new HomePage(driver);
     h.user_click_booking().click();	  
	    	Thread.sleep(3000);
	    	
	    }
	
	 @Then("^user click on Configuration$")
	    public void  user_click_on_Configuration() throws Throwable {
	        
	    
	    h=new HomePage(driver);
     h.user_click_configuration().click();	  
	    	Thread.sleep(7000);
	    	
	    }
	
	@Then("^user clicks on shampoo selection$")
	public void user_clicks_on_shampoo_selection() throws Throwable {
		
		System.out.println("User clicks on the link Shampoo Selection");
		Thread.sleep(3000);
		s = new ShampooSelection(driver);
		s.clickShampoo().click();
		Thread.sleep(3000);
		
	}
	
	@Then("^verify user can create new shampoo$")
	public void verify_user_can_create_new_shampoo() throws Throwable {
		
		System.out.println("Verify whether user can create a new shampoo");
		s = new ShampooSelection(driver);
		Thread.sleep(3000);
		s.clickNewButton().click();
		Thread.sleep(3000);
		s.enterShampooName().sendKeys("Fluffy Tails AUT_3");
		s.enterIndex().sendKeys("1");
		Thread.sleep(3000);
		s.clickAddButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@role='alert']")).getText().equalsIgnoreCase("shampoo added successfully")){
			System.out.println("Shampoo added successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo already exist with name Fluffy Tails AUT_3");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
	}
	
	
	@Then("^verify user can create shampoo with existing name$")
	public void verify_user_can_create_shampoo_with_existing_name() throws Throwable {
		
		System.out.println("Verify whether user can create Shampoo with existing name");
		String name="Fluffy Tails AUT_3";
		s = new ShampooSelection(driver);
		s.clickNewButton().click();
		Thread.sleep(3000);
		s.enterShampooName().sendKeys("Fluffy Tails AUT_3");
		s.enterIndex().sendKeys("1");
		Thread.sleep(3000);
		s.clickAddButton().click();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Shampoo already exist with name "+name)){
			System.out.println("Shampoo already exist with name "+name);
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo added successfully");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
	}
	
	@Then("^verify user can inactive from shampoo listing page$")
	public void verify_user_can_inactive_from_shampoo_listing_page() throws Throwable {
		
		System.out.println("Verify whether user is able to inactive from the Shampoo listing page");
		s = new ShampooSelection(driver);
		String msg ="Shampoo updated successfully";
		s.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		s.clickSubmit().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Active")) {
			s.clickToggle().click();
			s.clickSave().click();
			WebDriverWait w = new WebDriverWait(driver,5);
			String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
			Assert.assertEquals(actualmsg, msg);
		}
		else {
			System.out.println("Failed!");
		}
	
		Thread.sleep(3000);
	}
	
	@Then("^verify user can active from shampoo listing page$")
	public void verify_user_can_active_from_shampoo_listing_page() throws Throwable {
		
		System.out.println("Verify whether user is able to active from the Shampoo listing page");
		s = new ShampooSelection(driver);
		String msg ="Shampoo updated successfully";
		
		
		s.clickShampoo().click();
		Thread.sleep(3000);
		s.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		s.clickSubmit().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Inactive")) {
			s.clickToggle().click();
			s.clickSave().click();	
			WebDriverWait w = new WebDriverWait(driver,5);
			String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
			Assert.assertEquals(actualmsg, msg);
		}
		else {
			System.out.println("Failed!");
		}
		
		Thread.sleep(3000);
	}
	
	
	@Then("^verify user can delete shampoo$")
	public void verify_user_can_delete_shampoo() throws Throwable {
		System.out.println("Verify whether user can delete Shampoo");
		s = new ShampooSelection(driver);
		s.clickShampoo().click();
		s.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		s.clickSubmit().click();
		Thread.sleep(3000);
		s.clickDelete().click();
		s.selectYes().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Shampoo removed successfully")){
			System.out.println("Shampoo removed successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo is used in an appointment");
			System.out.println("Failed!");
		}	
		Thread.sleep(1000);
		s.clickReset().click();
		
		Thread.sleep(3000);
	}
	
	@Then("^verify user can delete a shampoo with appointment$")
	public void verify_user_can_delete_a_shampoo_with_appointment() throws Throwable {
		
		System.out.println("Verify whether user can delete a Shampoo with appointment");
		s = new ShampooSelection(driver);
		
		s.searchShampoo().sendKeys("DSFGDFGD");
		s.clickSubmit().click();
		Thread.sleep(3000);
		s.clickDelete().click();
		Thread.sleep(3000);
		s.selectYes().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Shampoo is used in an appointment")){
			System.out.println("Shampoo is used in an appointment");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo removed successfully");
			System.out.println("Failed!");
		}
	
		Thread.sleep(3000);
		s.closeAlert().click();
		s.clickReset().click();
		Thread.sleep(3000);
	}
	
	
}
