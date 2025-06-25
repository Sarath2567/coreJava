package institute.oopsPractice;
import institute.oopsPractice.BookMain;
public class Book {
    String title;
    int pages;
    String gener;

    public Book(String title,String gener){
        this.title=title;
        this.pages=1234;
        this.gener=gener;
    }
    public Book(String title){
        this.title=title;
        this.pages=100;
        this.gener="Horror";
    }
    public Book(String title,int pages,String gener){
        this.title=title;
        this.pages=pages;
        this.gener=gener;
    }
    public void display(){
        System.out.println("Title: "+title+ " "+ "Pages: " +pages+" " +"Gener: " + gener);
    }
}
