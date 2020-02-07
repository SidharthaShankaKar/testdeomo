package com.qa.tescase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.test.pages.Pagesone;

import Utility.PropertiesReader;
import Utility.Reusable.*;

public class testcaseone extends PropertiesReader{
	
	Pagesone pone;
	WebDriver driver;
	
	public testcaseone(){
		super();
		
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		pone = new Pagesone();
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	/*@Test(priority=1)
	public void firstetst{
		
	}*/
	
	
	
}
