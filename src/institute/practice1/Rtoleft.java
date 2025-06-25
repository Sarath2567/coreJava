package New.learn.pro;

public class Rtoleft {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;


        // total number of rows

        while (i <= n) {
            int spaces = n - i;
            int stars = i;

            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= stars) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
