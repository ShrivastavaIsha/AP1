package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_009 extends BaseClass
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
		logger.info("forgot password link cliked");
		logger.info("Navigate");
		lp.setResetEmail(emailid1);
		logger.info("Email id set");
		lp.clickResetPass();
		logger.info("Reset button clicked");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL4))
		{
			Assert.assertTrue(false);
			logger.info("Login test case 9 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Password recovered");
			logger.info("Login test case 9 is passed ");
			
		}
	}

}








