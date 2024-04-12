package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccPage
{
	WebDriver CDriver;
	
	public CreateAccPage(WebDriver rDriver)
	{
		CDriver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Create an Account']")
	@CacheLookup
	public
	WebElement createAccLink;
	
	/*@FindBy(xpath="//a[@class='action create primary']")
	@CacheLookup
	public
	WebElement createAccLink;*/
	
	
	@FindBy(xpath="//input[@id='firstname']")
	@CacheLookup
	public
	WebElement firstNameInput;
	
	@FindBy(xpath="//input[@id='lastname']")
	@CacheLookup
	public
	WebElement lastNameInput;
	
	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	public
	WebElement emailInput;
	
	@FindBy(xpath="//input[@name='password' and @id='password']")
	@CacheLookup
	public
	WebElement passwordInput;
	
	@FindBy(xpath="//input[@name='password_confirmation']")
	@CacheLookup
	public
	WebElement confirmPasswordInput;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	@CacheLookup
	public
	WebElement createAcc;
	
	
	public void clickAccCreate( )
	{
		createAccLink.click();
		
	}
	public void setFirstName(String firstName )
	{
		firstNameInput.sendKeys(firstName);
		
	}
	public void setLastName(String lastName )
	{
		lastNameInput.sendKeys(lastName);
		
	}
	public void setEmail(String email )
	{
		emailInput.sendKeys(email);
		
	}
	public void setPass(String password )
	{
		passwordInput.sendKeys(password);
		
	}
	public void setConfirmPass(String cpassword )
	{
		confirmPasswordInput.sendKeys(cpassword);
		
	}
	public void clickCreateAcc()
	{
		createAcc.click();
		
	}
	

}












