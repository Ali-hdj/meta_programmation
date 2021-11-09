package main;

import java.util.ArrayList;
import java.util.List;

public class Fourmilliere {

	List<Fourmi> fourmis =new ArrayList<>();

	public List<Fourmi> getFourmis() {
		return fourmis;
	}

	public void setFourmis(List<Fourmi> fourmis) {
		this.fourmis = fourmis;
	}

	public Fourmilliere(List<Fourmi> fourmis) {
		super();
		this.fourmis = fourmis;
	}
	
	
	
}
