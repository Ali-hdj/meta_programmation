package main;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VisitorTest {

    @Test
    public void test() {
        Fourmiliere fourmiliere = new Fourmiliere();
        Reine r = new Reine();
        fourmiliere.addFourmis(r);
        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();
        Soldat soldat3 = new Soldat();
        Soldat soldat4 = new Soldat();
        Soldat soldat5 = new Soldat();
        Soldat soldat6 = new Soldat();
        fourmiliere.addFourmis(soldat1);
        fourmiliere.addFourmis(soldat2);
        fourmiliere.addFourmis(soldat3);
        fourmiliere.addFourmis(soldat4);
        fourmiliere.addFourmis(soldat5);
        fourmiliere.addFourmis(soldat6);
        Ouvriere ouvriere1 = new Ouvriere();
        Ouvriere ouvriere2 = new Ouvriere();
        Ouvriere ouvriere3 = new Ouvriere();
        Ouvriere ouvriere4 = new Ouvriere();
        Ouvriere ouvriere5 = new Ouvriere();
        fourmiliere.addFourmis(ouvriere1);
        fourmiliere.addFourmis(ouvriere2);
        fourmiliere.addFourmis(ouvriere3);
        fourmiliere.addFourmis(ouvriere4);
        fourmiliere.addFourmis(ouvriere5);
        VisitorStats v = new VisitorStats();
        v.visitFourmiliere(fourmiliere);
        assertTrue(v.nbReine==1);
        assertTrue(v.nbSoldat==6);
        assertTrue(v.nbOuvriere==5);

    }
}

