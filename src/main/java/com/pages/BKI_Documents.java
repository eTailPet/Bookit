package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BKI_Documents {

	public WebDriver driver;
	
	public BKI_Documents (WebDriver driver)
	{
		this.driver=driver;
	}
	By user_click_on_Documents=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/ul/li[11]/a/strong");
	By user_click_on_Add_New=By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div[2]/div/button");
	By click_on_Save= By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div/form/div[3]/button");
	public WebElement user_click_on_Documents() 
	{
		return driver.findElement(user_click_on_Documents);
    }
	
	public WebElement user_click_on_Add_New()
	{
		return driver.findElement(user_click_on_Add_New);
	}
	
	public WebElement click_on_Save()
	{
		return driver.findElement(click_on_Save);
	}
	
	
}