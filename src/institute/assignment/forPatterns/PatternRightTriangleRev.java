package institute.assignment.forPatterns;

public class PatternRightTriangleRev {
    public static void main(String[] args){
        int row=5;
        for(int i=5; i>=1;i--){
            for (int j=1;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
