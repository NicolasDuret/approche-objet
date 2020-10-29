package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.Operation;

import java.util.Date;

public class Debit extends Operation{
    public Debit(String dateOpération, int montant) {
        super(dateOpération, montant);
    }
}
