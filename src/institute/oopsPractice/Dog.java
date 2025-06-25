package institute.oopsPractice;
import java.util.Scanner;
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void fetch() {
        System.out.println("The dog fetches a ball");
    }
    public static void main(String[] args){
//       Animal Animal =new Dog();
//       Animal.makeSound();
        Animal a=new Dog();
        a.makeSound();   // Upcasting

        Dog d=(Dog)a;
        d.fetch();      // Downcasting
    }
}

