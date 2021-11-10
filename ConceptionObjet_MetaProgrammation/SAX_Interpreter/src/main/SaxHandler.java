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
    private boolean flagInformations=false;
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
    		
    	System.out.println("uri"+ uri+" lName "+lName+" qName "+qName);
    	Map<String,String> atributsMapping=new HashMap<>();
    	
    	for (int index = 0; index < attributs.getLength(); index++) {
   		atributsMapping.put(attributs.getLocalName (index), attributs.getValue (index));   		 }
    	
    	switch(qName)
    	{
    	case "Contact":
    		this.contactEnCours=new Contact(atributsMapping.get("nom"),atributsMapping.get("numero"));
    		this.carnet.ajoutContact(this.contactEnCours);
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
            	 System.out.println("end carnet ");
                break;
            case "Contact":
                System.out.println("end contact ");
                break;
            case "Informations":this.flagInformations=false;
            	break;
        }
    }


}