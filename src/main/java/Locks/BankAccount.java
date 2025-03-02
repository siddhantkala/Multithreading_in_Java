package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        if(lock.tryLock())
        {
            System.out.println(Thread.currentThread().getName()+" acquired lock");
            if(balance>=amount)
            {
                try {
                    System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
                    Thread.sleep(10000);
                    balance-=amount;
                    System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance is "+balance);
                } catch (InterruptedException e) {
                }
                finally {
                    lock.unlock();
                }
            }
            else
            {
                System.out.println(Thread.currentThread().getName()+" insufficient balance");
            }
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" Couldn't acquire lock, will try later");
        }
    }

}
