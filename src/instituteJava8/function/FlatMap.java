package instituteJava8.function;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> Employeenames= Arrays.asList(
                Arrays.asList("SivaTeja","Sarath","Swami"),
                Arrays.asList("Eswar","SaiChran"),
                Arrays.asList("Kumar","Gangadhar"));

        Employeenames.stream().toList();
        List<String>Employee=Employeenames.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(Employee);
    }
}
