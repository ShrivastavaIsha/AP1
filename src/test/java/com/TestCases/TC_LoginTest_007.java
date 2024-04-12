package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_007 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		LoginPage lp= new LoginPage(driver);
		lp.clickSigninLink();
		logger.info("Signin link clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lp.emailInput);
		lp.clickCreateAcc();
		logger.info("Create account button clicked");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		if(driver.getTitle().equals(URL2))
		{
			Assert.assertTrue(false);
			logger.info("Login test case 7 is failed ");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Create account button navigate to create account form");
			logger.info("Login test case 7 is passed");
		}
		
	}


}
