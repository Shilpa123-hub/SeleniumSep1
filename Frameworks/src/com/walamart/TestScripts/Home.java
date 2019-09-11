package com.walamart.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.walmart.Pages.AddProducts;
import com.walmart.Pages.HomePage;

public class Home {

WebDriver driver;
	
	@BeforeTest
	public void openApplication()
	{
		
		 driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void checkOutApplication()
	{
		
		HomePage hp=new HomePage(driver);
		AddProducts ap=new AddProducts(driver);
		//WebDriverWait wait=new WebDriverWait(driver,20);
		
		hp.addCart();
		ap.addProducts();
		
	}
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}	
	
}
