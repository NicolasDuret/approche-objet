package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();

        for (int i=1;i<=100;i++) {
            array.add(i);
            System.out.println(i);
        }
        System.out.println("Taille : " + array.size());
    }


}