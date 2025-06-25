package institute.Assignment;

import java.util.Scanner;

public class GraterNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value :" );
        int a= sc.nextInt();
        System.out.println("Enter b value : ");
        int b= sc.nextInt();
        if (a>b){
            System.out.println(a+"is Grater than"+b);
        }
        else if (a < b) {
            System.out.println(b+"is Grater than"+a);
            }
        else{
            System.out.println(a+"is equals to"+b);

        }
    }
}
