package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetFilters {

	public WebDriver driver;
	
	public ResetFilters(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By ResetFilter = By.linkText("Reset Filters");
	
	public WebElement user_select_reset()
	{
		return driver.findElement(ResetFilter);
	}
	
	
}
