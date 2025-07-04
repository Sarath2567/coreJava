package institute.threading;

public class ThreadPra3 {
    public static void main(String[] args) {
        Track1 track1=new Track1();
        Track2 track2=new Track2();
        track1.setTrack2(track2);
        track2.setTrack1(track1);

        Thread trainA=new Thread(()->track1.useTrack1("track2"),"Train-A");
        Thread trainB=new Thread(()->track2.useTrack2("track1"),"Train-B");
        trainA.start();
        trainB.start();
    }
}

class Track1{
    private Track2 track2;
    public void setTrack2(Track2 track2){this.track2=track2;}
    public synchronized void useTrack1(String TrainA,Long Number){
        System.out.println(Thread.currentThread().getName()+":Locked Track1");
        synchronized (track2){
            System.out.println(Thread.currentThread().getName()+": Using only Track");
        }
    }
}
class Track2{
    private Track1 track1;
    public void setTrack1(Track1 track1){this.track1=track1;}
    public synchronized void useTrack2(String TrainB,Long Number){
        System.out.println(Thread.currentThread().getName()+": Locked Track2");
        synchronized(track1) {
            System.out.println(Thread.currentThread().getName() + ": Using only Tack2");
        }
    }
}
