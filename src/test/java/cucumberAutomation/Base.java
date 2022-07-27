package cucumberAutomation;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	

	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver getDriver() throws Throwable {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\user1\\Downloads\\EtailpetCucumberorginal2\\EtailpetCucumberorginal2\\src\\test\\java\\cucumberAutomation\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	


}
