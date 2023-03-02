package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int burger = in.nextInt();
        int burger2 = in.nextInt();
        int burger3 = in.nextInt();

        int sum = burger + burger2 + burger3;

        System.out.println("media burgers: " + (sum/3));

        in.close();
    }
}