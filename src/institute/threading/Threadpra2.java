package institute.threading;

class Printer{}
class Scanner{}
public class Threadpra2 {
    public static void main(String[] args){
        final Printer p=new Printer();
        final Scanner s=new Scanner();
        Thread taskA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (p){
                    System.out.println("Task A: locked p");
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
                synchronized (s){
                    System.out.println("Task A: locked s");
                }
            }
        });
        Thread taskB =new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s){
                    System.out.println("Task B: locked s");
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
                synchronized (p){
                    System.out.println("Task A: locked p");
                }
            }
        });
        taskA.start();
        taskB.start();
    }
}
