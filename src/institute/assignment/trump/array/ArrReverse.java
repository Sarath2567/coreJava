package institute.assignment.trump.array;
import java.util.Scanner;
public class ArrReverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter length of the array: ");
        int Len =sc.nextInt();
        int[] arr =new int[Len];

        System.out.println("Enter "+ Len +" elements:");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Reverse array elements: ");

        for (int i = Len -1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
