package institute.collectionPra.setPra;
import java.util.*;
import java.util.SortedSet;
public class Assignment {
    public void Method1(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(206);ss.add(354);
        ss.add(376);ss.add(456);
        ss.add(698);ss.add(785);
        ss.add(546);ss.add(242);
        ss.add(178);ss.add(98);
        System.out.println(ss);
        System.out.println("First : " + ss.first());
        System.out.println("Last : " + ss.last());
        System.out.println("Head Set: " + ss.headSet(376));
        System.out.println("Tail Set: " + ss.tailSet(546));
        System.out.println("Get Class: " + ss.getClass());
        System.out.println("Size of Set: " + ss.size());
        System.out.println("IsEmpty: " + ss.isEmpty());
        SortedSet<Integer>sub=ss.subSet(242,456);
        System.out.println("Sub Set : "+ sub);
        System.out.println(ss);
        Iterator<Integer> itr = ss.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("Comparator: null" + ss.comparator());
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.addAll(ss);
        System.out.println("Comparator: " + ts);
        Object[] arr=ts.toArray();
        for(Object e:arr) {
            System.out.println("To Array: "+e);
        }
        System.out.println("ToArray: " + ss.toArray());
        System.out.println(ss.remove(178)+" 178 removed");
        ss.clear();
        System.out.println(ss);
    }
}

