package institute.threading;
class Track2{
    public synchronized void useTrack2(Track1 track1){
        System.out.println(Thread.currentThread().getName()+": Locked Track2");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+":lock Track1");
        track1.useTrackonly();
    }
    public synchronized void useTrack2(){
        System.out.println(Thread.currentThread().getName()+": Using only Tack2");
    }
}