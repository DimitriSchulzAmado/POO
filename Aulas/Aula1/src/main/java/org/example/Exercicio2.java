package org.example;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // Declarando o tipo de entrada
        Scanner io = new Scanner(System.in);

        int NPA = io.nextInt();
        int NFA = 0;

        //Nota necessária para aprovação
        if(NPA >= 60) {
            System.out.println("Approved");
        } else if (NPA >= 30 && NPA < 60) {
            System.out.println("Insert NP3 point: ");
            int NP3 = io.nextInt();
            int nota = ((NP3 + NPA)/2);

            if(nota >= 50) {
                System.out.println("Approved");
            }else {
                System.out.println("Reproved");
            }
        }

    }
}
