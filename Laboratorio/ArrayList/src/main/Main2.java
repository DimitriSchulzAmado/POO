package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        /* Array List
         * Principal característica: Dinamic
        */

        ArrayList listaHeterogenea = new ArrayList();
        ArrayList <Integer> listInt = new ArrayList();

        // Add items to int structure
        listInt.add(5);
        listInt.add(4);
        listInt.add(3);
        listInt.add(2);
        listInt.add(1);

        // Print items from listIn - Format I
        System.out.println();

        // Print items from listInt - Format II
        System.out.println("INT LIST BEFORE SORT");
        for(int i = 0; i< listInt.size(); i++) {
            System.out.println("DADOS: " + listInt.get(i)); // HETEROGENEA
        }
        Collections.sort(listInt); // Sorting items
        Collections.reverse(listInt); // Sorting Items Reversely

        // Add items to structure
        listaHeterogenea.add(2);
        listaHeterogenea.add(true);
        listaHeterogenea.add("Dimitri");
        listaHeterogenea.add('A');

        // Print items - Format I
        System.out.println(listaHeterogenea);

        // Print items - Format II
        for(int i = 0; i< listaHeterogenea.size(); i++) {
            System.out.println("DADOS: " + listaHeterogenea.get(i)); // HETEROGENEA
        }
    }
}
