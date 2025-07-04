package institute.practice2;

public class StudentCloneExample implements Cloneable {

    int id;
    String name;

    public StudentCloneExample() {
    }

    public StudentCloneExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentCloneExample s1 = new StudentCloneExample(105, "Kumar");
        System.out.println(s1.id+" "+s1.name);
        StudentCloneExample s2= (StudentCloneExample)s1.clone();
        System.out.println(s2.id+" "+s2.name);
        System.out.println(s1+" "+s2);
//		in.trump.ObjectClassMethods.StudentCloneExample@36d64342
//		in.trump.ObjectClassMethods.StudentCloneExample@39ba5a14

        StudentCloneExample s3 = new StudentCloneExample();
        s3 = null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method is called");
    }

}
