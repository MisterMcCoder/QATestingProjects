package org.wipro.fedex.automation.datagenerator;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataGeneratorClass 
{
	@DataProvider(name="exceldata")
	public Object[][] testdatagenerator() throws Exception 
	{
		File f = new File("./TestData/file.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheet("data");
		int nr = sh.getPhysicalNumberOfRows();
		
		Object[][] testdata = new Object[nr][2];
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testdata[i][0] = username.getStringCellValue();
			testdata[i][1] = password.getStringCellValue();
			
		}
		
		//Object[][] testdata = {{"user1", "pass1"},{"user2","pass2"}, {"user3", "pass3"}}; //2D Array, passes SINGLE COMBINATIONS of Test data 
		return testdata;
	}
}
