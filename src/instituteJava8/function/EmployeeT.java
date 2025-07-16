package instituteJava8.function;

import java.util.*;
import java.util.stream.Collectors;

 class EmployeTeam{
    private final String name;
    private  final int salary;
    private final String department;
    public EmployeTeam(String name,int salary,String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
 public String getName(){
        return name;
 }
 public String toString(){
        return "Name: "+name+", Salary: "+salary+", Department: "+department;
 }

    public int getSalary() {
        return salary;
    }
}
public class EmployeeT {
    public static void main(String[] args) {
        List<EmployeTeam>empTeam=Arrays.asList(
                new EmployeTeam("AAA",23422,"A"),
                new EmployeTeam("BBB",23423,"B"),
                new EmployeTeam("CCC",23434,"A"),
                new EmployeTeam("DDD",23424,"D"),
                new EmployeTeam("EEE",23432,"B"),
                new EmployeTeam("FFF",23435,"D"),
                new EmployeTeam("GGG",23445,"C"),
                new EmployeTeam("HHH",23426,"C"),
                new EmployeTeam("III",23454,"A"),
                new EmployeTeam("JJJ",23421,"E")
        );
        /*OptionalInt maxSalary = empTeam.stream().mapToInt(EmployeTeam::getSalary).max();
        OptionalInt minSalary = empTeam.stream().mapToInt(EmployeTeam::getSalary).min();
        OptionalDouble avgSalary = empTeam.stream().mapToDouble(EmployeTeam::getSalary).average();
        System.out.println("MAX Salary: "+(maxSalary.isPresent()?maxSalary.getAsInt():);
        System.out.println("MIN Salary: "+(minSalary.isPresent()?minSalary.getAsInt():);
        System.out.println("AVERAGE Salary: "+(avgSalary.isPresent()?avgSalary.getAsInt():);

         */
       DoubleSummaryStatistics stats=empTeam.stream().collect(Collectors.summarizingDouble(EmployeTeam::getSalary));
        System.out.println("MAX Salary: "+stats.getMax());
        System.out.println("MIN Salary: "+stats.getMin());
        System.out.println("AVERAGE Salary: "+stats.getAverage());
        System.out.println("TOTAL Salary: "+stats.getSum());
        System.out.println("Employee Count: "+stats.getCount());


    }
}
