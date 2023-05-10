package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create file
        File arq = new File();

        // Presenting employee information
        ArrayList<Employee> foundEmployee;

        // Creating a menu to make the application dynamic
        // while flag
        boolean flag = true;

        // User choice option
        int option;

        // Input Data
        Scanner sc = new Scanner(System.in);

        while(flag){
            foundEmployee = arq.readFile();

            System.out.println("++++ BEM VINDO(A) AO MENU ++++");
            System.out.println("1- CADASTRAR FUNCIONÁRIO");
            System.out.println("2- LISTAR OS FUNCIONÁRIOS");
            System.out.println("3- SAIR DA APLICAÇÃO");
            option = sc.nextInt(); // Entering at User's Choice
            sc.nextLine(); // Clearing the buffer

            switch (option){
                case 1:
                    // Adding an Employee to the File
                    String name;
                    double salary;
                    int age;

                    System.out.println("Nome: ");
                    name = sc.nextLine();

                    System.out.println("Salário: ");
                    salary = sc.nextDouble();

                    System.out.println("Idade: ");
                    age = sc.nextInt();

                    // Creating the employee
                    Employee func = new Employee(name, salary, age);

                    // Writing this employee's information into the file
                    arq.writeFile(func);
                    break;
                case 2:
                    // Presenting employee information
                    for (int i = 0; i < foundEmployee.size(); i++) {
                        System.out.println("NOME: "+foundEmployee.get(i).getName());
                        System.out.println("SALÁRIO: "+foundEmployee.get(i).getSalary());
                        System.out.println("IDADE: "+foundEmployee.get(i).getAge());
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }

        sc.close(); // Close input data

    }
}