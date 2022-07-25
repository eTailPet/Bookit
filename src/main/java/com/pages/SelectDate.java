package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDate {

	public WebDriver driver;
	
	public SelectDate(WebDriver driver) 
	{ 
		this.driver=driver;
	}
	
	By selectStartDate = By.xpath("//input[@class='react-datepicker-ignore-onclickoutside']");
	By selectEndDate = By.xpath("//input[@class='react-datepicker-ignore-onclickoutside']");
	By submit = By.xpath("//button[text()='Submit']");
	
	
	public WebElement user_select_startDate()
	{
		return driver.findElement(selectStartDate);
	}
	
	public WebElement user_select_EndDate()
	{
		return driver.findElement(selectEndDate);
	}
	
	public WebElement user_click_on_submit()
	{
		return driver.findElement(submit);
	}
	
	
}

