package main;

import java.util.HashMap;
import java.util.Map;

public class Contact {
	private String nom;
    private String numerotel;
    private String adresse;
    
    private Map<String,String> infomrmations;
    
    
    public Contact(String nom,String numerotel)
    {
    	this.nom=nom;
    	this.numerotel=numerotel;
    	this.infomrmations=new HashMap<>();
    	
    }
    
    public  void ajoutInformation(String nomInfo,String valInfo)
    {
    	this.infomrmations.put(nomInfo, valInfo);
    	
    }
    
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumerpt() {
		return numerotel;
	}
	public void setNumerpt(String numerotel) {
		this.numerotel = numerotel;
	}

    
    
}
