package applicationHeritage;
import java.util.ArrayList;
import java.util.List;
public class GroupeTD {
	
	
	List<Etudiant> groupeEtudiant = new ArrayList<Etudiant>();
	
	void ajouterEtudiant(Etudiant e){
	if(groupeEtudiant.size()>30){
		System.out.println("Le groupe est au complet !");
		System.exit(0);
	}else{
		groupeEtudiant.add(e);
	}
		
	}
	
	void afficherListe(){
		for(int i=0;i<groupeEtudiant.size();i++){
			
			Etudiant objet = groupeEtudiant.get(i);
			
			if(objet instanceof Etudiant){
				((Etudiant) objet).affiche();
			}
//			if(objet instanceof EtudiantEtranger){
//				((EtudiantEtranger) objet).affiche();
//
//			}		
//			if(objet instanceof EtudiantSportif){
//				((EtudiantSportif) objet).affiche();
//				
//			}
//			objet.affiche();
			
			
		}
		
	}
}
