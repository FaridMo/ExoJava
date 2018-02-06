package Exercice17;

import java.util.regex.*;

public class MajOccu {
	static Pattern pattern;
	static Matcher matcher;
	@SuppressWarnings({ "static-access"})
	public static void Occu(String s,char c){
		
		pattern = pattern.compile("[A-Z]"); /*cette ligne permet de spécifier les expressions régulières
						* cherchées dans une chaine de caractère. Ici dans notre cas on 
						* cherche les caractères de l'alphabet en Majuscule
						*/
		matcher = pattern.matcher(s);
	
	while(matcher.find()){	
		
		System.out.println(s.substring(matcher.groupCount(),matcher.end()));	
		}
	}
	
}

