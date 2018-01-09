package monPackage.com;
@SuppressWarnings("unused")
public class Livre {

	private String titre,auteur;
	private int nbrepage;

	public Livre(String aut,String tit){
		this.auteur=aut;
		this.titre=tit;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
	
	public void setNbPages(int nbPages){
		this.nbrepage=nbPages;
	}
	
	public static void main(String[] args){
		
		Livre livre1 = new Livre("LaFontaine","Le Corbeau et le Renard");
		
		Livre livre2 = new Livre("Rousseau","testTitre");

		
		System.out.println("AUTEURS : "+livre1.getAuteur().toUpperCase()+" ; "
				+livre2.getAuteur().toUpperCase());
		
	}
}

	
	
	
	
