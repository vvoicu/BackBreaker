package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;

import com.tools.abs.AbstractPage;

public class FooterActionsPage extends AbstractPage {

	public FooterActionsPage(WebDriver driver) {
		super(driver);
	}

	private String salveazaButtonLocator = "[id*='WebOfferFooterCtrl1_btnOK']";

	public String clickSalveaza() {
		waitForElementByCssLocator(salveazaButtonLocator).click();
		return grabModalAlertMessage();
	}

	public String grabModalAlertMessage() {
		String message = "";

		try{
			message = 	driver.switchTo().alert().getText();
						driver.switchTo().alert().accept();
		}catch(Exception e){
			message = "No alert was displayed";
		}
			
		System.out.println(message);
		return message;
	}

}
