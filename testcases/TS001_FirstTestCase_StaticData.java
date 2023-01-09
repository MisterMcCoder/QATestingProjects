package org.wipro.fedex.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.fedex.automation.base.DriverInitiate;
import org.wipro.fedex.automation.pages.LoginPages;
import org.wipro.fedex.automation.utility.UtilityClass;


public class TS001_FirstTestCase_StaticData extends DriverInitiate
{

	@Test(dataProvider="static") 
	public void tc_loginvalidation(String name, String pass) throws Exception 
	{
		LoginPages login = new LoginPages(driver);
		login.enter_username(name);
		login.enter_password(pass);
		login.click_loginbutton();
	}
	
	@DataProvider(name="static")
	public Object[][] testdatagenerator() 
	{
		//String test = "user1"; //This is a data type
		
		//VVV This is also a data type
		//Object[] data = {"user1", "pass1", "user2", "pass2"}; //1D Array, passes MULTIPLE Test data
		Object[][] testdata = {{"user1", "pass1"},{"user2","pass2"}, {"user3", "pass3"}}; //2D Array, passes SINGLE COMBINATIONS of Test data 
		return testdata;
	}
	
	
}
