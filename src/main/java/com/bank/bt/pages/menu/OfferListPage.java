package com.bank.bt.pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;

public class OfferListPage extends AbstractPage{

	public OfferListPage(WebDriver driver) {
		super(driver);
	}

	private String addButtonLocator = ".divOperational input[value=Adauga]";
	
	public void clickAddOffer(){
		WebElement addButton = waitForElementByCssLocator(addButtonLocator);
		addButton.click();
	}
}
