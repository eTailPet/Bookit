package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class schedule {
public WebDriver driver;
	
	public schedule(WebDriver driver)
	{
		this.driver=driver;
	}
	By select_date=By.xpath("(//abbr[text()='5'])[1]");
	By click_on_date = By.xpath("//li[text()='dogss']");

	
	public WebElement user_select_date()
	{
		return driver.findElement(select_date);
	}
	public WebElement user_click_on_date()
	{
		return driver.findElement(click_on_date);
	}
}
