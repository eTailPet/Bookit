package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Appointment {
	
public WebDriver driver;
	
	public Appointment(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_appointment=  By.xpath("//button[text()='New Appointment']");
	
   

	public WebElement user_click_appointment()
	{
		return driver.findElement(click_appointment);
	}
	
}