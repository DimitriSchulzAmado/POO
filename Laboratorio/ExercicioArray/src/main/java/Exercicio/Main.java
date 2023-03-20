package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner input = new Scanner(System.in);
        School school = new School("Inatel", "Rua João Camargo", "50", "inatel@inatel.br", "2023");

        boolean flag = true; // While control flag

        while(flag) {
            System.out.println("--- WELCOME " + school.name + " ---");
            System.out.println("1 - Students Login");
            System.out.println("2 - Show Students info");
            System.out.println("3 - Mostrar quantidade de estudantes por ano");
            System.out.println("4 - System out");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1 -> {
                    // Criando o estudante que será adicionado no array de estudantes
                    System.out.println("Nome do aluno: ");
                    String name = input.nextLine();
                    System.out.println("Idade do aluno: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Ano letivo do aluno: ");
                    String schoolYear = input.nextLine();

                    // Criando um estudante
                    Student e = new Student(name, age, schoolYear);

                    // Adicionando estudante criado na escola
                    school.addEstudante(e);
                }
                case 2 -> school.mostraInfo(); // Mostrando as informações da escola e dos estudantes
                case 3 -> school.qtdEstudanteAno();// Quantidade de aluno por ano letivo
                case 4 -> flag = false;
                default -> System.out.println("Invalid Action !!");
            }
        }

        input.close(); // Fechando entrada de dados
    }
}
