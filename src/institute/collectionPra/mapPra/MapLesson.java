package institute.collectionPra.mapPra;
import java.util.*;
public class MapLesson {
    public static void main(String[] args) {
       // List<String>list =new Vector<>();
        Map<Integer,String> m=new HashMap<>();  //HashMap  /LinkedHashMap  /TreeMap  /HashTable
                                          //Create of a Map
        m.put(103,"Python");        // Addition of elements into the map
        m.put(123,"Dot Net");
        m.put(04,"Java Programing");
        m.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("----------------------------");
        Set<Integer>keys=m.keySet();  //Retrieval of keys from the map
        for(Integer key : keys) {
            System.out.println(key);
        }
        System.out.println("------------------"); // Retrieval of values from the map
        Collection<String>values=m.values();
        for(String value:values){
            System.out.println(value);
        }System.out.println("------------------");

        System.out.println(m.get(102));   //Retrieval of value from the map based on a single key
        System.out.println("------------------");

        for(Integer key:keys){
            System.out.println(key+"->"+m.get(key));      //Retrieval of values from map by using keys
        }
        System.out.println("------------------");
       // m.remove(102);     // Delete of element from the map
        System.out.println(m);
        System.out.println("------------------");
        System.out.println(m.containsKey(103)); //Verification of the key in a map
        System.out.println(m.containsKey(102));
        System.out.println(m.containsValue("Dot Net"));//Verification of the value in a map
        System.out.println(m.containsValue("Core Java"));
        System.out.println(m);
        System.out.println("------------------");
        m.replace(04,"Core Java");
        System.out.println(m);
        System.out.println("------------------");
        //m.clear();
        System.out.println(m);
        System.out.println("------------------");
        Set<Map.Entry<Integer,String>>entries=m.entrySet();
        for (Map.Entry<Integer,String> entry:entries){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"->"+value);
        }
    }
}
