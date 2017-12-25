/**
 * @author Farid Mohamed HASSAN
 */
package monPackage.com;

import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Equation {

	public static void calcul(double a,double b,double c){
		
		int p = (int) a;
		int p1 = (int) b;
		int p2 = (int) c;

		if(p1<0 && p2<0){
			System.out.print(p+"x²"+p1+"x"+p2);
		}
		
		if(p1>=0 && p2>=0){
			System.out.print(p+"x²"+"+"+p1+"x"+"+"+p2);
		}
		
		if(p1>=0 && p2<0){
			System.out.print(p+"x²"+"+"+p1+"x"+p2);
		}
		
		if(p1<0 && p2>=0){
			System.out.print(p+"x²"+p1+"x"+"+"+p2);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		double a,b,c,x,x1,x2,delta;
		
		
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
			 
				System.out.println("entrez les 3 nombres: ");
				a=clavier.nextDouble();
				b=clavier.nextDouble();
				c=clavier.nextDouble();
				
				
				
				if(a==0){
					System.out.println("L'équation n'est pas du second dégré");
				}
				else{
					DecimalFormat df = new DecimalFormat("#.##");
					delta=(pow(b,2)-(4*a*c));
					x=(-b)/(2*a);
					x1=(((-b)-(sqrt(delta)))/(2*a));
					x2=(((-b)+(sqrt(delta)))/(2*a));
					if(delta == 0){
						System.out.print("L'équation ");
						calcul(a,b,c);
								
						System.out.println(" n'admet aucune solution");
						
					
					}
					if(delta>0){
						System.out.print("L'equation ");
						calcul(a,b,c);
						System.out.println(" admet deux solutions:");
						System.out.println(" x1 =  "+df.format(x1)+"\n x2 = "+df.format(x2));
						
						
					}
					if(delta<0){
						System.out.print("L'equation ");
						calcul(a,b,c);
						System.out.println(" admet qu'une seule solution : \n"+"x ="+df.format(x));
						
					}
				}
			
	

	}

}
