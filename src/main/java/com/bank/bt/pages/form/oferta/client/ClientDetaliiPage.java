package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bank.bt.data.model.ClientDetaliiModel;
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

	public void inputCnp(String cnp) {
		WebElement cnpInput = waitForElementByCssLocator(cnpInputLocator);
		cnpInput.sendKeys(cnp);
	}

	public String grabCnp() {
		WebElement cnpInput = waitForElementByCssLocator(cnpInputLocator);
		return cnpInput.getAttribute("value");
	}

	public void inputSerieBi(String serieBi) {
		WebElement serieBiInput = waitForElementByCssLocator(serieBiInputLocator);
		serieBiInput.sendKeys(serieBi);
	}

	public String grabSerieBi() {
		WebElement serieBiInput = waitForElementByCssLocator(serieBiInputLocator);
		return serieBiInput.getAttribute("value");
	}

	public void inputNumarBi(String numarBi) {
		WebElement numarBiInput = waitForElementByCssLocator(numarBiInputLocator);
		numarBiInput.sendKeys(numarBi);
	}

	public String grabNumarBi() {
		WebElement numarBiInput = waitForElementByCssLocator(numarBiInputLocator);
		return numarBiInput.getAttribute("value");
	}

	public void inputTelefonFix(String telefonFix) {
		WebElement telefonFixInput = waitForElementByCssLocator(telefonFixInputLocator);
		telefonFixInput.sendKeys(telefonFix);
	}

	public String grabTelefonFix() {
		WebElement telefonFixInput = waitForElementByCssLocator(telefonFixInputLocator);
		return telefonFixInput.getAttribute("value");
	}

	public void inputTelefonMobil(String telefonMobil) {
		WebElement telefonMobilInput = waitForElementByCssLocator(telefonMobilInputLocator);
		telefonMobilInput.sendKeys(telefonMobil);
	}

	public String grabTelefonMobil() {
		WebElement telefonMobilInput = waitForElementByCssLocator(telefonMobilInputLocator);
		return telefonMobilInput.getAttribute("value");
	}

	public void inputEmail(String email) {
		WebElement emailInput = waitForElementByCssLocator(emailInputLocator);
		emailInput.sendKeys(email);
	}

	public String grabEmail() {
		WebElement emailInput = waitForElementByCssLocator(emailInputLocator);
		return emailInput.getAttribute("value");
	}

	public void inputProprietarImobil(String proprietarImobil) {
		WebElement proprietarImobilInput = waitForElementByCssLocator(proprietarImobilLocuintaInputLocator);
		proprietarImobilInput.sendKeys(proprietarImobil);
	}

	public String grabProprietarImobil() {
		WebElement proprietarImobilInput = waitForElementByCssLocator(proprietarImobilLocuintaInputLocator);
		return proprietarImobilInput.getAttribute("value");
	}

	public void inputGradRudenie(String gradRudenie) {
		WebElement gradRudenieInput = waitForElementByCssLocator(gradRudenieCuProprietarInputLocator);
		gradRudenieInput.sendKeys(gradRudenie);
	}

	public String grabGradRudenie() {
		WebElement gradRudenieInput = waitForElementByCssLocator(gradRudenieCuProprietarInputLocator);
		return gradRudenieInput.getAttribute("value");
	}

	public void selectSituatieLocuintaActuala(String situatieLocuinta) {
		selectFromDropdownByVisibleText(situatieLocuintaActualaDropdownLocator, situatieLocuinta);
	}

	public String grabSituatieLocuintaActuala() {
		Select dataDropdown = new Select(waitForElementByCssLocator(situatieLocuintaActualaDropdownLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectNumarMembrii(String numarMembrii) {
		selectFromDropdownByVisibleText(numarDeMembriiFamilieDropdownLocator, numarMembrii);
	}

	public String grabNumarMembrii() {
		Select dataDropdown = new Select(waitForElementByCssLocator(numarDeMembriiFamilieDropdownLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectMembriiCareRealizeazaVenituri(String numarMembrii) {
		selectFromDropdownByVisibleText(dinCareRealizeazaVenituriLunareDropdownLocator, numarMembrii);
	}

	public String grabMembriiCareRealizeazaVenituri() {
		Select dataDropdown = new Select(waitForElementByCssLocator(dinCareRealizeazaVenituriLunareDropdownLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

}
