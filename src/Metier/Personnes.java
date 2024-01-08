package Metier;

public class Personnes {
	private int identifiant;
	private String nom;
	private String prenom;
	private int numeroCompte;
	public Personnes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personnes(int identifiant, String nom, String prenom,int numeroCompte) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCompte = numeroCompte;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	
	
}
