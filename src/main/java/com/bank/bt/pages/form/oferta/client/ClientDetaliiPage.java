package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.bank.bt.data.model.output.ClientDetaliiModel;
import com.tools.abs.AbstractPage;

public class ClientDetaliiPage extends AbstractPage {

	public ClientDetaliiPage(WebDriver driver) {
		super(driver);
	}

	private String numeInputLocator = "[id*='WebOfferClientCtrl1_txtLastName']";
	private String prenumeInputLocator = "[id*='WebOfferClientCtrl1_txtFirstName']";
	private String cnpInputLocator = "[id*='WebOfferClientCtrl1_txtUniqueID']";
	private String serieBiInputLocator = "[id*='WebOfferClientCtrl1_txtBI_CISerial']";
	private String numarBiInputLocator = "[id*='WebOfferClientCtrl1_txtBI_CINumber']";
	private String telefonFixInputLocator = "[id*='WebOfferClientCtrl1_txtPhone']";
	private String telefonMobilInputLocator = "[id*='WebOfferClientCtrl1_txtMobilePhone']";
	private String emailInputLocator = "[id*='WebOfferClientCtrl1_txtEmail_I']";
	private String proprietarImobilLocuintaInputLocator = "[id*='WebOfferClientCtrl1_txtBuildingOwner']";
	private String gradRudenieCuProprietarInputLocator = "[id*='WebOfferClientCtrl1_txtKinship']";

	private String situatieLocuintaActualaDropdownLocator = "[id*='WebOfferClientCtrl1_ddlBuildingStatus']";
	private String numarDeMembriiFamilieDropdownLocator = "[id*='WebOfferClientCtrl1_ddlFamilyMembers']";
	private String dinCareRealizeazaVenituriLunareDropdownLocator = "[id*='ddlWorkingFamilyMembers']";

	public void fillDetaliiClient(String nume, String prenume, String cnp, String serieBi, String numarBi, String telefonFix, String telefonMobil, String email,
			String proprietarImobil, String gradRudenie, String situatieLocuintaSelect, String numarMembriiSelect, String membriiCuVenitSelect) {

		inputNume(nume);
		inputPrenume(prenume);
		inputCnp(cnp);
		inputSerieBi(serieBi);
		inputNumarBi(numarBi);
		inputTelefonFix(telefonFix);
		inputTelefonMobil(telefonMobil);
		inputEmail(email);
		inputProprietarImobil(proprietarImobil);
		inputGradRudenie(gradRudenie);

		selectSituatieLocuintaActuala(situatieLocuintaSelect);
		selectNumarMembrii(numarMembriiSelect);
		selectMembriiCareRealizeazaVenituri(membriiCuVenitSelect);

	}

	public ClientDetaliiModel grabDetaliiClient() {
		ClientDetaliiModel resultData = new ClientDetaliiModel();
		resultData.nume = grabNume();
		resultData.prenume = grabPrenume();
		resultData.cnp = grabCnp();
		resultData.serieBi = grabSerieBi();
		resultData.numarBi = grabNumarBi();
		resultData.telefonFix = grabTelefonFix();
		resultData.telefonMobil = grabTelefonMobil();
		resultData.email = grabEmail();
		resultData.proprietarImobil = grabProprietarImobil();
		resultData.gradRudenie = grabGradRudenie();

		resultData.situatieLocuintaSelect = grabSituatieLocuintaActuala();
		resultData.numarMembriiSelect = grabNumarMembrii();
		resultData.membriiCuVenitSelect = grabMembriiCareRealizeazaVenituri();

		return resultData;
	}

	public void inputNume(String nume) {
		waitForElementByCssLocator(numeInputLocator).sendKeys(nume);
	}

	public String grabNume() {
		return waitForElementByCssLocator(numeInputLocator).getAttribute("value");
	}

	public void inputPrenume(String prenume) {
		waitForElementByCssLocator(prenumeInputLocator).sendKeys(prenume);
	}

	public String grabPrenume() {
		return waitForElementByCssLocator(prenumeInputLocator).getAttribute("value");
	}

	public void inputCnp(String cnp) {
		waitForElementByCssLocator(cnpInputLocator).sendKeys(cnp);
	}

	public String grabCnp() {
		return waitForElementByCssLocator(cnpInputLocator).getAttribute("value");
	}

	public void inputSerieBi(String serieBi) {
		waitForElementByCssLocator(serieBiInputLocator).sendKeys(serieBi);
	}

	public String grabSerieBi() {
		return waitForElementByCssLocator(serieBiInputLocator).getAttribute("value");
	}

	public void inputNumarBi(String numarBi) {
		waitForElementByCssLocator(numarBiInputLocator).sendKeys(numarBi);
	}

	public String grabNumarBi() {
		return waitForElementByCssLocator(numarBiInputLocator).getAttribute("value");
	}

	public void inputTelefonFix(String telefonFix) {
		waitForElementByCssLocator(telefonFixInputLocator).sendKeys(telefonFix);
	}

	public String grabTelefonFix() {
		return waitForElementByCssLocator(telefonFixInputLocator).getAttribute("value");
	}

	public void inputTelefonMobil(String telefonMobil) {
		waitForElementByCssLocator(telefonMobilInputLocator).sendKeys(telefonMobil);
	}

	public String grabTelefonMobil() {
		return waitForElementByCssLocator(telefonMobilInputLocator).getAttribute("value");
	}

	public void inputEmail(String email) {
		waitForElementByCssLocator(emailInputLocator).sendKeys(email);
	}

	public String grabEmail() {
		return waitForElementByCssLocator(emailInputLocator).getAttribute("value");
	}

	public void inputProprietarImobil(String proprietarImobil) {
		waitForElementByCssLocator(proprietarImobilLocuintaInputLocator).sendKeys(proprietarImobil);
	}

	public String grabProprietarImobil() {
		return waitForElementByCssLocator(proprietarImobilLocuintaInputLocator).getAttribute("value");
	}

	public void inputGradRudenie(String gradRudenie) {
		waitForElementByCssLocator(gradRudenieCuProprietarInputLocator).sendKeys(gradRudenie);
	}

	public String grabGradRudenie() {
		return waitForElementByCssLocator(gradRudenieCuProprietarInputLocator).getAttribute("value");
	}

	public void selectSituatieLocuintaActuala(String situatieLocuinta) {
		selectFromDropdownByVisibleText(situatieLocuintaActualaDropdownLocator, situatieLocuinta);
	}

	public String grabSituatieLocuintaActuala() {
		return new Select(waitForElementByCssLocator(situatieLocuintaActualaDropdownLocator)).getFirstSelectedOption().getText();
	}

	public void selectNumarMembrii(String numarMembrii) {
		selectFromDropdownByVisibleText(numarDeMembriiFamilieDropdownLocator, numarMembrii);
	}

	public String grabNumarMembrii() {
		return new Select(waitForElementByCssLocator(numarDeMembriiFamilieDropdownLocator)).getFirstSelectedOption().getText();
	}

	public void selectMembriiCareRealizeazaVenituri(String numarMembrii) {
		selectFromDropdownByVisibleText(dinCareRealizeazaVenituriLunareDropdownLocator, numarMembrii);
	}

	public String grabMembriiCareRealizeazaVenituri() {
		return new Select(waitForElementByCssLocator(dinCareRealizeazaVenituriLunareDropdownLocator)).getFirstSelectedOption().getText();
	}

}
