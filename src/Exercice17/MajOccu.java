package Exercice17;

import java.io.Console;
import java.util.regex.*;

public class MajOccu {
	static Pattern pattern;
	static Matcher matcher;
	@SuppressWarnings({ "static-access"})
	public static void Occu(String s,char c){
		
		pattern = pattern.compile("[A-Z]"); /*cette ligne permet de sp�cifier l'expression cherch�e
											*dans une chaine de caract�re. Ici dans notre cas on 
											*cherche les caract�res de l'alphabet en Majuscule
											*/
		matcher = pattern.matcher(s);
	
	while(matcher.find()){	
		
		System.out.println(s.substring(matcher.groupCount(),matcher.end()));	
		}
	}
	
}

