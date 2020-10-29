package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tab = new Operation[4];
        float montantGlobal;
        tab[0] = new Credit("22/08/1999", 19999);
        tab[1] = new Debit("22/08/1999", 19999);
        tab[2] = new Credit("28/01/1999", 19999);
        tab[3] = new Debit("28/01/1999", 19999);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " type " + tab[i].afficherType());

        }
        montantGlobal = tab[0].getMontant() + tab[1].getMontant() - tab[2].getMontant() - tab[3].getMontant();
        System.out.println("Montant : " + montantGlobal);

    }
}