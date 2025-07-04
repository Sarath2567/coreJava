package institute.assignment.trump.number;

import java.util.Scanner;
public class CheckEvenOdd {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int i=0;
        if ((num % 2)==i) {
            System.out.println("Enter a number is EVEN: "+num);
        }
        else{
            System.out.println("Enter a number is ODD: "+num);
        }
        sc.close();
    }
}
