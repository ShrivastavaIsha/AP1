package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.CreateAccPage;

import junit.framework.Assert;

public class TC_CreateAccTest_013 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		CreateAccPage cap= new CreateAccPage(driver);
		cap.clickAccCreate();
		logger.info("Create account link clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cap.firstNameInput);
		cap.clickCreateAcc();
		logger.info("Create account button clicked");
		logger.info("Required field are vacant");
		//captureScreen(driver, "CreateAccTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL5))
		{
			Assert.assertTrue(false);
			logger.info("Create account test case 13 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Account doesn't Create successfully");
			logger.info("Create account test case 13 is passed");
		}
	}

}
