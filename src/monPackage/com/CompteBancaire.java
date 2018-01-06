package monPackage.com;

import java.util.Formatter;

public class CompteBancaire {

	private int rib;
	private double solde;
	private String type,nomProprietaire,date_ouverture;
	
	//constructeur
	public CompteBancaire(int rib,double solde,String type,String nomProprietaire,String date_ouverture){
		this.rib=rib;
		this.solde=solde;
		this.type=type;
		this.nomProprietaire=nomProprietaire;
		this.date_ouverture=date_ouverture;
	}
	
	//Guetter & Setter de chaque attribut 
	
		public int getRib() {
			return rib;
		}

		public void setRib(int rib) {
			this.rib = rib;
		}

		public double getSolde() {
			return solde;
		}

		public void setSolde(double solde) {
			this.solde = solde;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNomProprietaire() {
			return nomProprietaire;
		}

		public void setNomProprietaire(String nomProprietaire) {
			this.nomProprietaire = nomProprietaire;
		}

		public String getDate_ouverture() {
			return date_ouverture;
		}

		public void setDate_ouverture(String date_ouverture) {
			this.date_ouverture = date_ouverture;
		}
	
	//méthode pour débiter un compte
	public void débiter(double montant_debit){
		solde-=montant_debit;
		
		if(solde<montant_debit){
			System.out.println("Solde insuffisant !");
		}else{
			System.out.println("Opération effectué avec succès !");
		}
	}
	

	//méthode pour créditer un compte
	public void créditer(double montant_credit){
		solde+=montant_credit;
		if(solde<montant_credit){
			System.out.println("Solde insuffisant !");
		}else{
			System.out.println("Opération effectué avec succès !");
		}
	}
	
	//méthode permettant de fermer un compte
	@SuppressWarnings("null")
	public void fermerCompte(){
		Formatter c = null;
		c.close();
	}
	
	
	public static void main(String[] a){
		CompteBancaire compte = new CompteBancaire(1234567890,200000,"Compte Courant","HASSAN","23/01/2018");
		
		System.out.println("*************************");
		System.out.println("N° du compte : "+compte.getRib());
		System.out.println("Nom du propriétaire : "+compte.getNomProprietaire());
		System.out.println("Solde du compte : "+compte.getSolde());
		System.out.println("Type de compte : "+compte.getType());
		System.out.println("Date d'ouverture "+compte.getDate_ouverture());
		System.out.println("*************************");
		
		
		
		
	}
	
}
