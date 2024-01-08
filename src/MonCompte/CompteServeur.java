package MonCompte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import Metier.Compte;


public class CompteServeur extends UnicastRemoteObject implements ICompte{

	private static final long serialVersionUID = 1L;
	
	List<Compte> listeCompte = new ArrayList<Compte>();

	protected CompteServeur() throws RemoteException {
		super();
		Compte cp = new  Compte(2,"courant", 50000.0);
		listeCompte.add(cp);
	}

	double solde = 0.0;
	@Override
	public double debiter(int numCompte, double montantRetirer) throws RemoteException {
		for(Compte C : listeCompte) {
			if(numCompte == C.getNumeroCompte()) {
				if(montantRetirer > C.getSolde()) {
					System.out.println("le montant de votre compte ne vous permet pas d'effectuer ce retrait");
				}else {
				  solde = C.getSolde() - montantRetirer;
				  C.setSolde(solde);
				}
			}
		
		}
		
		return solde;
	}

	@Override
	public double crediter(int numCompte, double montantVerser) throws RemoteException {
		for(Compte C : listeCompte) {
			if(numCompte == C.getNumeroCompte()) {
				solde = C.getSolde() + montantVerser;
			}
		}
		return solde;
	}
	
}
