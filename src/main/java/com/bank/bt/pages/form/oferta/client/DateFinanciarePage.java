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
		WebElement venitLunarInput = waitForElementByCssLocator(venitLunarInputLocator);
		return venitLunarInput.getAttribute("value");
	}

	public void inputPensie(String pensieText) {
		WebElement venitLunarInput = waitForElementByCssLocator(pensieInputLocator);
		venitLunarInput.sendKeys(pensieText);
	}

	public String grabPensie() {
		WebElement venitLunarInput = waitForElementByCssLocator(pensieInputLocator);
		return venitLunarInput.getAttribute("value");
	}

	public void inputAlteVenituri(String alteVenituriText) {
		WebElement venitLunarInput = waitForElementByCssLocator(altevenituriTextareaLocator);
		venitLunarInput.sendKeys(alteVenituriText);
	}

	public String grabAlteVenituri() {
		WebElement venitLunarInput = waitForElementByCssLocator(altevenituriTextareaLocator);
		return venitLunarInput.getAttribute("value");
	}

	// codebitor
	public void clickExistaCodebitor() {
		WebElement existaCodebitorCheckbox = waitForElementByCssLocator(existaCodebitorCheckboxLocator);
		existaCodebitorCheckbox.click();
	}

	public void inputVenitLunarCodebitor(String venitText) {
		WebElement venitLunarInput = waitForElementByCssLocator(venitLunarCodebitorInputLocator);
		venitLunarInput.sendKeys(venitText);
	}

	public String grabVenitLunarCodebitor() {
		WebElement venitLunarInput = waitForElementByCssLocator(venitLunarCodebitorInputLocator);
		return venitLunarInput.getAttribute("value");
	}

	public void inputPensieCodebitor(String pensieText) {
		WebElement pensieInput = waitForElementByCssLocator(pensieCodebitorInputLocator);
		pensieInput.sendKeys(pensieText);
	}

	public String grabPensieCodebitor() {
		WebElement pensieInput = waitForElementByCssLocator(pensieCodebitorInputLocator);
		return pensieInput.getAttribute("value");
	}

	public void inputChirie(String pensieText) {
		WebElement chirieInput = waitForElementByCssLocator(chirieInputLocator);
		chirieInput.sendKeys(pensieText);
	}

	public String grabChirie() {
		WebElement chirieInput = waitForElementByCssLocator(chirieInputLocator);
		return chirieInput.getAttribute("value");
	}

	public void inputRateCredit(String rateCreditText) {
		WebElement rateCreditInput = waitForElementByCssLocator(rateCreditInputLocator);
		rateCreditInput.sendKeys(rateCreditText);
	}

	public String grabRateCredit() {
		WebElement rateCreditInput = waitForElementByCssLocator(rateCreditInputLocator);
		return rateCreditInput.getAttribute("value");
	}
}
