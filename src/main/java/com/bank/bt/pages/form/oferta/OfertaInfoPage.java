package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;

import com.bank.bt.data.model.OfertaInfoModel;
import com.tools.abs.AbstractPage;

public class OfertaInfoPage extends AbstractPage {

	public OfertaInfoPage(WebDriver driver) {
		super(driver);
	}

	public String numarOfertaInputLocator = "[id*='txtDocumentNumber']";
	public String pretTotalInputLocator = "[id*='txtAmount_I']";
	public String valFinInputLocator = "[id*='txtFinancedValue_I']";
	public String costTotalInputLocator = "[id*='TotalCostSpinEdit_I']";
	public String daeInputLocator = "[id*='txtDAE']";
	public String dataCreareInputLocator = "[id*='txtDocumentDate_I']";
	public String avansInputLocator = "[id*='txtAdvanceAmount_I']";
	public String rataInputLocator = "[id*='txtRate']";
	public String valoareTolalPlatibilaInputLocator = "[id*='TotalPayedAmountSpinEdit_I']";

	public OfertaInfoModel grabOfertaInfoData() {
		OfertaInfoModel resultData = new OfertaInfoModel();

		resultData.numarOferta = grabNumarOferta();
		resultData.pretTotal = grabPretTotal();
		resultData.valFin = grabValFin();
		resultData.costTotal = grabCostTotal();
		resultData.dAE = grabDae();
		resultData.dataCreare = grabDataCreare();
		resultData.avans = grabAvans();
		resultData.rata = grabRata();
		resultData.valoareTotalPlatibila = grabValoareTotalPlatibila();

		return resultData;
	}

	public void inputAvans(String sumaAvans) {
		waitForElementByCssLocator(avansInputLocator).sendKeys(sumaAvans);
	}

	public String grabNumarOferta() {
		return waitForElementByCssLocator(numarOfertaInputLocator).getAttribute("value");
	}

	public String grabPretTotal() {
		return waitForElementByCssLocator(pretTotalInputLocator).getAttribute("value");
	}

	public String grabValFin() {
		return waitForElementByCssLocator(valFinInputLocator).getAttribute("value");
	}

	public String grabCostTotal() {
		return waitForElementByCssLocator(costTotalInputLocator).getAttribute("value");
	}

	public String grabDae() {
		return waitForElementByCssLocator(daeInputLocator).getAttribute("value");
	}

	public String grabDataCreare() {
		return waitForElementByCssLocator(dataCreareInputLocator).getAttribute("value");
	}

	public String grabAvans() {
		return waitForElementByCssLocator(avansInputLocator).getText();
	}

	public String grabRata() {
		return waitForElementByCssLocator(rataInputLocator).getAttribute("value");
	}

	public String grabValoareTotalPlatibila() {
		return waitForElementByCssLocator(valoareTolalPlatibilaInputLocator).getAttribute("value");
	}

}
