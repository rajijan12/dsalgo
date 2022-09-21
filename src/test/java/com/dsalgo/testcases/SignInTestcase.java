package com.dsalgo.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.pageobjects.GetStartedpageobject;
import com.dsalgo.pageobjects.HomePagepageobject;
import com.dsalgo.pageobjects.SignInpageobject;

public class SignInTestcase extends BaseClass {
	
@Test
public void SignInTest() throws InterruptedException
{
	HomePagepageobject homepage = new HomePagepageobject(driver);
	SignInpageobject signin = new SignInpageobject(driver);
	
	homepage.clickSignIn();
	
	signin.setUsername(username);
	signin.setPassword(password);
	signin.clickSubmit();
	Thread.sleep(2000);
	
	
}

@Test
public void negativeTest() throws IOException
{
	HomePagepageobject homepage = new HomePagepageobject(driver);
	String title = homepage.verifyhomepageTitle();
	CaptureScreen(driver,"Screenshot1");
	Assert.assertEquals(title, "NumpyNinja1");

}

	

}