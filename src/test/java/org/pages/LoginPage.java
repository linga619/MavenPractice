package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		WebDriver driver = null;
		PageFactory.initElements(driver, this);
	}
	
	
//    @FindBy(id="email")
//	private WebElement txtUsername;
//    @FindBy(id="pass")
//	private WebElement txtPassword;
//    @FindBy(name="login")
//	private WebElement btnLogin;
//	public WebElement getTxtUsername() {
//		return txtUsername;
//	}
//	public WebElement getTxtPassword() {
//		return txtPassword;
//	}
//	public WebElement getBtnLogin() {
//		return btnLogin;
//	}
//	
	
	@FindBys({@FindBy(id="email"), @FindBy(xpath="//input[@id='email']")})
	private List<WebElement>txtUsername;
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='amazon']")})
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btnLogin;
	public List<WebElement> getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
public void login(String user,String pass) {
	sendKeys(getTxtUsername().get(0),user);
	sendKeys(getTxtPassword(),pass);
	click(getBtnLogin());
	
}
  }
