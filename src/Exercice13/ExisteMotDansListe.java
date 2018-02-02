package Exercice13;

import java.util.Scanner;

public class ExisteMotDansListe {

	public static boolean existeDans(String mot,String[] liste){
		boolean b=false;
		mot=mot.toLowerCase();
		for(int i=0;i<liste.length;i++){
			if(liste[i].equals(mot)){
				b=true;
			}
		}
		return b;
	}
	
	public static void affiche(){
		String[] liste = {"bonjour","kasse","farid"};
		Scanner clavier = new Scanner("System.in");
		System.out.println("Entrez votre mot :");
		String chaine = clavier.nextLine();
		System.out.println(existeDans(chaine, liste));
	}
	
	
	public static void main(String[] args) {
		affiche();
		
	}
}
