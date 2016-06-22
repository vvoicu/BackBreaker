package com.bank.bt.pages.form.oferta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.abs.AbstractPage;


/**
 * General Form page used for all popup pages that contain search and list
 * @author vvoicu
 *
 */
public class SearchFormPage extends AbstractPage{

	public SearchFormPage(WebDriver driver) {
		super(driver);
	}


	private String searchInputLocator = "input.TxtB3";
	private String codeInputLocator = "input.TxtB1";
	private String submitButtonLocator = "input[type=Submit]";
	private String contentListLocator = "table.content";
	
	public void inputSearchTerm(String search){
		WebElement searchInput = waitForElementByCssLocator(searchInputLocator);
		searchInput.clear();
		searchInput.sendKeys(search);
	}
	
	public void clickSearchButton(){
		waitForElementByCssLocator(submitButtonLocator).click();
	}
	
	public void inputCode(String code){
		waitForElementByCssLocator(codeInputLocator).clear();
		waitForElementByCssLocator(codeInputLocator).sendKeys(code);
	}
	
	public void selectFromList(String search){
		WebElement listContainer = waitForElementByCssLocator(contentListLocator);
		List<WebElement> listElements = listContainer.findElements(By.cssSelector("tr[class*='dgu']"));
		
		theFor:
		for (WebElement webElement : listElements) {
			System.out.println("rowNow: " + webElement.getText());
			if(webElement.getText().contains(search)){
				webElement.findElement(By.cssSelector("img")).click();
				break theFor;
			}
		}
	}

	public void inputSearchTerm(String mainWindow, String search) {
		switchToExtraWindow(mainWindow);
		inputSearchTerm(search);
		clickSearchButton();
		selectFromList(search);
		switchToWindow(mainWindow);
	}
	
	
}
