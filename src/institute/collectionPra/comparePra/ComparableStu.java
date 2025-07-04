package institute.collectionPra.comparePra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStu{

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1234, 22, "teja"));
        list.add(new Student(1235, 23, "Ravi"));
        list.add(new Student(1236, 22, "Rajiv"));

        Collections.sort(list);
        System.out.println("Sorted by name (Comparator): ");

        Collections.sort(list);  // uses CompareTo
        System.out.println("Sorted by age using Comparable: ");
        for (Student s:list){
            System.out.println(s);
        }
    }

}
