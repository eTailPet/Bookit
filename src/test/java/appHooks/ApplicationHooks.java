package appHooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumberAutomation.BookitBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	
	private BookitBase bBase;
	private WebDriver driver;

	
	@Before(order=0)
	public void launchbrowser() throws Throwable
	{
		bBase=new BookitBase();
		driver = bBase.getDriver();
		
		
	}
	
	
	
	@After(order=1)
	
		public void teardown(Scenario sc)
	{
		if(sc.isFailed())
		{
			String screenshotname=sc.getName().replaceAll(" ", "_");
			byte [] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", screenshotname);
			
			
			
			
		}
		
		
	}
	
	@After(order=0)
	public void quitbrowser() throws IOException
	{
		
		driver.quit();
		
	}
	
	
	
}
