package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.POSLogin;
import com.pages.ProductsPage;

import cucumberAutomation.BookitBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PublicCatalogStepDef {
	
	public WebDriver driver;
	public POSLogin pl;
	public BookitBase bb;
	public ProductsPage pp;
	
	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable {
		
		System.out.println("User is in landing page");
		BookitBase bb = new BookitBase();
		driver = bb.getDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@When("^user enters a valid username$")
	public void user_enters_a_valid_username() {
		
		System.out.println("User enters a valid username");
		pl = new POSLogin(driver);
		pl.enterUsername().sendKeys("qa2@etailpet.com");
		
	}
	
	@When("^user enters a valid password$")
	public void user_enters_a_valid_password() {
		
		System.out.println("User enters a valid password");
		pl = new POSLogin(driver);
		pl.enterPassword().sendKeys("qaETP*");
	}
	
	@And("^user clicks on Sigin button$")
	public void user_clicks_on_Sigin_button() throws Throwable {
		
		System.out.println("User clicks on Sigin Button");
		pl = new POSLogin(driver);
		pl.clickSignin().click();
		Thread.sleep(3000);
	}
	
	@Then("^user switches to etailpet$")
	public void user_switches_to_etailpet() throws Throwable {
		
		System.out.println("Then user switches to the etialpet dashboard");
		pl = new POSLogin(driver);
		Select etailDashboard = new Select(pl.selectToggle());
		etailDashboard.selectByValue("etailplus");
		Thread.sleep(3000);
	}
	
	@Then("^user enters the drawer amount$")
	public void user_enters_the_drawer_amount() throws Throwable {
		
		System.out.println("User enters the drawer amount");
		pp = new ProductsPage(driver);
		pp.enterCash().sendKeys("1");
		pp.clickSubmit().click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("1111");
		driver.switchTo().alert().accept();
		
	}
	
	@Then("^verify user is able to search the products by applying the filters$")
	public void verify_user_is_able_to_search_the_products_by_applying_the_filters() throws Throwable {
		
		System.out.println("User is in my products page");
		pp = new ProductsPage(driver);
		pp.clickCatalog().click();
		Thread.sleep(1000);
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.clickDeliveryType().click();
		pp.selectStorePickup().click();
		Thread.sleep(1000);
		Select obj= new Select(pp.showOnWebsite());
		obj.selectByValue("True");
		Thread.sleep(1000);
		Select brandSelect = new Select(pp.selectBrand());
		brandSelect.selectByVisibleText("ACANA");
		pp.clickCategory().click();
		pp.clickDogCategory().click();
		Thread.sleep(1000);
		pp.clickDogFood().click();
		Thread.sleep(1000);
		Select selectStore = new Select(pp.selectStore());
		selectStore.selectByValue("2");
		Thread.sleep(1000);
		Select selectTax = new Select(pp.selectTaxable());
		selectTax.selectByValue("True");
		pp.clickSearch().click();
		Thread.sleep(1000);
		int sum = pp.tableItemList().size();
		int count = pp.nextPageCount().size();
		int totalCount = Integer.parseInt(pp.itemsCount().getText());
		
		while(count>0) {
			pp.nextPageCount().get(count).click();
			Thread.sleep(1000);
			sum+= pp.tableItemList().size();
			count--;
		}
		System.out.println(sum);
		System.out.println(totalCount);
		if(totalCount == sum) {
			System.out.println("Passed!");
		}
		Thread.sleep(3000);
	
	}
	
	@Then("^verify user is able to search an item$")
	public void verify_user_is_able_to_search_an_item() throws Throwable {
		
		System.out.println("Verify whether user is able to search an item");
		pp = new ProductsPage(driver);
		String productName ="CANIDAE Grain-Free PURE Sea Salmon & Mackerel Formula Canned Dog Food";
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.enterSearchItem().sendKeys(productName);
		pp.clickSearch().click();
		Thread.sleep(1000);
		for(WebElement item : pp.productName()) {
			if(item.getText().contains(productName)) {
				System.out.println("The entered item is found");
			}
			else {
				System.out.println("No result found for keyword " +productName);
			}
		}
	}
	
	@Then("^verify user is able to edit the price of an item$")
	public void verify_user_is_able_to_edit_the_price_of_an_item() throws Throwable {
		
		System.out.println("Verify whether user is able to edit the rpice of an item");
		pp = new ProductsPage(driver);
		String productName ="CANIDAE Grain-Free PURE Sea Salmon & Mackerel Formula Canned Dog Food";
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.enterSearchItem().sendKeys(productName);
		pp.clickSearch().click();
		Thread.sleep(1000);
		pp.enterPrice().clear();
		pp.enterPrice().sendKeys("7.45");
		Thread.sleep(1000);
		pp.clickSaveIcon().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='toast-message']")).getText().equalsIgnoreCase("Product updated")) {
			System.out.println("Price is updated");
		}
		else {
			System.out.println("Failed!");
		}
	}
	
	@Then("^verify user is able to edit the QOH of an item$")
	public void verify_user_is_able_to_edit_the_QOH_of_an_item() throws Throwable {
		
		System.out.println("Verify whether the user is able to edit the QOH of an item");
		pp = new ProductsPage(driver);
		String productName ="CANIDAE Grain-Free PURE Sea Salmon & Mackerel Formula Canned Dog Food";
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.enterSearchItem().sendKeys(productName);
		pp.clickSearch().click();
		Thread.sleep(1000);
		for(WebElement item : pp.productName()) {
			if(item.getText().contains(productName)) {
				item.click();
				break;
			}
		}
		Thread.sleep(3000);
		pp.clickInventory().click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Select store = new Select(pp.selectInventoryStore());
		store.selectByValue("2");
		Thread.sleep(1000);
		pp.enterQuantity().clear();
		pp.enterQuantity().sendKeys("5");
		Select vendor = new Select(pp.selectVendor());
		vendor.selectByVisibleText("Honeybee Pet Adventures");
		pp.saveInventory().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='toast-message']")).getText().equalsIgnoreCase("Updated Sucessfully. Price nad taxable will be updated shortly")) {
			System.out.println("Price is updated");
		}
		else {
			System.out.println("Failed!");
		}
	}
	
	@Then("^verify user is able to perform the actions show on website taxable and delivery methods on an item$")
	public void verify_user_is_able_to_perform_the_actions_show_on_website_taxable_and_delivery_methods_on_an_item() throws Throwable {
		
		System.out.println("Verify whether the user is able to perform the actions: show on website, is taxable and delivery methods for an item");
		pp = new ProductsPage(driver);
		String productName ="CANIDAE Grain-Free PURE Sea Salmon & Mackerel Formula Canned Dog Food";
		pp.clickCatalog().click();
		Thread.sleep(1000);
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.enterSearchItem().sendKeys(productName);
		pp.clickSearch().click();
		Thread.sleep(1000);
		//for(WebElement item : pp.productName()) {
			//if(item.getText().contains(productName)) {
				if(!pp.checkShowOnWebSite().isSelected()) {
					pp.checkShowOnWebSite().click();
				}
				Thread.sleep(1000);
				//pp.selectIsTaxable().click();
				
				Select select = new Select(pp.selectIsTaxable());
				select.selectByValue("True");
				Thread.sleep(1000);
				pp.selectDeliveryMethod().click();
				Thread.sleep(1000);
				for(WebElement options: pp.selectDeliveryOptions()) {
					if(pp.activeDelivery().getText().equalsIgnoreCase(" ")) {
						options.click();
					}
				}
				Thread.sleep(1000);
				pp.selectDeliveryMethod().click();
				Thread.sleep(1000);
				pp.clickSaveIcon().click();
				//break;
		//	}
		//}
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='toast-message']")).getText().equalsIgnoreCase("Product updated")) {
			System.out.println("Price is updated");
		}
		else {
			System.out.println("Failed!");
		}
	}

	@Then("^verify user is able to click on clear selection$")
	public void verify_user_is_able_to_click_on_clear_selection() throws Throwable {
		
		System.out.println("Verify user is able to click on clear selection");
		pp = new ProductsPage(driver);
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		Select brandSelect = new Select(pp.selectBrand());
		brandSelect.selectByVisibleText("BRAVO");
		Thread.sleep(1000);
		pp.clickSearch().click();
		Thread.sleep(1000);
		pp.clickHeaderCheckbox().click();
		Thread.sleep(1000);
		pp.clickClearSelection().click();
		Thread.sleep(1000);
		for(WebElement item : pp.verifyCheckboxes()) {
			if(!item.isSelected()) {
				System.out.println("Passed!");
			}
		}
	}
	
	@Then("^verify user is able to reset to the default option$")
	public void verify_user_is_able_to_reset_to_the_default_option() throws Throwable {
		
		System.out.println("Verify whether user is able to reset to the default options");
		pp = new ProductsPage(driver);
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.clickDeliveryType().click();
		pp.selectStorePickup().click();
		Thread.sleep(1000);
		Select obj= new Select(pp.showOnWebsite());
		obj.selectByValue("True");
		Thread.sleep(1000);
		Select brandSelect = new Select(pp.selectBrand());
		brandSelect.selectByVisibleText("ACANA");
		pp.clickCategory().click();
		pp.clickDogCategory().click();
		Thread.sleep(1000);
		pp.clickDogFood().click();
		Thread.sleep(1000);
		Select selectStore = new Select(pp.selectStore());
		selectStore.selectByValue("2");
		Thread.sleep(1000);
		Select selectTax = new Select(pp.selectTaxable());
		selectTax.selectByValue("True");
		pp.clickResetFilter().click();
		Thread.sleep(2000);
		String deliveryMethod = driver.findElement(By.xpath("//button[@title='Delivery Method']/span")).getText();
		String showOnWeb = pp.showOnWebsite().getText();
		String brand = pp.selectBrand().getText();
		String category = pp.clickCategory().getText();
		String store = pp.selectStore().getText();
		String taxable = pp.selectIsTaxable().getText();
		if(deliveryMethod.equalsIgnoreCase("Delivery Method")&& showOnWeb.contains("Show on website")&&brand.equalsIgnoreCase("-- Brand --")&&category.equalsIgnoreCase("Select Categories")&&store.equalsIgnoreCase("Etail (ID:2)")&&taxable.equalsIgnoreCase("Is Taxable")) {
			System.out.println("Passed!");
		}
	}
	
	@Then("^verify user is able to export the file$")
	public void verify_user_is_able_to_export_the_file() throws Throwable {
		
		System.out.println("Verify whether user is able to export the file");
		pp = new ProductsPage(driver);
		pp.clickMyProducts().click();
		Thread.sleep(1000);
		pp.enterPin().sendKeys("1111");
		pp.submitPin().click();
		Thread.sleep(3000);
		pp.clickDeliveryType().click();
		pp.selectStorePickup().click();
		Thread.sleep(1000);
		Select obj= new Select(pp.showOnWebsite());
		obj.selectByValue("True");
		Thread.sleep(1000);
		Select brandSelect = new Select(pp.selectBrand());
		brandSelect.selectByVisibleText("ACANA");
		pp.clickCategory().click();
		pp.clickDogCategory().click();
		Thread.sleep(1000);
		pp.clickDogFood().click();
		Thread.sleep(1000);
		Select selectStore = new Select(pp.selectStore());
		selectStore.selectByValue("2");
		Thread.sleep(1000);
		Select selectTax = new Select(pp.selectTaxable());
		selectTax.selectByValue("True");
		pp.clickSearch().click();
		Thread.sleep(1000);
		pp.clickExportButton().click();
	}
}
