package institute.threading;

public class ThreadPra4 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("User thread value : "+i);
        }
    }
    public static void main(String[] args){
        ThreadPra4 T=new ThreadPra4();
        Thread t=new Thread(T);
        t.start();
//        t.run();
    }
}
