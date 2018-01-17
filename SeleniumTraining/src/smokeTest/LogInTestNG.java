package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LogInTestNG {
	
	
	@Test
	public void loginElementsPresentTest() {
		
		WebDriver driver =  utilities.DriverFactory.open("chrome");	
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		
		boolean logEmailBox = driver.findElement(By.name("ctl00$MainContent$txtUserName")).isDisplayed();
		boolean passBox =driver.findElement(By.name("ctl00$MainContent$txtPassword")).isDisplayed();
		
		System.out.println("###############checking for elements############## ");
		Assert.assertTrue(logEmailBox);

		Assert.assertTrue(passBox);
		
		driver.close();
		
	}
	 
	
	@BeforeMethod
	public void setUp(){
		System.out.println("&&&&       Starting Test to check elements present      &&&&  ");
		
	}


	@AfterMethod
	
	public void closingTest() {
		System.out.println("* Closing the TEST *************");
	}
	
	

}
