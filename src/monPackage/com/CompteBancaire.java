package monPackage.com;

import java.util.Formatter;

public class CompteBancaire{

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
		
		if(solde<montant_debit){
			System.out.println("==> Solde insuffisant !");
		}else{
			solde = solde-montant_debit;
			System.out.println("le solde est : "+solde+"\n==> Opération effectuée avec succès !");
		}
	}
	

	//méthode pour créditer un compte
	public void créditer(double montant_credit){
		if(solde<montant_credit){
			System.out.println("==> Solde insuffisant !");
		}else{
			solde=solde+montant_credit;
			System.out.println("le solde est : "+solde+"\n==> Opération effectuée avec succès !");
		}
	}
	
	//méthode permettant de fermer un compte
	@SuppressWarnings("null")
	public void fermerCompte(){
		Formatter c=null;
		c.close();
	}
	
	
	
	public static void main(String[] a){
		
	try{	
		CompteBancaire compte = new CompteBancaire(1234567890,300000,"Compte Courant","HASSAN","23/01/2018");
		
		
		System.out.println("*************************");
		System.out.println("N° du compte : "+compte.getRib());
		System.out.println("Nom du propriétaire : "+compte.getNomProprietaire());
		System.out.println("Solde du compte : "+compte.getSolde());
		System.out.println("Type de compte : "+compte.getType());
		System.out.println("Date d'ouverture : "+compte.getDate_ouverture());
		System.out.println("*************************");
		
		
		
		System.out.println("Solde débité de 100000 fcfa :");
		compte.débiter(100000);
		System.out.println("----------------------------");
		System.out.println("Solde débuté de 400000 fcfa :");
		compte.créditer(400000);
		
		System.out.println("##########################");
		System.out.println("Solde crédité de 200000 fcfa :");
		compte.créditer(200000);
		System.out.println("----------------------------");
		System.out.println("Solde crédité de 500000 fcfa :");
		compte.créditer(500000);
		
		System.out.println("----------------------------");
		System.out.println("Fermeture du compte :");
		compte.fermerCompte();
	}catch(Exception e){
		System.out.println("==> Compte fermé");
	}
	}
	
}
