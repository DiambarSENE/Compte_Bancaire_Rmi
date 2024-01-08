package MonCompte;

import java.rmi.Naming;

public class Client {
	
		public static void main(String[] args) {
				
				try {
						ICompte stub = (ICompte)Naming.lookup("rmi://127.0.0.1:1099/Cs");
						System.out.println("montant debuter " +stub.debiter(2,10000.0));
						System.out.println("montant verser " +stub.crediter(2, 25000.0));
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}	
}
