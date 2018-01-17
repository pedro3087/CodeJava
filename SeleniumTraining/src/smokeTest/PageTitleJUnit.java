package smokeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;


public class PageTitleJUnit {

	WebDriver driver;
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	
	@Before	
	public void setUp() {
		System.out.println("Setting up the test ");
		 driver =  utilities.DriverFactory.open("chrome");		
	}
	
	@Test
	public void pageTitleTest() {		
	
		driver.get(webURL);
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "SDET Training | Account Management";
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.close();		
	}
	

	
	@After
	public void tearDown() {
		
		System.out.println("Finishing the test ");
	}
	
}
