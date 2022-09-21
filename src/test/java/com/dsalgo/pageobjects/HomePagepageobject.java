package com.dsalgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePagepageobject {
	
	WebDriver ldriver;
	
	
	@FindBy(xpath ="//a[text()=' Register ']")
	WebElement register;
	
	
	@FindBy(xpath = "//div[contains(text(),'New Account Created')]")
	WebElement NewAccount;
	
	@FindBy(xpath="//a[text()='Data Structures']")
	WebElement dsDropdown;
	
	@FindBy(xpath="//a[text()='Tree']")
	WebElement treeDS;
	
	@FindBy(xpath ="//a[text()='Sign out']")
	WebElement signOut;
	
	@FindBy(xpath = "//div[contains(text(),'Logged out')]")
	WebElement logoutsuccess;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement signIn;
	
	
	
	public HomePagepageobject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	public String verifyhomepageTitle()
	{
		String title= ldriver.getTitle();
		return title;
		
	}
	
	public String verifyNewAccountCreated()
	{
		return NewAccount.getText();
	}
	public void clickRegister()
	{
		register.click();
		
	}
	
	public void clickDataStructurebutton()
	{
		dsDropdown.click();
	}
	
	public void clickTreeDS()
	{
		treeDS.click();
	}
	
	public String clickSignOut()
	{
		signOut.click();
		String logoutText=logoutsuccess.getText();
		return logoutText;
			
	}
	
	public void clickSignIn()
	{
		signIn.click();
	}
}
