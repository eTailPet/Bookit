package stepdefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BookingconfigPage;
import com.pages.CreateService;
import com.pages.DeleteServiceWithAppointment;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Retailerdashboardpage;
import com.pages.SignupPage;

import cucumberAutomation.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	public WebDriver driver;
	HomePage h;
	LoginPage l;
	SignupPage s;
	BookingconfigPage bp;
	Retailerdashboardpage re;
	DeleteServiceWithAppointment Del;
	CreateService cs;


	@Given("Launch the web application")
	public void launch_the_web_application() throws IOException {
		Base base = new Base();
		driver= base.getDriver();
		System.out.println("User is in Retailer Portal");
	}

	@When("Sign in to popup")
	public void sign_in_to_popup() throws InterruptedException {
		driver.get("https://etailadmin:pwd@123@sandyspetdepot-etailplus.dev.etailpet.com/retailer/dash/");
		driver.manage().window().maximize();	
	}

	@When("Login Screen")
	public void login_screen() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		l=new LoginPage (driver);
		l.enter_username().sendKeys("jibutest@getnada.com");
		Thread.sleep(2000);
		l.enter_password().sendKeys("etail_1202");
		Thread.sleep(8000);
		l.clicksignIn().click();
	}
	@Then("Switch to Bookit")
	public void switch_to_bookit() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		WebElement Source = driver.findElement(By.xpath("//select[@id='dashboard-toggle']"));
		Select dd1=new Select(Source);
		dd1.selectByValue("bookit_only");
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='dashboard-toggle']")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Bookings\"]"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Configuration"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Service Types"))).click();
	
	}
	@When("Verify whether user is able to delete the Service Types")
	public void verify_whether_user_is_able_to_delete_the_service_types() throws InterruptedException {
	
	  driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  bp=new BookingconfigPage(driver); Thread.sleep(8000); //
	  bp.user_click_delete().click(); 
	  bp.click_yes().click();
	  WebElement clickYes =driver.findElement(By.xpath("//button[text()='Yes']"));
	  if(clickYes.isEnabled())
	  {
		  clickYes.click();
	  }
	  else
	  {
		  WebElement clickNo = driver.findElement(By.xpath("//button[text()='No']"));
		  clickNo.click();
	  }
	  }
	 
	@When("Verify whether user is able to delete the Service Types with appointment")
	public void verify_whether_user_is_able_to_delete_the_service_types_with_appointment() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No']"))).click();

	}

	@When("Verify whether retailer is able to create Service Type")
	public void verify_whether_retailer_is_able_to_create_service_type() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Add new service type']")).click();
		WebElement addNewService= driver.findElement(By.id("serviceTypeName"));
		addNewService.click();
		addNewService.clear();
		addNewService.sendKeys("MyFirstServe");
		driver.findElement(By.id("serviceTypeIndexValue")).sendKeys("1");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(By.id("inputGroupFile01")).sendKeys("C:\\Users\\WIN-010\\OneDrive\\Documents\\no issue.png");
		//UploadService.sendKeys("C:\\Users\\WIN-010\\Documents\\error18.png");
		driver.findElement(By.xpath("//button[@class='btn btn-orange btn']")).click(); 
	}

	@When("Verify whether retailer is able to create Service Type with Existing name")
	public void verify_whether_retailer_is_able_to_create_service_type_with_existing_name() {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Add new service type']")).click();
		WebElement existingService= driver.findElement(By.name("serviceTypeName"));
		existingService.sendKeys("MyFirstServe");
		WebElement IndexValue = driver.findElement(By.name("serviceTypeIndexValue"));
		IndexValue.sendKeys("2");
		//WebElement UploadService= driver.findElement(By.xpath("//label[@class='custom-file-label']"));
		driver.findElement(By.id("inputGroupFile01")).sendKeys("C:\\Users\\WIN-010\\OneDrive\\Documents\\no issue.png");
		driver.findElement(By.xpath("//button[@class='btn btn-orange btn']")).click(); 
	}

	@When("Verify whether Service Type is able to inactive from the Service Type listing page")
	public void verify_whether_service_type_is_able_to_inactive_from_the_service_type_listing_page() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("div.react-switch-bg")).click();
	}

	@When("Verify whether Service Type is able to active from the Service Type listing page")
	public void verify_whether_service_type_is_able_to_active_from_the_service_type_listing_page() {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.react-switch-bg")).click();
	}

	@When("Verify whether Service Type is able to search from the Service Type name in listing page")
	public void verify_whether_service_type_is_able_to_search_from_the_service_type_name_in_listing_page() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Bath");
		Thread.sleep(8000);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    driver.quit();
	}


}
