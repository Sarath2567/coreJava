package institute.assignment.trump.VectorStackPra;

import java.util.*;

public class Pra1 {
        //String s="Hello";
        public static void main(String[] args) {
            Vector<String> vc=new Vector<>();
            //The Vector is a legacy class
            //The Vector class implements a growable array of objects
            String s="Hello";
            vc.add("Insertion order is maintained");//Vector maintains the same order in which elements are added.
            vc.add("Homogeneous data Stored");// Only String type data is stored (Vector<String>).
            vc.add(null);//Null values are allowed
            vc.add("Java");
            vc.add("Default capacity is: 10");// Default internal capacity is 10.
            vc.add("Size increases by double");//Capacity doubles when exceeded.
            vc.add("Vector is a  Legacy Class");// // Legacy class (introduced in Java 1.0).
            vc.add("It is SYNCHRONIZED");//Thread-safe (synchronized).
            vc.add("Java");//Duplicates are allowed
            vc.add(3,"Python");//Insert "Python" at index 3
            System.out.println(vc);
            System.out.println("-----------------------");
            System.out.println(vc.get(5));//retrieve the 5 index position
            System.out.println(vc);
            System.out.println("---------------------------");
            System.out.println(vc.clone());
            System.out.println("-------------------------");
            System.out.println(vc.equals(s));
            System.out.println(vc.contains("Java"));
            vc.remove(3);
            System.out.println(vc);
            System.out.println(vc.set(4,"JavaScript"));//update the element in 4 index position
            System.out.println(vc.indexOf(2));
            System.out.println("-------------------------------------------------------------------------------------------");

            System.out.println("---------------------------------------------------------");
            System.out.println("Using Enumeration interface for retrieving the elements");
            Enumeration<String> e= vc.elements();
            while (e.hasMoreElements()){
                System.out.println(e.nextElement());
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("Using iterator interface for retrieving the elements");
            Iterator<String> it= vc.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("Using List iterator interface for retrieving the elements");
            ListIterator<String> lt= vc.listIterator();
            while (lt.hasNext()){
                System.out.println(lt.next());
                System.out.println(lt.hasPrevious());//checks whether there is an element before the current position of the iterator.
            }






            System.out.println("-------------Stack------------");
            Stack<Integer> sk = new Stack<>();
            //Stack is a legacy class
            //A Stack is a linear data structure that follows the LIFO (Last-In, First-Out) principle, where the last element inserted is the first one to be removed.
            // It allows operations like push, pop, peek, and isEmpty.
            sk.push(null);//Null values Allows
            sk.push(45);//Stack follow LIFO (Last-In, First-Out)
            sk.push(45);//Duplicates allowed
            sk.push(75);
            sk.push(101);
            sk.add(3,6);
            sk.push(98);
            System.out.println(sk.pop());//remove the last element
            System.out.println(sk.peek());//peek is used to showing the last element (Not removing)
            System.out.println(sk.search(4));
            System.out.println(sk.isEmpty());
            System.out.println(sk);

            System.out.println("Using Enumeration interface for retrieving the elements");
            Enumeration<Integer> e1= sk.elements();
            while (e1.hasMoreElements()){
                System.out.println(e1.nextElement());
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("Using iterator interface for retrieving the elements");
            Iterator<Integer> it1= sk.iterator();
            while (it1.hasNext()){
                System.out.println(it1.next());
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("Using List iterator interface for retrieving the elements");
            ListIterator<Integer> lt1= sk.listIterator();
            while (lt1.hasNext()){
                System.out.println(lt1.next());
                System.out.println(lt1.hasPrevious());//checks whether there is an element before the current position of the iterator.
            }




        }
    }


