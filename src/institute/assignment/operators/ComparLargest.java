package institute.assignment.operators;

public class ComparLargest {
    public static void main(String[] args){
        int a=12;
        int b=12;
        int c=10;
        if (a>b  && a>c){
            System.out.println(" Largest number is:A="+a);
        }
        else if (b>a && b>c){
            System.out.println(" Largest number is:B="+b);
        }
        else if (c>a && c>b){
            System.out.println(" Largest number is:C="+c);
        }
        else {
            System.out.println("At least two are Equal number ");
        }

    }
}
