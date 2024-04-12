package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.Utilities.XLUtils;

public class TC_LoginTest_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginTest2(String email, String password)
	{
		driver.get(URL);
		LoginPage lp= new LoginPage(driver);
		lp.clickSigninLink();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lp.emailInput);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickSignin();
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException 
	{
		String path="./src/test/java/com/TestData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colCount= XLUtils.getCellCount(path, "Sheet1", 1);
		
		String loginData[][]= new String[rownum][colCount];
		loginData[1][0]= XLUtils.getCellData(path, "Sheet1", 1, 0);
		loginData[1][1]= XLUtils.getCellData(path, "Sheet1", 1, 0);
		
		return loginData;
	}
	
}


















