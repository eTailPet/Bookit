package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Service_historypage {
	
public WebDriver driver;
	
	public Service_historypage(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_service_history=  By.xpath("//a[text()='Service History']");

   

	public WebElement user_click_on_service_history()
	{
		return driver.findElement(click_on_service_history);
	}
	
	
}