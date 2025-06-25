package institute.oopsPractice;
import institute.oopsPractice.Book;
public class BookMain {
    public static void main(String[] args){
        Book b1=new Book("Maharabartha","comady");
        Book b2=new Book("Devil");
        Book b3=new Book("Ramayanam",25920,"Historical");
        b1.display();
        b2.display();
        b3.display();
    }
}
