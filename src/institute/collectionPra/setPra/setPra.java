package institute.collectionPra.setPra;
import java.util.*;

public class setPra {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Swift");
        hset.add("Xuv 300");
        hset.add("Ford F");
        hset.add("Skoda");
        hset.add("Scorpio");
        hset.add("Creta");
        System.out.println(hset);
        System.out.println("Contains Skoda: "+hset.contains("Skoda"));
        System.out.println("Size Of HashSet: "+hset.size());
        System.out.println("IsEmpty : "+hset.isEmpty());
        System.out.println("HashCode: "+hset.hashCode());
        System.out.println(hset);
        Iterator<String> itr=hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }hset.remove("Skoda");
        //System.out.println(hset.retainAll(Collections.singleton("Skoda")));
       // hset.clear();
       // System.out.println(hset);
        LinkedHashSet<String>lset=new LinkedHashSet<>(hset);
        System.out.println(lset);

    }
}
