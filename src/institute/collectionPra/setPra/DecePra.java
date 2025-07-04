package institute.collectionPra.setPra;
import java.util.Comparator;
public class DecePra implements Comparator<String> {
    public int compare(String o1,String o2){
        return o2.compareTo(o1);
    }
//    public int compare(Integer o1,Integer o2){
//        return o2.compareTo(o1);
//    }
}
