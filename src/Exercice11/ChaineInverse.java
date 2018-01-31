package Exercice11;

import java.util.Iterator;

public class ChaineInverse {
	
	String chaine;
	
	public ChaineInverse(String chaine){
			this.chaine=chaine;
		}
	
	public String InverseChaine(String a){
		StringBuffer rs = (new StringBuffer(a).reverse());
		return rs.toString();
	}
	
	public void imprimeChaine(){
		System.out.println("La chaine inversé de "+chaine+" est : "+ InverseChaine(chaine));
	}
	
	
	
}

