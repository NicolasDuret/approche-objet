package fr.diginamic.banque.entites;

import entites.Personne;

public class Compte {
    int numeroDeCompte;
    int soldeDuCompte;

    public Compte(int numeroDeCompte, int soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;

    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", soldeDuCompte=" + soldeDuCompte +
                '}';
    }
}
