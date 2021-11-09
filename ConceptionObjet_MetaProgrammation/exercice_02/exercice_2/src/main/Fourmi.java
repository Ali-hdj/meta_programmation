package main;

public class Fourmi implements AccepterUnVisiteur{

	private int age;
	private boolean vivante;
	private int ageMax;
	
	
	
	
	public Fourmi(int age, boolean vivante, int ageMax) {
		super();
		this.age = age;
		this.vivante = vivante;
		this.ageMax = ageMax;
	}




	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	

}
