package org.desconto;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double qtdLitros, payment;
        String type; // A = Alcool | G = Gasolina

        System.out.println("Qtd de litros vendidos: ");
        qtdLitros = input.nextDouble();

        System.out.println("Tipo de Combustivel [A/G]: ");
        type = input.nextLine();

        // Gasolina
        if(qtdLitros <= 20) {
            // 0,04 por litro
        }else {
            //0,06 por litro
        }

        // Alcool
        if (qtdLitros <= 20) {
            // 0,03 por litro
        }else {
            // 0,05 por litro
        }

        // Calcular e imprimir o valor a ser pago sabendo que G = (6 reais) e (A = 4,90 reais)
    }
}