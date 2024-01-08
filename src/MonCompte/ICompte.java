package MonCompte;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICompte extends Remote{
	public double debiter(int numCompte, double montantRetirer) throws RemoteException;
	public double crediter(int numCmopte, double montantVerser) throws RemoteException;

}
