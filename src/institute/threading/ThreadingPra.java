package institute.threading;

import java.util.Map;

class Movie{
    int Tickets=20;

    public synchronized void booking(String name,int ticketReq)throws InterruptedException{
        if(ticketReq<=Tickets){
            System.out.println(name+" - "+ticketReq);
            Tickets-=ticketReq;
            System.out.println(name+" Booked "+ticketReq+" Seat.");
        }else{
            System.out.println("Tickets Not Booked "+name);
        }
    }
}
class MovieThread extends Thread{
    Movie Booking;
    int ticketReq;
    String username;

    public MovieThread(Movie Booking,int ticketReq,String username){
        this.Booking=Booking;
        this.ticketReq=ticketReq;
        this.username=username;
    }
    public void run(){
        try{
            Booking.booking(username,ticketReq);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
public class ThreadingPra {
    public static void main(String[] args){
        Movie Book = new Movie();
        MovieThread user1=new MovieThread(Book,4,"a");
        MovieThread user2=new MovieThread(Book,6,"b");
        MovieThread user3=new MovieThread(Book,3,"c");
        MovieThread user4=new MovieThread(Book,6,"d");
        MovieThread user5=new MovieThread(Book,3,"e");
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
    }
}
