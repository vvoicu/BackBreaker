package com.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.bank.bt.pages.LoginPage;
import com.bank.bt.pages.form.oferta.BrokerInfoPage;
import com.bank.bt.pages.form.oferta.OfertaInfoPage;
import com.bank.bt.pages.form.oferta.ProdusDeFinantarePage;
import com.bank.bt.pages.form.oferta.client.ClientDetaliiPage;
import com.bank.bt.pages.form.oferta.client.ClientDetaliiProfesionalePage;
import com.bank.bt.pages.form.oferta.client.DateFinanciarePage;
import com.bank.bt.pages.form.oferta.client.adresa.cerespond.AdresaCorespondentaPage;
import com.bank.bt.pages.form.oferta.client.adresa.domiciliu.AdresaDomiciliuPage;
import com.bank.bt.pages.menu.MenuPage;
import com.bank.bt.pages.menu.OfferListPage;
import com.tools.Constants.DRIVER_TYPE;
import com.tools.config.SeleniumDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	// pages used
	protected LoginPage loginPage;
	protected OfferListPage offerListPage;
	protected MenuPage menuPage;
	protected BrokerInfoPage brokerInfoPage;
	protected OfertaInfoPage ofertaInfoPage;
	protected ProdusDeFinantarePage produsDeFinantarePage;
	protected DateFinanciarePage dateFinanciarePage;
	protected ClientDetaliiPage clientDetaliiPage;
	protected ClientDetaliiProfesionalePage clientDetaliiProfesionalePage;
	protected AdresaDomiciliuPage adresaDomiciliuPage;
	protected AdresaCorespondentaPage adresaCorespondentaPage;
	
	@Before
	public void testSetup() {
		driver = SeleniumDriver.pickWebdriver(DRIVER_TYPE.FIREFOX);
		//setup pages
		loginPage = new LoginPage(driver);
		offerListPage = new OfferListPage(driver);
		menuPage = new MenuPage(driver);
		brokerInfoPage = new BrokerInfoPage(driver);
		ofertaInfoPage = new OfertaInfoPage(driver);
		produsDeFinantarePage= new ProdusDeFinantarePage(driver);
		dateFinanciarePage = new DateFinanciarePage(driver);
		clientDetaliiPage = new ClientDetaliiPage(driver);
		clientDetaliiProfesionalePage = new ClientDetaliiProfesionalePage(driver);
		adresaDomiciliuPage = new AdresaDomiciliuPage(driver);
		adresaCorespondentaPage = new AdresaCorespondentaPage(driver);
	}
	
	@After
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}

}
