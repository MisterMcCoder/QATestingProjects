package org.wipro.fedex.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.fedex.automation.utility.UtilityClass;

public class LoginPages 
{
	WebDriver driver;

	public LoginPages(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception 
	{
		driver.findElement(By.id(UtilityClass.readElementProp("fb_login_email_id"))).sendKeys(uname);;
	}
	
	public void enter_password(String upass) throws Exception 
	{
		driver.findElement(By.name(UtilityClass.readElementProp("fb_login_password_name"))).sendKeys(upass);;
	}
	
	public void click_loginbutton() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("fb_login_loginbutton_xpath"))).click();;
	}
}
