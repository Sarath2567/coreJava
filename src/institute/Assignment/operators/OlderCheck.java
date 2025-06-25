package institute.Assignment;

import java.util.Scanner;

public class OlderCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X age :" );
        int x= sc.nextInt();
        System.out.println("Enter Y age : ");
        int y= sc.nextInt();
        if (x>y){
            System.out.println(" X is Older than Y ");
        }
        else if (x <y) {
            System.out.println("Y is Older than X ");
        }
        else{
            System.out.println("x,Y are Same age");

        }
    }
}
