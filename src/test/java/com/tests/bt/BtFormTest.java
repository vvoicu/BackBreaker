package com.tests.bt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.DateAndPOD;
import com.bank.bt.data.model.input.DateFinanciareModel;
import com.bank.bt.data.model.output.AdresaModel;
import com.bank.bt.data.model.output.BrokerInfoModel;
import com.bank.bt.data.model.output.ClientDetaliiModel;
import com.bank.bt.data.model.output.OfertaInfoModel;
import com.tests.BaseTest;
import com.tools.utils.PrintUtils;

@RunWith(JUnit4.class)
public class BtFormTest extends BaseTest {
	
	private DateFinanciareModel dateFinanciareData = new DateFinanciareModel();
	
	@Before
	public void setupData(){
		
		//date financiare
		dateFinanciareData.alteVenituri = "200 sdasdasd weqweqwsdasd";
		dateFinanciareData.chirie = "10";
		dateFinanciareData.pensie = "300";
		dateFinanciareData.venitLunar = "900";
		
		dateFinanciareData.durata = "54";
		
		dateFinanciareData.tip = "WCR";
		dateFinanciareData.denumire = "WCR";
		dateFinanciareData.descriere = "brichete";
		dateFinanciareData.unitati = "10";
		dateFinanciareData.pretUnitate = "250";

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
		
		produsDeFinantarePage.setDurata(dateFinanciareData.durata);
		System.out.println(produsDeFinantarePage.grabDurata());
		
		dateFinanciarePage.inputAlteVenituri(dateFinanciareData.alteVenituri);
		dateFinanciarePage.inputChirie(dateFinanciareData.chirie);
		dateFinanciarePage.inputPensie(dateFinanciareData.pensie);
		dateFinanciarePage.inputVenitLunar(dateFinanciareData.venitLunar);
		DateFinanciareModel dateFinanciareModel = dateFinanciarePage.grabDateFinanciare();
		PrintUtils.printDateFinanciareModel(dateFinanciareModel);

		articolePage.fillArticoleData(dateFinanciareData.tip, dateFinanciareData.denumire, dateFinanciareData.descriere, dateFinanciareData.unitati, dateFinanciareData.pretUnitate);
		
		clientDetaliiPage.fillDetaliiClient("Amu", "Mani", "1850101192193", "BN", "123465", "11254487", "9988228882", "example@mail.com", "Stangulescu Dreptu", "este", "Altele", "2", "2");
		ClientDetaliiModel clientDetaliiModel = clientDetaliiPage.grabDetaliiClient();
		PrintUtils.printClientDetaliiModel(clientDetaliiModel);
		
		clientDetaliiProfesionalePage.fillClientDetaliiProfesionale("Universitate", "Celibatar", "Productie", "11-50 angajati", "60-120 luni", "Profesionist + PFA cu studii superioare (care profeseaza)");
		
		//grab main window identifier
		String mainWindow = adresaDomiciliuPage.getWindowHandle();

		//Open window with search items;
		adresaDomiciliuPage.fillAdresaDomiciliuForm(mainWindow, "ADR 231", "Gu gu gu Strada ", "0011442255", "Romania", "Cluj", "Cluj");
		
		AdresaModel adresaDomiciliu  = adresaDomiciliuPage.grabAdresaDomiciliuData();
		PrintUtils.printAdresaModel(adresaDomiciliu);
		
		adresaCorespondentaPage.fillAdresaCorespondentaForm(mainWindow, "DDD 2222", "MeGusta ", "0011442255", "Romania", "Bucu", "SECTOR 3");
		
		AdresaModel adresaCorespondenta  = adresaCorespondentaPage.grabAdresaCorespondentaData();
		PrintUtils.printAdresaModel(adresaCorespondenta);
		
		String alertMessage = footerActionsPage.clickSalveaza();
		System.out.println("Alert: " + alertMessage);
		
	}

}
