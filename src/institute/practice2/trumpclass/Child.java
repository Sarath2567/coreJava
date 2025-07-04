package institute.practice2.trumpclass;

public class Child extends Parent {

    public static void main(String[] args) {
        Child c = new Child();
        Parent p =c;

        Parent p1 = new Child();
        //TypeCastingWidening t = new Child();

        //System.out.println(c.hashCode()+" "+p1.hashCode());
        //https://excalidraw.com/
        System.out.println(p1 + " "+ c);
        System.out.println(new Child());
        System.out.println(new Child());

//		Parent p1 = new Parent();
//	    Child c1 = (c1)p1;

    }

}