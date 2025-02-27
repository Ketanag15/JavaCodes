package Searching;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find : ");
        int target = sc.nextInt();
        searchLinear(arr,target);
    }

    private static void searchLinear(int[] arr, int target) {
        boolean flag = false;
        int index = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag){
            System.out.println("The targeted element "+target+" is found at location : "+index);
        } else{
            System.out.println("The targeted element "+target+" is not found.");
        }
    }
}
