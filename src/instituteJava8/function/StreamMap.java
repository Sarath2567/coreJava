package instituteJava8.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employe {
    private String name;
    private int salary;
    private String developer;

    public Employe(String name, int salary, String Java) {
        this.name = name;
        this.salary = salary;
        this.developer = Java;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "students=" + name + ",salary=" + salary + ",developer=" + developer;
    }
}

public class StreamMap {
    public static void main(String[] args) {
        List<Employe> trumpStudents = Arrays.asList(
                new Employe("Kumar", 25, "Java"),
                new Employe("Ajay", 26, "Java Advanced"),
                new Employe("Kiran", 28, "Java 8"),
                new Employe("Siva", 24, "Java"),
                new Employe("Teja", 27, "Java Advanced"),
                new Employe("Vishnu", 30, "Java"),
                new Employe("Adit", 20, "Java"),
                new Employe("Easwar", 21, "Java 8"));
        List<Employe> trump = trumpStudents.stream().filter(tech -> tech.getName().startsWith("A")).toList();
        trump.forEach(System.out::println);

    }
}
