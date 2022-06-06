package org.adaptin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="login")
	private WebElement btnLog;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLog() {
		return btnLog;
	}
	public void loginHotel(String user,String pass) {
		sendKeys(getTxtUser(),user);
		sendKeys(getTxtPass(),pass);
		click(getBtnLog());
	}
	
	
		
}
