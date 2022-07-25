package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateService {

	public WebDriver driver;
	
	public void service(WebDriver driver) {
		this.driver= driver;
		
	}
	
	By NewService = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/button");
	By NewServiceInput= By.name("serviceTypeName");
	By IndexValues= By.name("serviceTypeIndexValue");
	By UploadService= By.xpath("//label[text()='Choose service type image']");
	By submit= By.xpath("//button[@type='submit']");
	
	public WebElement new_service() 
	{
		return driver.findElement(NewService);
	}
	
	public WebElement new_service_input() 
	{
		return driver.findElement(NewServiceInput);
	}
	public WebElement index_value() 
	{
		return driver.findElement(IndexValues);
	}
	public WebElement upload_service() 
	{
		return driver.findElement(UploadService);
	}
	public WebElement submit() 
	{
		return driver.findElement(submit);
	}
	
	
	
}
