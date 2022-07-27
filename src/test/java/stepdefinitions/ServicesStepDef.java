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
import com.pages.ServicesPage;

import cucumberAutomation.BookitBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*public class ServicesStepDef {
	
	public WebDriver driver;
	public BookitBase bb;
	public BookitLogin bl;
	public MenuBar m;
	public ServicesPage sp;
	
	
	@Given("^user is in landing page$")
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
		Thread.sleep(3000);
	}
	
	@Then("^user clicks on services$")
	public void user_clicks_on_services() throws Throwable {
		
		System.out.println("User clicks on services");
		sp = new ServicesPage(driver);
		Thread.sleep(3000);
		sp.clickServices().click();
		Thread.sleep(3000);
		
	}
	
	@Then("^verify whether user is able to create a new service$")
	public void verify_whether_user_is_able_to_create_a_new_service() throws Throwable {
		
		System.out.println("Verify whether the user is able to create a new service");
		String serviceName = "Pet Grooming AUT 60";
		sp = new ServicesPage(driver);
		sp.clickAddNew().click();
		Thread.sleep(3000);
		sp.enterServiceName().sendKeys(serviceName);
		sp.clickServiceType().click();
		for(WebElement store : sp.selectfromList()) {
			if(store.getText().contains("Special Pet care")) {
				store.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickPetType().click();
		for(WebElement pet : sp.selectfromList()) {
			if(pet.getText().contains("labrar dogs only")) {
				pet.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickPetSize().click();
		for(WebElement size : sp.selectfromList()) {
			if(size.getText().contains("small")) {
				size.click();
				sp.closeDropdown().click();
				break;
		
			}
		}
		
		Thread.sleep(2000);
		sp.clickVenue().click();
		for(WebElement venue : sp.selectfromList()) {
			if(venue.getText().contains("venue for testee")) {
				venue.click();
				sp.closeDropdown().click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickAttendant().click();
		for(WebElement attendant : sp.selectfromList()) {
			if(attendant.getText().contains("Attendant for test")) {
				attendant.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterFixedSchedule().sendKeys("5");
		sp.clickFixedInterval().click();
		Thread.sleep(1000);
		for(WebElement fixedEvent : sp.selectInterval()) {
			if(fixedEvent.getText().contains("Hour")) {
				fixedEvent.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterPreBooking().sendKeys("12");
		sp.clickpreInterval().click();
		Thread.sleep(1000);
		for(WebElement preEvent : sp.selectInterval()) {
			if(preEvent.getText().contains("Hour")) {
				preEvent.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterServiceCost().sendKeys("45");
		sp.clickServiceInterval().click();
		Thread.sleep(1000);
		for(WebElement serviceEvent : sp.selectInterval()) {
			if(serviceEvent.getText().contains("Hour")) {
				serviceEvent.click();
				break;
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		//List<WebElement> checklists = driver.findElements(By.xpath("//label[contains(@for,'storesIds')]"));
		//List<WebElement> timePicker = driver.findElements(By.xpath("//input[@class='rc-time-picker-input']"));

		for(int i=0;i<=sp.clickCheckbox().size();i=i+2) {
			sp.clickCheckbox().get(i).click();
			Thread.sleep(1000);
			for(int j=i*2;j<=sp.selectTime().size();j++) {
				sp.selectTime().get(j).click();
				sp.setTime().sendKeys("9:00 a");
				Thread.sleep(1000);
				sp.selectTime().get(j+1).click();
				sp.setTime().sendKeys("5:00 p");	
				break;
			}
		 }
		
		Thread.sleep(1000);
		sp.clickSaveButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Service added successfully!")){
			System.out.println("Service added successfully!");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Service already exist with name "+serviceName);
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
		
	}
	
	@Then("^verify whether user is able to create a service with existing name$")
	public void verify_whether_user_is_able_to_create_a_service_with_existing_name() throws Throwable {
		
		System.out.println("Verify whether the user is able to create a service with existing name");
		sp = new ServicesPage(driver);
		String serviceName = "Pet Grooming AUT 60";
		sp.clickAddNew().click();
		Thread.sleep(3000);
		sp.enterServiceName().sendKeys(serviceName);
		sp.clickServiceType().click();
		for(WebElement store : sp.selectfromList()) {
			if(store.getText().contains("Special Pet care")) {
				store.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickPetType().click();
		for(WebElement pet : sp.selectfromList()) {
			if(pet.getText().contains("labrar dogs only")) {
				pet.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickPetSize().click();
		for(WebElement size : sp.selectfromList()) {
			if(size.getText().contains("small")) {
				size.click();
				sp.closeDropdown().click();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		sp.clickVenue().click();
		for(WebElement venue : sp.selectfromList()) {
			if(venue.getText().contains("venue for testee")) {
				venue.click();
				sp.closeDropdown().click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.clickAttendant().click();
		for(WebElement attendant : sp.selectfromList()) {
			if(attendant.getText().contains("Attendant for test")) {
				attendant.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterFixedSchedule().sendKeys("5");
		sp.clickFixedInterval().click();
		Thread.sleep(1000);
		for(WebElement fixedEvent : sp.selectInterval()) {
			if(fixedEvent.getText().contains("Hour")) {
				fixedEvent.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterPreBooking().sendKeys("12");
		sp.clickpreInterval().click();
		Thread.sleep(1000);
		for(WebElement preEvent : sp.selectInterval()) {
			if(preEvent.getText().contains("Hour")) {
				preEvent.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		sp.enterServiceCost().sendKeys("45");
		sp.clickServiceInterval().click();
		Thread.sleep(1000);
		for(WebElement serviceEvent : sp.selectInterval()) {
			if(serviceEvent.getText().contains("Hour")) {
				serviceEvent.click();
				break;
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		for(int i=0;i<=sp.clickCheckbox().size();i=i+2) {
			sp.clickCheckbox().get(i).click();
			Thread.sleep(1000);
			for(int j=i*2;j<=sp.selectTime().size();j++) {
				sp.selectTime().get(j).click();
				sp.setTime().sendKeys("9:00 a");
				Thread.sleep(1000);
				sp.selectTime().get(j+1).click();
				sp.setTime().sendKeys("5:00 p");	
				break;
			}
		 }
		Thread.sleep(1000);
		sp.clickSaveButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Service already exist with name "+serviceName)){
			System.out.println("Service already exist with name "+serviceName);
			System.out.println("Passed!");
		}
		else {
			System.out.println("Service added successfully!");
			System.out.println("Failed!");
		}
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(1000);
		sp.clickBack().click();
		Thread.sleep(3000);

		
	}
	
	@Then("^verify whether user is able to edit the service$")
	public void verify_whether_user_is_able_to_edit_the_service() throws Throwable {
		
		System.out.println("Verify whether user is able to edit the service");
		sp = new ServicesPage(driver);
		sp.searchServiceName().sendKeys("Pet Grooming AUT 60");
		sp.clickSubmitButton().click();
		Thread.sleep(3000);
		for(WebElement item : sp.tableDataList()) {
			if(item.getText().contains("Pet Grooming AUT 60")) {
				Actions action = new Actions(driver);
				action.moveToElement(item).click().perform();
				break;
			}
		}
		Thread.sleep(3000);
		sp.enterServiceName().clear();
		sp.enterServiceName().sendKeys("Pet Grooming Update AUT 60");
		Thread.sleep(1000);
		sp.enterServiceCost().clear();
		sp.enterServiceCost().sendKeys("90");
		Thread.sleep(1000);
		sp.clickUpdateButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Service updated successfully!")){
			System.out.println("Service updated successfully!");
			System.out.println("Passed!");
		}
		Thread.sleep(3000);
		
	}
	
	@Then("^verify whether user is able to delete a service$")
	public void verify_whether_user_is_able_to_delete_a_service() throws Throwable {
		
		System.out.println("verify whether user is able to delete a service");
		sp = new ServicesPage(driver);
		sp.searchServiceName().sendKeys("Pet Grooming Update AUT 60");
		sp.clickSubmitButton().click();
		Thread.sleep(3000);
		for(WebElement item : sp.tableDataList()) {
			if(item.getText().contains("Pet Grooming Update AUT 60")) {
				Actions action = new Actions(driver);
				action.moveToElement(item).click().perform();
				break;
			}
		}
		Thread.sleep(3000);
		sp.clickDeleteButton().click();
		Thread.sleep(1000);
		sp.clickYesButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Service deleted successfully!")){
			System.out.println("Service deleted successfully!");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Service is used in an appointment");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
		
		}
	
	@Then("^verify whether user is able to delete a service with appointment$")	
	public void verify_whether_user_is_able_to_delete_a_service_with_appointment() throws Throwable {
		
		System.out.println("verify whether user is able to delete a service with appointment");
		sp = new ServicesPage(driver);
		sp.searchServiceName().sendKeys("Pet walking service");
		sp.clickSubmitButton().click();
		Thread.sleep(3000);
		for(WebElement item : sp.tableDataList()) {
			if(item.getText().contains("Pet walking service")) {
				Actions action = new Actions(driver);
				action.moveToElement(item).click().perform();
				break;
			}
		}
		Thread.sleep(3000);
		sp.clickDeleteButton().click();
		Thread.sleep(1000);
		sp.clickYesButton().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Service is used in an appointment")){
			System.out.println("Service is used in an appointment");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Service deleted successfully!");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
		
	}

}*/
