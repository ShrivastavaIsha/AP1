package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
			
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);		
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
			
		}
	}
	
	
	public String getApplicationURL()
	{
		String url= pro.getProperty("URL");
		return url;
	}
	
	public String getApplicationURL2()
	{
		String url= pro.getProperty("URL2");
		return url;
	}
	public String getApplicationURL3()
	{
		String url= pro.getProperty("URL3");
		return url;
	}
	public String getApplicationURL4()
	{
		String url= pro.getProperty("URL4");
		return url;
	}
	
	public String getApplicationURL5()
	{
		String url= pro.getProperty("URL5");
		return url;
	}
	public String getApplicationURL6()
	{
		String url= pro.getProperty("URL6");
		return url;
	}
	public String getApplicationURL7()
	{
		String url= pro.getProperty("URL7");
		return url;
	}
	
	
	public String getEmailid()
	{
		String eid= pro.getProperty("emailid1");
		return eid;
	}
	
	public String getEmailid2()
	{
		String eid2= pro.getProperty("emailid2");
		return eid2;
	}
	
	
	public String getPassword()
	{
		String pass= pro.getProperty("password1");
		return pass;
	}
	
	public String getPassword2()
	{
		String pass= pro.getProperty("password2");
		return pass;
	}
	
	public String getPassword3()
	{
		String pass= pro.getProperty("password3");
		return pass;
	}
	
	public String getPassword4()
	{
		String pass= pro.getProperty("password4");
		return pass;
	}
	
	public String getPassword5()
	{
		String pass= pro.getProperty("password5");
		return pass;
	}
	
	public String getPassword6()
	{
		String pass= pro.getProperty("password6");
		return pass;
	}
	
	public String getChromePath()
	{
		String chPath= pro.getProperty("chromepath");
		return chPath;
	}
	
	
	public String getFirstName()
	{
		String fn= pro.getProperty("firstname");
		return fn;
	}
	
	public String getLastName()
	{
		String ln= pro.getProperty("lastname");
		return ln;
	}
}
