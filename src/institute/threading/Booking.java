package institute.threading;

class BookingSystem{
    int availableSeat =3;
    public  synchronized void bookTicket(String name,int seatRequested)throws InterruptedException{
        if(seatRequested <= availableSeat){
            System.out.println(name+" - "+ seatRequested);
            Thread.sleep(3000);
            availableSeat -= seatRequested;
            System.out.println(name+" booked "+ seatRequested +" seat. ");
        }else{
            System.out.println("not booked "+name);
        }
    }
}
class BookingThread extends Thread{
    BookingSystem bookingSystem;
    int seatRequested;
    String userName;

    public BookingThread(BookingSystem bookingSystem,int seatRequested,String userName){
        this.bookingSystem=bookingSystem;
        this.seatRequested =seatRequested;
        this.userName=userName;
    }
    public void run(){
        try{
            bookingSystem.bookTicket(userName, seatRequested);
        }catch(InterruptedException H){
            throw new RuntimeException(H);
        }
    }
}
public class Booking {
    public static void main(String[] args){
        BookingSystem bookingSystem=new BookingSystem();
        BookingThread user1 =new BookingThread(bookingSystem,1,"A");
        BookingThread user2=new BookingThread(bookingSystem,2,"B");
        BookingThread user3 =new BookingThread(bookingSystem,3,"C");
        BookingThread user4 =new BookingThread(bookingSystem,1,"D");
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
