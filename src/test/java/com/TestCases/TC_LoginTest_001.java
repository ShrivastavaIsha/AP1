package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	
		@Test
		public void loginTest() throws IOException, InterruptedException
		{
			
			driver.get(URL);
			LoginPage lp= new LoginPage(driver);
			lp.clickSigninLink();
			logger.info("Signin link clicked");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lp.emailInput);
			lp.setEmail(emailid1);
			logger.info("Email is set");
			lp.setPassword(password1);
			logger.info("Password is set");
			lp.clickSignin();
			logger.info("Signin button cliked");
			//captureScreen(driver, "loginTest");
			Thread.sleep(1000);
			
			if(driver.getTitle().endsWith(URL))
			{
				Assert.assertTrue(false);
				logger.info("Login test case 1 is failed");
			}

			else
			{
				Assert.assertTrue(true);
				logger.info("Login successful");
				logger.info("Login test case 1 is passed");
			}
		}



}
