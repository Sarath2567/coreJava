package New.learn.pro;

public class Reversstars {
    public static void main(String[] args) {
        int rows =5; //total no.of rows
        for (int a=1; a<=rows; a++){
            for(int b=1; b<=rows-a; b++){
                System.out.print(" ");//print stars
            }
            for (int c=1;c<=a-1; c++){
                System.out.print("*");//print space
            }
            System.out.println();//print line by line
        }
    }
}