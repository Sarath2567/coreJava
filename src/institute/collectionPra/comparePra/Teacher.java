package institute.collectionPra.comparePra;

import java.util.Comparator;

abstract class Teacher implements Comparator<Teacher> {
    String name;
    int id;
    int age;

    public Teacher(){
        this.name = name;
        this.id=id;
        this.age=age;
    }

    public String toString() {
        return id+" - "+ name + " - " +age;
    }

    public int compareTo(Teacher t1,Teacher t2){
        return t1.name.compareTo(t2.name);
    }
}
