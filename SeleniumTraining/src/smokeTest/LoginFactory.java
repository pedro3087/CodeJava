package smokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPageFactory;

public class LoginFactory {

	String userName = "tim@testemail.com";
	String passwordText = "trpass";
	
	@Test
	public void LoginTestUsingPageFactory() {
		
		//1.Initialize Driver
		
		WebDriver driver =  utilities.DriverFactory.open("chrome");	
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
			
		
		//2. Enter Login
		
		LoginPageFactory loginPage = new LoginPageFactory (driver);
		
		loginPage.logInAction(userName, passwordText);
		
		
		//Close driver
		
		driver.close();
		
	}
}
