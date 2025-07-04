package institute.practice2.trumpclass.training;

public class MethodOverloading {

        void show(int x, int y) {
            System.out.println(x + "" + y);
        };

        void show(double x, double y, double z) {
            System.out.println(x + " " + y + " " + z);
        };

        void show(long x) {
            System.out.println("MethodOverloading.show() --- long");
            System.out.println(x);
        };

        void show(String name) {
            System.out.println(name+" String");
        };

        public static void main(String[] args) {
            MethodOverloading mo = new MethodOverloading();
            mo.show(10);
            mo.show("Trump");//
        }

    }

