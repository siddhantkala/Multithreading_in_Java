public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println(Thread.currentThread().getName());
        World world = new World();
        world.start();

        for(;;)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
