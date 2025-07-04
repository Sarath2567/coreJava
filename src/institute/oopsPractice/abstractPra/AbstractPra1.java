package institute.oopsPractice.abstractPra;

abstract class Newvehical{
    public abstract void startEngin(); // abstraction method -1
    public abstract void stopEngin();  // abstraction method -2
    public abstract int getSpeed();    // abstraction method -3
    public void horn() { // concrete method-1
        System.out.println("Sound Horn");
    }
    public void maxSpeed() { //concrete method-2
        System.out.println("Max speed = " + getSpeed() + " km/h");
    }
}
class Car extends Newvehical{
    @Override
    public void startEngin() {
        System.out.println("Car is Started");
    }
    @Override
    public void stopEngin(){
        System.out.println("Car is Stoped");
    }
    public int getSpeed(){
        return 220;
    }
}
public class AbstractPra1 {
    public static void main(String[] args) {
        Newvehical car=new Car();
        car.startEngin();
        car.horn();
        car.maxSpeed();
        car.stopEngin();
    }
}
