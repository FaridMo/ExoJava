package applicationHeritage;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e = new Etudiant("Hassan","farid",12);
		Etudiant e1 = new EtudiantEtranger("Mohamed","Ali",13,"Djibouti");
		Etudiant e2 = new EtudiantSportif("Mohamed","Hassan",14,"Football");
		
		GroupeTD gtd = new GroupeTD();
		
		gtd.groupeEtudiant.add(e);
		gtd.groupeEtudiant.add(e1);
		gtd.groupeEtudiant.add(e2);
		
		//gtd.groupeEtudiant.clear();
		System.out.println("Nombre d'�tudiants au sein du GroupeTD : "+gtd.groupeEtudiant.size());
		gtd.afficherListe();
		
		
		
		
	}

}
