package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	
	@FindBy(linkText = "Transfer Funds")
	private WebElement transfFunds;
	
	
	public AccountSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickTransferFunds() {
		transfFunds.click();
	}
	

	public boolean isTransferFundsPresent() {
		boolean transferFundsPresent = transfFunds.isDisplayed();
		return transferFundsPresent;
	}
}
