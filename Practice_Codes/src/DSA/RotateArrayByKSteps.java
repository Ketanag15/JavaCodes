package DSA;

import java.util.*;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 10;
        int n = arr.length;
        rotate(arr, k ,n);
    }

    public static void rotate(int[] arr, int k , int n){
        if(k>n){
            k = k%n;
        }
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse(int[] arr, int start, int end){
        for(int i=start; i<end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
