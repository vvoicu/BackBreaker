package com.tests.bt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.DateAndPOD;
import com.bank.bt.data.model.AdresaModel;
import com.bank.bt.data.model.BrokerInfoModel;
import com.bank.bt.data.model.ClientDetaliiModel;
import com.bank.bt.data.model.DateFinanciareModel;
import com.bank.bt.data.model.OfertaInfoModel;
import com.tests.BaseTest;
import com.tools.utils.PrintUtils;

@RunWith(JUnit4.class)
public class BtFormTest extends BaseTest {
	
	
	@Before
	public void setupData(){

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
		
		dateFinanciarePage.inputAlteVenituri("200 sdasdasd weqweqwsdasd");
		dateFinanciarePage.inputChirie("10");
		dateFinanciarePage.inputPensie("300");
		dateFinanciarePage.inputVenitLunar("900");
		DateFinanciareModel dateFinanciareModel = dateFinanciarePage.grabDateFinanciare();
		PrintUtils.printDateFinanciareModel(dateFinanciareModel);
		
		clientDetaliiPage.fillDetaliiClient("Amu", "Mani", "1870000192193", "BN", "123465", "11254487", "9988228882", "example@mail.com", "Stangulescu Dreptu", "este", "Altele", "2", "2");
		ClientDetaliiModel clientDetaliiModel = clientDetaliiPage.grabDetaliiClient();
		PrintUtils.printClientDetaliiModel(clientDetaliiModel);
		
		clientDetaliiProfesionalePage.fillClientDetaliiProfesionale("Universitate", "Celibatar", "Productie", "11-50 angajati", "60-120 luni", "Profesionist + PFA cu studii superioare (care profeseaza)");
		
		//grab main window identifier
		String mainWindow = adresaDomiciliuPage.getWindowHandle();

		//Open window with search items;
		adresaDomiciliuPage.fillAdresaDomiciliuForm(mainWindow, "ADR 231", "GuguStrada ", "0011442255", "Romania", "Cluj", "Cluj");
		
		AdresaModel adresaDomiciliu  = adresaDomiciliuPage.grabAdresaDomiciliuData();
		PrintUtils.printAdresaModel(adresaDomiciliu);
		
		adresaCorespondentaPage.fillAdresaCorespondentaForm(mainWindow, "DDD 2222", "MeGusta ", "0011442255", "Romania", "Bucu", "SECTOR 3");
		
		AdresaModel adresaCorespondenta  = adresaCorespondentaPage.grabAdresaCorespondentaData();
		PrintUtils.printAdresaModel(adresaCorespondenta);
		
		
		
		
	}

}
