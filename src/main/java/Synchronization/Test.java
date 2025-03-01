package Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        //System.out.println(t1.getState());
        t1.start();
        t2.start();
        //System.out.println(t1.getState());
        //System.out.println(counter.getCount());
        //System.out.println(t1.getState());
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(t1.getState());
        System.out.println(counter.getCount());
//        System.out.println(Thread.currentThr8ead().getName());
//        System.out.println(Thread.currentThread().getState());
    }
}