package com.bank.bt.pages.form.oferta.client.adresa.domiciliu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bank.bt.data.model.AdresaModel;
import com.tools.abs.AbstractPage;

public class AdresaDomiciliuPage extends AbstractPage{

	public AdresaDomiciliuPage(WebDriver driver) {
		super(driver);
	}

	private String stradaInputLocator = "[id*='txtSocialAddressStreet']";
	private String adresaInputLocator = "[id*='txtSocialAddressAddress']";
	private String telefonInputLocator = "[id*='txtSocialAddressPhone']";

	private String taraInputLocator = "span input[id*='SocialAddressCountry']";
	private String taraFormLocator = "[id*='SocialAddressCountry'] + a[href*='SocialAddressCountry']";
	
	private String judetInputLocator = "[id*='fwkSocialAddressDistrict']";
	private String judetFormLocator = "[id*='fwkSocialAddressDistrict'] + a[href*='fwkSocialAddressDistrict']";
	
	private String localitateInputLocator = "[id*='fwkSocialAddressCity']";
	private String localitateFormLocator = "[id*='fwkSocialAddressCity'] + a[href*='fwkSocialAddressCity']";
	
	public void clickTaraFormViewButton(){
		waitForElementByCssLocator(taraFormLocator).click();
	}
	
	public AdresaModel grabAdresaDomiciliuData(){
		AdresaModel formData = new AdresaModel();
		formData.adresa = grabAdresa();
		formData.strada = grabStrada();
		formData.telefon = grabTelefon();
		formData.tara = grabTara();
		
		return formData;
	}
	
	public String grabTara(){
		WebElement taraInput = waitForElementByCssLocator(taraInputLocator);
		return taraInput.getAttribute("value");
	}
	
	public void inputStrada(String strada){
		waitForElementByCssLocator(stradaInputLocator).sendKeys(strada);
	}
	
	public String grabStrada(){
		return waitForElementByCssLocator(stradaInputLocator).getAttribute("value");
	}
	
	public void inputAdresa(String adresa){
		waitForElementByCssLocator(adresaInputLocator).sendKeys(adresa);
	}
	
	public String grabAdresa(){
		return waitForElementByCssLocator(adresaInputLocator).getAttribute("value");
	}
	
	public void inputTelefon(String telefon){
		waitForElementByCssLocator(telefonInputLocator).sendKeys(telefon);
	}
	
	public String grabTelefon(){
		return waitForElementByCssLocator(telefonInputLocator).getAttribute("value");
	}
	
}
