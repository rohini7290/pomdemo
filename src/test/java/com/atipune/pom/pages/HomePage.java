package com.atipune.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	public WebDriver driver;
	//init elements
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	//page objects repo
	@FindBy(xpath="//*[@id='text-22-sub_row_1-0-1-1-0']/h2")
	private WebElement arrivalActEle ;
	
	@FindBy(xpath="//h3[text()='Selenium Ruby']")
	private WebElement firstBookEle;
	
	
	//go on adding Object identified for the page 
	
	
	//methods or action
	
       public boolean newArrivalsIsDisplyed()
       {
    	  return  arrivalActEle.isDisplayed();//true false
       }
	
       public boolean newArrivalsIsEnabled()
       {
    	  return  arrivalActEle.isEnabled();//true false 
       }
       
       public String getElementText()
       {
    	   return firstBookEle.getText();
       }
       
       //go on creating methods or action that we are performing on element      
       
}
