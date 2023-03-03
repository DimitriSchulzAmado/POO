package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Input data
        StringBuilder expo = new StringBuilder(); // To Append

        int first, second; // 1° e 2° numero
        int choice; // Escolha menu

        System.out.println("Entre com o primeiro número: ");
        first = input.nextInt();

        System.out.println("Entre com o segundo número: ");
        second = input.nextInt();

        System.out.println("Escolha um número: \n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n" +
                "5 - Exponencial"
        );

        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("A soma é: " + (first + second));
                break;

            case 2:
                System.out.println("A subtração é: " + (first - second));
                break;

            case 3:
                System.out.println("A multiplicação é: " + (first * second));
                break;

            case 4:
                System.out.println("A divisão é: " + (first / second));
                break;

            case 5:
                System.out.println(expo.append("A exponencial de ").append(first).append(" elevado a ").append(second)
                        .append(" é: ").append(Math.pow(first, second))
                );
                break;
        }
    }
}