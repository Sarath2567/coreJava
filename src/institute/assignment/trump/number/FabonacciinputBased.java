package institute.assignment.trump.number;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class FabonacciinputBased {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            List<Integer> l = new ArrayList<>();
            l.add(0);
            l.add(1);
            System.out.println("Enter number: ");
            do {
                int n = s.nextInt();
                if (l.size() >n) {
                    n=n;
                }
                else {
                    for (int i = l.size(); i <n; i++) {
                        l.add(l.get(i - 1) + l.get(i - 2));
                    }
                    System.out.println(l);
                }
                System.out.println("Current List size:"+l.size());
                System.out.println("Fibonacci Series of position "+n+" is:" + l.get(n-1));
                System.out.println("Enter number: ");
            }while(s.hasNextInt());
        }
        catch(InputMismatchException e){
            System.out.println("Input must be Interger"+e);
        }
    }
}
