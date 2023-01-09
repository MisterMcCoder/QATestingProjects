package org.wipro.fedex.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.fedex.automation.utility.UtilityClass;

public class AllLinksPage 
{
	WebDriver driver;

	public AllLinksPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_investor( ) throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("investors_xpath"))).click();;;
	}
	
	public void click_newsroom() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("newsroom_xpath"))).click();;
	}
	
	public void click_csr() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("csr_xpath"))).click();;
	}
	
	public void click_esg() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("esg_xpath"))).click();;
	}
	
	public void click_culture() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("culture_xpath"))).click();;
	}
	
	public void click_contact() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("contact_xpath"))).click();;
	}
	
	public void click_french() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("french_xpath"))).click();;
	}
	
	public void click_german() throws Exception 
	{
		driver.findElement(By.xpath(UtilityClass.readElementProp("german_xpath"))).click();;
	}
}
