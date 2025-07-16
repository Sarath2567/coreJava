package institute.arrayPractice;

import java.util.Arrays;

public class TwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {7,9,11,16,20,40};
        int[] arr2 = {2,6,8,18,21,24,30};

//        int length = arr1.length + arr2.length;
//        int[] combined = new int[length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            combined[i] = arr1[i];
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr2.length; i++) {
//            combined[arr1.length + i] = arr2[i];
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//
//        System.out.print("Combined Array: ");
//        Arrays.sort(combined);
//        for (int num : combined) {
//            System.out.print(num + " ");
//        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;int j=0;int k=0;
        int n1=arr1.length;
        int n2=arr2.length;
        int[] index= new int[n1+n2];
        while(i<n1 && j<n2) {
            if (arr1[i] < arr2[j]) {
                index[k++]=arr1[i++];
            } else {
                index[k++]=arr2[j++];
            }
        }
        while(i<n1){
            index[k++]=arr1[i++];
        }
        while(j<n2){
            index[k++]=arr2[j++];
        }
        System.out.println("Merged sorted array"+Arrays.toString(index));
//        for(int num:index){
//            System.out.print(num+" ");
//        }
    }
}


