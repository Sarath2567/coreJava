package institute.practice2;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();
        sc.close();

        // Remove spaces and make lowercase if you want to ignore them:
         input = input.replaceAll("\\s+", "");//.toLowerCase();

        String reverse = "";
        int i = input.length() - 1;
        while (i >= 0) {
            reverse += input.charAt(i);
            System.out.print(input.charAt(i));
            i--;
        }
        System.out.println();
        if (input.equals(reverse)) {
            System.out.println( input + " is a palindrome.");
        } else {
            System.out.println( input + " \"is not a palindrome.\"");
        }
    }
}
