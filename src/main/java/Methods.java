public class Methods extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.start();
        System.out.println("Start "+m.getState());
        m.interrupt();
        System.out.println("Interrupted "+m.getState());
    }
}
