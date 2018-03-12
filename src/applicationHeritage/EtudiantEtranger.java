package applicationHeritage;

public class EtudiantEtranger extends Etudiant {
	public String paysOrigine;
	
	public EtudiantEtranger(String nom ,String prenom,int age,String paysOrigine) {
		super(nom, prenom, age);
		this.paysOrigine = paysOrigine;
	}

	@Override
	void affiche() {
		System.out.println("--------");
		super.affiche();
		System.out.println("Pays d'origine : "+paysOrigine);
		
		//return "Pays d'origine : "+paysOrigine;
	}

	
	
	
}
