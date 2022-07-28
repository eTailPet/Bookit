package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedingInformation {

public WebDriver driver;
	
	public FeedingInformation (WebDriver driver)
	{
		this.driver=driver;
	}
	By user_click_on_Feeding_Information=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/ul/li[3]/a/strong");
	By user_click_on_Gain_Free=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/label");
	By user_click_on_Gain_Full=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/div/label");
	By user_enter_charge=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/input");
	By click_on_save=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button");
	
	public WebElement user_click_on_Feeding_Information() 
	{
		return driver.findElement(user_click_on_Feeding_Information);
	}
	public WebElement user_click_on_Gain_Free()
	{
		return driver.findElement(user_click_on_Gain_Free);
	}
	public WebElement user_click_on_Gain_Full()
	{
		return driver.findElement(user_click_on_Gain_Full);
	}
	public WebElement user_enter_charge()
	{
		return driver.findElement(user_enter_charge);
	}
	public WebElement click_on_save()
	{
		return driver.findElement(click_on_save);
	}
	
	
}
