package institute.practice2.trumpclass;

public class TypeCastingWidening {
    public static void main(String[] args) {
        double num = 10;
        System.out.println("double value of num: " + num);

        //widening - from 32 bits to 64 bits
//		double data = num;
//		System.out.println("double value of data: "+data);

        //Narrowing - 64 bits to 32 bits
        //int data = num; //Type mismatch: cannot convert from double to int
        int data = (int) num;
        System.out.println("int value of data : " + data);
    }
}
