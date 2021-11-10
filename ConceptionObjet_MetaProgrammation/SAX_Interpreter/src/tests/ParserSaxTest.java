package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import junit.framework.Assert;
import main.Carnet;
import main.SaxHandler;

class ParserSaxTest {
	
	 DefaultHandler handler;
	 
    @Before
    public void init() throws ParserConfigurationException, SAXException, IOException {
	
	
    }
	@Test
	void test() throws ParserConfigurationException, SAXException, IOException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		File file = new File("./src/carnet.xml");
		 handler = new SaxHandler();
		 saxParser.parse(file, handler);
		SaxHandler handlerSax=(SaxHandler)handler;
		Carnet carnet=handlerSax.getCarnet();
		
		assertTrue(carnet.getListContactes().size()!=0);
		assertTrue(carnet.getListContactes().size()==3);
		
		// vérification du premier contact 
		assertTrue(carnet.getListContactes().get(0).getNom().equals("ali"));
		assertTrue(carnet.getListContactes().get(0).getNumerotel().equals("0668392121"));
		assertEquals(carnet.getListContactes().get(0).getAdresse(),"07 rue hoche 29200 brest");
		Map<String,String> infosContact=carnet.getListContactes().get(0).getInfomrmations();
		assertEquals(infosContact.get("sport"),"football");
		assertEquals(infosContact.get("etudes"),"informatique");
		assertEquals(infosContact.get("niveau"),"bac+5");
		
		// vérification du 2eme contact
		infosContact=carnet.getListContactes().get(1).getInfomrmations();
		assertTrue(carnet.getListContactes().get(1).getNom().equals("tibolt"));
		assertTrue(carnet.getListContactes().get(1).getNumerotel().equals("0668391777"));
		
		infosContact=carnet.getListContactes().get(2).getInfomrmations();
		assertEquals(infosContact.get("sport"),null);
		assertEquals(infosContact.get("etudes"),"chimie");
		assertEquals(infosContact.get("niveau"),"bac+2");
		
		// vérification du 3eme contact
		assertTrue(carnet.getListContactes().get(2).getNom().equals("noel"));
		assertTrue(carnet.getListContactes().get(2).getNumerotel().equals("0778391221"));
		

	}

}
