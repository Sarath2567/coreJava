package institute.threading;
class Shop1 {

}
    /*
    public synchronized void ac(Shop2 tv) {
        System.out.println(Thread.currentThread().getName() +" :Locked Shop1.");
        try{
          Thread.sleep(100);
        }
        catch(Exception e){
        System.out.println(e);
        }
        tv.tv();
    }
}
class Shop2 {
    public synchronized void tv(){
        System.out.println(Thread.currentThread().getName()+" : Locked Shop2");
        try{
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public synchronized void callBack(Shop1 ac) {
        System.out.println(Thread.currentThread().getName() +" :Locked Shop2.");
        try{
          Thread.sleep(100);}
         catch (Exception e){
           System.out.println(e);
         }
    }
}
public class ThreadPra1 {
    public static void main(String[] args){
         Shop1 ac=new Shop1();
         Shop2 tv=new Shop2();
//         Thread task1 =new Thread(()->ac.ac(tv),"Thread-1");
//         Thread task2=new Thread(()->tv.callBack(ac),"Thread=2");
//         task1.start();
//       ''  task2.start();
    }
}
/*
class Account {
    int balance = 1000;
    String name;

    public Account(String name) {
        this.name = name;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class ThreadPra1 {
    public static void main(String[] args) {
        final Account acc1 = new Account("AccountA");
        final Account acc2 = new Account("AccountB");

        // Thread 1: Transfer from acc1 to acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) {
                System.out.println("Thread 1: Locked " + acc1.name);
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (acc2) {
                    System.out.println("Thread 1: Locked " + acc2.name);
                    acc1.withdraw(100);
                    acc2.deposit(100);
                    System.out.println("Thread 1: Transfer complete");
                }
            }
        });

        // Thread 2: Transfer from acc2 to acc1
        Thread t2 = new Thread(() -> {
            synchronized (acc2) {
                System.out.println("Thread 2: Locked " + acc2.name);
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (acc1) {
                    System.out.println("Thread 2: Locked " + acc1.name);
                    acc2.withdraw(200);
                    acc1.deposit(200);
                    System.out.println("Thread 2: Transfer complete");
                }
            }
        });

        t1.start();
        t2.start();
    }
}*/

