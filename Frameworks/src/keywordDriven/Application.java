package keywordDriven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import utils.GenericMethods;

public class Application {
	
	@Test
	public void verifyInvalidCredentials() throws IOException
	{
		//Making changes after release 1.1
		String[][] data = GenericMethods.getData("C:\\Users\\anily\\Desktop\\TestDataM.xlsx", "Sheet2");
		for(int i=0;i<data.length;i++)
		{
			switch(data[i][3])
			{
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.maximiseBrowser();
				break;
			case "impWait":
				Methods.implicitWait();
				break;
			case "navigateToApplication":
				Methods.navigateToApplication(data[i][6]);
				break;
			case "enterUserID":
				Methods.enterUserID(data[i][4],data[i][5], data[i][6]);
				break;
			case "enterPassword":	
				Methods.enterPassword(data[i][4],data[i][5], data[i][6]);
				break;
			case "clickSignIn":
				Methods.clickSignInBtn(data[i][4],data[i][5]);
				break;
			case "verifyErrMessg":
			String actualMessage=Methods.verifyErrorMessage(data[i][5]);
				Assert.assertEquals(actualMessage, data[i][6]);
				break;
			case "closeAUT":
				Methods.closeApplication();
				break;
				
			}
			
			
		}
		
	}
	

}
