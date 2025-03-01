package Synchronization;

public class Thread extends java.lang.Thread {
    private Counter counter;
    public Thread(Counter counter)
    {
        this.counter=counter;
    }

    @Override
    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            counter.increment();
        }
    }
}