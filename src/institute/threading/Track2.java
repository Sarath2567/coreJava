package institute.threading;
class Track2 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else{
            System.out.println("User Thread");
        }
    }

    public static void main(String[] args) throws Exception {
        Track2 t1= new Track2();
        Track2 t2=new Track2();
        Track2 t3=new Track2();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }

}