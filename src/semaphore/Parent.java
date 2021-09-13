package semaphore;

public class Parent extends Thread{
    private Account account;
    public Parent(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        try {
            for(int i = 0 ; i<100; i ++) {
                account.deposit(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
