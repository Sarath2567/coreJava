package institute.Assignment;


import java.util.Scanner;
public class BetweenNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if (num>10 & num<20) {
            System.out.println(num + " is between 10 to 20");
        }
        else if (num == 10 || num == 20){
                System.out.println(num + " is Either 10 or 20");
        }
        else {
            System.out.println(num + " is Less than 10 or Grater than 20");
        }
        sc.close();
    }
}