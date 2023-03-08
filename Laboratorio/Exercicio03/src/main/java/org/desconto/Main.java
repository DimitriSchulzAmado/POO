package org.desconto;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double amountLiters, payGas, payAlcohol;
        char letter; // A = Alcohol | G = Gasoline

        // Input Data (reading a caractere)
        System.out.println("Fuel letter [A/G]: ");
        letter = input.next().charAt(0);

        System.out.println("How much liters? ");
        amountLiters = input.nextDouble();

        // Calculate and print the amount to be paid knowing that G = (6 reais) and (A = 4.90 reais)
        // Gasoline
        if(amountLiters <= 20 && (letter == 'G')) {
            // 0,04 the liter
            payGas = amountLiters * 6 - (amountLiters * 6) * 0.04;
            System.out.println("Total a pagar com 4% de desconto: R$" + payGas);

        }else if (letter == 'G') {
            //0,06 the liter
            payGas = amountLiters * 6 - (amountLiters * 6) * 0.06;
            System.out.println("Total a pagar com 6% de desconto: R$" + payGas);
        }

        // Alcohol
        if (amountLiters <= 20 && (letter == 'A')) {
            // 0,03 the liter
            payAlcohol = amountLiters * 4.90 - (amountLiters * 4.90) * 0.03;
            System.out.println("Total a pagar com 3% de desconto: R$" + payAlcohol);
        }else if(letter == 'A') {
            // 0,05 the liter
            payAlcohol = amountLiters * 4.90 - (amountLiters * 4.90) * 0.05;
            System.out.println("Total a pagar com 5% de desconto: R$" + payAlcohol);
        }
    }
}