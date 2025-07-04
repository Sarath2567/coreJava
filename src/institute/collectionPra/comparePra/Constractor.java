package institute.collectionPra.comparePra;
import java.util.*;
import java.util.ArrayList;

public class Constractor {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(103, 19, "Ramu"));
        list.add(new Student(101, 25, "Varma"));
        list.add(new Student(102, 23, "Kiran"));
        list.add(new Student(105, 20, "Abhiram"));
        list.add(new Student(104, 27, "Manoj"));
        // Sort using NameComparator
//        Collections.sort(list, new Teacher);

        System.out.println("Sorted by name (using Comparator):");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

