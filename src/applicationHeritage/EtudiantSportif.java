package applicationHeritage;




public class EtudiantSportif extends Etudiant {

	private String sportPratiqué;
	public EtudiantSportif(String nom,String prenom, int age,String sportPratiqué){
		super(nom,prenom,age);
		this.sportPratiqué = sportPratiqué;
	}
	
	@Override
	void affiche(){
		System.out.println("--------");
		super.affiche();
		System.out.println("Sport Pratiqué : "+sportPratiqué);
	}

	
	
	
}
