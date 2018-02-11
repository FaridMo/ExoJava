/* Exerice 3 TP */
package monPackage.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TableauxEtCaractere {
	static Scanner clavier = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	static void lireEntier(){
		double moyenne=0.0;
		int[] table = new int[6];
		int plusGrandNombre=table[0];
		for(int i=0;i<table.length;i++){
			System.out.println("Entrez l'entier "+(i+1)+":");
			table[i]=clavier.nextInt();
		}
		
		System.out.println("Contenu du tableau : ");
		for(int i=0;i<table.length;i++){
			System.out.print(table[i]+"|");
			moyenne+=table[i];
		}
		
		for(int i=0;i<table.length;i++){
			if(table[i]>plusGrandNombre){
				plusGrandNombre=table[i];
			}
		}
		moyenne=moyenne/table.length;
		System.out.println("");
		System.out.println("\nLe plus grand nombre est : "+plusGrandNombre);
		System.out.println("\nLa moyenne est : "+df.format(moyenne));
	}
	
	
	
	static void lireCaractere(){
		int[] table = new int[6];
		char plusGrandCaractere=(char) table[0];
		for(int i=0;i<table.length;i++){
			System.out.println("Entrez le caractère "+(i+1)+":");
			table[i]=clavier.next().charAt(0);
		}
		
		System.out.println("Contenu du tableau : ");
		for(int i=0;i<table.length;i++){
			System.out.print((char) table[i]+"|");
		}
		
		for(int i=0;i<table.length;i++){
			if(table[i]>plusGrandCaractere){
				plusGrandCaractere=(char) table[i];
			}
		}
		System.out.println("\nLe plus grand caractère est :"+plusGrandCaractere);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenu(s)\nFaites votre choix :\n1- pour lire les entiers\n2- pour lire les caractères\n3- quitter");
		int choix = clavier.nextInt();
		if(choix == 1){
			lireEntier();
		}
		if(choix == 2){
			lireCaractere();
		}
		if(choix == 3){
			System.out.println("à bientôt !");
			System.exit(0);
		}
		if(choix!=1 && choix!=2 && choix!=3){
			System.out.println("Votre choix n'existe pas ! Réessayez...");
		}
	}
}
