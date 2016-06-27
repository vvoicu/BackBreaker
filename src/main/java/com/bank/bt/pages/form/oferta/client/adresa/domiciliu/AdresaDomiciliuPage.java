package com.bank.bt.pages.form.oferta.client.adresa.domiciliu;

import org.openqa.selenium.WebDriver;

import com.bank.bt.data.model.AdresaModel;
import com.bank.bt.pages.form.oferta.SearchFormModalPage;
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

	
	public void fillAdresaDomiciliuForm(String mainWindowHandle, String adresa, String strada, String telefon, String tara, String judet, String localitate){
		SearchFormModalPage searchForm = new SearchFormModalPage(driver);
		
		inputAdresa(adresa);
		inputStrada(strada);
		inputTelefon(telefon);
		clickTaraFormViewButton();
		searchForm.inputSearchAndSelectFromList(mainWindowHandle, tara);
		
		clickJudetFormButton();
		searchForm.inputSearchAndSelectFromList(mainWindowHandle, judet);
		
		clickLocalitateFormButton();
		searchForm.inputSearchAndSelectFromList(mainWindowHandle, localitate);
		
	}
	
	public AdresaModel grabAdresaDomiciliuData(){
		AdresaModel formData = new AdresaModel();
		formData.adresa = grabAdresa();
		formData.strada = grabStrada();
		formData.telefon = grabTelefon();
		formData.tara = grabTara();
		formData.judet = grabJudet();
		formData.localitate = grabLocalitate();
		
		return formData;
	}
	
	private String grabLocalitate(){
		return waitForElementByCssLocator(localitateInputLocator).getAttribute("value");
	}
	
	private void clickLocalitateFormButton(){
		waitForElementByCssLocator(localitateFormLocator).click();
	}
	
	private String grabJudet(){
		return waitForElementByCssLocator(judetInputLocator).getAttribute("value");
	}
	
	private void clickJudetFormButton(){
		waitForElementByCssLocator(judetFormLocator).click();
	}
	
	private String grabTara(){
		return waitForElementByCssLocator(taraInputLocator).getAttribute("value");
	}
	
	private void clickTaraFormViewButton(){
		waitForElementByCssLocator(taraFormLocator).click();
	}
	
	private void inputStrada(String strada){
		waitForElementByCssLocator(stradaInputLocator).sendKeys(strada);
	}
	
	private String grabStrada(){
		return waitForElementByCssLocator(stradaInputLocator).getAttribute("value");
	}
	
	private void inputAdresa(String adresa){
		waitForElementByCssLocator(adresaInputLocator).sendKeys(adresa);
	}
	
	private String grabAdresa(){
		return waitForElementByCssLocator(adresaInputLocator).getAttribute("value");
	}
	
	private void inputTelefon(String telefon){
		waitForElementByCssLocator(telefonInputLocator).sendKeys(telefon);
	}
	
	private String grabTelefon(){
		return waitForElementByCssLocator(telefonInputLocator).getAttribute("value");
	}
	
}
