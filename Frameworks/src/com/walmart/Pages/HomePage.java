package com.walmart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

@FindBy(css="#header-bubble-links > div:nth-child(1) > a")

private WebElement grocery;




public void addCart()
{

	grocery.click();
	
}
public HomePage(WebDriver driver)
{

	PageFactory.initElements(driver, this);
}

}
