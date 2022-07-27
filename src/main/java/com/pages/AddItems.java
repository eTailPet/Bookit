package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItems {
	public WebDriver driver;
	
	public AddItems(WebDriver driver) {
		this.driver=driver;
	}
	
	By upc = By.id("item-add-upc");
	
	public WebElement enterUpc() {
		return driver.findElement(upc);
	}
}
