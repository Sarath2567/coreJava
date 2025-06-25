package institute.oopsPractice;

public class RecursionPractice {
        public static int reverse(int num, int rev){
            if (num==0){
                return rev;
            }
            return reverse(num/10,rev*10+num%10);
        }
        public static boolean ispalindrome(int num){
            return num==reverse(num,0);
        }
        public static void main(String[] args){
            int number=123454321;
            if(ispalindrome(number)){
                System.out.println(number+"is a palindrome");
            }
            else{
                System.out.println(number+"is not a palindrome");
            }

        }

}

