package exercice5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
			System.out.println("Saisissez un entier : ");
			a = clavier.nextInt();
		
	
		if(a<=20){ //* debut de la premiere boucle pour que le nombre soit compris entre 0 et 20 **

				if(a>=0){//** debut de la deuxieme boucle pour le cacul du factoriel pour un nombre saisie au clavier **
					System.out.println("Le factoriel de "+a+" est : "+Factoriel.calculFacto(a));
			       }
				else{
				System.out.println("entrez un entier positif !");
			  }//** fin de la deuxieme boucle **
				
		}else{
			System.out.println("Saisissez un nombre compris entre 0 et 20 !!");
		}//* fin de la premiere boucle *
		
	}

}

