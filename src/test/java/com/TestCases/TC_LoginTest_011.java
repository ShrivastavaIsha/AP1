package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_011 extends BaseClass
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
		lp.setResetEmail(emailid2);
		logger.info("Wrong format email id set");
		lp.clickResetPass();
		logger.info("Reset button clicked");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL2))
		{
			Assert.assertTrue(false);
			logger.info("Login test case 11 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Password recovery unsuccessful");
			logger.info("Login test case 11 is passed ");
			
		}
		
	}

}
