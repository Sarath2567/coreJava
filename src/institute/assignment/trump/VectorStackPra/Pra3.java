package institute.assignment.trump.VectorStackPra;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class Pra3 {
        public static void main(String[] args) {
            System.err.println("Stack");
            Stack<String> s = new Stack<>();System.out.println("----------------");
            s.push("New");s.push("Oops");s.push("java");s.push("object");
            s.push("Main");System.out.println(s);
            System.out.println(s.search("java"));System.out.println(s.search("object"));
            System.out.println(s.search("New"));System.out.println(s.search("Main"));
            System.out.println("Popped " + s.pop());System.out.println("------------------");
            System.out.println("Top element " + s.peek());System.out.println("------------------");
            System.out.println(s.isEmpty());

            Iterator<String> itr=s.iterator();
            System.out.println("Access Elements by using Iterator: ");
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println("---------------");
            System.out.println("Access Elements by using ListIterator: ");
            ListIterator<String> lit=s.listIterator();
            while (lit.hasNext()){
                System.out.println(lit.next());
            }
            while (lit.hasPrevious()){
                System.out.println(lit.previous());
            }
            System.out.println("----------------");
            System.out.println(" Access Elements by using Enumeration: ");
            Enumeration<String> Enum=s.elements();
            while(Enum.hasMoreElements()){
                System.out.println(Enum.nextElement());
            }

        }
    }

