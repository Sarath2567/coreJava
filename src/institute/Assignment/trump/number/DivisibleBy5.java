package institute.Assignment.trump;

import java.util.Scanner;
public class DivisibleBy5 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int i=0;
        if ((num % 5)==i) {
            System.out.println("Enter a number is Divisible by 5: "+num);
        }
        else{
            System.out.println("Enter a number is Not Divisible by 5: "+num);
        }
        sc.close();
    }

}
