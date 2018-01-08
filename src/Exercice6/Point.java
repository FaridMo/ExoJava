package Exercice6;

import java.text.DecimalFormat;

public class Point {
	
	float abscisse,ordonnee;
	byte couleur;
	
	//premier constructeur à deux arguments
	public Point(float absc,float ord){
		this.abscisse=absc;
		this.ordonnee=ord;
	}
	
	//deuxième constructeur à trois arguments
	public Point(float absc,float ord,byte coul){
		this(absc,ord);
		this.couleur=coul;
	}
	
	
	//troisième constructeur sans argument
	public Point(){
		this.abscisse=0;
		this.ordonnee=0;
	}
	
	//methode pour translater un point à x cm
	public void translater(float x){
		this.abscisse+=x;
		this.ordonnee+=x;
	}
	
	//methode pour afficher les coordonnées
	public void affiche(){
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Les coordonnées du point sont : \n"
				+ "X = "+df.format(abscisse)
				+ "\nY = "+df.format(ordonnee));
	}
	
	//methode pour comparer un point avec un autre
	public boolean coïncide(Point p){
		boolean res = false;
		if(abscisse == p.abscisse && ordonnee == p.ordonnee){
			res = true;
			return res;
		}
		return res;
	}
	
	
}
