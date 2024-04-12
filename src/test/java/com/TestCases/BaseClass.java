package com.TestCases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utilities.ReadConfig;

	public class BaseClass
	{
		
		ReadConfig rc= new ReadConfig();
		//public String URL="https://magento.softwaretestingboard.com/";
		public String URL= rc.getApplicationURL();
		public String URL2= rc.getApplicationURL2();
		public String URL3= rc.getApplicationURL3();
		public String URL4= rc.getApplicationURL4();
		public String URL5= rc.getApplicationURL5();
		public String URL6= rc.getApplicationURL6();
		public String URL7= rc.getApplicationURL7();
		public String emailid1= rc.getEmailid();
		public String emailid2= rc.getEmailid2();
		public String password1= rc.getPassword();
		public String password2= rc.getPassword2();
		public String password3= rc.getPassword3();
		public String password4= rc.getPassword4();
		public String password5= rc.getPassword5();
		public String password6= rc.getPassword6();
		public String firstname= rc.getFirstName();
		public String lastname= rc.getLastName();
		public static WebDriver driver;
		public static Logger logger;
		
		@BeforeClass
		public void setup()
		{
			
			System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		    driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    logger= Logger.getLogger("Magneto");
		    PropertyConfigurator.configure("Log4j.properties");
		}
		
		
		
		
		public void captureScreen(WebDriver driver, String tname) throws IOException
		{
			TakesScreenshot ts= (TakesScreenshot)driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			//File target= new File("./ScreenShots/"+ tname +".png");
			File target1= new File(System.getProperty("user.dir")+"./ScreenShots/"+ tname +".png");
			FileUtils.copyFile(source, target1);
			System.out.println("Screenshot Taken");			
		}
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}



