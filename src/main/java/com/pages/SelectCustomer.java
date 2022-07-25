package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCustomer {

	public WebDriver driver;
	
	public SelectCustomer (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	By selectCustomer = By.linkText("Select Customer");
	By submit = By.xpath("//button[text()='Submit']");
	
	public WebElement user_select_customer()
	{
		return driver.findElement(selectCustomer);
	}
	
	public WebElement user_click_on_submit()
	{
		return driver.findElement(submit);
	}
	
	
	
}
