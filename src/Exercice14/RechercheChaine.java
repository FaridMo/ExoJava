package Exercice14;

import java.util.Scanner;

public class RechercheChaine {
	
	static boolean trouveChaine(String chaine,String chaineRecherche){
		chaine = chaine.toLowerCase();
		chaineRecherche = chaineRecherche.toLowerCase();
		
			if(chaine.contains(chaineRecherche)){
					return true;
			}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre chaine de caractère : ");
		String phrase = clavier.nextLine();
		System.out.println("Entrez la chaine de caractère que vous cherchiez : ");
		String phraseRecherche = clavier.nextLine();
		System.out.println(trouveChaine(phrase, phraseRecherche));
		clavier.close();
		
	}
}
