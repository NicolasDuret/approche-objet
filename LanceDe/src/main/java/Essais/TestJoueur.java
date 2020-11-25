package Essais;

import Entites.Joueur;

public class TestJoueur {
    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("Nicolas", 5);
        System.out.println(joueur1);
        joueur1.afficherJoueur(joueur1);
    }
}
