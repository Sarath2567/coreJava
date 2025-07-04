package institute.assignment.trump.number;

public class PalindromeClass {
    public static void main(String[] args) {

        int i=123456;
        int sum=0;
        int x=i;
        while(i >0){
            int rem= i %10;
            sum=sum*10+rem;
            i = i /10;
        }
        System.out.println(x==sum?"Palindrome":"Not Palindrome");
        System.out.println(sum);
//        if(x==sum){
//            System.out.println("Is Palindrome: "+ i +""+sum);
//        }else{
//            System.out.println("Not Palindrome: "+ i +" "+sum);
//        }
    }
}
