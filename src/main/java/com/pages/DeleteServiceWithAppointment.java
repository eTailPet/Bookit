package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteServiceWithAppointment {
 
	public WebDriver driver;
	
	public void deleteService(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By deleteService = By.xpath("(//button[text()='Delete'])[2]");
	By clickYes = By.xpath("//button[text()='Yes']");
	By clickNo =By.xpath("//button[text()='No']");
	
	public WebElement user_click_delete()
	{
		return driver.findElement(deleteService);
	}
	
	public WebElement user_click_yes()
	{
		return driver.findElement(clickNo);
	}
	
	public WebElement user_click_no() 
	{
		return driver.findElement(clickYes);
	}
	
}
