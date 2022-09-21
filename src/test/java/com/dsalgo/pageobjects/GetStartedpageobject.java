package com.dsalgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.dsalgo.pageobjects.HomePagepageobject;
import com.dsalgo.pageobjects.HomePagepageobject;

public class GetStartedpageobject {
	
	WebDriver ldriver;
	
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getStarted;
	
	public GetStartedpageobject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	public void getStartedclick()
	{
		getStarted.click();
		
	}
	

}