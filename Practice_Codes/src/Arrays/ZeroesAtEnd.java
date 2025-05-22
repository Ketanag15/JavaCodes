package Arrays;

import java.util.Scanner;
import java.util.Arrays;

//Shift all the zeroes at the end of array and maintain the order of other non-zero elements.
public class ZeroesAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array with 0.");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array : " + Arrays.toString(arr));
        shiftZeroes(arr, n);
    }

    //Approach 1 : two pointer approach - no new array.
    private static void shiftZeroes(int[] arr, int n) {
       int index = 0;
       for(int i=0; i<n; i++){
           if(arr[i] != 0){
               arr[index] = arr[i];
               index++;
           }
       }
       while(index<n){
           arr[index] = 0;
           index++;
       }
        System.out.println("New Array with all zeroes shifted : " + Arrays.toString(arr));
    }

    //Approach 2 : new Array and two pointer.
    public static void shiftZeroes2(int[] arr, int n){
        int[] newArr = new int[n];
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
