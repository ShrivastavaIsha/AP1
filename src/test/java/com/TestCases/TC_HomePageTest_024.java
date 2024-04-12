package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.HomePage;

import junit.framework.Assert;

public class TC_HomePageTest_024 extends BaseClass
{
	@Test
	public void homePageTest() throws IOException, InterruptedException
	{
		driver.get(URL);
		HomePage hp= new HomePage(driver);
		hp.whatsNewLink();
		logger.info("What's new link clicked");
		hp.teesWomen();
		logger.info("Tees women link clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",hp.teesSelected);
		hp.colorTeesBlackSelected();
		logger.info("Tees selected");
		hp.sizeTees2();
	    logger.info("S Size selected");
		hp.colorTeesYellow();
		logger.info("Yellow color tees selected");
		hp.colorTeesBlackAdd();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",hp.addToCart);
		logger.info("Add to cart clicked");
		
		
		
		if(driver.getTitle().endsWith(URL6))
		{
			Assert.assertTrue(false);
			logger.info("Home page test case 24 is failed");
		}

		else
		{
			Assert.assertTrue(true);
			logger.info("product added to cart successfully");
			logger.info("Home page test case 24 is passed");
		}
		
	}



}
