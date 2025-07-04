package institute.collectionPra.lindedListPra;
import java.util.ArrayList;
import java.util.LinkedList;

public class Leason {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("s1");
        al.add("s2");
        LinkedList<String> ll=new LinkedList<>();
        ll.add("y1");
        ll.add("y2");
        ll.add("y3");
        ll.add(1,"yy");
        ll.addAll(0,al);  //ll.addAll(al);
        ll.remove(1);
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.contains("y1"));
        ll.set(2,"ss");
        System.out.println(ll);    //collection.synchronized list(ll) for sinchronization
        ll.add("y3");
        ll.add(null);
        ll.add("ss");
    }
}
