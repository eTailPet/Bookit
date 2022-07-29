package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POSLogin {
	
	public WebDriver driver;
	
	public POSLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	private By username = By.name("username");
	private By password = By.name("password");
	private By signin = By.xpath("//input[@type='submit']");
	private By selectToggle =By.id("dashboard-toggle");

	
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickSignin() {
		return driver.findElement(signin);
	}
	
	public WebElement selectToggle() {
		return driver.findElement(selectToggle);
	}
}
