package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bank.bt.data.model.ProdusFinantareModel;
import com.tools.abs.AbstractPage;

public class ProdusDeFinantarePage extends AbstractPage{

	public ProdusDeFinantarePage(WebDriver driver) {
		super(driver);
	}

	private String produsFinantareLocator = "[id*='wkProduct']";
	private String durataLocator = "[id*='cboMonthNo']";
	private String nrFacturaLocator = "[id*='txtInvoiceNumber']";
	private String gratieLocator = "[id*='txtGracePeriod']";
	private String dataSemnareLocator = "[id*='dtpInvoiceDate_I']";
	
	
	public ProdusFinantareModel grabProdusDeFinantareInfo(){
		ProdusFinantareModel resultData = new ProdusFinantareModel();
		resultData.produsFinantare = grabProdusFinantare();
		resultData.durata = grabDurata();
		resultData.nrFactura = grabNumarFactura();
		resultData.gratie = grabGratie();
		resultData.dataSemnare = grabDataSemnare();
		
		return resultData;
	}
	
	public String grabProdusFinantare(){
		WebElement produsFinantareDropdown = waitForElementByCssLocator(produsFinantareLocator);
		return produsFinantareDropdown.getAttribute("value");
	}
	
	public String grabDurata(){
		Select durataDropdown = new Select(waitForElementByCssLocator(durataLocator));
		return durataDropdown.getFirstSelectedOption().getText();
	}

	public void setDurata(String textValue){
		selectFromDropdownByVisibleText(durataLocator, textValue);
	}

	public String grabNumarFactura(){
		WebElement nrFacturaInput = waitForElementByCssLocator(nrFacturaLocator);
		return nrFacturaInput.getText();
	}
	
	public String grabGratie(){
		WebElement gratieInput = waitForElementByCssLocator(gratieLocator);
		return gratieInput.getText();
	}
	
	public void inputGratie(String text){
		WebElement gratieInput = waitForElementByCssLocator(gratieLocator);
		gratieInput.sendKeys(text);
	}
	
	public String grabDataSemnare(){
		WebElement dataSemnareInput = waitForElementByCssLocator(dataSemnareLocator);
//		return dataSemnareInput.getAttribute("value");
		return dataSemnareInput.getText();
	}
	
}
