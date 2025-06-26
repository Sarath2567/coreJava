package institute.practice1;

public class Sta {
    public static void main(String[] args){
        int a=5;
        for (int b=1; b<=a; b++){
            for (int c=b; c<=a; c++){
                System.out.print(" ");
            }
            for (int c=1; c<=b;c++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}

