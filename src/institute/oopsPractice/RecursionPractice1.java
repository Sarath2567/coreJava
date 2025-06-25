package institute.oopsPractice;

public class RecursionPractice1 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);

    }
    public static void main(String[] args) {
        String text = "123456789";
        String reversed = reverse(text);
        System.out.println("Reversed: " + reversed);
    }
}
