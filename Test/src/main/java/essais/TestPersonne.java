package essais;

import entites.Address;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne personne1 = new Personne("Duret", "Nicolas", "20 rue de la rincais" );
        Personne personne2 = new Personne("Duret", "Nicolas", "20 rue de la rincais");
        System.out.println(personne1);
        System.out.println(personne2);
        personne1.afficherPersonne(personne1);
        personne1.setNom("toto");
    }

}
