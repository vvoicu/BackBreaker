package com.tools.pdf.cerere;

import java.awt.Rectangle;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import com.tools.pdf.PdfKeys;

public class PdfCerereCreditare {
	
	public static void extractContent(PDDocument document) throws IOException {

		PDFTextStripperByArea stripper = defineFirstPageAreas();

		// define page
		PDPage firstPage = document.getPage(0);

		// connect area with page
		stripper.extractRegions(firstPage);

		//print extracted fields
		printPdfDocument(stripper);
	}
	
	public static void printPdfDocument(PDFTextStripperByArea stripper){
		System.out.println("creditSuma: " + stripper.getTextForRegion(PdfKeys.creditSuma));
		System.out.println("tipCredit: " + stripper.getTextForRegion(PdfKeys.tipCredit));

		System.out.println("numeTitle: " + stripper.getTextForRegion(PdfKeys.numeTitle));
		System.out.println("numeValue: " + stripper.getTextForRegion(PdfKeys.numeValue));

		System.out.println("prenumeTitle: " + stripper.getTextForRegion(PdfKeys.prenumeTitle));
		System.out.println("prenumeValue: " + stripper.getTextForRegion(PdfKeys.prenumeValue));

		System.out.println("cnpTitle: " + stripper.getTextForRegion(PdfKeys.cnpTitle));
		System.out.println("cnpValue: " + stripper.getTextForRegion(PdfKeys.cnpValue));

		System.out.println("buletinTitle: " + stripper.getTextForRegion(PdfKeys.buletinTitle));
		System.out.println("buletinValue: " + stripper.getTextForRegion(PdfKeys.buletinValue));

		System.out.println("adresaTitle: " + stripper.getTextForRegion(PdfKeys.adresaTitle));
		System.out.println("adresaValue: " + stripper.getTextForRegion(PdfKeys.adresaValue));

		System.out.println("proprietarTitle: " + stripper.getTextForRegion(PdfKeys.proprietarTitle));
		System.out.println("proprietarValue: " + stripper.getTextForRegion(PdfKeys.proprietarValue));
		System.out.println("proprietarRudenie: " + stripper.getTextForRegion(PdfKeys.proprietarRudenie));

		System.out.println("-------");
		System.out.println("valoareCredit: " + stripper.getTextForRegion(PdfKeys.valoareCredit));
		System.out.println("comisionAnaliza: " + stripper.getTextForRegion(PdfKeys.comisionAnaliza));
		System.out.println("sumaReferinta: " + stripper.getTextForRegion(PdfKeys.sumaReferinta));
		System.out.println("valoareTotalaCredit: " + stripper.getTextForRegion(PdfKeys.valoareTotalaCredit));
		System.out.println("nrLuniFinantare: " + stripper.getTextForRegion(PdfKeys.nrLuniFinantare));

		System.out.println("-------");
		System.out.println("nrLuniGratie: " + stripper.getTextForRegion(PdfKeys.nrLuniGratie));
		System.out.println("plataLunara: " + stripper.getTextForRegion(PdfKeys.plataLunara));
		System.out.println("dobandaAnuala: " + stripper.getTextForRegion(PdfKeys.dobandaAnuala));
		System.out.println("telefonMobilSolicitant: " + stripper.getTextForRegion(PdfKeys.telefonMobilSolicitant));
		System.out.println("telefonFixSolicitant: " + stripper.getTextForRegion(PdfKeys.telefonFixSolicitant));
	}
	


