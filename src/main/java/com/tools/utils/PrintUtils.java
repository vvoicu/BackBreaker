package com.tools.utils;

import com.bank.bt.data.model.BrokerInfoModel;
import com.bank.bt.data.model.DateFinanciareModel;
import com.bank.bt.data.model.OfertaInfoModel;

public class PrintUtils {

	
	public static void printBrokerInfoModel(BrokerInfoModel brokerInfoModel){
		System.out.println("------BrokerInfoModel---------");
		System.out.println("furnizor: " + brokerInfoModel.furnizor);
		System.out.println("magazin: " + brokerInfoModel.magazin);
		System.out.println("reprezentant: " + brokerInfoModel.reprezentant);
		System.out.println("stare: " + brokerInfoModel.stare);
	}
	
	public static void printOfertaInfoModel(OfertaInfoModel ofertaInfoModel){
		System.out.println("-----OfertaInfoModel----------");
		System.out.println("numarOferta: " + ofertaInfoModel.numarOferta);
		System.out.println("pretTotal: " + ofertaInfoModel.pretTotal);
		System.out.println("valFin: " + ofertaInfoModel.valFin);
		System.out.println("costTotal: " + ofertaInfoModel.costTotal);
		System.out.println("dae: " + ofertaInfoModel.dAE);
		System.out.println("dataCreare: " + ofertaInfoModel.dataCreare);
		System.out.println("avans: " + ofertaInfoModel.avans);
		System.out.println("rata: " + ofertaInfoModel.rata);
		System.out.println("valoareTotalPlatibila: " + ofertaInfoModel.valoareTotalPlatibila);
	}

	public static void printDateFinanciareModel(DateFinanciareModel dateFinanciareModel) {
		System.out.println("------DateFinanciareModel---------");
		System.out.println("alteVenituri: " + dateFinanciareModel.alteVenituri);
		System.out.println("chirie: " + dateFinanciareModel.chirie);
		System.out.println("pensie: " + dateFinanciareModel.pensie);
		System.out.println("pensieCodebitor: " + dateFinanciareModel.pensieCodebitor);
		System.out.println("rateCredit: " + dateFinanciareModel.rateCredit);
		System.out.println("venitLunar: " + dateFinanciareModel.venitLunar);
		System.out.println("venitLunarCodebitor: " + dateFinanciareModel.venitLunarCodebitor);
		
	}
}
