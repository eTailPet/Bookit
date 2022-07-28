package cucumberAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	public static WebDriver driver;
	public static Properties prop;

	public  WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\NUZHAT\\Downloads\\EtailpetCucumber-my\\EtailpetCucumber\\src\\test\\java\\cucumberAutomation\\global.properties");
		
	prop.load(fis);

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NUZHAT\\Downloads\\EtailpetCucumber-my\\EtailpetCucumber\\Drivers\\chromedriver.exe");
		
		
   	driver=new ChromeDriver();
   	 
  	driver.get(prop.getProperty("url"));
   	 return driver;
		
	}
	


}
