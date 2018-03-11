package com.metier;


public class Livres extends Produit{

	final int TAXEDIXPOURCENT = 10;
	
	public Livres(){
		super.taxe= TAXEDIXPOURCENT ;
	};
	
	public Livres (double prix , boolean isImported ,int quantite) {		
		super.taxe= TAXEDIXPOURCENT ;
		super.prix=prix;
		super.isImported=isImported;
		super.quantite = quantite ;
	}
	 	
}
