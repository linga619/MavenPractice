package org.adaptin;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.utility.BaseClass;



public class AdaptinHotelBrowserLaunch extends BaseClass{
public static void main(String[] args) throws AWTException, InterruptedException {
	launchBrowser("chrome");
	urlLaunch("https://adactinhotelapp.com/");
	maximize();
	
	LoginPage l=new LoginPage();
	l.loginHotel("Lingadurai","sethulinga");
	SearchHotel sh=new SearchHotel();
	sh.drdLocation();
	sh.drdRooms("1");
	sh.checkIn("10/03/2022");
	sh.checkOut("11/03/2022");
	sh.drdAdult("2");
	sh.drdChild("0");
	sh.search();
	sh.hotelCreek();
	sh.continues();
	sh.firstName("lingadurai");
	sh.lastName("D");
	sh.address("chennai");
	sh.ccNo("1234567890123456");
	sh.drdType();
	sh.drdExMonth();
	sh.drdExYear("2022");
	sh.ccvNo("321");
	sh.bookNow();
    Thread.sleep(5000);
	sh.orderNo();
	quit();
	
	
	
	
}
}
