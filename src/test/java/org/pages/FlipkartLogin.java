package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartLogin {
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtsearch;
	@FindBy(xpath="//div[text()='REDMI 9i Sport (Carbon Black, 64 GB)']")
	private WebElement btnPhone; 
	@FindBy()
	private WebElement btnAdd;
	

}
