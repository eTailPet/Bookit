package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Retailerdashboardpage {
	
public WebDriver driver;
	
	public Retailerdashboardpage(WebDriver driver)
	{
		this.driver=driver;
	}

	//By click_dashboard= By.id("dashboard-toggle");
	By click_booking=By.xpath("//span[text()='Bookings']");
	//By click_schedule=By.xpath("//a[@class='bookit-redirect']");
	By click_configuration=By.linkText("Configuration");
	By click_customers=By.linkText("Customers");
	By click_service=By.linkText("service-types");
   

//	public WebElement user_click_dashboard()
//	{
//		return driver.findElement(click_dashboard);
//	}
	public WebElement user_click_booking()
	{
		return driver.findElement(click_booking);
	}
	public WebElement user_click_configuration()
	{
		return driver.findElement(click_configuration);
	}
//	public WebElement user_click_schedule()
//	{
//		return driver.findElement(click_schedule);
//	}
	public WebElement user_click_customers()
	{
		return driver.findElement(click_customers);
	}
	public WebElement click_service()
	{
		return driver.findElement(click_service);
	}
	
}
