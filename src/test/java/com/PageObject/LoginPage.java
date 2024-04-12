package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
		WebDriver lDriver;
		
		public LoginPage(WebDriver rDriver)
		{
			lDriver=rDriver;
			PageFactory.initElements(rDriver, this);
			
		}
		
		
		@FindBy(className="authorization-link")
		@CacheLookup
		public
		WebElement signinLink;
		
		
		@FindBy(name="login[username]")
		@CacheLookup
		public
		WebElement emailInput;
		
		@FindBy(name="login[password]")
		@CacheLookup
		public
		WebElement passwordInput;
		
		@FindBy(xpath="//button[@class='action login primary']")
		@CacheLookup
		public
		WebElement signinButton;
		
		@FindBy(xpath="//a[@class='action create primary']")
		@CacheLookup
		public
		WebElement createAnAccount;
	     		
		@FindBy(xpath="//a[@class='action remind']")
		@CacheLookup
		public
		WebElement forgotPassword;
		
		
		@FindBy(xpath="//input[@id='email_address']")
		@CacheLookup
		public
		WebElement emailidReset;
		
		
		@FindBy(xpath="//button[@class='action submit primary']")
		@CacheLookup
		public
		WebElement resetPassword;
		
		
		public void clickSigninLink()
		{
			signinLink.click();
			
		}
	    
		public void setEmail(String email )
		{
			emailInput.sendKeys(email);
			
		}
		public void setPassword(String password )
		{
			passwordInput.sendKeys(password);
			
		}
		public void clickSignin()
		{
			signinButton.click();
			
		}
		public void clickCreateAcc()
		{
			createAnAccount.click();
			
		}
		public void clickForgotPass()
		{
			forgotPassword.click();
			
		}
		public void setResetEmail(String email)
		{
			emailidReset.sendKeys(email);
			
		}
		public void clickResetPass()
		{
			resetPassword.click();
			
		}
	
}














