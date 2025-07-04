package institute.assignment.trump.VectorStackPra;
import java.util.Hashtable;
import java.util.Enumeration;
public class EnumPra {
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<>();
        table.put(101,"Sai");
        table.put(102,"Ram");
        table.put(103,"Noel");
        table.put(104,"Sarath");
        Enumeration<Integer>key=table.keys();
        Enumeration<String>value=table.elements();
        System.out.println("key: ");
        while(key.hasMoreElements()){
            System.out.println(key.nextElement());
        }
        System.out.println("Values: ");
        while(value.hasMoreElements()){
            System.out.println(value.nextElement());
        }
    }
}
