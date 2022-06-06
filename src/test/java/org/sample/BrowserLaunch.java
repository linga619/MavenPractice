package org.sample;

import java.io.IOException;
import java.time.Duration;

import javax.xml.stream.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
public static void main(String[] args) throws IOException {
	
//launchBrowser("chrome");
//urlLaunch("https://www.facebook.com/");
//JavascriptExecutor js=(JavascriptExecutor) driver;
//
//LoginPage l=new LoginPage();
////l.login("linga","9876543");
//sendKeys(l.getTxtUsername().get(0),getExcel("Excel","sheet1",1,0));

	
	String s="ramya@H#+";
	
for(int i=0;i<s.length();i++) {
	
	char s1 = s.charAt(i);
	int asciivalue=s1;
if(asciivalue>=97) {
	System.out.println(" alphabet");
}
else {
	if(asciivalue<=64) {
		System.out.println(" symbols");
	}
	else {
		System.out.println(" capital letter");
	}
	}

}}}

