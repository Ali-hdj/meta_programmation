package main;

public class GestionVieVisitor implements Visitor {

	@Override
	public void visiterOuvriere(Ouvriere o) {
		
		if(o.getAge()>o.getAgeMax())
		{
			o.setVivante(false);
		}
		
	}

	@Override
	public void visiterReine(Reine r) {
		if(r.getAge()>r.getAgeMax())
		{
			r.setVivante(false);
		}	
		
	}

	@Override
	public void visiterSoldat(Soldat s) {
		if(s.getAge()>s.getAgeMax())
		{
			s.setVivante(false);
		}
	}
	

}
