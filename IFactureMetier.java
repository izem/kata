package com.metier;

import java.util.List;
	
public interface IFactureMetier {
	
	public List<Double> getSommeTotalFactureAndTaxe(List<Produit> list);

	double calculTaxeProduit(int taxe, double Pht,int quantite, boolean isImporte);

	//public List<Double> getSommeTotalFactureAndTaxe(Object setListProduitAndTaxeFirstInput);

}
