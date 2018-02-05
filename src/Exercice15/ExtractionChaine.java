package Exercice15;

import java.util.Scanner;
import java.util.regex.*;
public class ExtractionChaine {

	public static Pattern pattern;
	public static Matcher matcher;
	
			
			static boolean estVide(String mot) {
			      return mot == null || mot.length() == 0;
			 }
			
			static int extraireSousChaine(String name,String sousChaine) {
			int compteur = 0;
			name= name.toLowerCase();
			sousChaine = sousChaine.toLowerCase();
			  
			  
			 if (estVide(name) || estVide(sousChaine)) {
		          return 0;
		      }
		      int index = 0;
		      while ((index = name.indexOf(sousChaine, index)) != -1) {
		          compteur++;
		          index += sousChaine.length();
		      }
		      return compteur;
		}
			

		
		 @SuppressWarnings({ "static-access", "unused" })
		static int extraireChiffres(String s){
			int [] chiffre = null;
			pattern = pattern.compile("[0-9]+");
			matcher = pattern.matcher(s);
			int compt=0;
				while(matcher.find()){
					compt++;
				}
			return compt;
		}
		
		static void afficheNbSousChaine(){
			
				System.out.println("Entrez votre chaine de caractère : ");
				Scanner clavier = new Scanner(System.in);
				String maChaine = clavier.nextLine();
				System.out.println("Entrez la sous-chaine que vous recherchez : ");
				String maSousChaine = clavier.nextLine();
				System.out.println(extraireSousChaine(maChaine, maSousChaine));
				clavier.close();
			
		}
		
		static void afficheNbChiffre(){
			System.out.println("Entrez votre chaine de caractère : ");
			Scanner clavier1 = new Scanner(System.in);
			String maChaine = clavier1.nextLine();
			if(extraireChiffres(maChaine) == 1){
				System.out.println("Il existe qu'un seul chiffre dans la chaine");
			}else{
				System.out.println("Il existe "+extraireChiffres(maChaine)+" chiffres dans la chaine");
			}
			
			clavier1.close();
		}
		
		public static void main(String[] args) {
			afficheNbSousChaine();
			afficheNbChiffre();
		}
}
