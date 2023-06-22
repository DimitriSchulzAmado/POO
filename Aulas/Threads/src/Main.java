import core.utilities.Contador1;
import core.utilities.Contador2;
import core.utilities.Contador3;

public class Main {
    public static void main(String[] args) {
        // Implementa e depois faz a Thread
        Contador1 cont1 = new Contador1();

        Thread th1 = new Thread(cont1);
        th1.start();

        // Outro jeito de fazer a implementação junto com a Thread
        Thread th2 = new Thread(new Contador2());
        th2.start();

        Thread th3 = new Thread(new Contador3());
        th3.start();
    }
}