	public static PDFTextStripperByArea defineFirstPageAreas() throws IOException {
		PDFTextStripperByArea areaStripper = new PDFTextStripperByArea();
		areaStripper.setSortByPosition(true);

		// define area - top elements
		Rectangle creditSuma = new Rectangle(10, 50, 107, 10);
		areaStripper.addRegion(PdfKeys.creditSuma, creditSuma);

		Rectangle tipCredit = new Rectangle(100, 50, 300, 10);
		areaStripper.addRegion(PdfKeys.tipCredit, tipCredit);

		Rectangle numeTitle = new Rectangle(10, 60, 100, 10);
		areaStripper.addRegion(PdfKeys.numeTitle, numeTitle);

		Rectangle numeValue = new Rectangle(100, 60, 200, 10);
		areaStripper.addRegion(PdfKeys.numeValue, numeValue);

		Rectangle prenumeTitle = new Rectangle(10, 70, 100, 10);
		areaStripper.addRegion(PdfKeys.prenumeTitle, prenumeTitle);

		Rectangle prenumeValue = new Rectangle(100, 70, 200, 10);
		areaStripper.addRegion(PdfKeys.prenumeValue, prenumeValue);

		Rectangle buletinTitle = new Rectangle(10, 80, 100, 10);
		areaStripper.addRegion(PdfKeys.buletinTitle, buletinTitle);

		Rectangle buletinValue = new Rectangle(10, 80, 400, 10);
		areaStripper.addRegion(PdfKeys.buletinValue, buletinValue);

		Rectangle cnpTitle = new Rectangle(10, 90, 100, 10);
		areaStripper.addRegion(PdfKeys.cnpTitle, cnpTitle);

		Rectangle cnpValue = new Rectangle(10, 90, 400, 10);
		areaStripper.addRegion(PdfKeys.cnpValue, cnpValue);

		Rectangle adresaTitle = new Rectangle(10, 100, 100, 20);
		areaStripper.addRegion(PdfKeys.adresaTitle, adresaTitle);

		Rectangle adresaValue = new Rectangle(10, 100, 400, 20);
		areaStripper.addRegion(PdfKeys.adresaValue, adresaValue);

		// define area - program CDB credit direct broker 14 STANGA
		Rectangle valoareCredit = new Rectangle(170, 140, 50, 10);
		areaStripper.addRegion(PdfKeys.valoareCredit, valoareCredit);

		Rectangle comisionAnaliza = new Rectangle(170, 160, 50, 10);
		areaStripper.addRegion(PdfKeys.comisionAnaliza, comisionAnaliza);

		Rectangle sumaReferinta = new Rectangle(170, 170, 50, 10);
		areaStripper.addRegion(PdfKeys.sumaReferinta, sumaReferinta);

		Rectangle valoareTotalaCredit = new Rectangle(170, 180, 50, 10);
		areaStripper.addRegion(PdfKeys.valoareTotalaCredit, valoareTotalaCredit);

		Rectangle nrLuniFinantare = new Rectangle(170, 190, 50, 10);
		areaStripper.addRegion(PdfKeys.nrLuniFinantare, nrLuniFinantare);

		// define area - program CDB credit direct broker 14 DREAPTA
		Rectangle nrLuniGratie = new Rectangle(360, 140, 50, 10);
		areaStripper.addRegion(PdfKeys.nrLuniGratie, nrLuniGratie);

		Rectangle plataLunara = new Rectangle(360, 160, 50, 10);
		areaStripper.addRegion(PdfKeys.plataLunara, plataLunara);

		Rectangle dobandaAnuala = new Rectangle(360, 170, 50, 10);
		areaStripper.addRegion(PdfKeys.dobandaAnuala, dobandaAnuala);

		Rectangle telefonMobilSolicitant = new Rectangle(360, 180, 50, 10);
		areaStripper.addRegion(PdfKeys.telefonMobilSolicitant, telefonMobilSolicitant);

		Rectangle telefonFixSolicitant = new Rectangle(360, 190, 50, 10);
		areaStripper.addRegion(PdfKeys.telefonFixSolicitant, telefonFixSolicitant);

		// define area - middle elements
		Rectangle proprietarTitle = new Rectangle(10, 280, 400, 20);
		areaStripper.addRegion(PdfKeys.proprietarTitle, proprietarTitle);

		Rectangle proprietarValue = new Rectangle(10, 300, 400, 20);
		areaStripper.addRegion(PdfKeys.proprietarValue, proprietarValue);

		Rectangle proprietarRudenie = new Rectangle(110, 300, 100, 20);
		areaStripper.addRegion(PdfKeys.proprietarRudenie, proprietarRudenie);

		return areaStripper;
	}

}
