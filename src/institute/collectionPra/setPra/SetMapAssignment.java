package institute.collectionPra.setPra;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SetMapAssignment {
    public static void main(String[] args) {
        Comparator<Integer>reverseOrder=(a,b)->b-a;
        Map<Integer,String> map =new TreeMap<>(reverseOrder);
        map.put(001,"Java");
        map.put(002,"Python");
        map.put(003,"DotNet");
        map.put(004,"SQLData");
        map.put(005,"Security");
        System.out.println("Decending order: ");
        for(Map.Entry<Integer,String> e:map.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }
    }
}
