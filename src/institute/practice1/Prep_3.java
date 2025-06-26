package institute.practice1;

public class Prep_3 {
    public static void main(String[] args){
        String Fruit="Mango Banana Apple";
        String[] Fr1=Fruit.split(" ");
        if (Fr1.length==3){
            String Fr2 = Fr1[2]+" "+Fr1[1]+" "+Fr1[0];
            System.out.println("Fruit "+Fruit);
            System.out.println("Fruit "+ Fr2);
        }
    }


}
