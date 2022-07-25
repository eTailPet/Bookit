package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectAttendant {

public WebDriver driver;
	
	public SelectAttendant (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By selectAttendant = By.linkText("Select Attendant");
	By submit = By.xpath("//button[text()='Submit']");
	
	public WebElement user_select_attendant()
	{
		return driver.findElement(selectAttendant);
	}
	
	public WebElement user_click_on_submit()
	{
		return driver.findElement(submit);
	}
	
	
}