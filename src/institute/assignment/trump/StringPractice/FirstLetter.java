package institute.assignment.trump.StringPractice;

import java.lang.String;

public class FirstLetter {
    public static void main(String[] args) {
        String s = "";
        StringBuffer strFirst = new StringBuffer();
        strFirst.append("java Programing java");
        for (int i = 0; i < strFirst.length(); i++) {
            char ch = strFirst.charAt(i);
            int count = 0;
            for (int j = 0; j < strFirst.length(); j++) {
                if (ch == strFirst.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(ch);
                break;
            }
        }
    }
}