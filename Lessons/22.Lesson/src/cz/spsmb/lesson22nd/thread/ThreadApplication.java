package cz.spsmb.lesson22nd.thread;

public class ThreadApplication {

    public static void main(String[] args) throws InterruptedException {
        CounterThread counterThread0 = new CounterThread();
        CounterThread counterThread1 = new CounterThread();
        CounterThread counterThread2 = new CounterThread();
        CounterThread counterThread3 = new CounterThread();

        counterThread0.start();
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();

        counterThread0.join();
        counterThread1.join();
        counterThread2.join();
        counterThread3.join();

        System.out.println(CounterThread.count);

    }
}
