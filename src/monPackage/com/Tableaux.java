package monPackage.com;

import java.util.Scanner;

public class Tableaux {
	
	@SuppressWarnings({ "unused", "resource" })
	static int[] tableau = {10,12,13,14,15,18,0,1,-5,12,14,15,20,19,1,0};
	static Scanner clavier = new Scanner(System.in);
	
	 static void apparTableau(){
		System.out.println("Entrez un nombre : ");
		int nombre = clavier.nextInt();
		String res="non";
		int indice = -1;
		int indiceDeb=-1;
		int occurrence=0;
		for(int i=0;i<tableau.length;i++)
		{
			/*pour trouver l'indice lorsque l'occurence est égale à 1, et en même temps c'est le dernier indice
			pour n'importe quelle occurence.*/
			if(nombre == tableau[i])
			{
				res="oui";
				indice=i;
				occurrence++;
				
			}
			//pour trouver l'indice du début lorsque l'occurence est supérieur à 1
			if(nombre == tableau[i] && indiceDeb==-1){
				indiceDeb=i;
			}
			
		}
	
	if(res=="oui"){
		if(occurrence == 1){
			System.out.println("Oui, le nombre "+nombre+" se trouve dans le tableau "
					+ "et il apparaît 1 seule fois.\nIl se trouve à la position "+indice+" du tableau");
		}
		if(occurrence>1){
			System.out.println("Oui, le nombre "+nombre+" se trouve dans le tableau "
					+ "et il apparaît "+occurrence+" fois.\nSa première position est "+indiceDeb+"\n"
							+ "Sa dernière position est "+indice);
		}
	}

	if(res=="non")
	{
		System.out.println("Non, le nombre "+nombre+" ne se trouve pas dans le tableau !");
	}	
		
	 }
	

	 static void indiceNombre(){
		int indice,nombre;
			System.out.println("Entrez votre entier :");
			nombre = clavier.nextInt();
			System.out.println("Entrez l'indice ");
			indice = clavier.nextInt();
			
			if(indice<tableau.length && indice>=0){
				System.out.println("### Tableau initial :: ###");
				for(int i=0;i<tableau.length;i++){
					System.out.print(tableau[i]+"|");
				}
				System.out.println(" ");
				tableau[indice]=nombre;
				System.out.println("### Tableau modifié :: ###");
				for(int i=0;i<tableau.length;i++){
					System.out.print(tableau[i]+"|");
				}
				System.out.println(" ");
			}else{
				System.out.println("l'indice n'existe pas !");
			}
	}
	
	
	static void indiceEchange(){
		System.out.println("Entrez le premier indice :");
		int id1 = clavier.nextInt();
		System.out.println("Entrez le deuxième indice :");
		int id2 = clavier.nextInt();
		
		if((id1<tableau.length && id1>=0) && (id2<tableau.length && id2>=0)){
			System.out.println("### Tableau initial :: ###");
			for(int i=0;i<tableau.length;i++){
				System.out.print(tableau[i]+"|");
			}
			System.out.println(" ");
			int tmp=tableau[id1];
			tableau[id1]=tableau[id2];
			tableau[id2]=tmp;
			System.out.println(" ");
			System.out.println("### Tableau modifié :: ###");
			for(int i=0;i<tableau.length;i++){
				System.out.print(tableau[i]+"|");
			}
		}else{
			System.out.println("l'un ou l'autre indice n'existe pas !");
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Bienvenu(s) :");
		System.out.println("Faites votre Choix :");
		
		System.out.println("1- Afficher le nombre d'occurence et  l'indice de début et fin d'un entier se trouvant dans le tableau");
		System.out.println("2- Changer le contenu du tableau pour un indice donné");
		System.out.println("3- Intervertir le contenu des deux indices distincts");
		System.out.println("0- Quitter");
		
		int choix = clavier.nextInt();
		
		switch(choix){
		case 1:
			apparTableau();break;
		case 2:
			indiceNombre();break;
		case 3:
			indiceEchange();break;
		case 4:
			System.exit(0);
		}
		
		
		
		
		
	}
}
