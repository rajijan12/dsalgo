package com.dsalgo.testcases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import com.dsalgo.utilities.ReadConfig;
public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String url= readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password =readconfig.getPassword();
	public String editorText=readconfig.getEditorText();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeSuite
	public static void setup()
	{
			driver = new ChromeDriver();	
			//driver.get(url);
			logger=Logger.getLogger(BaseClass.class);
			PropertyConfigurator.configure("log4j.properties");
			logger.info("Inside Base class performing Setup");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


@AfterSuite
 public void tearDown()
 {
	 //driver.quit();
 }

public void CaptureScreen(WebDriver driver, String name) throws IOException {
	logger.info("Taking Screenshot");
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
	File destinationFile=new File("/Users/raji/eclipse-workspace/DSAlgoproject/screenshots/"+name+".png");
	FileHandler.copy(sourceFile, destinationFile);
	System.out.println("Screenshot taken");
}

}

