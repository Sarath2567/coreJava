package institute.assignment.forPatterns;

public class PatternTriangle {
    public static void main(String[] args) {
        int row=5;
        for (int i=1;i<=row;i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//reverse Triangele
// public static void main(String[] args){
//    int n = 5;
//    for(int i=n-1; i>=1; i--) {
//        for(int j=n; j>=i; j--) {
//            System.out.print(" ");
//        }
//        for(int k=1; k<=2*i-1; k++) {
//            System.out.print("^");
//        }
//        System.out.println();
//    }
//
//}