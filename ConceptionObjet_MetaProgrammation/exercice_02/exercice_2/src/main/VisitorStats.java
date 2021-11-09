package main;

public class VisitorStats implements Visitor {

    int nbReine;
    int nbSoldat;
    int nbOuvriere;
    @Override
    public void visitFourmis(Fourmis f) {
        switch(f.getClass().toString()){
            case "class Reine":
                nbReine++;
                break;
            case "class Soldat":
                nbSoldat++;
                break;
            case "class Ouvriere":
                nbOuvriere++;
                break;
        }
    }

    @Override
    public void visitFourmiliere(Fourmiliere f) {

        for(int i = 0; i< f.fourmis.size(); i++){
            this.visitFourmis(f.fourmis.get(i));
        }

    }
}

