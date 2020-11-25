package Entites;

public class Joueur {
    String nom;
    int Score;

    public Joueur(String nom, int Score) {
        this.nom = nom;
        this.Score = Score;
    }

    public void afficherJoueur(Joueur joueur){
        System.out.println(joueur.nom);
    }
}
