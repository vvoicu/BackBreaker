package com.bank.bt.pages.form.oferta.client.adresa.domiciliu;

import org.openqa.selenium.WebDriver;

import com.tools.abs.AbstractPage;

public class AdresaDomiciliuPage extends AbstractPage{

	public AdresaDomiciliuPage(WebDriver driver) {
		super(driver);
	}

	private String stradaInputLocator = "[id*='txtSocialAddressStreet']";
	private String adresaInputLocator = "[id*='txtSocialAddressAddress']";
	private String telefonInputLocator = "[id*='txtSocialAddressPhone']";

	private String taraInputLocator = "[id*='SocialAddressCountry']";
	private String taraFormLocator = "[id*='SocialAddressCountry'] + a[href*='SocialAddressCountry']";
	
	private String judetInputLocator = "[id*='fwkSocialAddressDistrict']";
	private String judetFormLocator = "[id*='fwkSocialAddressDistrict'] + a[href*='fwkSocialAddressDistrict']";
	
	private String localitateInputLocator = "[id*='fwkSocialAddressCity']";
	private String localitateFormLocator = "[id*='fwkSocialAddressCity'] + a[href*='fwkSocialAddressCity']";
	
	public void clickTaraFormViewButton(){
		waitForElementByCssLocator(taraFormLocator).click();
	}
	
}
