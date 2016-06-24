package com.bank.bt.pages.form.oferta;

import org.openqa.selenium.WebDriver;

import com.bank.bt.data.model.BrokerInfoModel;
import com.tools.abs.AbstractPage;

public class BrokerInfoPage extends AbstractPage {

	public BrokerInfoPage(WebDriver driver) {
		super(driver);
	}

	public String brokerInfoContainerLocator = "#brokerInfoContainer";
	public String furnizorInputLocator = "#brokerInfoContainer div[class*='input']:nth-child(2) span";
	public String magazinInputLocator = "#brokerInfoContainer div[class*='input']:nth-child(4)";
	public String reprezentantInputLocator = "#brokerInfoContainer div[class*='input']:nth-child(7) input";
	public String stareDropdownLocator = "#uiHeader select";

	public BrokerInfoModel grabBrokerInfoData() {
		BrokerInfoModel resultData = new BrokerInfoModel();

		resultData.furnizor = grabFurnizorDetails();
		resultData.magazin = grabMagazinDetails();
		resultData.reprezentant = grabReprezentantDetails();
		resultData.stare = grabStareDetails();

		return resultData;
	}

	public String grabFurnizorDetails() {
		return waitForElementByCssLocator(furnizorInputLocator).getText();
	}

	public String grabMagazinDetails() {
		return waitForElementByCssLocator(magazinInputLocator).getText();
	}

	public String grabReprezentantDetails() {
		return waitForElementByCssLocator(reprezentantInputLocator).getAttribute("value");
	}

	public String grabStareDetails() {
		return waitForElementByCssLocator(stareDropdownLocator).getText();
	}

}
