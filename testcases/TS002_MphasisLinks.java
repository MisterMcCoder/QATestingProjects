package org.wipro.fedex.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wipro.fedex.automation.base.DriverInitiate;
import org.wipro.fedex.automation.pages.AllLinksPage;
import org.wipro.fedex.automation.pages.LoginPages;
import org.wipro.fedex.automation.utility.UtilityClass;


public class TS002_MphasisLinks extends DriverInitiate
{

	@Test 
	public void tc2_Linksvalidation() throws Exception 
	{
		AllLinksPage link = new AllLinksPage(driver);
		link.click_investor();
		Assert.assertEquals("", "");
		
		link.click_newsroom();
		Assert.assertEquals("", "");
		
		link.click_csr();
		Assert.assertEquals("", "");
		
		link.click_esg();
		Assert.assertEquals("", "");
		
		link.click_culture();
		Assert.assertEquals("", "");
		
		link.click_contact();
		Assert.assertEquals("", "");
		
		link.click_french();
		Assert.assertEquals("", "");
		
		link.click_german();
		Assert.assertEquals("", "");
	}
	
}
