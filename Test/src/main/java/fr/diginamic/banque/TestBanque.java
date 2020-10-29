package fr.diginamic.banque;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args){
    Compte[] tab = new Compte[2];
    tab[0] = new Compte (1999,19999 );
    tab[1] = new CompteTaux(152552,100000, 99);

    for (int i=0; i<tab.length; i++){
        System.out.println(tab[i]);
    }
    }
}
