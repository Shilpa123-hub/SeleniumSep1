package keywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Methods {

	static WebDriver driver;
	
	public static void openBrowser()
	{
		driver=new ChromeDriver();
	}
	
	public static void maximiseBrowser()
	{
		driver.manage().window().maximize();
	}
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void navigateToApplication(String url)
	{
		driver.get(url);
	}
	public static void enterUserID(String loc,String locValue,String userID)
	{
		if(loc.equals("id"))
		{
		driver.findElement(By.id(locValue)).sendKeys(userID);
		}
		else if(loc.equals("name"))
		{
			driver.findElement(By.name(locValue)).sendKeys(userID);
		}
	}
	public static void enterPassword(String loc,String locValue,String password)
	{
		if(loc.equals("id"))
		{
		driver.findElement(By.id(locValue)).sendKeys(password);
		}
		else if(loc.equals("name"))
		{
			driver.findElement(By.name(locValue)).sendKeys(password);
		}
	}
	
	public static void clickSignInBtn(String loc,String locValue)
	{
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).click();	
		}
		else if(loc.equals("name"))
		{
			driver.findElement(By.name(locValue)).click();
		}
	}
	
	public static String verifyErrorMessage(String locValue)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locValue)));
		
	String actualMessage=driver.findElement(By.cssSelector(locValue)).getText();
	return actualMessage;
	}
	
	public static void closeApplication()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
