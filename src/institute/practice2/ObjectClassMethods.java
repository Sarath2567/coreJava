package institute.practice2;

public class ObjectClassMethods {

    public static void main(String[] args) {
        Student s = new Student(101, "Teja");

        //without toString() in Student class
        //System.out.println(s); //in.trump.ObjectClassMethods.Student@e580929
        //System.out.println(s.toString());//in.trump.ObjectClassMethods.Student@e580929

        //with toString()
        System.out.println(s);
        //Student s1 = new Student(102, "Sai");
        Student s1 = new Student(101, "Teja");
        System.out.println(s1); //102 sai

        System.out.println("--------------------------------------");
        System.out.println(s1);
        System.out.println(s);

        System.out.println("--------------------------------------");
        String str2 =new String( "trump");
        String str3 = new String("trump");

        System.out.println("--------------------------------------");
        System.out.println(str2);
        System.out.println(str3);

        //Class getCalss()
        System.out.println("--------------------------------------");
        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());

        //hascode()
        System.out.println("--------------------------------------");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        //equals
        System.out.println("--------------------------------------");
        System.out.println(s1.equals(s)); // false
        System.out.println(str2.equals(str3)); // true

        //clone()
        System.out.println("--------------------------------------");
        Student s5 = new Student(103, "Kumar");
        System.out.println(s5.id+" "+s5.name);

        //finalise()
        System.out.println("--------------------------------------");




    }

}
