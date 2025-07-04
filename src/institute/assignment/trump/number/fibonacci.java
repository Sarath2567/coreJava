package institute.assignment.trump.number;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n=19;
        int a=0;
        int b=1;
//        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++){
            int temp = a+b;
//            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
        System.out.println(b);
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2;  i <=n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[5]+" "+arr[10]+" "+arr[19]);
    }
}
