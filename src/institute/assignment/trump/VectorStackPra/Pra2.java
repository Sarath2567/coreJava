package institute.assignment.trump.VectorStackPra;
import java.util.*;
public class Pra2 {
    public static void main(String[] args) {
        System.err.println("Vector");
        Vector<String> v = new Vector<>();
        v.add("1");
        v.add("stack");
        v.add(null);
        v.add(2, "vector");
        System.out.println(v);
        v.remove("vector");
        System.out.println(v);
        System.out.println("---------------");
        v.remove(0);
        System.out.println(v);
        System.out.println("---------------");
        v.add("java");
        v.add("vector");
        System.out.println(v.get(1) + "^");
        System.out.println("---------------");
        System.out.println(v);
        System.out.println(v.contains("stack"));
        System.out.println("---------------");
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        for (int i = 0; i < v.toArray().length; i++) {
            System.out.println("Index " + i + ": " + v.get(i));
        }
        System.out.println("---------------");
        System.out.println(v.isEmpty());
        v.set(3, "String");
        System.out.println(v.indexOf("java"));
        System.out.println(v);
        System.out.println("---------------");
//        v.clear();

        System.out.println("Access Elements by using Iterator: ");
        Iterator<String> itr= v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------");
        System.out.println("Access Elements by using ListIteration: ");
        ListIterator<String> lit=v.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        System.out.println("----------------");
        System.out.println("Access Elements by using Enumeration: ");
        Enumeration<String> Enum=v.elements();
        while(Enum.hasMoreElements()){
            System.out.println(Enum.nextElement());
        }
    }
}
