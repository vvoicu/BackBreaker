package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.tools.abs.AbstractPage;

public class ClientDetaliiProfesionalePage extends AbstractPage {

	public ClientDetaliiProfesionalePage(WebDriver driver) {
		super(driver);
	}

	private String varstaSelectLocator = "[id*='ddlAge']";
	private String educatieSelectLocator = "[id*='ddlEducation']";
	private String stareCivilaSelectLocator = "[id*='ddlMaritalStatus']";
	private String domeniuActivitateSelectLocator = "[id*='ddlActivityDomain']";
	private String numarAngajatiSelectLocator = "[id*='ddlEmployeesNo']";
	private String vechimeLocMuncaSelectLocator = "[id*='ddlCurrentEmployerPeriod']";
	private String profesieSelectLocator = "[id*='ddlProfession']";
	// private String tipTelefonSelectLocator = "[id*='']";
	
	public void fillClientDetaliiProfesionale(String educatie, String stareCivila, String domeniuActivitate, String numarAngajati, String vechimeLocMunca, String profesie){
		selectEducatie(educatie);
		selectStareCivila(stareCivila);
		selectDomeniuActivitate(domeniuActivitate);
		selectNumarAngajati(numarAngajati);
		selectVechimeLocMunca(vechimeLocMunca);
		selectProfesie(profesie);
	}

	public void grabClientDetaliiProfesionale(){
		grabVarsta();
		grabEducatie();
		grabStareCivila();
		grabDomeniuActivitate();
		grabNumarAngajati();
		grabVechimeLocMunca();
		grabProfesie();
	}

	public String grabVarsta() {
		Select dataDropdown = new Select(waitForElementByCssLocator(varstaSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectEducatie(String educatie) {
		selectFromDropdownByVisibleText(educatieSelectLocator, educatie);
	}

	public String grabEducatie() {
		Select dataDropdown = new Select(waitForElementByCssLocator(educatieSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectStareCivila(String stareCivila) {
		selectFromDropdownByVisibleText(stareCivilaSelectLocator, stareCivila);
	}

	public String grabStareCivila() {
		Select dataDropdown = new Select(waitForElementByCssLocator(stareCivilaSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectDomeniuActivitate(String domeniuActivitate) {
		selectFromDropdownByVisibleText(domeniuActivitateSelectLocator, domeniuActivitate);
	}

	public String grabDomeniuActivitate() {
		Select dataDropdown = new Select(waitForElementByCssLocator(domeniuActivitateSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectNumarAngajati(String numarAngajati) {
		selectFromDropdownByVisibleText(numarAngajatiSelectLocator, numarAngajati);
	}

	public String grabNumarAngajati() {
		Select dataDropdown = new Select(waitForElementByCssLocator(numarAngajatiSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectVechimeLocMunca(String vechimeLocMunca) {
		selectFromDropdownByVisibleText(vechimeLocMuncaSelectLocator, vechimeLocMunca);
	}

	public String grabVechimeLocMunca() {
		Select dataDropdown = new Select(waitForElementByCssLocator(vechimeLocMuncaSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}

	public void selectProfesie(String profesie) {
		selectFromDropdownByVisibleText(profesieSelectLocator, profesie);
	}

	public String grabProfesie() {
		Select dataDropdown = new Select(waitForElementByCssLocator(profesieSelectLocator));
		return dataDropdown.getFirstSelectedOption().getText();
	}
}
