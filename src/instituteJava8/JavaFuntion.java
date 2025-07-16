package instituteJava8;
import java.util.Arrays;
import java.util.List;
class Employee {
    int id;
    String name;
    String designation;
    double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + designation + " " + salary;
    }
}

public class JavaFuntion {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee(12112, "Sravan","Tester",34200),
                new Employee(12113, "Bala","Tester",46570),
                new Employee(12134, "Adithya","Tester",48700),
                new Employee(12342, "Bhanu","Developer",62500),
                new Employee(12343, "Viswanadh","Developer",76000),
                new Employee(12347, "Vijay","Developer",89040),
                new Employee(12345, "SaiKrishna","Developer",47000),
                new Employee(12355, "Kishor","HrManager",64000),
                new Employee(12345, "RaviTeja","HrManager",25400),
                new Employee(12356, "Manshi","HrManager",65700),
                new Employee(12367, "Charan","Tester",85700),
                new Employee(12377, "Govind","HrManager",74500)
                );
       // int x=Integer.MAX_VALUE;

     //   System.out.println(x);
        System.out.println("Employee with Salary: ");
        emps.stream().filter(emp->emp.salary>25000&&emp.salary<50000).forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println("Employee with Designation Tester");
        emps.stream().filter(emp->emp.designation.equals("Tester")).forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("Employee with Designation Developer");
        emps.stream().filter(emp-> emp.designation.equals("Developer")).forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("Employee with Designation HrManager");
        emps.stream().filter(emp->emp.designation.equals("HrManager")).forEach(System.out::println);
    }
}
