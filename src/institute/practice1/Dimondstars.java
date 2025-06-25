package New.learn.pro;

public class Dimondstars {
    public static void main(String[] args){
        int n=5; //no.of rows for the upper half
        for (int a=1; a<=n; a++){
            for (int b=a; b<n;b++){//print space
                System.out.print(" ");
            }
            for (int b=1;b<=(2*a-1);b++){
                System.out.print("$");
            }
            System.out.println();
        }
        for (int a=n-1;a>=1; a--){
            for (int b=n; b>a; b--){
                System.out.print(" ");

            }
            for (int b=1;b<=(2*a-1);b++){
                System.out.print("$");
            }
            System.out.println();

        }

    }
}
