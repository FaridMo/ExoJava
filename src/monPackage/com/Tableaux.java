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
		int indiceDeb = -1;
		int indiceFin = -1;
		int occurrence=0;
		for(int i=0;i<tableau.length;i++)
		{
			if(nombre == tableau[i] && indiceDeb == -1)
			{
				res="oui";
				indiceDeb=i;
				occurrence++;
				
			}
			if(nombre == tableau[i])
			{
				res="oui";
				indiceFin=i;
				occurrence++;
				
			}
		}
		
	if(indiceDeb!=-1 || indiceFin != -1)
	{
	  if(occurrence==0)
	  {
		if(res=="oui"){
			System.out.println("Oui, le nombre est dans le tableau ! il apparaît "+(occurrence-1)+" fois !");
			System.out.println("son indice est : "+indiceDeb);
		}
	  }else
	  {
		  System.out.println("Oui, le nombre est dans le tableau ! il apparaît "+(occurrence-1)+" fois !");
		  System.out.println("son indice de début = "+indiceDeb);
		  System.out.println("son dernier indice  = "+indiceFin);
	  }
	}else
	{
		System.out.println("Non, le nombre n'est pas dans le tableau !");
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
					System.out.print(tableau[i]);
					System.out.print("|");
				}
				System.out.println(" ");
				tableau[indice]=nombre;
				System.out.println("### Tableau modifié :: ###");
				for(int i=0;i<tableau.length;i++){
					System.out.print(tableau[i]);
					System.out.print("|");
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
		
		if((id1<tableau.length && id1>=0) && (id1<tableau.length && id1>=0)){
			System.out.println("### Tableau initial :: ###");
			for(int i=0;i<tableau.length;i++){
				System.out.print(tableau[i]);
				System.out.print("|");
			}
			System.out.println(" ");
			int tmp=tableau[id1];
			tableau[id1]=tableau[id2];
			tableau[id2]=tmp;
			System.out.println(" ");
			System.out.println("### Tableau modifié :: ###");
			for(int i=0;i<tableau.length;i++){
				System.out.print(tableau[i]);
				System.out.print("|");
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
		
		if(choix == 1){
			apparTableau();
		}
		if(choix == 2){
			indiceNombre();
		}
		if(choix == 3){
			indiceEchange();
		}
		if(choix == 0){
			System.exit(0);
		}
		
		
		
		
	}
}
