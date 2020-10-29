package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {
    int tauxderémunération;

    public CompteTaux(int numeroDeCompte, int soldeDuCompte, int tauxderémunération) {
        super(numeroDeCompte, soldeDuCompte);
        this.tauxderémunération = tauxderémunération;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "tauxderémunération=" + tauxderémunération +
                ", numeroDeCompte=" + numeroDeCompte +
                ", soldeDuCompte=" + soldeDuCompte +
                '}';
    }
}
