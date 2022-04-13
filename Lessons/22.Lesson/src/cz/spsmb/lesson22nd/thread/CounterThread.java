package cz.spsmb.lesson22nd.thread;

public class CounterThread extends Thread {

    public static int counter = 0;

    @Override
    public void run() {
       for(int i = 0; i < 5_000_000; i++) {
           synchronized (CounterThread.class) {
               counter = counter + 1;
           }
       }
    }
}
