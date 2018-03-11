package com.metier;

import java.util.ArrayList;
import java.util.List;

public class FactureMetier  implements IFactureMetier  {
	
	double sommeProduitTTC = 0 ;
	double sommeTaxeProduit = 0;
	double sommeProduitHTTC = 0;
	double factureTotal = 0;
	//public List<Produit> getSommeTotalFactureAndTaxe(List<Produit> list)
	public List<Double> getSommeTotalFactureAndTaxe(List<Produit> phts) {
		
		List<Double> factureAndTaxes = new ArrayList<Double>();
		for(Produit pht : phts){
				        	 
					sommeTaxeProduit += calculTaxeProduit1(pht.getTaxe() ,pht.getPrix() , pht.getQuantite(), pht.isImported());
					sommeProduitHTTC += (pht.getPrix() * pht.getQuantite());					
	           }	
		
			factureTotal = sommeProduitHTTC + sommeTaxeProduit;		
			factureAndTaxes.add(rounding(roundToHalf(factureTotal)));
			factureAndTaxes.add(rounding(roundToHalf(sommeTaxeProduit)));
			return factureAndTaxes;		
		}
				
	public double calculTaxeProduit(int taxe, double Pht ,int quantite ,boolean isImporte) {
		
		if(isImporte){
			double taxeProduitImporte = quantite * (calculTaxeProduitImporte(taxe,  Pht));			
			return rounding(roundToHalf(taxeProduitImporte + (quantite*Pht)));
			
		}else{
			double taxeProduitLocal = calculTaxeProduitLocal(taxe,  quantite * Pht);			
			return rounding(roundToHalf(taxeProduitLocal + (quantite * Pht)));
		}

	}
	
	private double calculTaxeProduit1(int taxe, double Pht ,int quantite ,boolean isImporte) {
		
		if(isImporte){
			double taxeProduitImporte = calculTaxeProduitImporte(taxe, quantite * Pht);			
			return rounding(roundToHalf(taxeProduitImporte)); 
			
		}else{
			double taxeProduitLocal = calculTaxeProduitLocal(taxe,  quantite * Pht);			
			return rounding(roundToHalf(taxeProduitLocal));
		}

	}
	private double calculTaxeProduitLocal(int taxe, double Pht) {

		double taxeProduit = (Pht* taxe /100);		
		return taxeProduit;
	}
	
	private double calculTaxeProduitImporte(int taxe, double Pht) {

		double taxeProduit = ((Pht* (taxe+5)) /100);		
		return taxeProduit;
	}
	
	private double rounding(double round){
		
		return (double) Math.round(round * 100) / 100; 
	}

	public static double roundToHalf(double f){

		return (double)Math.ceil(f / 0.05f) * 0.05f;		    
}


}
