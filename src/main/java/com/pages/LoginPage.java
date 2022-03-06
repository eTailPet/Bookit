package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//By Remember_me=By.xpath("//span[text()='Remember me']");
	By Username= By.id("signin-username");
	By Password = By.id("signin-password");
	By SIGNINN=By.xpath("//input[@type='submit']");



	public WebElement enter_username()
	{
		return driver.findElement(Username);
	}
	
	public WebElement enter_password()
	{
		return driver.findElement(Password);
	}

	public WebElement clicksignIn()
	{
		return driver.findElement(SIGNINN);
	}
//	public WebElement user_click_Remember_me()
//	{
//		return driver.findElement(Remember_me);
//	}
	
	
}