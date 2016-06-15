package com.tests.bt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.DateAndPOD;
import com.bank.bt.data.model.BrokerInfoModel;
import com.bank.bt.data.model.OfertaInfoModel;
import com.bank.bt.pages.LoginPage;
import com.bank.bt.pages.form.oferta.BrokerInfoPage;
import com.bank.bt.pages.form.oferta.OfertaInfoPage;
import com.bank.bt.pages.form.oferta.ProdusDeFinantarePage;
import com.bank.bt.pages.menu.MenuPage;
import com.bank.bt.pages.menu.OfferListPage;
import com.tests.BaseTest;
import com.tools.utils.PrintUtils;

@RunWith(JUnit4.class)
public class BtFormTest extends BaseTest {
	
	// pages used
	private LoginPage loginPage;
	private OfferListPage offerListPage;
	private MenuPage menuPage;
	private BrokerInfoPage brokerInfoPage;
	private OfertaInfoPage ofertaInfoPage;
	private ProdusDeFinantarePage produsDeFinantarePage;
	
	
	@Before
	public void setupData(){
		loginPage = new LoginPage(driver);
		offerListPage = new OfferListPage(driver);
		menuPage = new MenuPage(driver);
		brokerInfoPage = new BrokerInfoPage(driver);
		ofertaInfoPage = new OfertaInfoPage(driver);
		produsDeFinantarePage= new ProdusDeFinantarePage(driver);
	}
	
	
	@Test
	public void fillBtCreditFormTest(){
		loginPage.navigateTo(DateAndPOD.BT_BASE_URL);
		loginPage.performLogin(DateAndPOD.BT_USERNAME, DateAndPOD.BT_PASSWORD);
		
		//left menu navigation
		menuPage.clickListOfferMenu();
		
		//open form with customer details
		offerListPage.clickAddOffer();
		BrokerInfoModel brokerData = brokerInfoPage.grabBrokerInfoData();
		PrintUtils.printBrokerInfoModel(brokerData);
		OfertaInfoModel ofertaData = ofertaInfoPage.grabOfertaInfoData();
		PrintUtils.printOfertaInfoModel(ofertaData);
		produsDeFinantarePage.setDurata("54");
		System.out.println(produsDeFinantarePage.grabDurata());
	}

}
