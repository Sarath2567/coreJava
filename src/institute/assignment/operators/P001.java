package institute.assignment.operators;

import javax.swing.*;
import java.util.Arrays;

public class P001 {
    public static void main(String[] args) {
        int [] a={8,3,9,6,4};
        //Arrays.sort(a);
        int s=a[a.length-2];
        System.out.println("Second Largest Number: "+s);

        // using time complex

        int largest=Integer.MIN_VALUE;
        int secondlarges=Integer.MIN_VALUE;
        for(int num:a){
            if(num> largest){
                secondlarges=largest;
                largest=num;
            }else if(num>secondlarges && num != largest){
                secondlarges =num;
            }
        }
        System.out.println("secondlarges number is: "+secondlarges);

        //
        int x=0;
        int y=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>y){
                System.out.println("a[0]"+a[0]);
                x=y;
                y=a[i];
                System.out.println("x = "+x);
                System.out.println("y = "+y);
                System.out.println("a[i]"+a[i]);
            }
            else if(a[i]>x){
                System.out.println("a[i]"+a[i]);
                System.out.println("x"+x);
                x=a[i];
            }
        }
        System.out.println(x);
    }
}



