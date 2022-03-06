package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer {
	
public WebDriver driver;
	
	public Customer(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_customer=  By.xpath("//span[text()='Customers']");
	By Search_customer= By.name("query");
	By click_on_submit = By.xpath("//button[text()='Submit']");
	By select_on_customer = By.xpath("//a[text()='Anu s']");
   

	public WebElement user_click_on_customer()
	{
		return driver.findElement(click_on_customer);
	}
	public WebElement user_Search_customer()
	{
		return driver.findElement(Search_customer);
	}
	public WebElement user_click_on_submit()
	{
		return driver.findElement(click_on_submit);
	}
	public WebElement user_select_on_customer()
	{
		return driver.findElement(select_on_customer);
	}
	
}