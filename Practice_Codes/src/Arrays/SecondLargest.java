package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size > 2 : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array.");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array : " + Arrays.toString(arr));
        if(secondLargest(arr, n)!=-1){
            System.out.println("The second largest element is : " + secondLargest(arr,n));
        } else{
            System.out.println("The second largest element doesn't exists. : " + secondLargest(arr,n));
        }
    }

    private static int secondLargest(int[] arr, int n) {
        if(n<2){
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            } else if (arr[i]!=first && arr[i]>second) {
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return  -1;
        }
        return second;
    }
}
