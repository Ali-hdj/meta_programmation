package main;

public interface Visitor {

	public void  visiterOuvriere(Ouvriere o);
	public void visiterReine(Reine r);
	public void visiterSoldat(Soldat s);
	public void visiterFourmis(Fourmis f);
	public void visiterFourmiliere(Fourmiliere f);
	
}
