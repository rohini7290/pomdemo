package com.atipune.pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sep_Mrng_2021_JavaAutomation\\POMDEMO\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
}
