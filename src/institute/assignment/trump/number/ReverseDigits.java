package institute.assignment.trump.number;

public class ReverseDigits {

    public static void main(String[] args) {
        int n=123456;
        int i =1234321;
        int rev=0;
        int sum=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }System.out.println(rev);

    }
}
