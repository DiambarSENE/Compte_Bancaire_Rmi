package Metier;

public class Compte {
	private int numeroCompte;
	private String typeCompte;
	private double solde=50000.0;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(int numeroCompte, String typeCompte, double solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.typeCompte = typeCompte;
		this.solde = solde;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
}
