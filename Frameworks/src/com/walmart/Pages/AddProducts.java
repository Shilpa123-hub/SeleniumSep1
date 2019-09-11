package com.walmart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProducts {
	
	@FindBy(css="#carousel-Featured\\ Items > div > div.slider-frame > ul > li:nth-child(1) > div > div.productTile__detailsOld___2Lc3l > div:nth-child(5) > div > div > button")	
	private WebElement addToCart;

	@FindBy(css="#carousel-Featured\\ Items > div > div.slider-frame > ul > li:nth-child(1) > div > div.productTile__detailsOld___2Lc3l > div:nth-child(5) > div > div > button.AddToCart__cartIconPlus___3xHfn > i")
	private WebElement quantity;	
	
	public void addProducts()
	{
	
	addToCart.click();
	quantity.click();
	}
	public AddProducts(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
}
