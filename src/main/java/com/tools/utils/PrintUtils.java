package com.tools.utils;

import com.bank.bt.data.model.BrokerInfoModel;
import com.bank.bt.data.model.OfertaInfoModel;

public class PrintUtils {

	
	public static void printBrokerInfoModel(BrokerInfoModel brokerInfoModel){
		System.out.println("---------------");
		System.out.println("furnizor: " + brokerInfoModel.furnizor);
		System.out.println("magazin: " + brokerInfoModel.magazin);
		System.out.println("reprezentant: " + brokerInfoModel.reprezentant);
		System.out.println("stare: " + brokerInfoModel.stare);
	}
	
	public static void printOfertaInfoModel(OfertaInfoModel ofertaInfoModel){
		System.out.println("---------------");
		System.out.println("numerOferta: " + ofertaInfoModel.numerOferta);
		System.out.println("pretTotal: " + ofertaInfoModel.pretTotal);
		System.out.println("valFin: " + ofertaInfoModel.valFin);
		System.out.println("costTotal: " + ofertaInfoModel.costTotal);
		System.out.println("dae: " + ofertaInfoModel.dAE);
		System.out.println("dataCreare: " + ofertaInfoModel.dataCreare);
		System.out.println("avans: " + ofertaInfoModel.avans);
		System.out.println("rata: " + ofertaInfoModel.rata);
		System.out.println("valoareTotalPlatibila: " + ofertaInfoModel.valoareTotalPlatibila);
	}
}
