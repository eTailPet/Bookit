package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookitLogin {
	
	public WebDriver driver;
	
	public BookitLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	By uname = By.id("signin-username");
	By pwd = By.id("signin-password");
	By signin = By.xpath("//input[@type='submit']");
	
	public WebElement enterUname() {
		return driver.findElement(uname);
	}
	
	public WebElement enterPass() {
		return driver.findElement(pwd);
	}
	
	public WebElement clickSignin() {
		return driver.findElement(signin);
	}

}
