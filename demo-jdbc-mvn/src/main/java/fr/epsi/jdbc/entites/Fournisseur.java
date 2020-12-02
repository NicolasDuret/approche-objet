package fr.epsi.jdbc.entites;

public class Fournisseur {

    private int id;
    private String nom;

    public Fournisseur(int id, String nom){
        this.id = id;
        this.nom=nom;
    }

    @Override
    public String toString() {
        return "|| ID: " + id + " nom: '" + nom + "|| \n";
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}
