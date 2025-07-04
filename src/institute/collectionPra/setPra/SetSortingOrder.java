package institute.collectionPra.setPra;

import java.util.Comparator;
import java.util.TreeSet;

public class SetSortingOrder {
        int id;
        String name;
        public SetSortingOrder(int id,String name){
            this.id=id;
            this.name=name;
        }
        public String toString(){
            return id+" - "+name;
        }
    public static void main(String[] args) {
        Comparator<SetSortingOrder> c =(s1,s2)->s2.name.compareTo(s1.name);
        TreeSet<SetSortingOrder> set=new TreeSet<>(c);
        set.add(new SetSortingOrder(2321,"Raju"));
        set.add(new SetSortingOrder(2322,"Babu"));
        set.add(new SetSortingOrder(2323,"Bala"));
        set.add(new SetSortingOrder(2324,"Tarun"));
        set.add(new SetSortingOrder(2325,"Koti"));
        System.out.println("TreeSet Sorted: ");
        for(SetSortingOrder s:set){
            System.out.println(s);
        }

        }
}
