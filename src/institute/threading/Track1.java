package institute.threading;

class Counter{
    int count =0;
    //without Synchronized key word we get the data inconsistency
    public void increment(){
        count++;
    }
   /* public synchronized void increment(){
        count++;
    }*/
}
class Track1{
    public static void main(String[] args) throws Exception{
        Counter c=new Counter();
        Thread t1=new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
            System.out.println("Thread t1 finished");
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
            System.out.println("Thread t2 finished");
        });
        t1.start(); //start out thread run
        t2.start();
        System.out.println("Main thread waiting to finish t1 and t2 to finish");
        t1.join(); //no join here
        t2.join();
//        System.out.println("main thread finished (without waiting)");
        System.out.println("All Thread Finished");
        System.out.println("Final Count: "+c.count);
    }
}
