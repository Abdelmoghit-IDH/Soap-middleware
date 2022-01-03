package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.Compte;


@WebService()
public class BanqueService {
	//Declaration des comptes 
	Compte compte1, compte2,compte3;
	List<Compte> listCompte;
	 
	//Constracteur
    public BanqueService(){
    	String pattern = "yyyy-MM-dd";
    	Date date1 = null;
    	Date date2 = null;
    	Date date3 = null;
    	try {
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    		date1 = (Date) simpleDateFormat.parse("2022-1-4");
    		date2 = (Date) simpleDateFormat.parse("2022-12-29");
    		date3 = (Date) simpleDateFormat.parse("2022-5-10");
    	}catch(java.text.ParseException e) {
    		e.printStackTrace();
    	}

        //Creation des trois fonctions pour tester le web service
        compte1 = new Compte(1,2392,date1);
        compte2 = new Compte(2,38223,date2);
        compte3 = new Compte(3,99472,date3);
        
        // List the compte
        listCompte = List.of(compte1,compte2,compte3);
    }
    
    @WebMethod(operationName="conversion")
    public double conversion(double montant){
    	double nouveauMontant = compte1.getSolde() - montant;
        return nouveauMontant;
    }

    @WebMethod(operationName="consulterCompte")
    public Compte consulterCompte(int code){
        return listCompte.get(code-1);
    }

    @WebMethod(operationName="listComptes")
    public List<Compte> listComptes(){
        return listCompte;
    }
}
