package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_004 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		LoginPage lp= new LoginPage(driver);
		lp.clickSigninLink();
		logger.info("Signin link clicked");
		logger.info("Email id is missing");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lp.emailInput);
		lp.setPassword(password1);
		logger.info("Password set");
		lp.clickSignin();
		logger.info("Singin button clicked");
		//captureScreen(driver, "loginTest");
		Thread.sleep(1000);
		
		if(driver.getTitle().endsWith(URL))
		{
			Assert.assertTrue(false);
			logger.info("Login test case4 is failed ");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Login unsuccessful");
			logger.info("Login test case 4 is passed");
		}
		
	}


}
