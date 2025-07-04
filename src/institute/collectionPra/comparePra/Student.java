package institute.collectionPra.comparePra;
import java.util.*;

public class Student implements Comparable<Student> {
    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.age - s.age;

    }

    public String toString() {
        return id + " - " + name + " - " + age;
    }
}