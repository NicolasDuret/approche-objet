package fr.diginamic.banque;

import fr.diginamic.banque.entites.ObjetGeometrique;
import fr.diginamic.banque.entites.Rectangle;
import fr.diginamic.banque.entites.Cercle;


public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] tab = new ObjetGeometrique[2];
        tab[0] = new Cercle(5);
        tab[1] = new Rectangle(5, 10);


        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
