package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VenueSelection {
	
	public WebDriver driver;
	
	public VenueSelection(WebDriver driver) {
		this.driver=driver;
	}
	
	By clickVenue = By.xpath("//a[@href='/retailer/booking/configuration/venues']");
	By searchBar = By.xpath("//input[@placeholder='Search here']");
	By submitButton = By.xpath("//button[text()='Submit']");
	By addNew = By.xpath("//button[text()='Add Venue']");
	By internalName = By.name("internalVenue");
	By publicName = By.name("publicVenue");
	By selectStore = By.xpath("//div[text()='Select store *']");
	By selectService = By.xpath("//div[text()='Nothing selected']");
	By pCount = By.name("participantCount");
	By setTime = By.xpath("//div[@class='rc-time-picker-panel-input-wrap']/input");
	By saveButton = By.xpath("//button[@type='submit']");
	By listOfItems = By.xpath("//div[@col-id='internalName']");
	By resetFilter = By.xpath("//button[text()='Reset filters']");
	By deleteButton = By.xpath("//button[text()='Delete']");
	By Yes = By.xpath("//button[text()='Yes']");
	By arrow = By.cssSelector("#Group_53");
	By updateButton = By.xpath("//button[text()='Update']");
	
	public WebElement clickVenueLink() {
		return driver.findElement(clickVenue);
	}
	
	public WebElement searchVenue() {
		return driver.findElement(searchBar);
	}
	
	public WebElement clickSubmit() {
		return driver.findElement(submitButton);
	}
	
	public WebElement addNewVenue() {
		return driver.findElement(addNew);
	}
	
	public WebElement addInternalName() {
		return driver.findElement(internalName);
	}
	
	public WebElement addPublicName() {
		return driver.findElement(publicName);
	}
	
	public WebElement selectLocation() {
		return driver.findElement(selectStore);
	}
	
	public WebElement selectService() {
		return driver.findElement(selectService);
	}
	
	public WebElement particpantCount() {
		return driver.findElement(pCount);
	}
	
	public WebElement setTime() {
		return driver.findElement(setTime);
	}
	
	public WebElement clickSave() {
		return driver.findElement(saveButton);
	}
	
	public List<WebElement> tableItems() {
		return driver.findElements(listOfItems);
	}
	
	public WebElement clickReset() {
		return driver.findElement(resetFilter);
	}
	
	public WebElement clickDelete() {
		return driver.findElement(deleteButton);
	}
	
	public WebElement selectYes() {
		return driver.findElement(Yes);
	}
	
	public WebElement clickArrow() {
		return driver.findElement(arrow);
	}
	
	public WebElement editPublicVenue() {
		return driver.findElement(publicName);
	}
	
	public WebElement clickUpdate() {
		return driver.findElement(updateButton);
	}


}
