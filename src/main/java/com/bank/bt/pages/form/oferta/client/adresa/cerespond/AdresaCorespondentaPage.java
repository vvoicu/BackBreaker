package com.bank.bt.pages.form.oferta.client.adresa.cerespond;

import org.openqa.selenium.WebDriver;

import com.bank.bt.data.model.AdresaModel;
import com.bank.bt.pages.form.oferta.SearchFormModalPage;
import com.tools.abs.AbstractPage;

public class AdresaCorespondentaPage extends AbstractPage{

	public AdresaCorespondentaPage(WebDriver driver) {
		super(driver);
	}
	
	public String sameAsDomiciliuCheckboxLocator = "[id*='chkSameAsSocialAddress_I']";

	private String stradaInputLocator = "[id*='txtMailingAddressStreet']";
	private String adresaInputLocator = "[id*='txtMailingAddressAddress']";
	private String telefonInputLocator = "[id*='txtMailingAddressPhone']";

	private String taraInputLocator = "span input[id*='MailingAddressCountry']";
	private String taraFormLocator = "[id*='MailingAddressCountry'] + a[href*='MailingAddressCountry']";
	
	private String judetInputLocator = "[id*='fwkMailingAddressDistrict']";
	private String judetFormLocator = "[id*='fwkMailingAddressDistrict'] + a[href*='fwkMailingAddressDistrict']";
	
	private String localitateInputLocator = "[id*='fwkMailingAddressCity']";
	private String localitateFormLocator = "[id*='fwkMailingAddressCity'] + a[href*='fwkMailingAddressCity']";
	
	public void fillAdresaCorespondentaForm(String mainWindowHandle, String adresa, String strada, String telefon, String tara, String judet, String localitate){
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
	
	public AdresaModel grabAdresaCorespondentaData(){
		AdresaModel formData = new AdresaModel();
		formData.adresa = grabAdresa();
		formData.strada = grabStrada();
		formData.telefon = grabTelefon();
		formData.tara = grabTara();
		formData.judet = grabJudet();
		formData.localitate = grabLocalitate();
		
		return formData;
	}
	
	public void clickSameAsDomiciliu(){
		waitForElementByCssLocator(sameAsDomiciliuCheckboxLocator).click();
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
