package org.wipro.fedex.automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.fedex.automation.utility.UtilityClass;

public class DriverInitiate 
{
	public WebDriver driver; 
	
	@BeforeMethod
	public void launchbrowser() throws Exception 
	{
		
		if (UtilityClass.readConfigProp("browsername").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver");
		    driver = new ChromeDriver(); //will launch browser
			
		}
		
		else if (UtilityClass.readConfigProp("browsername").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		else if (UtilityClass.readConfigProp("browsername").equalsIgnoreCase("safari"))
		{
			System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			driver = new SafariDriver();
			
		}
		
		else if (UtilityClass.readConfigProp("browsername").equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./BrowserDrivers/msedgedriver");
			driver = new EdgeDriver();
			
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver");
		    driver = new ChromeDriver();
		}
		
		
		driver.get(UtilityClass.readConfigProp("application_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.quit();
	}
	
	
	
	
}
