package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_008 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		LoginPage lp= new LoginPage(driver);
		lp.clickSigninLink();
		logger.info("Signin link clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lp.emailInput);
		lp.clickForgotPass();
		logger.info("Forgot password link clicked");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL2))
		{
			Assert.assertTrue(false);
			logger.info("Login test case 8 is failed");
		}

		else
		{
			Assert.assertTrue(true);			
			logger.info("Forgot password button navigate to forgot password page");
			logger.info("Login test case 8 is passed ");
		}
		
	}

}
