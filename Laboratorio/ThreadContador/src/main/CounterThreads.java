package main;

//public class CounterThreads extends Thread
public class CounterThreads implements Runnable{
    // Thread class attributes
    private String nome;
    private int id;

    CounterThreads(String nome, int id){
        // Constructor
        this.nome = nome;
        this.id = id;
    }

    // Method that allows operating the class as a thread
    @Override
    public void run(){
        // Logic responsible for counting from 0 to 100
        for (int i = 0; i < 100; i++) {
            System.out.println("NOME DA THREAD: "+this.nome+" ID: "+this.id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("CONTAGEM: "+i);
        }
    }
}

