package smokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginPOM {
	
	@Test	
	public void LoginTestPOM() {
	//Initialize Driver
	
	WebDriver driver =  utilities.DriverFactory.open("chrome");	
	
	driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
	
	//Enter login information (loginPage)
		//create object to pass the driver to the constructor
		LoginPage loginPage = new LoginPage(driver);
	
	
	loginPage.setUserName("tim@testemail.com");
	loginPage.serPassword("trpass");
	loginPage.clickSubmit();
	
	//Get Confirmation (Dashboard page) 
		//create object to pass the driver to the constructor
		DashboardPage dashboardPage = new DashboardPage(driver);
		
	String confMessage = dashboardPage.ValidateConfirmationPage();	
	
	System.out.println(confMessage);
	//Assert.assertTrue(confMessage.contains("Account"));
	
	// Close driver
	
	driver.close();
	
	}
	

}
