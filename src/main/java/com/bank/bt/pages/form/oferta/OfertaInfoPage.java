package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		WebElement avansInput = waitForElementByCssLocator(avansInputLocator);
		avansInput.sendKeys(sumaAvans);
	}

	public String grabNumarOferta() {
		WebElement numarOfertaInput = waitForElementByCssLocator(numarOfertaInputLocator);
		return numarOfertaInput.getAttribute("value");
	}

	public String grabPretTotal() {
		WebElement pretTotalInput = waitForElementByCssLocator(pretTotalInputLocator);
		return pretTotalInput.getAttribute("value");
	}

	public String grabValFin() {
		WebElement valFinInput = waitForElementByCssLocator(valFinInputLocator);
		return valFinInput.getAttribute("value");
	}

	public String grabCostTotal() {
		WebElement costTotalInput = waitForElementByCssLocator(costTotalInputLocator);
		return costTotalInput.getAttribute("value");
	}

	public String grabDae() {
		WebElement daeInput = waitForElementByCssLocator(daeInputLocator);
		return daeInput.getAttribute("value");
	}

	public String grabDataCreare() {
		WebElement dataInput = waitForElementByCssLocator(dataCreareInputLocator);
		return dataInput.getAttribute("value");
	}

	public String grabAvans() {
		WebElement avansInput = waitForElementByCssLocator(avansInputLocator);
		return avansInput.getText();
	}

	public String grabRata() {
		WebElement rataInput = waitForElementByCssLocator(rataInputLocator);
		return rataInput.getAttribute("value");
	}

	public String grabValoareTotalPlatibila() {
		WebElement valoareTotalInput = waitForElementByCssLocator(valoareTolalPlatibilaInputLocator);
		return valoareTotalInput.getAttribute("value");
	}

}
