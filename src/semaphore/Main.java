package semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(0);
        Parent parent = new Parent(account);
        Child child = new Child(account);
        parent.start();
        child.start();

    }
}
