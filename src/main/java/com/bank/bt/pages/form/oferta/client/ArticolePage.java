package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;

import com.bank.bt.pages.form.oferta.SearchFormModalPage;
import com.tools.abs.AbstractPage;

public class ArticolePage extends AbstractPage {

	public ArticolePage(WebDriver driver) {
		super(driver);
	}

	private String adaugaArticolImageLocator = "[id*='dgDetails_DXMainTable'] img";

	private String tipInputLocator = "[id*='fwkItemType']";
	private String tipButtonLocator = "[id*='fwkItemType'] + a";

	private String denumireInputLocator = "[id*='editnew_2_fwkItem']";
	private String denumireButtonLocator = "[id*='editnew_2_fwkItem'] + a";

	private String descriereInputLocator = "[id*='dgDetails_DXEditor3_I']";
	private String unitatiInputLocator = "[id*='dgDetails_DXEditor4_I']";
	private String pretUnitateInputLocator = "[id*='DXEditor5_I']";
	private String totalInputLocator = "[id*='DXEditor6_I']";

	private String actualizeazaButtonLocator = "td.dxgvCommandColumn img[title='Actualizeaza']";
	private String anuleazaButtonLocator = "td.dxgvCommandColumn img[title='Anuleaza']";

	public void fillArticoleData(String tip, String denumire, String descriere, String unitati, String pretUnitate) {
		SearchFormModalPage searchPage = new SearchFormModalPage(driver);
		String mainWindow = getWindowHandle();

		clickAdaugaArticolImage();
		clickTipButton();
		searchPage.selectFromList(mainWindow, tip);

		clickDenumireButton();
		searchPage.selectFromList(mainWindow, denumire);

		inputDescriere(descriere);
		inputUnitati(unitati);
		inputPretUnitate(pretUnitate);
		
		clickActualizeaza();

	}

	public void clickAdaugaArticolImage() {
		waitForElementByCssLocator(adaugaArticolImageLocator).click();
	}

	public void clickTipButton() {
		waitForElementByCssLocator(tipButtonLocator).click();
	}

	public String grabTip() {
		return waitForElementByCssLocator(tipInputLocator).getAttribute("value");
	}

	public void clickDenumireButton() {
		waitForElementByCssLocator(denumireButtonLocator).click();
	}

	public String grabDenumire() {
		return waitForElementByCssLocator(denumireInputLocator).getAttribute("value");
	}

	public void inputDescriere(String descriere) {
		waitForElementByCssLocator(descriereInputLocator).sendKeys(descriere);
	}

	public String grabDescriere() {
		return waitForElementByCssLocator(descriereInputLocator).getAttribute("value");
	}

	public void inputUnitati(String unitati) {
		waitForElementByCssLocator(unitatiInputLocator).sendKeys(unitati);
	}

	public String grabUnitati() {
		return waitForElementByCssLocator(unitatiInputLocator).getAttribute("value");
	}

	public void inputPretUnitate(String pret) {
		waitForElementByCssLocator(pretUnitateInputLocator).sendKeys(pret);
	}

	public String grabPretUnitate() {
		return waitForElementByCssLocator(pretUnitateInputLocator).getAttribute("value");
	}

	public String grabTotal() {
		return waitForElementByCssLocator(totalInputLocator).getAttribute("value");
	}

	public void clickActualizeaza() {
		waitForElementByCssLocator(actualizeazaButtonLocator).click();
	}

	public void clickAnuleaza() {
		waitForElementByCssLocator(anuleazaButtonLocator).click();
	}

}
