package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;

import com.tools.abs.AbstractPage;

public class FooterActionsPage extends AbstractPage{

	public FooterActionsPage(WebDriver driver) {
		super(driver);
	}

	private String salveazaButtonLocator = "[id*='WebOfferFooterCtrl1_btnOK']";
	
	public void clickSalveaza(){
		waitForElementByCssLocator(salveazaButtonLocator).click();
	}
	
}
