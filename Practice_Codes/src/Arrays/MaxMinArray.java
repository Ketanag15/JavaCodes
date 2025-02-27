package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        System.out.println("The elements of array should be sorted..");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum element of array is : " + MaxArray(arr));
        System.out.println("The minimum element of array is : " + MinArray(arr));
    }

    private static int MaxArray(int[] arr){
        int max = arr[0];
//        for(int i=0;i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
        for(int j : arr){
            if(j>max){
                max=j;
            }
        }
        return max;
    }
    private static int MinArray(int[] arr){
        int min = arr[0];
//        for(int i=0;i<arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
        for(int i : arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
