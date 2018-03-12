package applicationHeritage;

public class Etudiant {
	String nom,prenom;
	int age;

	public Etudiant(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	void affiche(){
		System.out.println("Nom : "+nom+"\nPrenom: "+prenom+"\nAge : "+age);
		//return "Nom : "+nom+"\nPrenom: "+prenom+"\nAge : "+age;
	}

	
	
	
}
