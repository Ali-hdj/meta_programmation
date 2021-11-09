package main;

public interface Visitor {

	public void  visiterOuvriere(Ouvriere o);
	public void visiterReine(Reine r);
	public void visiterSoldat(Soldat s);
	
}
