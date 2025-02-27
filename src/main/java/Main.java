public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        World world = new World();
        Thread t = new Thread(world);
        t.start();

        for(;;)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
