package main;

public class Main {
    public static void main(String[] args) {
        // Instantiating 3 counter threads - Interface
        CounterThreads tc1 = new CounterThreads("Thread 1",1);
        CounterThreads tc2 = new CounterThreads("Thread 2",3);
        CounterThreads tc3 = new CounterThreads("Thread 3",3);

        // Create 3 objects of type Thread
        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);

        // Execute the threads
        t1.start();
        t2.start();
        t3.start();

        /* HERANÇA

        // Instantiating 3 counter threads
        ThreadCount t1 = new ThreadCount("Thread 1",1);
        ThreadCount t2 = new ThreadCount("Thread 2",3);
        ThreadCount t3 = new ThreadCount("Thread 3",3);

        // Execute the threads
        t1.start();
        t2.start();
        t3.start();

        */

    }
}
