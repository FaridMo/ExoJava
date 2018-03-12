package applicationHeritage;
import java.util.ArrayList;
import java.util.List;
public class GroupeTD {
	
	
	List<Etudiant> groupeEtudiant = new ArrayList<Etudiant>();
	
	void ajouterEtudiant(Etudiant e){
//	if(groupeEtudiant.size()>30){
//		System.out.println("Le groupe est au complet !");
//		groupeEtudiant.clear();
//	}else{
		groupeEtudiant.add(e);
//	}
		
	}
	
	void afficherListe(){
		for(int i=0;i<groupeEtudiant.size();i++){
			Object obj = groupeEtudiant.get(i);
			
			if(obj instanceof Etudiant){
				((Etudiant) obj).affiche();
			}
			if(obj instanceof EtudiantEtranger){
				((EtudiantEtranger) obj).affiche();
			}		
			if(obj instanceof EtudiantSportif){
				((EtudiantSportif) obj).affiche();
			}
			
			
		}
		
	}
}
