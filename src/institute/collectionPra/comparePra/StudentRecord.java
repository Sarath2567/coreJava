package institute.collectionPra.comparePra;

public interface StudentRecord {
    public static int compare(Teacher t1, Teacher t2){
        return t1.name.compareTo(t2.name);
    }
}
