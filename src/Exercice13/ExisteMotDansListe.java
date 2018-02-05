package Exercice13;

import java.util.Scanner;

public class ExisteMotDansListe {

	static Scanner clavier = new Scanner("System.in");
	public static boolean existeDans(String mot,String[] liste){
		mot=mot.toLowerCase();
		for(int i=0;i<liste.length;i++){
			if(liste[i] == mot){
				return true;	
			}
			
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String[] liste = {"bonjour","kasse","farid","javase","javaee"};
		
		System.out.println(existeDans("javase", liste)); //true
		System.out.println(existeDans("java", liste));  //false
		
		
	}
}
