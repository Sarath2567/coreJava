package institute.threading;

public class MyThread2 implements Runnable{
    public void run(){
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("user thread value: "+ currentThread.getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        MyThread2 T=new MyThread2();
        Thread t=new Thread(T);
        t.start();
//        t.join();
//        t.run();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Main thread Value: "+t.currentThread().getName()+" "+i);
        }
    }
}
