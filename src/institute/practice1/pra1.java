package institute.practice1;


public class pra1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" New");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(6,7);
        System.out.println(sb); // Output: Hello, World!

    }
}
