package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListInt {
    public static void main(String args[]) {
        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(-1);
        listInt.add(5);
        listInt.add(7);
        listInt.add(3);
        listInt.add(-2);
        listInt.add(4);
        listInt.add(8);
        listInt.add(5);

        System.out.println(listInt);
        System.out.println("Taille : " + listInt.size());

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < listInt.size(); i++){
            if(listInt.get(i) > maxVal)
                maxVal = listInt.get(i);
            if(listInt.get(i) < minVal)
                minVal = listInt.get(i);
        }
        System.out.println("Max : " + maxVal + " Min : " + minVal);
        listInt.remove((Integer)minVal);
        System.out.println("Après suppression de minVal" + listInt);

        int entierNegatif = 0;
        for(int i = 0; i < listInt.size(); i++){
            if(listInt.get(i) < 0){
                entierNegatif = Math.abs(listInt.get(i));
                listInt.set(i, entierNegatif);
            }
        }
        System.out.println("Après conversion" + listInt);

    }
}