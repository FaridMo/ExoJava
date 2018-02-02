package Exercice13;

import java.util.Scanner;


public class ExisteMotDansListe {
	
	private static String[] liste;
	
	public ExisteMotDansListe(String[] liste){
		this.liste = liste;
	}
	public static void existeDans(String mot,String[]liste){
		for(int i=0;i<liste.length;i++){
			if(mot.equals(liste[i])){
				System.out.println("Vrai !");
				break;
			}else{
				System.out.println("Faux !");
				break;
			}
		}
		ExisteMotDansListe.liste = liste;
	}
	public static void main(String[] args) {
		liste = new String[6];
		liste[0]="voiture";
		liste[1]="pneu";
		liste[2]="avion";
		liste[3]="ordinateur";
		liste[4]="maison";
		liste[5]="balle";
		
		ExisteMotDansListe ex = new ExisteMotDansListe(liste);
		System.out.println("--------------------");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez le mot que vous recherchez");
		String mots = clavier.next();
		ex.existeDans(mots, liste);
		
//		if(bo = true){
//			System.out.println("VRAI ==> le mot "+ mots +" existe bien dans la liste prédefinie");
//			
//		}else{
//			System.out.println("FAUX ==>le mot "+mots+" ne se trouve pas dans la liste");
//			
//		}
		
		
	}

}
