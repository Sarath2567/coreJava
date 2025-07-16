package instituteJava8.function;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
    public static void main(String[] args) {
         List<List<String>> names= Arrays.asList(
                Arrays.asList("Anil","raju","Heamenth"),
                Arrays.asList("Manoj","Tarun","Arjun"),
                Arrays.asList("Lokesj","Emunial"),
                Arrays.asList("Harasha","Lalin","Rahul","Pradeep"));

    names.stream().toList();
    List<String>listnames=names.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(listnames);

    }
}
