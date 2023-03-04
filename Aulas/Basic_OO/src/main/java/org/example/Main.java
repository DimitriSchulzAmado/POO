package org.example;

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 200;
        z2.vida = 100;

        z2.transfereVida(z1, 100);
    }
}