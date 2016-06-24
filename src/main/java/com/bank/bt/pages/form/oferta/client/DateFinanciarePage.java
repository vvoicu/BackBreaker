package com.bank.bt.pages.form.oferta.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bank.bt.data.model.DateFinanciareModel;
import com.tools.abs.AbstractPage;

public class DateFinanciarePage extends AbstractPage {

	public DateFinanciarePage(WebDriver driver) {
		super(driver);
	}

	// client
	private String venitLunarInputLocator = "[id*='ClientFinancialData_txtMonthlyIncome_I']";
	private String pensieInputLocator = "[id*='txtOtherIncomesAmount_I']";
	private String altevenituriTextareaLocator = "[id*='txtOtherIncomes_I']";

	// codebitor
	private String existaCodebitorCheckboxLocator = "[id*='ClientFinancialData_CoDebtorExists_I']";
	private String venitLunarCodebitorInputLocator = "[id*='CoDebtorIncomeAmountSpinEdit_I']";
	private String pensieCodebitorInputLocator = "[id*='CoDebtorOtherIncomeAmountSpinEdit_I']";
	private String chirieInputLocator = "[id*='txtRentPensionAmount_I']";
	private String rateCreditInputLocator = "[id*='txtTotalCreditRateAmount_I']";

	public DateFinanciareModel grabDateFinanciare() {
		DateFinanciareModel resultData = new DateFinanciareModel();

		resultData.venitLunar = grabVenitLunar();
		resultData.pensie = grabPensie();
		resultData.alteVenituri = grabAlteVenituri();
		resultData.venitLunarCodebitor = grabVenitLunarCodebitor();
		resultData.pensieCodebitor = grabPensieCodebitor();
		resultData.chirie = grabChirie();
		resultData.rateCredit = grabRateCredit();

		return resultData;
	}

	public void inputVenitLunar(String venitText) {
		WebElement venitLunarInput = waitForElementByCssLocator(venitLunarInputLocator);
		venitLunarInput.clear();
		venitLunarInput.sendKeys(venitText);
	}

	public String grabVenitLunar() {
		return waitForElementByCssLocator(venitLunarInputLocator).getAttribute("value");
	}

	public void inputPensie(String pensieText) {
		waitForElementByCssLocator(pensieInputLocator).sendKeys(pensieText);
	}

	public String grabPensie() {
		return waitForElementByCssLocator(pensieInputLocator).getAttribute("value");
	}

	public void inputAlteVenituri(String alteVenituriText) {
		waitForElementByCssLocator(altevenituriTextareaLocator).sendKeys(alteVenituriText);
	}

	public String grabAlteVenituri() {
		return waitForElementByCssLocator(altevenituriTextareaLocator).getAttribute("value");
	}

	// codebitor
	public void clickExistaCodebitor() {
		waitForElementByCssLocator(existaCodebitorCheckboxLocator).click();
	}

	public void inputVenitLunarCodebitor(String venitText) {
		waitForElementByCssLocator(venitLunarCodebitorInputLocator).sendKeys(venitText);
	}

	public String grabVenitLunarCodebitor() {
		return waitForElementByCssLocator(venitLunarCodebitorInputLocator).getAttribute("value");
	}

	public void inputPensieCodebitor(String pensieText) {
		waitForElementByCssLocator(pensieCodebitorInputLocator).sendKeys(pensieText);
	}

	public String grabPensieCodebitor() {
		return waitForElementByCssLocator(pensieCodebitorInputLocator).getAttribute("value");
	}

	public void inputChirie(String pensieText) {
		waitForElementByCssLocator(chirieInputLocator).sendKeys(pensieText);
	}

	public String grabChirie() {
		return waitForElementByCssLocator(chirieInputLocator).getAttribute("value");
	}

	public void inputRateCredit(String rateCreditText) {
		waitForElementByCssLocator(rateCreditInputLocator).sendKeys(rateCreditText);
	}

	public String grabRateCredit() {
		return waitForElementByCssLocator(rateCreditInputLocator).getAttribute("value");
	}
}
