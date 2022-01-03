package service;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Client {
	
	// Cr�ation fonction main 
	public static void main(String[] args) throws RemoteException, ServiceException {
		double convertion = convert(100);
		Compte compte = compteConsult(1);
		Compte[] listCompte= listCompte();
		System.out.print("############################Convertion############################");
		System.out.print("La convertion de la fonction convert est : "+ convertion);
		
		System.out.print("############################Infos sur compte 1############################");
		System.out.print("Le code du client est : "+ compte.getCode());
		System.out.print("Le solde du client est: "+ compte.getSolde());
		System.out.print("La date de creation du compte du client est: "+ compte.getDateCreation());
		
		System.out.print("############################List des comptes############################");
		for(int i=0;i<listCompte.length;i++) {
			System.out.print("Le solde du compte " + i+1 + " est :" + listCompte[i].getCode());
		}
	}
	
	// Cr�ation fonction convert 
	@SuppressWarnings("unused")
	private static double convert(double m) throws ServiceException, RemoteException {
		BanqueServiceServiceLocator service = new BanqueServiceServiceLocator();
		BanqueService port = service.getBanqueServicePort();
		return port.conversion(m);
	}
	
	// Cr�ation fonction compteConsult 
	@SuppressWarnings("unused")
	private static Compte compteConsult(int m) throws ServiceException, RemoteException {
		BanqueServiceServiceLocator service = new BanqueServiceServiceLocator();
		BanqueService port = service.getBanqueServicePort();
		return port.consulterCompte(m);
	}
	
	// Cr�ation fonction listCompte 
		@SuppressWarnings("unused")
		private static Compte[] listCompte() throws ServiceException, RemoteException {
			BanqueServiceServiceLocator service = new BanqueServiceServiceLocator();
			BanqueService port = service.getBanqueServicePort();
			return port.listComptes();
		}

}













