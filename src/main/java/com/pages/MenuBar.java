package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBar {
public WebDriver driver;
	
	public MenuBar(WebDriver driver) {
		this.driver=driver;
	}
	
	By selectBookit = By.id("dashboard-toggle");
	By booking = By.xpath("//span[text()='Bookings']");
	By config = By.xpath("//a[text()='Configuration']");
	
	
	
	public WebElement selectBookit() {
		return driver.findElement(selectBookit);
	}
	
	public WebElement clickBooking() {
		return driver.findElement(booking);
	}
	
	public WebElement selectConfig() {
		return driver.findElement(config);
	}

}
