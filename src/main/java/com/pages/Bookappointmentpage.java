package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bookappointmentpage {
	
public WebDriver driver;
	
	public Bookappointmentpage(WebDriver driver)
	{
		this.driver=driver;
	}

	By Select_service_type=By.id("react-select-9-input");
	By Select_service=By.xpath("//div[text()='Pet Sitting']");
	By service_name=By.id("react-select-10-input");
	By select_service_name=By.xpath("//div[text()='Staystorevar']");
	By click_on_attandent = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div[3]/div/div/div[2]/div");
    By select_attandent = By.xpath("//div[text()='Petty']");
	By select_timeSlot = By.xpath("//button[@class='link-btn btn']");
	By select_date = By.xpath("(//abbr[text()='4'])[2]");
	By select_time = By.xpath("(//li[text()='03:00 PM'])[2]");
	By Enter_tip_amount=By.xpath("//input[@placeholder='Enter tip amount']");
	By click_on_petdetails = By.xpath("//h5[text()='Pet Details']");
	By select_pet = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]");
	By Select_pet_name = By.xpath("//div[text()='tst rabbit eleven nov']");
	By click_Temperament = By.xpath("(//input[@autocapitalize='none'])[9]");
	By Select_temperament = By.xpath("//div[text()='neutral']");
	By click_hairlength =  By.xpath("(//input[@autocapitalize='none'])[10]");
	By select_hairlength = By.xpath("//div[text()='Short']");
	By click_on_otherdetails = By.xpath("//h5[text()='Other Details']");
	By enter_vetname2 = By.xpath("//input[@placeholder='Vet name 2']");
	By enter_vetname1 = By.xpath("//input[@placeholder='Vet name 1']");
	By enter_emergency = By.xpath("//input[@placeholder='Emergency Contact name']");
	By enter_emergency_number = By.xpath("//input[@placeholder='Emergency Phone number']");
	By click_how_many_times_food = By.xpath("//div[text()='2']/following-sibling::div");
	By click_service_auto_booked = By.xpath("//label[@for='isAutoBooked']");
	By enter_number_of_time = By.xpath("//label[text()='I need this service to be auto-booked every']/following::input");
	By click_on_booknow = By.xpath("//button[text()='Book Now']");
	By click_on_checkout = By.xpath("//button[text()='Check out']");
	
	
	
	
	
	
	
	public WebElement user_click_on_attandent()
	{
		return driver.findElement(click_on_attandent);
	}
	
	public WebElement user_click_on_checkout()
	{
		return driver.findElement(click_on_checkout);
	}
	public WebElement user_click_on_booknow()
	{
		return driver.findElement(click_on_booknow);
	}
	public WebElement user_click_how_many_times_food()
	{
		return driver.findElement(click_how_many_times_food);
	}
	public WebElement user_click_enter_number_of_time()
	{
		return driver.findElement(enter_number_of_time);
	}
	public WebElement user_click_service_auto_booked()
	{
		return driver.findElement(click_service_auto_booked);
	}
	public WebElement user_select_attandent()
	{
		return driver.findElement(select_attandent);
	}

	public WebElement user_Select_service()
	{
		return driver.findElement(Select_service);
	}
	public WebElement user_Select_service_type()
	{
		return driver.findElement(Select_service_type);
	}
	public WebElement user_service_name()
	{
		return driver.findElement(service_name);
	}
	public WebElement user_select_service_name()
	{
		return driver.findElement(select_service_name);
	}
	public WebElement user_enter_vetname2()
	{
		return driver.findElement(enter_vetname2);
	}
	public WebElement user_enter_vetname1()
	{
		return driver.findElement(enter_vetname1);
	}
	public WebElement user_enter_emergency()
	{
		return driver.findElement(enter_emergency);
	}
	public WebElement user_enter_emergency_number()
	{
		return driver.findElement(enter_emergency_number);
	}
	public WebElement user_select_date()
	{
		return driver.findElement(select_date);
	}
	public WebElement user_select_timeSlot()
	{
		return driver.findElement(select_timeSlot);
	}
	public WebElement user_select_time()
	{
		return driver.findElement(select_time);
	}
	public WebElement user_Enter_tip_amount()
	{
		return driver.findElement(Enter_tip_amount);
	}
	public WebElement user_click_on_petdetails()
	{
		return driver.findElement(click_on_petdetails);
	}
	public WebElement user_select_pet()
	{
		return driver.findElement(select_pet);
	}
	public WebElement user_Select_pet_name()
	{
		return driver.findElement(Select_pet_name);
	}
	public WebElement user_click_Temperament()
	{
		return driver.findElement(click_Temperament);
	}
	public WebElement user_Select_temperament()
	{
		return driver.findElement(Select_temperament);
	}
	public WebElement user_click_hairlength()
	{
		return driver.findElement(click_hairlength);
	}
	public WebElement user_select_hairlength()
	{
		return driver.findElement(select_hairlength);
	}
	public WebElement user_click_on_otherdetails()
	{
		return driver.findElement(click_on_otherdetails);
	}
}
