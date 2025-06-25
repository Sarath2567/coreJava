package institute.Assignment.trump;

import java.util.Scanner;
public class CharacterIS {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch =sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println(ch+" is an Alphabet.");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+" is an Digit.");
        }
        else{
            System.out.println(ch + " is neither Alphabet nor Digit.");
        }
        sc.close();
    }

}
