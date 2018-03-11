package com.metier;

public class MedicamentsAndAliments extends Produit {
				
final int TAXZEROPOURCENT = 0;
	
	public MedicamentsAndAliments(){
		super.taxe = TAXZEROPOURCENT ;
	}
			
	public MedicamentsAndAliments(double prix , boolean isImported, int quantite){		
		this.taxe= TAXZEROPOURCENT ;
		super.prix=prix;
		super.isImported=isImported;
		super.quantite = quantite ;
	}
}
