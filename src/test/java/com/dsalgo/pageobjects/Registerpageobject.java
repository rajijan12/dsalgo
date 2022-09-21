package com.dsalgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpageobject {
	
	WebDriver ldriver;
	
	@FindBy(id = "id_username")
	WebElement username;
	
	@FindBy(id = "id_password1")
	WebElement password1;
	@FindBy(id = "id_password2")
	WebElement password2;
	
	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerbutton;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement alertMsg;
	
	public Registerpageobject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	public String verifyTitle()
	{
		return ldriver.getTitle();
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword1(String pswd1)
	{
		password1.sendKeys(pswd1);
	}
	public void setPassword2(String pswd2)
	{
		password2.sendKeys(pswd2);
	}
	
	public void clickSubmit()
	{
		registerbutton.click();
		
	}
	
	public String getAlertMsg()
	{
		return alertMsg.getText();
		
	}
	
	
}
