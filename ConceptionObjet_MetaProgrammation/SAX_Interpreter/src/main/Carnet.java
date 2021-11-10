package main;

import java.util.ArrayList;
import java.util.List;

public class Carnet
{
	
	private List<Contact> listContactes;
	
	private String type="";
	
	public void ajoutContact(Contact c)
	{
		this.listContactes.add(c);
	}
	
	public Carnet()
	{
		this.listContactes=new ArrayList<>();
		
	}

	public List<Contact> getListContactes() {
		return listContactes;
	}

	public void setListContactes(List<Contact> listContactes) {
		this.listContactes = listContactes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}