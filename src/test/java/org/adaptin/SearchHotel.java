package org.adaptin;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
    
	public void drdLocation() {
	WebElement loc = driver.findElement(By.id("location"));
    Select s=new Select(loc);
	s.selectByValue("Sydney");
	loc.click();
	
	}
	public  void drdRooms(String no) {
		WebElement room = driver.findElement(By.id("room_nos"));
		 Select s=new Select(room);
			s.selectByValue(no);
			room.click();
			}
	public   void checkIn(String cidate) throws AWTException {
		WebElement ci = driver.findElement(By.id("datepick_in"));
		ci.sendKeys(cidate);
		
		}
	public  void checkOut( String codate){
		WebElement co = driver.findElement(By.id("datepick_out"));
		co.sendKeys(codate);
		}
	public  void drdAdult(String Adult) {
		WebElement ar = driver.findElement(By.id("adult_room"));
		Select s=new Select(ar);
		s.selectByValue(Adult);
		ar.click();
	}
	public void drdChild( String child) {
		WebElement cr = driver.findElement(By.id("child_room"));
		Select s=new Select(cr);
		s.selectByValue(child);
		cr.click();
	}
	public void search() {
		WebElement sr = driver.findElement(By.id("Submit"));
		sr.click();
		System.out.println("Done");
		}
	public void hotelCreek() {
		WebElement hc = driver.findElement(By.id("radiobutton_2"));
		hc.click();
		}
	public void continues() {
		WebElement cs = driver.findElement(By.id("continue"));
		cs.click();
		}
	public void firstName(String firstname) {
		WebElement fn = driver.findElement(By.id("first_name"));
        fn.sendKeys(firstname);
	}
	public void lastName(String lastname) {
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys(lastname);
		}
	public void address(String add) {
		WebElement ad = driver.findElement(By.id("address"));
		ad.sendKeys(add);
		}
	public void ccNo(String no) {
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys(no);
		}
	public void drdType() {
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select s=new Select(cct);
		s.selectByValue("VISA");
		cct.click();
		}
	public  void drdExMonth() {
		WebElement em = driver.findElement(By.id("cc_exp_month"));
		Select s=new Select(em);
		s.selectByValue("7");
		
		}
	public void drdExYear(String year) {
		WebElement ey = driver.findElement(By.id("cc_exp_year"));
		Select s=new Select(ey);
		s.selectByValue(year);
		}
	public void ccvNo(String no) {
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys(no);
		}
	public void bookNow() {
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
		}
	public void orderNo() {
		WebElement on = driver.findElement(By.id("order_no"));
		String text = on.getAttribute("value");
		System.out.println(text);
		System.out.println("done");
	}
	
}
