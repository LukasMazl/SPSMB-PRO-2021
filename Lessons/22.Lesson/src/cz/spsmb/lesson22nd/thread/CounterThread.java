package cz.spsmb.lesson22nd.thread;

public class CounterThread extends Thread {

    public static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 500_000; i++) {
            synchronized (CounterThread.class) {
                count = count + 1;
            }
        }
    }
}
