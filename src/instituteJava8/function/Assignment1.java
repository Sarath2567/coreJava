package instituteJava8.function;
import java.util.Arrays;
import java.util.List;

record Collage(String studentname,int id,int age,String group){}

public class Assignment1 {
    public static void main(String[] args) {
        List<Collage> student = Arrays.asList(
                new Collage("Anil", 21, 101, "Bsc com"),
                new Collage("Ram", 19, 102, "Bsc com"),
                new Collage("Kiran", 21, 103, "Bsc com"),
                new Collage("Juli", 18, 104, "B com"),
                new Collage("Ankith", 19, 105, "B com"),
                new Collage("Bhanu", 20, 106, "Msc com"),
                new Collage("Arun", 20, 107, "M com"),
                new Collage("Balu", 21, 108, "M com"),
                new Collage("Mani", 22, 109, "Msc com"),
                new Collage("Anji", 20, 110, "M com")
        );
//        List<String> studentinclass=student.stream().map(s->s.toString()).toList();
//        studentinclass.forEach(System.out::println);
        List studentinclas = student.stream().filter(s -> s.studentname().startsWith("A"))
                .map(s->Arrays.asList(s.studentname(),s.age(),s.id(),s.group()))
                .flatMap(s->s.stream()).toList();
        System.out.println(studentinclas.toString());


    }
}

/* Method 2 possibulity
class Collage{
    private String studentname;
    private int age;
    private int id;
    private String group;
    public Collage(String name,int age,int id,String group){
        this.studentname=name;
        this.id=id;
        this.age=age;
        this.group=group;
    }
    public String getName(){
        return studentname;
    }
    @Override
    public String toString(){
        return ("Student Name :"+studentname+" ,Id: "+id+" ,Age: "+age+" ,Group: "+group) ;
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        List<Collage> student = Arrays.asList(
                new Collage("Anil", 21, 101, "Bsc com"),
                new Collage("Ram", 19, 102, "Bsc com"),
                new Collage("Kiran", 21, 103, "Bsc com"),
                new Collage("Juli", 18, 104, "B com"),
                new Collage("Ankith", 19, 105, "B com"),
                new Collage("Bhanu", 20, 106, "Msc com"),
                new Collage("Arun", 20, 107, "M com"),
                new Collage("Balu", 21, 108, "M com"),
                new Collage("Mani", 22, 109, "Msc com"),
                new Collage("Anji", 20, 110, "M com")
        );
        List<String> studentinclass=student.stream().map(s->s.toString()).toList();
        studentinclass.forEach(System.out::println);
        List<Collage> studentinclas = student.stream().filter(s -> s.getName().startsWith("A")).toList();
        studentinclas.forEach(System.out::println);
    }
}
 */