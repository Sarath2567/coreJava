package institute.oopsPractice.abstractPra;

interface Vehical1{
    void startEngin();
    void fuelType();
    void stopEngin();
    void maxSpeed();
    int maxspeed=280;
    int maxsPeed=160;
}
class Car1 implements Vehical1{
    @Override
    public void fuelType() {
        System.out.println("Cars fuel is Diesel");
    }
    @Override
    public void startEngin() {
        System.out.println("Car Engin is Started");
    }
    @Override
    public void stopEngin() {
        System.out.println("Stop Engin");
    }
    public void maxSpeed() {
        System.out.println("MaxSpeed: " + maxspeed+ "km/h");
    }
}
class Bike1 implements Vehical1{
    @Override
    public void fuelType() {
        System.out.println("Bike fuel is Petrol");
    }
    @Override
    public void startEngin() {
        System.out.println("Bike engine Starts");
    }
    @Override
    public void stopEngin() {
        System.out.println("Bike engine Stops");
    }
    public void maxSpeed() {
        System.out.println("MaxSpeed: "+maxsPeed+"km/h");
    }
}
public interface Vehical2 {
    public static void main(String[] args) {
    Vehical1 v=new Car1();
    v.startEngin();
    v.fuelType();
    v.maxSpeed();
    v.stopEngin();
        System.out.println("-------------------");
    v=new Bike1();
    v.startEngin();
    v.fuelType();
    v.maxSpeed();
    v.stopEngin();
    }
}