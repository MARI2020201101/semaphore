package semaphore;

public class Child extends Thread{
    private Account account;
    public Child(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        try {
            for(int i = 0 ; i<100; i ++){
                account.withdraw(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
