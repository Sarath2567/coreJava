package institute.Assignment.trump.array;

public class ArrSum {
    public static void main(String[] args) {
        int[] num = {1, 4, 5, 8, 12, 26};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum of array element: " + sum);
    }
}


