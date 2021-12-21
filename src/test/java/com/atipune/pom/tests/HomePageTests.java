package com.atipune.pom.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atipune.pom.pages.HomePage;

public class HomePageTests extends TestBase{

	HomePage homepage;
	
	public HomePageTests(){
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initDriver();
		homepage=new HomePage(driver);
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		//----------------------------------
	@Test
	public void verifyHomePageTitle() {
	  String expectedTitle="Automation Practice Site";
	  String actualTitle=homepage.getPageTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
 	}
	
	@Test
	public void verifyNewArrivalsDisplayed() {
		boolean arrivalsActual=homepage.newArrivalsIsDisplyed();	//true  false
		Assert.assertTrue(arrivalsActual);
 	}
	
	@Test
	public void verifyNewArrivalsEnabled() {
		boolean arrivalsActual=homepage.newArrivalsIsEnabled();	
		Assert.assertTrue(arrivalsActual);
 	}
	
			
	@Test
	public void verifyFirstBookTitle() {
		String expectedTitleBook="Selenium Ruby";
		String actualTitleBook=homepage.getElementText();	
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	
	// go on adding test cases
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
