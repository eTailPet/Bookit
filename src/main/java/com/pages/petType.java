package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class petType {
  
public WebDriver driver;
	
	public petType(WebDriver driver)
	{
		this.driver=driver;
	}
	By enter_petname=By.className("form-control");
	By enter_petimage=By.className("custom-file-input");
	By click_next=By.xpath("//button[text()='Next']");
	By click_on_switch=By.xpath("//div[@class='react-switch-bg'][1]");
	By click_on_switch1=By.xpath("//div[@class='react-switch-handle'][1]");
	
   
	public WebElement user_enter_petname()
	{
		return driver.findElement(enter_petname);
	}
	public WebElement user_enter_petimage()
	{
		return driver.findElement(enter_petimage);
	}
	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}
	public WebElement user_click_on_switch()
	{
		return driver.findElement(click_on_switch);
	}
	public WebElement user_click_on_switch1()
	{
		return driver.findElement(click_on_switch1);
	}
}
