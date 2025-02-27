package Searching;

import java.util.*;
public class BinarySearch {
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
        System.out.println("Enter the element you want to find : ");
        int target = sc.nextInt();
        searchBinary(arr, target);
    }

    private static void searchBinary(int[] arr, int target){
        int start= 0, end = arr.length-1;
        boolean flag = false;
        while(start<=end){
            int mid = (end+start)/2;
            if(arr[mid] == target){
                System.out.println("The target element "+target+" is found at location : "+mid);
                flag = true;
                break;
            }else if(arr[mid]>target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if(!flag){
            System.out.println("The target element "+target+" is not found.");
        }
    }
}
