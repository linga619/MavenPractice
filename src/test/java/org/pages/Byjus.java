package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseClass;

public class Byjus extends BaseClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	launchBrowser("chrome");
	urlLaunch("https://byjus.com/");
	maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement btnlogin = driver.findElement(By.xpath("//a[@class='primary-login-btn']"));
	btnlogin.click();
	WebElement txtphn = driver.findElement(By.xpath("//input[@type='tel']"));
	txtphn.sendKeys("9765432342",Keys.ENTER);
	WebElement drdloc = driver.findElement(By.xpath("//div[contains(@class,'dropdown-select')]"));
	drdloc.click();
//	WebElement search = driver.findElement(By.xpath("//input[@id='txtSearchValue']"));
//	search.
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	Actions a=new Actions(driver);
	a.moveToElement(search).sendKeys("chennai").perform();
	
//	r.keyPress(KeyEvent.VK_C);
//	r.keyRelease(KeyEvent.VK_C);
//	Thread.sleep(5000);
	WebElement loc = driver.findElement(By.xpath("//li[@data-display-text='Chennai']"));
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(loc));
	a.moveToElement(loc).click().perform();

}
}
