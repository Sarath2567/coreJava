package institute.exceptionFile;

//import java.io.ArithmeticException;

public class catchBlock {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Result: "+c);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Exception occured: no clarity about exception"+aioobe);
        }catch (ArithmeticException ae) {
            System.out.println("Exception Occur :/by Zero "+ae);
        }catch (Exception e) {
            System.out.println("Unknown Exception: "+e);
        }
    }
}
