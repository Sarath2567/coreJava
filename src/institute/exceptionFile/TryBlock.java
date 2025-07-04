package institute.exceptionFile;

public class TryBlock {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Program continues after the catch block.");
    }
}