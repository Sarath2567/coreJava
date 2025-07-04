package institute.collectionPra.setPra;
import java.util.*;

public class SetTerrAssignment {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new DecePra());
        set.add("Set");
        set.add("List");
        set.add("Map");
        set.add("Queue");
        set.add("DeQueue");
        System.out.println(set);
        set.remove("DeQueue");
        set.contains("Map");
        set.contains("DeQueue");
        System.out.println(set);
//        Map<Integer,String> map=new HashMap<>();
//        map.put(2,"qwe");
//        map.put(3,"rty");
//        map.put(4,"uiop");
//        map.put(5,"asdf");
//        map.put(6,"hjkl");
//        System.out.println(map);
////      map.remove(2);
//        System.out.println(map.remove(2,"qwe")+" remove");
//        System.out.println(map.containsKey(4));
//        System.out.println(map.containsValue("uiop"));
//        System.out.println(map.containsValue("qwe"));
//        System.out.println(map);
    }
}