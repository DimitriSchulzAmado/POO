package core.utilities;

public class Contador1 implements Runnable {
    @Override
    public void run() {
        int cont = 10;

        for (int i = 0; i < cont; i++) {
            System.out.println(i);
        }
    }
}
