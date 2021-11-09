package main;

public class Fourmi implements AccepterUnVisiteur{

	private int age;
	private boolean vivante;
	private int ageMax;
	
	
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public boolean isVivante() {
		return vivante;
	}




	public void setVivante(boolean vivante) {
		this.vivante = vivante;
	}




	public int getAgeMax() {
		return ageMax;
	}




	public void setAgeMax(int ageMax) {
		this.ageMax = ageMax;
	}




	public Fourmi(int age, boolean vivante, int ageMax) {
		super();
		this.age = age;
		this.vivante = vivante;
		this.ageMax = ageMax;
	}




	@Override
	public void accept(Visitor v) {
		
		
	}
	

}
