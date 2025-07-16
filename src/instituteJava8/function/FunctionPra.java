package instituteJava8.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FunctionPra {
    static String[] names={"arjun","sai","bala adithya","Mani","sravan","sravanti","sameera"};
    static String[] designation={"java Developer","python developer","DotNet Developer","Tester","Hr"};

    public static void main(String[] args) {
//        String str ="teja";
//        System.out.println(str.length());
//        String[] nar = {"1","8","8","6"};
//        System.out.println(nar.length);
//        List list = new ArrayList<>();
//        list.add("raju");
//        list.add("2,5,6");
//        System.out.println(list.size());

        List<Employee> allEmployeesDatabase =new ArrayList<>();
        int num=10;
        for(int i=1;i<=num;i++) {
            String name =names[new Random().nextInt(names.length)];
            int id = 1000 +new Random().nextInt(9000);
            int salary = new Random().nextInt(20000,100000) ;
            String designations =designation[new Random().nextInt(designation.length)];
            //System.out.println("Employee "+i);
            allEmployeesDatabase.add(new Employee(id,salary,name,designations));
            System.out.println(allEmployeesDatabase.get(i-1));
        }
        System.out.println(allEmployeesDatabase);
    }
}
class Employee{
    int id;
    int salary;
    String name;
    String designation;
    Employee(int id,int salary,String name,String designation){
        this.id=id;
        this.salary=salary;
        this.name=name;
        this.designation=designation;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+designation+" "+salary;
    }
}