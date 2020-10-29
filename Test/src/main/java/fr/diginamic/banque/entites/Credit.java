package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.Operation;

import java.util.Date;

public class Credit extends Operation{
    public Credit(String dateOpération, int montant) {
        super(dateOpération, montant);
    }
}
