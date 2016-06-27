package com.tests.bt;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;

import com.tools.pdf.cerere.PdfCerereCreditare;

public class BtPdfTest {

	public static void main(String[] args) throws IOException {
		PDDocument document = null;
		try {
			document = PDDocument.load(new File("resources/DocumentBtCharisma.pdf"));
			PdfCerereCreditare.extractContent(document);

		} finally {
			if (document != null) {
				document.close();
			}
		}
	}

	
	public static void grabContentAsInputStream(PDDocument document) throws IOException {

		InputStream textStream = document.getPage(0).getContents();
		String myString = IOUtils.toString(textStream, "UTF-8");
		System.out.println("Text: " + myString);
	}

}
