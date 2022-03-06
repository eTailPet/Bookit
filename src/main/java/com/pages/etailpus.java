package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class etailpus {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.get("https://sandyspetstore.staging.etailpet.com/site-admin/login/?next=/retailer/dash/");
		driver.findElement(By.id("signin-username")).sendKeys("kallis@mailinator.com");
		driver.findElement(By.id("signin-password")).sendKeys("asdf123");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dashboard-toggle")));
		driver.findElement(By.id("dashboard-toggle")).click();
		//select etailpus
		WebElement Source = driver.findElement(By.id("dashboard-toggle"));
		  Select dd1=new Select(Source);
		  dd1.selectByVisibleText("eTailPlus");
		  //click on new sale
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Sale']")));
		driver.findElement(By.xpath("//span[text()='New Sale']")).click();
	     //click on ok
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"closeBtn\"]")));
		 driver.findElement(By.xpath("//*[@id=\"closeBtn\"]")).click();
       ///click on search
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Enter customer name']")));
		driver.findElement(By.xpath("//span[text()='Enter customer name']")).click();
        ///search name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[1]")));
		driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[1]")).sendKeys("test");
		
		


	
	   
	}
}

