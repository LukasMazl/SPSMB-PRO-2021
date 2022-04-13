package cz.spsmb.lesson22nd.thread;

public class ThreadApplication {

    public static void main(String[] args) throws InterruptedException {
        CounterThread thread0 = new CounterThread();
        CounterThread thread1 = new CounterThread();
        CounterThread thread2 = new CounterThread();
        CounterThread thread3 = new CounterThread();

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        thread0.join();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(CounterThread.counter);
    }
}
