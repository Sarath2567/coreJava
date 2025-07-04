package institute.practice2.trumpclass.training;

public class A extends B{
    //A refers to Base  class
    String name;

    public void details() {
        super.name = "Parent";
        this.name = "Child";
        System.out.println(super.name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        A a = new A();
        a.details();

    }
}