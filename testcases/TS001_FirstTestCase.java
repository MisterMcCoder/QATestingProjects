package org.wipro.fedex.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.fedex.automation.base.DriverInitiate;
import org.wipro.fedex.automation.pages.LoginPages;
import org.wipro.fedex.automation.utility.UtilityClass;


public class TS001_FirstTestCase extends DriverInitiate
{

	@Test 
	public void tc_loginvalidation() throws Exception 
	{
		LoginPages login = new LoginPages(driver);
		login.enter_username(UtilityClass.readConfigProp("username"));
		login.enter_password(UtilityClass.readConfigProp("password"));
		login.click_loginbutton();
	}
	
}
