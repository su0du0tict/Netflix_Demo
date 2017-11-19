package Test_Helpers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser_Factory {
	
	public static WebDriver launch_WEB_URL(String URL, String Browser) throws Exception
	{
		WebDriver driver=null;
		
		if(Browser=="Firefox")
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Demo\\geckodriver\\geckodriver-v0.19.1-win64.exe");   //geckodriver-v0.19.0-win64.zip
	
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get(URL);
		}
		
		else if( Browser=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Custom Installations\\Appium\\chromedriver_win32\\New Chromedriver\\chromedriver_2.33.exe");   //
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			driver.get(URL);
		}
		
		
		return driver;	
	}

}
