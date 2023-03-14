/*
        // Array de primitivos
        // char, float, double, int

        char[] arrayDeChars;
        int[] arrayDeInts = {0, 1, 2, 3}; // Array preenchido
        float[] arrayDeFloat;
        double[] arrayDeDouble;

        // Array de referencia
        String[] arrayDeString;

        // Mostrando uma posição do array
        System.out.println("2° Posição array de inteiros: " + arrayDeInts[1]);

        // Mostrando todas as posições do array
        for (int i = 0; i < arrayDeInts.length; i++) {
            System.out.println("Valor da posição ["+i+"] é = " + arrayDeInts[i]);
        }
 */

public class Main {
    public static void main(String[] args) {

        // Criando um array de referencia para Contas
        Conta[] contas = new Conta[5];

        // Atribuindo contas
        Conta c1 = new Conta(234.56f,"3452-0");
        Conta c2 = new Conta(1300.45f,"9090-8");

        contas[0] = c1;
        contas[1] = c2;

        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null){
                contas[i].mostraInfos();
            }
        }
    }
}
