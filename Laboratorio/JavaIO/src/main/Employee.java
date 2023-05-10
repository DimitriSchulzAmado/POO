package main;

public class Employee {
    private String name;
    private double salary;
    private int age;

    // Constructor
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
