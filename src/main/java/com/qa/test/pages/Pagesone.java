package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PropertiesReader;

public class Pagesone extends PropertiesReader{
	
	public Pagesone() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;

	public void action() {
		/*create your action you want to perform*/
		
	}

}
