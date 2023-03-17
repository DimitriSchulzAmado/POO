import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cantina cantina = new Cantina();
        Salgado[] salgados = new Salgado[3];

        System.out.println("Peça os seus salgados aqui (máximo 3 por pessoa)");
        for (int i = 0; i < salgados.length; i++) {
            salgados[i] = new Salgado(input.nextLine());
            cantina.addSalgado(salgados[i]);
        }
        cantina.mostraInfo();
    }
}
