package Exercice18;

import java.util.Scanner;

public class TableauVoyelle {
	/* **** m�thode 1 ****
	static void retouneVoyelle(String chaine){
	 	char voy[]={'a','e','i','o','u','y'};
	
		int compt = 0;
		chaine=chaine.toLowerCase();
		for(int k=0;k<chaine.length();k++){
			for(int c=0;c<voy.length;c++){
				if(chaine.charAt(k)==voy[c]){
					System.out.println(voy[c]);
				}
			}
		}
	  }
	}
	*/
		
	// **** m�thode 2 ****
		static void retVoy(){
			int voy[] = new int[6];
			Scanner clavier = new Scanner(System.in);
			System.out.println("Entrez votre chaine :");
			String chaine = clavier.nextLine();
			chaine = chaine.toLowerCase();
			for(int i=0;i<chaine.length();i++){
				switch(chaine.charAt(i)){
				case 'a':
					voy[0]++; break;
				case 'e':
					voy[1]++; break;
				case 'i':
					voy[2]++; break;
				case 'o':
					voy[3]++; break;
				case 'u':
					voy[4]++; break;
				case 'y':
					voy[5]++; break;
				
				}
			}
			
			
			System.out.println("la lettre 'a' appara�t "+voy[0]+" fois");
			System.out.println("la lettre 'e' appara�t "+voy[1]+" fois");
			System.out.println("la lettre 'i' appara�t "+voy[2]+" fois");
			System.out.println("la lettre 'o' appara�t "+voy[3]+" fois");
			System.out.println("la lettre 'u' appara�t "+voy[4]+" fois");
			System.out.println("la lettre 'y' appara�t "+voy[5]+" fois");
		}
	

		
	public static void main(String[] a){
		retVoy();
	}
}
