package MonCompte;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	public static void main(String[] args) {
			
			try {
				LocateRegistry.createRegistry(1099);
				CompteServeur Cs = new CompteServeur();
				System.out.println(Cs.toString());
				String chemin="rmi://127.0.0.1:1099/Cs";
				Naming.rebind(chemin, Cs);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
