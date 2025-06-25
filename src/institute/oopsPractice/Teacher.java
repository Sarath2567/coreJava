package institute.oopsPractice;
import java.lang.String;
public class Teacher {
    public int rollNo;
    public String name;
    boolean isAttend;

    public Teacher(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void setStudent(boolean flag) {
        if (!isAttend)
            isAttend = flag;
        System.out.println("teacher attendance takes");
    }

    public boolean getStudent1() {
        System.out.println("student attended ");
        return isAttend;
    }
}