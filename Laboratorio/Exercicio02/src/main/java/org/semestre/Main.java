package org.semestre;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double np1, np2;

        System.out.println("Entre com a nota do primeiro semestre: ");
        np1 = input.nextDouble();

        System.out.println("Entre com a nota do segundo semestre: ");
        np2 = input.nextDouble();

        System.out.println("Média final do aluno: " + (np1 + np2) / 2);
    }
}