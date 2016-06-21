package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;

public class ClientDetaliiPage extends AbstractPage{

	public ClientDetaliiPage(WebDriver driver) {
		super(driver);
	}

	public String numeInputLocator = "[id*='WebOfferClientCtrl1_txtLastName']";
	public String prenumeInputLocator = "[id*='WebOfferClientCtrl1_txtFirstName']";
	public String cnpInputLocator = "[id*='WebOfferClientCtrl1_txtUniqueID']";
	public String serieBiInputLocator = "[id*='WebOfferClientCtrl1_txtBI_CISerial']";
	public String numarBiInputLocator = "[id*='WebOfferClientCtrl1_txtBI_CINumber']";
	public String telefonFixInputLocator = "[id*='WebOfferClientCtrl1_txtPhone']";
	public String telefonMobilInputLocator = "[id*='WebOfferClientCtrl1_txtMobilePhone']";
	public String emailInputLocator = "[id*='WebOfferClientCtrl1_txtEmail_I']";
	public String proprietarImobilLocuintaInputLocator = "[id*='WebOfferClientCtrl1_txtBuildingOwner']";
	public String gradRudenieCuProprietarInputLocator = "[id*='WebOfferClientCtrl1_txtKinship']";
	
	public String situatieLocuintaActualaDropdownLocator = "[id*='WebOfferClientCtrl1_ddlBuildingStatus']";
	public String numarDeMembriiFamilieDropdownLocator = "[id*='WebOfferClientCtrl1_ddlFamilyMembers']";
	public String dinCarerealizeazaVenituriLunareDropdownLocator = "[id*='ddlWorkingFamilyMembers']";

	public void inputNume(String nume) {
		WebElement numeInput = waitForElementByCssLocator(numeInputLocator);
		numeInput.sendKeys(nume);
	}

	public String grabNume() {
		WebElement numeInput = waitForElementByCssLocator(numeInputLocator);
		return numeInput.getAttribute("value");
	}
	
	public void inputPrenume(String prenume) {
		WebElement prenumeInput = waitForElementByCssLocator(prenumeInputLocator);
		prenumeInput.sendKeys(prenume);
	}

	public String grabPrenume() {
		WebElement prenumeInput = waitForElementByCssLocator(prenumeInputLocator);
		return prenumeInput.getAttribute("value");
	}	
	
	
	
}
