package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Configurationpage {
	
public WebDriver driver;
	
	public Configurationpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_petType= By.xpath("//strong[text()='Pet Types']");
	By click_configuration=By.xpath("(//button[text()='Configure'])[4]");
	
   

	public WebElement user_click_petType()
	{
		return driver.findElement(click_petType);
	}
	public WebElement user_click_configuration()
	{
		return driver.findElement(click_configuration);
	}
	
	
}
