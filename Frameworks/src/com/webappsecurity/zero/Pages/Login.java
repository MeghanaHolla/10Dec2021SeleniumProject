package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	@FindBy(id="user_login")
	private WebElement uName;
	
	@FindBy(id="user_password")
	private WebElement pass;
	
	@FindBy(name="submit")
	private WebElement signIn;
	
	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement errorMsgBox;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin(String username, String password) {
		uName.sendKeys(username);
		pass.sendKeys(password);
		signIn.click();
	}
	
	public String getErrorMsgText() {
		String errorMsg = errorMsgBox.getText();
		return errorMsg;
	}
}
