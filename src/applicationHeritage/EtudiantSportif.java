package applicationHeritage;




public class EtudiantSportif extends Etudiant {

	private String sportPratiqu�;
	public EtudiantSportif(String nom,String prenom, int age,String sportPratiqu�){
		super(nom,prenom,age);
		this.sportPratiqu� = sportPratiqu�;
	}
	
	@Override
	void affiche(){
		System.out.println("--------");
		super.affiche();
		System.out.println("Sport Pratiqu� : "+sportPratiqu�);
	}

	
	
	
}
