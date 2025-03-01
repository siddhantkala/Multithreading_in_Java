public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Run is called");
        System.out.println("State of run when called : "+currentThread().getName()+" "+currentThread().getState());
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyThread thread = new MyThread();
        System.out.println(thread.getName()+" In main "+thread.getState());
        thread.start();
        System.out.println(thread.getName()+" In main "+thread.getState());
        System.out.println(thread.getName()+" In main "+Thread.currentThread().getState());
        Thread.sleep(2000);
        System.out.println(thread.getName()+" In main "+thread.getState());
    }
}
