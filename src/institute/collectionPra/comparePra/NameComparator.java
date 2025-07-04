package institute.collectionPra.comparePra;

import java.util.Comparator;

abstract class NameComparator implements Comparator<Teacher> {
    public int compare(Teacher t1,Teacher t2){
        return t1.name.compareTo(t2.name);
    }
}
