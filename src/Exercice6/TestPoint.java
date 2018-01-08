package Exercice6;


public class TestPoint {

	public static void main(String[] args) {
		
		
		Point p1 = new Point(1.2f,2.4f);
		Point p2 = new Point(1.2f,2.4f);
		
		System.out.println("----------------------");
		System.out.println("Comparaison entre le point p1 et p2 :");
		System.out.println(p1.coïncide(p2));
		System.out.println("----------------------");
		System.out.println("le point p1 est translaté de 1,1 cm");
		p1.translater(1.1f);
		p1.affiche();
		System.out.println("----------------------");
	}

}
