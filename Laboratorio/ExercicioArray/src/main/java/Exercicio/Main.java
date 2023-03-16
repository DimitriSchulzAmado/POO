package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner input = new Scanner(System.in);

        Escola escola = new Escola("Inatel", "Rua João Camargo", "50", "inatel@inatel.br", "2023");

        while(flag) {
            System.out.println("BEM VINDO " + escola.nome + " ---------");
            System.out.println("1 - Adicionar estudante");
        }

        input.close();
    }
}
