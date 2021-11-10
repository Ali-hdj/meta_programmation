package main;

import java.util.HashMap;
import java.util.Map;

public class Contact {
	private String nom;
    private String numerotel;
    private String adresse;
    
    private Map<String,String> infomrmations;
    
    
    public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Map<String, String> getInfomrmations() {
		return infomrmations;
	}

	public void setInfomrmations(Map<String, String> infomrmations) {
		this.infomrmations = infomrmations;
	}

	public Contact(String nom,String numerotel,String adresse)
    {
    	this.nom=nom;
    	this.numerotel=numerotel;
    	this.infomrmations=new HashMap<>();
    	this.adresse=adresse;
    	
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
	public String getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(String numerotel) {
		this.numerotel = numerotel;
	}

    
    
}
