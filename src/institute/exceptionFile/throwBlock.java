package institute.exceptionFile;
import java.lang.ArithmeticException;
public class throwBlock {
    static void deposit(int amount) {
        int balance = 1000;
        if (amount >= 100 && amount <= 49900) {
            balance += amount;
            System.out.println("Deposit Successful.Remaining balance: " + balance);
        } else {
            throw new ArithmeticException("Please check amount Deposit between 100 to 49900");
        }
    }
    public static void main(String[] args) {
        try {
            deposit(-400);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            //System.err.println(e.getMessage());
            StackTraceElement[] trace = e.getStackTrace();
            for (StackTraceElement element : trace) {
                System.out.println("at " + element);
            }
        }
    }
}
