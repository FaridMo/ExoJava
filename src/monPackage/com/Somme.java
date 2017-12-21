package monPackage.com;

import java.util.Scanner;

public class Somme {
	
	public static void main(String[] args){
		
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entrez 2 entiers");
	String a = clavier.nextLine();
	String b = clavier.nextLine();
	
	int c = Integer.parseInt(a);
	int d = Integer.parseInt(b);
	
	int k = c+d;
	
	System.out.println("La somme de "+c+" et "+d+" est : "+k);
		
	}
}
