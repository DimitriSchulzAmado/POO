package main;

public class Funcionario implements Comparable<Funcionario> {
    private String name;
    private int age;
    private float salary;

    // Constructor
    public Funcionario(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary(){
        return salary;
    }

    // Compare Method
    @Override
    public int compareTo(Funcionario func) {
        return Float.compare(this.salary,func.getSalary());
    }
}
