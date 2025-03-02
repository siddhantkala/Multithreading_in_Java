package Locks;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        if(balance>=amount)
        {
            System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance is "+balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }

}
