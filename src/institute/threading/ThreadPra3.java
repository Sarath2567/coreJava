package institute.threading;

public class ThreadPra3 {
    public static void main(String[] args) {
        TrackA trackA=new TrackA();
        TrackB trackB=new TrackB();
        trackA.setTrack2(trackB);
        trackB.setTrack1(trackA);

        Thread trainA=new Thread(()->trackA.useTrack1("TrainA",322L));
        Thread trainB=new Thread(()->trackB.useTrack2("TrainB",235L));
        trainA.start();
        trainB.start();
    }
}

class TrackA {
    private TrackB trackB;
    public void setTrack2(TrackB trackB){this.trackB=trackB;}
    public synchronized void useTrack1(String TrainA,Long Number){
        System.out.println(Thread.currentThread().getName()+" :Locked Track A.");
        synchronized (trackB){
            System.out.println(Thread.currentThread().getName()+": Using only Track");
        }
    }
}
class TrackB{
    private TrackA trackA;
    public void setTrack1(TrackA trackA){this.trackA=trackA;}
    public synchronized void useTrack2(String TrainB,Long Number){
        System.out.println(Thread.currentThread().getName()+" : Locked Track B.");
        synchronized(trackA) {
            System.out.println(Thread.currentThread().getName() +" : Using only Tack2");
        }
    }
}
