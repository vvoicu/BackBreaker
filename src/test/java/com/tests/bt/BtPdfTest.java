package com.tests.bt;

import java.io.File;
import java.io.IOException;

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

}
