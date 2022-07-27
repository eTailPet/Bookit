package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesPage {
	
	public WebDriver driver;
	
	public ServicesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By servicesLink = By.xpath("//a[@href='/retailer/booking/configuration/services']");
	By addNewButton = By.xpath("//button[text()='Add a new service']");
	By serviceName = By.name("name");
	By serviceType = By.xpath("//div[text()='Service type']");
	By dropDownList = By.xpath("//div[@class=' css-11unzgr']/div");
	By petType = By.xpath("//div[text()='Pet type']");
	By petSize = By.xpath("//div[text()='Pet size']");
	By closeDropdown = By.xpath("//div[@class='css-12jo7m5']");
	By venue = By.xpath("//div[text()='venue']");
	By attendant = By.xpath("//div[text()='attendants']");
	By fixedSchedule = By.xpath("//input[@name='fixedScheduleValue']");
	By fixedScheduleInterval = By.xpath("//div[text()='Select interval*']");
	By intervalDropdown = By.xpath("//div[@class='Dropdown-menu']/div");
	By preBooking = By.name("preBookingValue");
	By preBookingInterval = By.xpath("//div[text()='Minute']");
	By serviceCost = By.name("amountPerUnit");
	By serviceInterval = By.xpath("//div[text()='Select interval']");
	By checkBox = By.xpath("//label[contains(@for,'storesIds')]");
	By timePicker = By.xpath("//input[@class='rc-time-picker-input']");
	By enterTime = By.xpath("//div[@class='rc-time-picker-panel-input-wrap']/input");
	By saveButton = By.xpath("//button[text()='Save']");
	By searchBar = By.xpath("//input[@placeholder='Search here']");
	By submitButton = By.xpath("//button[text()='Submit']");
	By tabledata = By.xpath("//div[@col-id='serviceName']");
	By backArrow = By.id("Group_53");
	By updateButton = By.xpath("//button[text()='Update']");
	By deleteButton = By.xpath("//button[text()='Delete']");
	By yesButton = By.xpath("//button[text()='Yes']");
	
	public WebElement clickServices() {
		return driver.findElement(servicesLink);
	}
	
	public WebElement clickAddNew() {
		return driver.findElement(addNewButton);
	}
	
	public WebElement enterServiceName() {
		return driver.findElement(serviceName);
	}

	public WebElement clickServiceType() {
		return driver.findElement(serviceType);
	}
	
	public List<WebElement> selectfromList(){
		return driver.findElements(dropDownList);
	}
	
	public WebElement clickPetType() {
		return driver.findElement(petType);
	}
	
	public WebElement clickPetSize() {
		return driver.findElement(petSize);
	}
	
	public WebElement closeDropdown() {
		return driver.findElement(closeDropdown);
	}
	
	public WebElement clickVenue() {
		return driver.findElement(venue);
	}
	
	public WebElement clickAttendant() {
		return driver.findElement(attendant);
	}
	
	public WebElement enterFixedSchedule() {
		return driver.findElement(fixedSchedule);
	}
	
	public WebElement clickFixedInterval() {
		return driver.findElement(fixedScheduleInterval);
	}
	
	public List<WebElement> selectInterval(){
		return driver.findElements(intervalDropdown);
	}
	
	public WebElement enterPreBooking() {
		return driver.findElement(preBooking);
	}
	
	public WebElement clickpreInterval() {
		return driver.findElement(preBookingInterval);
	}
	
	public WebElement enterServiceCost() {
		return driver.findElement(serviceCost);
	}
	
	public WebElement clickServiceInterval() {
		return driver.findElement(serviceInterval);
	}
	
	public List<WebElement> clickCheckbox() {
		return driver.findElements(checkBox);
	}
	
	public List<WebElement> selectTime(){
		return driver.findElements(timePicker);
	}
	
	public WebElement setTime() {
		return driver.findElement(enterTime);
	}
	
	public WebElement clickSaveButton() {
		return driver.findElement(saveButton);
	}
	
	public WebElement searchServiceName() {
		return driver.findElement(searchBar);
	}
	
	public WebElement clickSubmitButton() {
		return driver.findElement(submitButton);
	}
	
	public List<WebElement> tableDataList(){
		return driver.findElements(tabledata);
	}
	
	public WebElement clickBack() {
		return driver.findElement(backArrow);
	}
	
	public WebElement clickUpdateButton() {
		return driver.findElement(updateButton);
	}
	
	public WebElement clickDeleteButton() {
		return driver.findElement(deleteButton);
	}
	
	public WebElement clickYesButton() {
		return driver.findElement(yesButton);
	}
 }
