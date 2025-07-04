package institute.assignment.trump.VectorStackPra;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterationPra {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(35,44,67,56,21,2,7,65);
        ListIterator<Integer > itr=num.listIterator();
        System.out.println("using ListIteratior to print numbers: ");
        while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }


