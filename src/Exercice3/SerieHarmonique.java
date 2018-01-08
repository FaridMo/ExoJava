package Exercice3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SerieHarmonique {
	
	public static void main(String[] args){
		int i=1,n,essai = 1;
		double somme=0;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner clavier = new Scanner(System.in);
		
		do{
				System.out.println("Saisissez un nombre positif");
				n = clavier.nextInt();
		
			 if(n>=0 && n<=100){
				while(i<=n){
					somme = somme + (double) 1/i;
					i++;
				}
				System.out.println("La serie Harmonique de "+n+" est : "+df.format(somme));
				essai=6;
				
			  }else{
				  System.out.println("Choissisez un entier compris entre 0 et 100 !");
				  essai++;
			  }
			   if(essai>5){
				System.out.println("Le nombre d'essai est terminé !");
			   }
		}while(essai<6);
			 clavier.close();
	}
	
	
}
