package utils;
import java.lang.System;

public class ConversionNombre {
    String nombreEntier = "5";
    int nbEntier;



    public int affichageValue(){
        nbEntier = Integer.parseInt(nombreEntier);
        return nbEntier;
    }
    public static int  calculMax(int a, int b){
        return Math.max(a, b);
    }
}