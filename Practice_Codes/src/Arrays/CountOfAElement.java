package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CountOfAElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(arr));

        System.out.println("Enter the element : ");
        int x = sc.nextInt();
        System.out.println("The count of the element in the array is : " +ElementCount(arr, n, x));
    }

    private static int ElementCount(int[] arr, int n, int x){
        int count = 0;
//        for (int i = 0; i<n; i++) {
//            if(arr[i] == x ){
//                count++;
//            }
//        }
        for (int i : arr) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
}
