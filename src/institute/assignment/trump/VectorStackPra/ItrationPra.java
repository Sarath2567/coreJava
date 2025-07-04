package institute.assignment.trump.VectorStackPra;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ItrationPra {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,4,84,37,65);
        Iterator<Integer > itr=num.iterator();
        System.out.println("using Iteratior to print numbers: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
