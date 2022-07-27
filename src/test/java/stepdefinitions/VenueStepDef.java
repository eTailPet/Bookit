package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.pages.BookitLogin;
import com.pages.MenuBar;
import com.pages.VenueSelection;

import cucumberAutomation.BookitBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VenueStepDef {
	
	public WebDriver driver;
	public BookitLogin bl;
	public MenuBar m;
	public VenueSelection v;
	
	
/*	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable {
		System.out.println("User is in Signin Page");
		
		BookitBase bb = new BookitBase();
		driver = bb.getDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@When("^user enters valid username$")
	public void user_enters_valid_username() {
		
		System.out.println("User enters a valid Username");
		bl = new BookitLogin(driver);
		bl.enterUname().sendKeys("jibutest@getnada.com");
	}
	
	@When("^user enters valid password$")
	public void user_enters_valid_password(){
		
		System.out.println("User enters a valid Password");
		bl = new BookitLogin(driver);
		bl.enterPass().sendKeys("etail_1202");
	}
	
	@And("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		
		System.out.println("User clicks on Sign in button");
		bl = new BookitLogin(driver);
		bl.clickSignin().click();
		Thread.sleep(3000);
	}
	
	@Then("^user selects bookit dashboard$")
	public void user_selects_bookit_dashboard() throws Throwable {
		
		System.out.println("User selects Bookit Dashboard");
		m = new MenuBar(driver);
		Select switchToBookit = new Select(m.selectBookit());
		switchToBookit.selectByValue("bookit_only");
		Thread.sleep(3000);
	}
	
	@Then("^user clicks configuration$")
	public void user_clicks_configuration() throws Throwable {
		
		System.out.println("User clicks Configuration under Booking");
		m = new MenuBar(driver);
		m.clickBooking().click();
		Thread.sleep(1000);
		m.selectConfig().click();
		Thread.sleep(5000);
	}
	
	@Then("^user clicks on venue$")
	public void user_clicks_on_venue() throws Throwable
	{
		System.out.println("User clicks on Venue");
		v = new VenueSelection(driver);
		Thread.sleep(3000);
		v.clickVenueLink().click();
		Thread.sleep(3000);
	}
	
	@Then("^verify user can create a venue$")
	public void verify_user_can_create_a_venue() throws Throwable {
		
		System.out.println("Verify whether user can create a venue");
		String internalName ="Pet on Board";
		v= new VenueSelection(driver);
		v.addNewVenue().click();
		Thread.sleep(3000);
		v.addInternalName().sendKeys(internalName);
		v.addPublicName().sendKeys("Dog and Bone");
		v.selectLocation().click();
		Thread.sleep(1000);
		List<WebElement> locations = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		for(WebElement loc : locations) {
			if(loc.getText().contains("Sandys Warehouse1")) {
				loc.click();
				break;
			}				
		}
		
		Thread.sleep(1000);		
		v.selectService().click();
		Thread.sleep(1000);
		List<WebElement> services = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		for(WebElement service :services) {
			if(service.getText().contains("Special Pet care")) {
				service.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		v.selectService().click();
		List<WebElement> dogTypes = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		for(WebElement type :dogTypes) {
			if(type.getText().contains("labrar dogs only")) {
				type.click();
				break;
			}
		}
		


		//v.selectService().click();
		//Thread.sleep(3000);
		//List<WebElement> size = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		//for(WebElement type :dogTypes) {
		//	if(type.getText().contains("small")) {
		//		type.click();
		//		break;
         //		}
		//}
		
		Thread.sleep(1000);
		v.particpantCount().sendKeys("5");
		Thread.sleep(1000);
		
		List<WebElement> checklists = driver.findElements(By.xpath("//label[contains(@for,'storeId')]"));
		List<WebElement> timePicker = driver.findElements(By.xpath("//input[@class='rc-time-picker-input']"));
		//WebElement setTime = driver.findElement(By.xpath("//div[@class='rc-time-picker-panel-input-wrap']/input"));
		
		for(int i=0;i<=checklists.size();i=i+2) {
			checklists.get(i).click();
			Thread.sleep(1000);
			for(int j=i*2;j<=timePicker.size();j++) {
				timePicker.get(j).click();
				v.setTime().sendKeys("9:00 a");
				Thread.sleep(1000);
				timePicker.get(j+1).click();
				v.setTime().sendKeys("5:00 p");	
				break;
			}
		 }
		
		v.clickSave().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Venue added successfully!")){
			System.out.println("Venue added successfully!");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Venue already exist with name"+internalName);
			System.out.println("Failed!");
		}
		
	}
	
	@Then("^verify user can edit the venue details$")
	public void verify_user_can_edit_the_venue_details() throws Throwable {
		
		System.out.println("Verify whether user can edit the venue details");
		v = new VenueSelection(driver);
		
		v.searchVenue().sendKeys("Pet on Board");
		v.clickSubmit().click();
		Thread.sleep(3000);
		for(WebElement items : v.tableItems()) {
			if(items.getText().contains("Pet on Board")) {
				Actions action = new Actions(driver);
				action.moveToElement(items).click().perform();
				break;
			}
		}
		Thread.sleep(3000);
		v.editPublicVenue().clear();
		v.editPublicVenue().sendKeys("Update Pet on Board");
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("window.scrollBy(0,3000)");
		v.clickUpdate().click();

		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Venue updated successfully!")){
			System.out.println("Venue updated successfully!");
			System.out.println("Passed!");
		}
		
	}
	
	@Then("^verify user can search a venue$")
	public void verify_user_can_search_a_venue() throws Throwable {
		
		System.out.println("Verify whether user is able to search a venue from the venue list");
		v = new VenueSelection(driver);
		v.searchVenue().sendKeys("Update Pet on Board");
		for(WebElement item: v.tableItems()) {
			if(item.getText().contains("Update Pet on Board")) {
				System.out.println("Search Successful");
				System.out.println("Passed!");
				break;
			}
		}
		Thread.sleep(1000);
		v.clickReset().click();
		Thread.sleep(3000);
	}
	
	@Then("^verfiy user can delete the venue$")
	public void verfiy_user_can_delete_the_venue() throws Throwable {
		
		System.out.println("Verify whether user can delete a Venue");
		v = new VenueSelection(driver);
		v.searchVenue().sendKeys("Update Pet on Board");
		v.clickSubmit().click();
		Thread.sleep(1000);
		
		for(WebElement items : v.tableItems()) {
			if(items.getText().contains("Pet on Board")) {
				Actions action = new Actions(driver);
				action.moveToElement(items).click().perform();
				break;
			}
		}
			
		Thread.sleep(3000);
		v.clickDelete().click();
		v.selectYes().click();
		
	
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Venue deleted successfully!")){
			System.out.println("Venue deleted successfully!");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Venue is currently used by Services");
			System.out.println("Failed!");
		}
		
	}
	
	@Then("^verify user can delete the venue with service$")
	public void verify_user_can_delete_the_venue_with_service() throws Throwable {
		
		System.out.println("Verify whether user can delete the venue with appointmnent,service and attendant");
		v = new VenueSelection(driver);
		v.searchVenue().sendKeys("venue mouse s");
		v.clickSubmit().click();
		Thread.sleep(3000);
		for(WebElement item: v.tableItems()) {
			if(item.getText().equalsIgnoreCase("venue mouse s")) {
				item.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		v.clickDelete().click();
		v.selectYes().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Venue is currently used by Services")){
			System.out.println("Venue is currently used by Services");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Venue deleted successfully!");
			System.out.println("Failed!");
		}
		
		
		Thread.sleep(1000);
		v.clickArrow().click();
		Thread.sleep(3000);
	}
	
	*/
	
	
	
}
