package institute.practice1;
import java.util.ArrayList;
public class Practice {
    public static void main(String[] args) {
          int[] k={1,43,6,8,8,0,9,7,6,7,5,4,5,};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int j : k) {
            boolean y = !arrayList.contains(j);
            if (y) arrayList.add(j);
/*
            boolean y=true;
            for (int j = 0; j < i; j++) {
                if(x[i]==x[j]){
                    y=false;
                    break;
                }
            }
            System.out.println();
            if(y){
                arrayList.add(x[i]);
            }
            System.out.println();
*/
        }
       System.out.println(arrayList);
        System.out.println();

                String s = "123657324235";
                String result = "";

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (result.indexOf(ch) == -1) {
                        result += ch;
                    }
                }

                System.out.println(result);  // Output: 1236574
            }
        }
