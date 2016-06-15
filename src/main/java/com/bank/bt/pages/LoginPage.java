package com.bank.bt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private String userNameInputLocator = "#Login1_UserName";
	private String userPassInputLocator = "#Login1_Password";
	private String loginButtonLocator = "#Login1_LoginButton";

	public void performLogin(String userName, String userPass) {
		inputUserName(userName);
		inputUserPass(userPass);
		clickLoginButton();
	}
	
	public void inputUserName(String userName){
		WebElement userNameInput = waitForElementByCssLocator(userNameInputLocator);
		userNameInput.sendKeys(userName);
	}


	public void inputUserPass(String userPass){
		WebElement userPassInput = waitForElementByCssLocator(userPassInputLocator);
		userPassInput.sendKeys(userPass);
	}
	
	public void clickLoginButton(){
		WebElement loginButton = waitForElementByCssLocator(loginButtonLocator);
		loginButton.click();
	}
}
