package institute.oopsPractice.abstractPra;

abstract class Animal{
    public abstract void cat();
    public abstract void dog();
    public abstract void cow ();
    public void eats(){
        System.out.println("Animal eats food");
    }
    public void drinks(){
        System.out.println("Animal drinks Water");
    }
}
class EatsDrinks extends Animal{
    @Override
    public void cat(){
        System.out.println("cat food & Drinks Milk");
    }

    @Override
    public void dog(){
        System.out.println("dog eats Pedigree & Drinks Milk");
    }
    @Override
    public void cow(){
        System.out.println("Cow eats grass & Drinks water");
    }
}

public class AbstractPra2 {
    public static void main(String[] args) {
        Animal a=new EatsDrinks();
        a.eats();
        a.drinks();
        a.cat();
        a.dog();
        a.cow();

    }
}
