package com.metier;

public class AutresProduits extends Produit{
	
	
	final int TAXEVINGHTPOURCENT = 20;	
	
	public AutresProduits(){		
		super.taxe = TAXEVINGHTPOURCENT;
	}
	
	public AutresProduits (double prix , boolean isImported, int quantite ) {		
		this.taxe= TAXEVINGHTPOURCENT ;
		super.prix=prix;
		super.isImported=isImported;
		super.quantite = quantite ;
	}
	 	
}