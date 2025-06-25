package institute.oopsPractice;
import  institute.oopsPractice.Teacher;
public class Student1 extends Teacher{
    public Student1(int tej,String name){
        super(tej,name);
    }
    public static void main(String[] args) {
        Student1  t1 = new Student1(37,"sarath");
        System.out.println(t1.rollNo);
        System.out.println(t1.name);
        t1.setStudent(true);
        boolean isPresent = t1.getStudent1();
        System.out.println("Is student present? " + isPresent);
    }
}

