package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;

public class SearchFormPage extends AbstractPage{

	public SearchFormPage(WebDriver driver) {
		super(driver);
	}


	private String searchInputLocator = "input.TxtB3";
	private String codeInputLocator = "input.TxtB1";
	private String submitButtonLocator = "input[type=Submit]";
	
	public void inputSearchTerm(String search){
		WebElement searchInput = waitForElementByCssLocator(searchInputLocator);
		searchInput.clear();
		searchInput.sendKeys(search);
	}
	
	public void clickSearchButton(){
		waitForElementByCssLocator(submitButtonLocator).click();
	}
	
	public void inputCode(String code){
		waitForElementByCssLocator(codeInputLocator).clear();
		waitForElementByCssLocator(codeInputLocator).sendKeys(code);
	}

	public void inputSearchTerm(String mainWindow, String search) {
		switchToExtraWindow(mainWindow);
		inputSearchTerm(search);
		clickSearchButton();
		switchToWindow(mainWindow);
	}
	
	
}
