package cucumberAutomation;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BookitBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public WebDriver getDriver() throws Throwable {
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\monic\\Downloads\\EtailpetCucumberorginal2 (2)\\EtailpetCucumberorginal2\\EtailpetCucumberorginal2\\src\\test\\java\\cucumberAutomation\\global.properties");
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monic\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get(prop.getProperty("posurl"));
	

	
	
	return driver;

}
}
