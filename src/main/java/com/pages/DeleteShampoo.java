package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteShampoo {

	public WebDriver driver;

	public DeleteShampoo(WebDriver driver) 
	{
		this.driver= driver;
	}

	By clickEventId= By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[3]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[6]/div[3]");
	By CancelService= By.linkText("Cancel Service");
	By DeleteYes = By.xpath("//button[text()='Yes']");
	By DeleteNo = By.xpath("//button[text()='No']");

	public WebElement user_click_even_id()
	{
		return driver.findElement(clickEventId);
	}

	public WebElement user_click_cancel_service()
	{
		return driver.findElement(CancelService);
	}

	public WebElement user_click_yes()
	{
		return driver.findElement(DeleteYes);
	}

	public WebElement user_click_no()
	{
		return driver.findElement(DeleteNo);
	}


}
