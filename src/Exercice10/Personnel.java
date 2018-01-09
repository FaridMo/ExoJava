package Exercice10;

import java.util.Scanner;

public class Personnel {

	static private String nom,prenom,fonction,matricule;
	static private char sexe;
	static private int age;
	
	
	public Personnel(String nom, String prenom, String matricule,String fonction, char sexe, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule=matricule;
		this.fonction = fonction;
		this.sexe = sexe;
		this.age = age;
	}
	
	
	public static void main(String[] a){
		
		//Personnel p = new Personnel("macoumba","Thiam","Directeur",'M',12);
		//Personnel p1 = new Personnel("fall","Binta","Directrice",'F',14);
		
		System.out.println("-----BIENVENU-----");
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisissez votre sexe : ");
		sexe=clavier.next().charAt(0);
		if(sexe == 'M' || sexe == 'm'){
			System.out.println("Entrez votre nom : ");
			nom=clavier.next();
			System.out.println("Entrez votre prenom : ");
			prenom=clavier.next();
			System.out.println("Entrez votre matricule : ");
			matricule=clavier.next();
			System.out.println("Entrez votre fonction au sein de l'entreprise : ");
			fonction=clavier.next();
			System.out.println("Entrez votre �ge : ");
			age=clavier.nextInt();
		}else if(sexe == 'F' || sexe == 'f'){
			System.out.println("Entrez votre nom : ");
			nom=clavier.next();
			System.out.println("Entrez votre prenom : ");
			prenom=clavier.next();
			System.out.println("Entrez votre matricule : ");
			matricule=clavier.next();
			System.out.println("Entrez votre fonction au sein de l'entreprise : ");
			fonction=clavier.next();
			System.out.println("Entrez votre �ge : ");
			age=clavier.nextInt();
		}else{
			System.out.println("Saisissez 'M' Pour Masculin et 'F' pour F�minin !");
		}
		
		
		System.out.println("---------------------------------");
		System.out.println("Nom : "+nom);
		System.out.println("Prenom : "+prenom);
		System.out.println("Matricule : "+matricule);
		System.out.println("Fonction : "+fonction);
		System.out.print("Sexe : ");
			if(sexe == 'M'){
				System.out.println("Masculin");
			}else if(sexe == 'F'){
				System.out.println("F�minin");
			}else{
				System.out.println("Erreur");
				clavier.close();
			}
		System.out.println("Age: "+age);
		System.out.println("---------------------------------");
	}
}
