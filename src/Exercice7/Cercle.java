package Exercice7;

import java.text.DecimalFormat;

import Exercice6.Point;

import static java.lang.Math.*;

public class Cercle {

	
	Point centre;
	double rayon,aire;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public double surface(double r){
		aire = (3.14)*pow(r,2);
		return aire;
	}
	
	public void affiche(){
		System.out.println("Le Cercle a un rayon de "+rayon+"cm de centre O");
		centre.affiche();
	}
	
	public void imprime(){
		System.out.println("La surface du cercle de rayon "+rayon+" cm est : "+df.format(surface(rayon)));
	}
	
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Cercle c1 = new Cercle(p,4);
		c1.affiche();
		System.out.println("----------");
		c1.imprime();
	}

	
}
