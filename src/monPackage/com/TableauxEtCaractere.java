/* Exerice 3 TP */
package monPackage.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TableauxEtCaractere {
	static Scanner clavier = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	static int choix;
	
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
		char[] table = new char[6];
		char plusGrandCaractere=table[0];
		for(int i=0;i<table.length;i++){
			System.out.println("Entrez le caract�re "+(i+1)+":");
			table[i]=clavier.next().charAt(0);
		}
		
		System.out.println("Contenu du tableau : ");
		for(int i=0;i<table.length;i++){
			System.out.print(table[i]+"|");
		}
		
		for(int i=0;i<table.length;i++){
			if(table[i]>plusGrandCaractere){
				plusGrandCaractere=table[i];
			}
		}
		System.out.println("\nLe plus grand caract�re est : "+plusGrandCaractere);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenu(s)\nFaites votre choix :\n1- pour lire les entiers\n2- pour lire les caract�res\n3- quitter");
		choix = clavier.nextInt();
		
		switch(choix){
		case 1:
			lireEntier();break;
		case 2:
			lireCaractere();break;
		case 3:
			System.out.println("� bient�t !");
			System.exit(0);
		}
		
	
		while(choix!=1 && choix!=2 && choix!=3){
			System.out.println("Votre choix n'existe pas ! R�essayez...");
			System.out.println("Faites votre choix :\n1- pour lire les entiers\n2- pour lire les caract�res\n3- quitter");
			choix = clavier.nextInt();
			
			switch(choix){
			case 1:
				lireEntier();break;
			case 2:
				lireCaractere();break;
			case 3:
				System.out.println("� bient�t !");
				System.exit(0);
			}
			
		}
	}
}
