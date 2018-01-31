package Exercice11;

public class ChaineInverseStat {
	
	static String chaine;
	
	public ChaineInverseStat(String chaine){
			this.chaine=chaine;
		}
	
	public static String InverseChaine(String a){
		StringBuffer rs = new StringBuffer(a).reverse();
		return rs.toString();
	}
	
	public static void imprimeChaine(){
		System.out.println("La chaine inversé de "+chaine+" est : "+ InverseChaine(chaine));
	}
}
