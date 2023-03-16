package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner input = new Scanner(System.in);
        School escola = new School("Inatel", "Rua João Camargo", "50", "inatel@inatel.br", "2023");

        boolean flag = true;

        while(flag) {
            System.out.println("BEM VINDO " + escola.name + " ---------");
            System.out.println("1 - Adicionar estudante");
            System.out.println("2 - ");
        }

        input.close();
    }
}
