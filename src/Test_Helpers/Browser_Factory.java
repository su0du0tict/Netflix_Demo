package Test_Helpers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser_Factory {
	
	public static WebDriver launch_WEB_URL(String URL) throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Demo\\geckodriver\\geckodriver-v0.19.1-win64.exe");   //geckodriver-v0.19.0-win64.zip
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get(URL);
		return driver;
		
	}

}
