package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));

        //Original Array is reversed here in this method. [1,2,3] --> [3,2,1]
        ArrayReverse(arr);

        //The reversed array is reversed again, so it will be converted into original array again.
        // [3,2,1] --> [1,2,3]
        ArrayReverse2(arr);
    }

    //Method 1 : Without using extra array, swapping the elements within the same array.
    private static void ArrayReverse(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array without using Extra Array : ");
        System.out.println(Arrays.toString(arr));
    }

    //Method 2 : With using a new array. Copying all elements of first array to the second array in reverse order.
    private static void ArrayReverse2(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[arr.length-i-1] ;
        }
        System.out.println("Reversed Array with using Extra Array : ");
        System.out.println(Arrays.toString(newArr));
    }
}