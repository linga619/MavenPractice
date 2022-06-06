package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class BaseClass {
public static WebDriver driver;
public static WebDriver launchBrowser(String browsername) {
	if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	if(browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	
	}
	if(browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		}
	return driver;
	}
public static WebDriver chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	return driver;
	}
public static WebDriver firefoxBrowser() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	return driver;
}
public static WebDriver edgeBrowser() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	return driver;
	}
public static void urlLaunch(String url) {
	driver.get(url);
}
public static void maximize() {
	driver.manage().window().maximize();

}

public static void sendKeys(WebElement e,String value) {
	e.sendKeys(value);
	}
public static void click(WebElement e) {
	e.click();
}
public static String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
public static String title() {
	String title = driver.getTitle();
	return title;
	}
public static String getAttribute(WebElement e) {
String attribute = e.getAttribute("value");
return attribute;
}
public static void moveToElements(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	}
public static void quit() {
	driver.quit();
}
public void btnClose() {
	WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnClose.click();
}
//public void implicitWait(long secs) {
//	driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS)
//	
    public static String getExcel(String filename, String sheet,int r,int c) throws IOException {
		File f=new File("C:\\Users\\SIGHTSPECTRUM\\eclipse-workspace\\MavenProject\\src\\test\\resources\\"+filename+".xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheet);
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int type = cell.getCellType();
		String value;
		if(type==1) {
			 value = cell.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat s1=new SimpleDateFormat("dd-MMM-yyyy");
				 value = s1.format(d);
				
			}
			else {
				double d = cell.getNumericCellValue();
				long l=(long) d;
				 value = String.valueOf(l);
			}
		}
		return value;
		

}

}
