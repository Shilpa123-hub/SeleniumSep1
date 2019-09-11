package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOn {

@FindBy(linkText="SIGN-ON")	
private WebElement signOn;

public boolean verifySignOnLinkVisible()
{
	 return signOn.isDisplayed();
	 
	
}

public SignOn(WebDriver driver)
{

	PageFactory.initElements(driver, this);
}	
	
	
}
