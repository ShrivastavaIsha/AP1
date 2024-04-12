package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	WebDriver lDriver;
	
	public HomePage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(xpath="//a[@id='ui-id-3']")
	@CacheLookup
	public
	WebElement whatsNew;
	
	@FindBy(xpath="//a[text()='Tees']")
	@CacheLookup
	public
	WebElement tees1;
	
	
	@FindBy(id="option-label-size-143-item-166")
	@CacheLookup
	public
	WebElement xsSize;
	
	@FindBy(id="option-label-size-143-item-167")
	@CacheLookup
	public
	WebElement sSize;
	
	@FindBy(id="option-label-size-143-item-168")
	@CacheLookup
	public
	WebElement mSize;
	
	@FindBy(id="option-label-size-143-item-169")
	@CacheLookup
	public
	WebElement lSize;
	
	@FindBy(id="option-label-size-143-item-170")
	@CacheLookup
	public
	WebElement xlSize;
	
	
	@FindBy(id="option-label-color-93-item-49")
	@CacheLookup
	public
	WebElement colorBlack;
	
	@FindBy(id="option-label-color-93-item-56")
	@CacheLookup
	public
	WebElement colorOrange;
	
	@FindBy(id="option-label-color-93-item-60")
	@CacheLookup
	public
	WebElement colorYellow;
	
	@FindBy(xpath="//a[@class='product-item-link']")
	@CacheLookup
	public
	WebElement teesSelected;
	
	@FindBy(id="product-addtocart-button")
	@CacheLookup
	public
	WebElement addToCart;
	
	
	public void whatsNewLink()
	{
		whatsNew.click();
		
	}
	public void teesWomen()
	{
		tees1.click();
		
	}
	public void sizeTees()
	{
		xsSize.click();
		
	}
	public void sizeTees2()
	{
		sSize.click();
		
	}
	public void sizeTees3()
	{
		mSize.click();
		
	}
	public void sizeTees4()
	{
		lSize.click();
		
	}
	public void sizeTees5()
	{
		xlSize.click();
		
	}
	public void colorTeesBlack()
	{
		colorBlack.click();
		
	}
	public void colorTeesOrange()
	{
		colorOrange.click();
		
	}
	public void colorTeesYellow()
	{
		colorYellow.click();
		
	}
	public void colorTeesBlackSelected()
	{
		teesSelected.click();
		
	}
	public void colorTeesBlackAdd()
	{
		addToCart.click();
		
	}

}
















