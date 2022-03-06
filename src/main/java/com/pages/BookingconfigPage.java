package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingconfigPage {
	
public WebDriver driver;
	
	public BookingconfigPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_config_petType=  By.xpath("(//button[text()='Configure'])[1]");
	By click_delete= By.xpath("(//button[text()='Delete'])[1]");
	By click_yes=By.xpath("//button[text()='Yes']");
	By click_deactivte_petType= By.xpath("//div[@class='react-switch-bg'][1]");
	By click_activte_petType= By.xpath("//div[@class='react-switch-handle'][1]");
   

	public WebElement user_click_config_petType()
	{
		return driver.findElement(click_config_petType);
	}
	public WebElement user_click_delete()
	{
		return driver.findElement(click_delete);
	}
	public WebElement user_click_deactivte_petType()
	{
		return driver.findElement(click_deactivte_petType);
	}
public WebElement user_click_activte_petType()
{
	return driver.findElement(click_activte_petType);
}
public WebElement click_yes()
{
	return driver.findElement(click_yes);
}
}