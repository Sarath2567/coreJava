package institute.oopsPractice;

public class Car1 {
    String color;
    int speed;
    int friction;
    public boolean isStarted;
    public Car1(String color,int speed,int friction){
        this.color=color;
        this.speed=speed;
        this.friction=friction;
        this.isStarted =false;
    }
    public void startEngine(){
        this.isStarted=true;
    }
    public void stopEngine(){
        this.isStarted=false;
        this.speed=0;
    }
    public void applyBreak(){
        if (speed>0){
            speed-=friction;
            if (speed<0){
                speed=0;
            }
        }
    }
    public void soundHorn() {
        System.out.println(isStarted ? "Honk Honk" : "Truck has not started yet");
    }
}
//    public void accelerate() {
//        if (!isEngineStarted) {
//            System.out.println("Car has not started yet");
//        } else {
//            if (currentSpeed < maxSpeed) {
//                currentSpeed += acceleration;
//                if (currentSpeed > maxSpeed) {
//                    currentSpeed = maxSpeed;
//                } } }}
//
//    public void soundHorn() {
//        System.out.println(isEngineStarted?"Honk Honk":"Truck has not started yet");
//    }
