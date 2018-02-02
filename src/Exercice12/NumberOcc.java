package Exercice12;

import java.util.Scanner;

public class NumberOcc {

	public static int getNbOcc(String s,char c){
		
		int compteur = 0;
		
		for(int i=0;i<s.length();i++){
			if(s.toLowerCase().charAt(i)==c){
				compteur++;
			}
		}
		return compteur;
	}
	
	public static void afficheNbOcc(){
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre mot : ");
		String chaine = clavier.nextLine();
		System.out.println("Entrez le caractère que vous recherchez :");
		char carac = clavier.next().charAt(0);
		
		System.out.println("le mot "+chaine+" contient "+ getNbOcc(chaine,carac)+" fois la lettre "+carac);
	}
	
	public static int getNbVoy(String chaine){
		char[] voyelle = {'a','e','i','o','u','y'};
		int compteur = 0;
		String carac="";
		chaine = chaine.toLowerCase();
		for(int i=0;i<chaine.length();i++){
			for(int j=0;j<voyelle.length;j++){
				if(chaine.charAt(i)==voyelle[j]){
					compteur++;
				}
			}
		}
		return compteur;
	}
	
	public static void afficheNbVoy(){
		System.out.println("-----------------");
		System.out.println("Script qui permet de compter le nombre des voyelles existant"
				+ " dans une chaine de caractère");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez votre mot : ");
		String chaine = clavier.nextLine();
		System.out.println("le mot "+chaine+" contient "+ getNbVoy(chaine)+" voyelle(s)");
	}
	
	
	public static void main(String[] args) {
		
		NumberOcc.afficheNbOcc();
		NumberOcc.afficheNbVoy();
	}
}
