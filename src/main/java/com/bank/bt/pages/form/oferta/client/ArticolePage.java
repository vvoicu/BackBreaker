package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;

import com.tools.abs.AbstractPage;

public class ArticolePage extends AbstractPage{

	public ArticolePage(WebDriver driver) {
		super(driver);
	}

	private String adaugaArticolImageLocator = "[id*='dgDetails_DXMainTable'] img";
	
	
	
	
	public void clickAdaugaArticolImage() {
		waitForElementByCssLocator(adaugaArticolImageLocator).click();
	}
	
	
	
}
