package institute.assignment.forPatterns;

public class PatternRightTriangle {
    public static void main(String[] args){
        int row=5;
        for(int  i=0; i<=5;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
