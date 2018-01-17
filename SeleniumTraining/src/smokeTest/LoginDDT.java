package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT {
	
	
	
	@BeforeMethod
	public void setUp(){
		System.out.println("&&&&       Starting Test to check elements present      &&&&  ");
		
	}
	
	
	@Test (dataProvider = "getData")
	public void loginTest (String name, String email, String password) {
		
		System.out.println(" NEW RECORD" + name + email + password);
		
		WebDriver driver =  utilities.DriverFactory.open("chrome");	
		
	
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		
		//Validating that the objects are present
		
		boolean logEmailBox = driver.findElement(By.name("ctl00$MainContent$txtUserName")).isDisplayed();
		boolean passBox =driver.findElement(By.name("ctl00$MainContent$txtPassword")).isDisplayed();
		
		System.out.println("###############checking for elements############## ");
		Assert.assertTrue(logEmailBox);

		Assert.assertTrue(passBox);
		
		//inputing the data
		
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys(email);
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
		
		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();; 
	
		
			
		driver.close();
		
	}
	
	@DataProvider
	public String[][] getData() {
		return utilities.Excel.get("C:\\CodeJava\\Software\\UserLogin.xls");
		
	}
	



	@AfterMethod
	
	public void closingTest() {
		System.out.println("* Closing the TEST *************");
	}

}
