package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

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
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
	File file = new File("./src/carnet.xml");
	 handler = new SaxHandler();
	 saxParser.parse(file, handler); 
    }
	@Test
	void test() {
		
		SaxHandler handlerSax=(SaxHandler)handler;
		Carnet carnet=handlerSax.getCarnet();
		
		
		fail("Not yet implemented");
	}

}
