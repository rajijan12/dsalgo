package com.dsalgo.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dsalgo.pageobjects.HomePagepageobject;
import com.dsalgo.pageobjects.TreePageObject;

public class TreeTestcase extends BaseClass {
	
	@Test
	public void treeTest() throws InterruptedException {
		
		HomePagepageobject homepage=new HomePagepageobject(driver);
		homepage.clickDataStructurebutton();
		
		homepage.clickTreeDS();

		logger=Logger.getLogger(TreeTestcase.class);
		PropertyConfigurator.configure("log4j.properties");
		
		TreePageObject treepage=new TreePageObject(driver);
		treepage.overview_link();
		
		Actions action=new Actions(driver);	
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		tryEditor(treepage);
		
		logger.info("Inside Tree Testcase");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.terminology_link();
		tryEditor(treepage);
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		treepage.treeTraversals_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		logger.info("Checking all Tree Links");
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.traversalsIllustration_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.binaryTree_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		logger.info("Checking Try Editor operation");
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.binaryTreeTypes_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.implementation_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
			
		treepage.binaryTreeTraversals_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.binaryTreeImplementation_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);

		driver.navigate().back();
		driver.navigate().back();
		
		treepage.binaryTreeApplication_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.binarySearchTree_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		driver.navigate().back();
		driver.navigate().back();
		
		treepage.bstImplementation_link();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		tryEditor(treepage);
		
		
	}
	
	public void tryEditor(TreePageObject treepage)
	{
		treepage=new TreePageObject(driver);
		treepage.tryEditor_link();
		treepage.codeMirrorline_click();
		treepage.editorBox_python(editorText);
		treepage.run_click();
	}

}
