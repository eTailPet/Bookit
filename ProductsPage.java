package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	public WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By cashTab = By.id("cash_count_1");
	private By submit = By.xpath("//button[text()='Submit Count']");
	private By manageCatalog = By.xpath("//span[text()='Manage Catalog']");
	private By myProducts = By.xpath("//a[text()='My Products']");
	private By pin = By.xpath("//div[@class='modal-content']/div[2]/div/div/input");
	private By submitPin = By.xpath("//div[@class='modal-content']/div[2]/div/button");
	private By deliveryMethod = By.xpath("//button[@title='Delivery Method']");
	private By storeCheckbox = By.xpath("//label[@class='checkbox']/input");
	private By website = By.id("id_show_on_website");
	private By brand = By.id("id_retailer_product__product__brand");
	private By category = By.id("category-select");
	private By dogCategory = By.xpath("//button[text()='Dog']");
	private By dogFoodCategory = By.xpath("//label[@for='categories_0003000D']");
	private By store = By.id("id_store");
	private By tax = By.id("id_is_taxable");
	private By search = By.xpath("//input[@value='Search']");
	private By tableData = By.xpath("//tr[contains(@id,'prod_itm')]");
	private By nextPage = By.xpath("//a[@class='endless_page_link']");
	private By itemCount = By.id("id_storeproducts_count");
	private By searchBar = By.id("search_query");
	private By productName = By.xpath("//a[@class='prdct-ttl-lnk']");
	private By priceTab = By.name("price");
	private By saveButton = By.xpath("//div[@class='product-list-save']/button");
	private By inventory = By.xpath("//a[text()='Inventory']");
	private By storeName = By.id("id_add_store");
	private By quantity = By.id("id_quantity");
	private By vendor = By.id("id_vendor");
	private By addInventory = By.id("add_inventory");
	private By showOnWebsite = By.xpath("//input[@name='show_on_website']/parent::div");
	private By isTaxable = By.xpath("//td[@class='product-delivery-method-td']/select");
	private By tableDeliveryMethod = By.xpath("//td[@class='product-delivery-method-td']/span/div");
	private By deliveryOptions = By.xpath("//td[@class='product-delivery-method-td']/span/div/ul/li/a/label");//By.xpath("//td/span/div/ul/li/a/label/input");
	//private By actDelivery =By.xpath("td[@class='product-delivery-method-td']/span/div/ul/li");// By.xpath("//li[@class='active']");
	private By headerCheckbox = By.xpath("//th[@class='check-th']");
	private By clearSelection = By.xpath("//a[text()='Clear Selection']");
	private By checkboxList = By.xpath("//td[@class='check-td']/div/label");//By.xpath("//label[contains(@for,'item_checkbox')]");
	private By resetFliter = By.xpath("//button[text()='Reset Filters']");
	private By exportButton = By.xpath("//a[@type='button' and @href='/retailer/store-products/']");
	private By printLabel = By.xpath("//button[text()='Print Label']");
	private By printQOH = By.id("print-label-qoh");
	private By QOHCount = By.xpath("//tbody[@class='endless_content_wrapper']/tr/td[8]");
	private By labelText = By.xpath("//*[@id='header']//span");
	private By printOne = By.xpath("//input[@value='Print One']");
	private By tableRow = By.xpath("//tbody[@class='endless_content_wrapper']/tr");
	private By tableColumnCheckboxes = By.xpath("//tbody[@class='endless_content_wrapper']/tr/td/div/label");
	
	public WebElement enterCash() {
		return driver.findElement(cashTab);
	}
	
	public WebElement clickSubmit() {
		return driver.findElement(submit);
	}
	
	public WebElement clickCatalog() {
		return driver.findElement(manageCatalog);
	}
	
	public WebElement clickMyProducts() {
		return driver.findElement(myProducts);
	}
	
	public WebElement enterPin() {
		return driver.findElement(pin);
	}
	
	public WebElement submitPin(){
		return driver.findElement(submitPin);
	}
	
	public WebElement clickDeliveryType() {
		return driver.findElement(deliveryMethod);
	}
	
	public WebElement selectStorePickup() {
		return driver.findElement(storeCheckbox);
	}
	
	public WebElement showOnWebsite() {
		return driver.findElement(website);
	}
	
	public WebElement selectBrand() {
		return driver.findElement(brand);
	}
	
	public WebElement clickCategory() {
		return driver.findElement(category);
	}
	
	public WebElement clickDogCategory() {
		return driver.findElement(dogCategory);
	}
	
	public WebElement clickDogFood() {
		return driver.findElement(dogFoodCategory);
	}
	
	public WebElement selectStore() {
		return driver.findElement(store);
	}
	
	public WebElement selectTaxable() {
		return driver.findElement(tax);
	}
	
	public WebElement clickSearch() {
		return driver.findElement(search);
	}
	
	public List<WebElement> tableItemList() {
		return driver.findElements(tableData);
	}
	
	public List<WebElement> nextPageCount(){
		return driver.findElements(nextPage);
	}
	
	public WebElement itemsCount() {
		return driver.findElement(itemCount);
	}

	public WebElement enterSearchItem() {
		return driver.findElement(searchBar);
	}
	
	public List<WebElement> productName(){
		return driver.findElements(productName);
	}
	
	public WebElement enterPrice() {
		return driver.findElement(priceTab);
	}
	
	public WebElement clickSaveIcon() {
		return driver.findElement(saveButton);
	}
	
	public WebElement clickInventory() {
		return driver.findElement(inventory);
	}
	
	public WebElement selectInventoryStore() {
		return driver.findElement(storeName);
	}
	
	public WebElement enterQuantity() {
		return driver.findElement(quantity);
	}
	
	public WebElement selectVendor() {
		return driver.findElement(vendor);
	}
	
	public WebElement saveInventory() {
		return driver.findElement(addInventory);
	}
	
	public WebElement checkShowOnWebSite() {
		return driver.findElement(showOnWebsite);
	}
	
	public WebElement selectIsTaxable() {
		return driver.findElement(isTaxable);
	}
	
	public WebElement selectDeliveryMethod() {
		return driver.findElement(tableDeliveryMethod);
	}
	
	public List<WebElement> selectDeliveryOptions(){
		return driver.findElements(deliveryOptions);
	}
	
	public WebElement clickHeaderCheckbox() {
		return driver.findElement(headerCheckbox);
	}
	
	public WebElement clickClearSelection() {
		return driver.findElement(clearSelection);
	}
	
	public List<WebElement> verifyCheckboxes(){
		return driver.findElements(checkboxList);
	}
	
	public WebElement clickResetFilter() {
		return driver.findElement(resetFliter);
	}
	
	public WebElement clickExportButton() {
		return driver.findElement(exportButton);
	}
	
	public WebElement clickPrintLabel() {
		return driver.findElement(printLabel);
	}
	
	public WebElement clickPrintQOH() {
		return driver.findElement(printQOH);
	}
	
	public WebElement getQOHCount() {
		return driver.findElement(QOHCount);
	}
	
	public WebElement getLabelCount() {
		return driver.findElement(labelText);
	}
	
	public WebElement clickPrintOne() {
		return driver.findElement(printOne);
	}
	
	public List<WebElement> tableRow() {
		return driver.findElements(tableRow);
	}
	
	public List<WebElement> tableColumnCheckboxes() {
		return driver.findElements(tableColumnCheckboxes);
	}
}
