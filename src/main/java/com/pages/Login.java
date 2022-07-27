package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName= By.id("signin-username");
	By password = By.id("signin-password");
	By signIn = By.xpath("//input[@type='submit']");
	
	public WebElement enterUname() {
		return driver.findElement(userName);
	}
	
	public WebElement enterPass() {
		return driver.findElement(password);
	}
	
	public WebElement clickSignin() {
		return driver.findElement(signIn);
	}

}
