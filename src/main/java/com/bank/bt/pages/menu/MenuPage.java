package com.bank.bt.pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;

public class MenuPage extends AbstractPage{

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	private String listaOferteLocator = "a[href*='Offer']";
	
	
	public void clickListOfferMenu(){
		WebElement listOfferButton = waitForElementByCssLocator(listaOferteLocator);
		listOfferButton.click();
	}
}
