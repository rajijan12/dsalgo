package com.dsalgo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.pageobjects.GetStartedpageobject;
import com.dsalgo.pageobjects.HomePagepageobject;
import com.dsalgo.pageobjects.Registerpageobject;
import com.dsalgo.pageobjects.SignInpageobject;
import com.dsalgo.utilities.XLUtils;

public class RegisterPageTestcase extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void registerDDT(String user,String pwd,String msg) throws InterruptedException, IOException
	{
		logger=Logger.getLogger(RegisterPageTestcase.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Launching Url");
		
		driver.get(url);

		GetStartedpageobject getstart = new GetStartedpageobject(driver);
		getstart.getStartedclick();

		HomePagepageobject homepage = new HomePagepageobject(driver);

		homepage.clickRegister();

		Registerpageobject register = new Registerpageobject(driver);

		register.setUsername(user);
		logger.info("user name provided");
		register.setPassword1(pwd);
		logger.info("password provided");
		register.setPassword2(pwd);
		

		register.clickSubmit();
		
		
		Thread.sleep(2000);
		String alertMsg="";
		
		if(user!="")
		{
		alertMsg=register.getAlertMsg();
		}
		
		if (alertMsg.contains("New Account Created. "))
		{
			homepage.clickSignOut();
			
		}
		
		Assert.assertEquals(alertMsg,msg);
		
		
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path="/Users/raji/eclipse-workspace/DSAlgoproject/src/test/java/com/dsalgo/testdata/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		return logindata;
	}

}