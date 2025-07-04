package institute.practice2;
import java.lang.reflect.Field;
public class Prep_3 {
    String name;
    int age;
    public Prep_3(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) throws IllegalAccessException {
        Prep_3 s=new Prep_3("Student",25);
        System.out.println("Class: "+s.getClass().getName());
        Field[] fields=s.getClass().getDeclaredFields();
        for (Field field:fields){
            field.setAccessible(true);
            Object value =field.get(s);
            System.out.println(field.getName()+"="+value);
        }
    }
}
