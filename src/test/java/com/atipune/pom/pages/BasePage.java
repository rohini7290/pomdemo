package com.atipune.pom.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver;
	
 	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
