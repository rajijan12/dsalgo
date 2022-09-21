package com.dsalgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePageObject {
	
	WebDriver ldriver;
	
	@FindBy(xpath="//a[@href='overview-of-trees']")
	WebElement overview;
	
	@FindBy(xpath="//a[@href='terminologies']")
	WebElement terminology;
	
	@FindBy(xpath="//a[@href='types-of-trees']")
	WebElement treeTypes;
	
	@FindBy(xpath="//a[@href='tree-traversals']")
	WebElement treeTraversals;
	
	@FindBy(xpath="//a[@href='traversals-illustration']")
	WebElement traversalsIllustration;
	
	@FindBy(xpath="//a[@href='binary-trees']")
	WebElement binaryTree;
	
	@FindBy(xpath="//a[@href='types-of-binary-trees']")
	WebElement binaryTreeTypes;
	
	@FindBy(xpath="//a[@href='implementation-in-python']")
	WebElement implementTree;
	
	@FindBy(xpath="//a[@href='binary-tree-traversals']")
	WebElement binaryTreeTraversals;
	
	@FindBy(xpath="//a[@href='implementation-of-binary-trees']")
	WebElement binaryTreeImplementation;
	
	@FindBy(xpath="//a[@href='applications-of-binary-trees']")
	WebElement binaryTreeApplication;
	
	@FindBy(xpath="//a[@href='binary-search-trees']")
	WebElement binarySearchTree;
	
	@FindBy(xpath="//a[@href='implementation-of-bst']")
	WebElement bstImplementation;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryEditor;
	
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']")
	WebElement codeMirrorline;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;
	
	@FindBy(xpath="//button[text()='Run']")
	WebElement runButton;
	
	public TreePageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void overview_link()
	{
		overview.click();
	}
	
	public void terminology_link()
	{
		terminology.click();
	}
	
	public void treeTypes_link()
	{
		treeTypes.click();
	}

	public void treeTraversals_link()
	{
		treeTraversals.click();
	}
	
	public void traversalsIllustration_link()
	{
		traversalsIllustration.click();
	}
	public void binaryTree_link()
	{
		binaryTree.click();
	}
	public void binaryTreeTypes_link()
	{
		binaryTreeTypes.click();
	}
	public void implementation_link()
	{
		implementTree.click();
	}
	public void binaryTreeTraversals_link()
	{
		binaryTreeTraversals.click();
	}
	public void binaryTreeImplementation_link()
	{
		binaryTreeImplementation.click();
	}
	public void binaryTreeApplication_link()
	{
		binaryTreeApplication.click();
	}
	public void binarySearchTree_link()
	{
		binarySearchTree.click();
	}
	public void bstImplementation_link()
	{
		bstImplementation.click();
	}
	public void tryEditor_link()
	{
		tryEditor.click();
	}
	public void codeMirrorline_click()
	{
		codeMirrorline.click();
	}
	public void editorBox_python(String code)
	{
		textArea.sendKeys(code);
	}
	public void run_click()
	{
		runButton.click();
	}
}

