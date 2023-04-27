package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList listaHeterogenea = new ArrayList();
        ArrayList <Integer> listInt = new ArrayList();
        ArrayList <Funcionario> funcionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario("Dimitri", 19, 590.4F);
        Funcionario func2 = new Funcionario("Pedro", 20, 1240.4F);
        Funcionario func3 = new Funcionario("Luna", 19, 10000.4F);

        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func1);

        Collections.sort(funcionarios);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("NAME: " + funcionarios.get(i).getName() + " AGE: " + funcionarios.get(i).getAge() + "SALARY: " + funcionarios.get(i).getSalary());
        }
    }
}
