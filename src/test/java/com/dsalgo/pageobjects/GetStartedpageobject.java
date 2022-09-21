package com.dsalgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedpageobject {
	
	WebDriver ldriver;
	
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getStarted;
	
	public GetStartedpageobject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	/**
	 * get started click method
	 */
	public void getStartedclick()
	{
		getStarted.click();
		
	}
	

}