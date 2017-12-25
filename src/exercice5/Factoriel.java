package exercice5;


public class Factoriel {
	public static int calculFacto(int n){
		if(n==0 || n==1){
			return 1;
		}
		else
			return n*calculFacto(n-1);
	}
	
	public static void main(String[] args) {
		
	System.out.println(calculFacto(10)); //on a pris 10 comme valeur pour le "n"

}
}