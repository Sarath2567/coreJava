package institute.assignment.forPatterns;

public class PatternSquare {
    public static void main(String[] args){
        int i=1;
        int r=5;
        while(i<=r){
            int j=1;
            while(j<=r){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
