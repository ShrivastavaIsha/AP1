package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.CreateAccPage;

import junit.framework.Assert;

public class TC_CreateAccTest_014 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		CreateAccPage cap= new CreateAccPage(driver);
		cap.clickAccCreate();
		logger.info("Create account link clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cap.firstNameInput);	
		cap.setFirstName(firstname);
		logger.info("First name set");
		cap.setLastName(lastname);
		logger.info("last name set");
		cap.setEmail(emailid2);
		logger.info("Wrong format email id set");
		cap.setPass(password1);
		logger.info("Password set");
		cap.setConfirmPass(password1);
		logger.info("Confirm password set");
		cap.clickCreateAcc();
		logger.info("Create account button clicked");
		//captureScreen(driver, "CreateAccTest");
		Thread.sleep(1000);
		if(driver.getTitle().endsWith(URL5))
		{
			Assert.assertTrue(false);
			logger.info("Create account test case 14 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("Account doesn't Create successfully");
			logger.info("Create account test case 14 is passed");
		}
		
	}

}
