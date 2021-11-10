package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler {
    private static final String NOM = "nom";
    private static final String NUMERO = "numero";


    private Carnet carnet;
    private StringBuilder elementValue;
    private boolean flagInformations=false; // flag information à la lecture de la balise informations 
    private Contact contactEnCours; // le contact actuel en cours de construction 

    
   public Carnet getCarnet()
    {
		return carnet;
    	
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() throws SAXException {
    	carnet = new Carnet();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attributs) throws SAXException {
    		
    	Map<String,String> atributsMapping=new HashMap<>();
    	for (int index = 0; index < attributs.getLength(); index++){
    		atributsMapping.put(attributs.getLocalName (index), attributs.getValue (index));
    																}
    	
    	switch(qName)
    	{
    	case "Contact":
    		this.contactEnCours=new Contact(atributsMapping.get("nom"),atributsMapping.get("numero"),atributsMapping.get("adresse"));
    		break;
    	case "Type":this.carnet.setType(atributsMapping.get("type"));
    		break;
    	case "Informations": this.flagInformations=true;
    		break;
    	default:
    		if(this.flagInformations) {
    		this.contactEnCours.ajoutInformation(qName,attributs.getValue (0));}
    		break;
    	}
    	
        }
    

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Carnet":
            	 System.out.println("Carnet crée");
                 break;
            case "Contact":
            	this.carnet.ajoutContact(this.contactEnCours);
                System.out.println("contact ajouté au carnet ");
                break;
            case "Informations":this.flagInformations=false;
            	break;
        }
    }


}