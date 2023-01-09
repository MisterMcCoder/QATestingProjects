package org.wipro.fedex.automation.testcases;
import org.testng.annotations.Test;
import org.wipro.fedex.automation.base.DriverInitiate;
import org.wipro.fedex.automation.datagenerator.TestDataGeneratorClass;
import org.wipro.fedex.automation.pages.LoginPages;
import org.wipro.fedex.automation.utility.UtilityClass;


public class TS001_FirstTestCase_Excel extends DriverInitiate
{

	@Test(dataProvider="exceldata", dataProviderClass=TestDataGeneratorClass.class) 
	public void tc_loginvalidation(String name, String pass) throws Exception 
	{
		LoginPages login = new LoginPages(driver);
		login.enter_username(name);
		login.enter_password(pass);
		login.click_loginbutton();
	}
	
	
}
