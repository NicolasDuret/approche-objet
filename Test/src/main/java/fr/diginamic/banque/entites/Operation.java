package fr.diginamic.banque.entites;

import java.util.Date;

public abstract class Operation {
    String dateOpération;
    int montant;

    public Operation(String dateOpération, int montant) {
        this.dateOpération = dateOpération;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "dateOpération='" + dateOpération + '\'' +
                ", montant=" + montant +
                '}';
    }

    public abstract class afficherType {

    }
}
