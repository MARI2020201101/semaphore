package semaphore;

import java.util.concurrent.Semaphore;

public class Account {
    private int balance;
    private Semaphore semaphore;

    public Account(int balance) {
        this.balance = balance;
        this.semaphore = new Semaphore(1);
    }

    public void deposit(int money) throws InterruptedException {
        semaphore.acquire();
        System.out.println("I have money : " + balance);
        int temp = money;
        Thread.sleep(100);
        balance+=temp;
        semaphore.release();
    }

    public void withdraw(int money) throws InterruptedException {
        semaphore.acquire();
        System.out.println("I have money : " + balance);
        int temp = money;
        Thread.sleep(100);
        balance-=temp;
        semaphore.release();
    }

    public void printBalance(){
        System.out.println("I have money : " + balance);
    }
}
