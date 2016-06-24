package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.bank.bt.data.model.ProdusFinantareModel;
import com.tools.abs.AbstractPage;

public class ProdusDeFinantarePage extends AbstractPage {

	public ProdusDeFinantarePage(WebDriver driver) {
		super(driver);
	}

	private String produsFinantareLocator = "[id*='wkProduct']";
	private String durataLocator = "[id*='cboMonthNo']";
	private String nrFacturaLocator = "[id*='txtInvoiceNumber']";
	private String gratieLocator = "[id*='txtGracePeriod']";
	private String dataSemnareLocator = "[id*='dtpInvoiceDate_I']";

	public ProdusFinantareModel grabProdusDeFinantareInfo() {
		ProdusFinantareModel resultData = new ProdusFinantareModel();
		resultData.produsFinantare = grabProdusFinantare();
		resultData.durata = grabDurata();
		resultData.nrFactura = grabNumarFactura();
		resultData.gratie = grabGratie();
		resultData.dataSemnare = grabDataSemnare();

		return resultData;
	}

	public String grabProdusFinantare() {
		return waitForElementByCssLocator(produsFinantareLocator).getAttribute("value");
	}

	public String grabDurata() {
		return new Select(waitForElementByCssLocator(durataLocator)).getFirstSelectedOption().getText();
	}

	public void setDurata(String textValue) {
		selectFromDropdownByVisibleText(durataLocator, textValue);
	}

	public String grabNumarFactura() {
		return waitForElementByCssLocator(nrFacturaLocator).getText();
	}

	public String grabGratie() {
		return waitForElementByCssLocator(gratieLocator).getText();
	}

	public void inputGratie(String text) {
		waitForElementByCssLocator(gratieLocator).sendKeys(text);
	}

	public String grabDataSemnare() {
		return waitForElementByCssLocator(dataSemnareLocator).getText();
	}

}
