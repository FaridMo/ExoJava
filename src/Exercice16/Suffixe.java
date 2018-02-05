package Exercice16;

public class Suffixe {

	static boolean estSuffixe(String u,String v){
		u = u.toLowerCase();
		v= v.toLowerCase();
		if(u.startsWith(v)){
			return true;
		}
		return false;
	}
	
	static String extraire (String s, int d�but, int fin){
		s = s.toLowerCase();
		String chaine = null;
		while(chaine != ""){
			chaine = s.substring(d�but,fin-1);
			return chaine;
		}
		return chaine;
	}
	public static void main(String[] args) {
		
		System.out.println(estSuffixe("bonjour","bon")); //true
		System.out.println(extraire("bonjour tout le monde", 16, 22)); //monde
	}

}
