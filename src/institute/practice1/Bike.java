package institute.practice1;

public class Bike {
    // Class
    String brand;                    // Data member
    int speed;                       // Data member
    public Bike(String b, int s) {   // Constructor
        brand = b;
        speed = s;
    }
    public int getSpeed() {          // Method with return type
        return speed;
    }
    public void display() {          // Method with no return type (void)
        System.out.println("Brand: " + brand);
    }
    public static void main(String[] args) {  // main method
        Bike myBike = new Bike("Raider", 80); // Object
        myBike.display();
        System.out.println("Speed: " + myBike.getSpeed());
    }
 }


