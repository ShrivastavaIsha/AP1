package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_010 extends BaseClass
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
		logger.info("Navigate to forgot password page ");
		lp.clickResetPass();
		logger.info("Email id is missing");
		logger.info("Clicked reset button");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL2))
		{
			Assert.assertTrue(false);
			logger.info("Login test case 10 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Password recovery unsuccessful");
			logger.info("Login test case 10 is passed ");
			
		}
		
	}

}
