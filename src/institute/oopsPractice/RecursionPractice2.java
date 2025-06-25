package institute.oopsPractice;
import java.util.Arrays;
public class RecursionPractice2 {
    public static int minValue(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int minval = minValue(arr, i + 1);
        return Math.min(arr[i], minval);
    }
    public static void main(String[] args) {
        int[] arr = {234, 534, 567, 45, 34, 76, 39};
        int min = minValue(arr, 0);
        System.out.println("Minimum value in array: " + min);
    }
}
