package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size > 2 : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array.");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the steps to rotate the array ");
        int d = sc.nextInt();

        arrayRotation(arr,d, n);
    }

    private static void arrayRotation(int[] arr, int d, int n){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0 , n-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
