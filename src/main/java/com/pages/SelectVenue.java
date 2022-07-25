package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectVenue {
	public WebDriver driver;
	
	public SelectVenue (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By selectVenue = By.linkText("Select Venue");
	By submit = By.xpath("//button[text()='Submit']");
	
	public WebElement user_select_venue()
	{
		return driver.findElement(selectVenue);
	}
	
	public WebElement user_click_on_submit()
	{
		return driver.findElement(submit);
	}

}
