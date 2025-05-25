package DSA;

import java.util.*;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//26. Remove Duplicates from Sorted Array

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4,4,5,6};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr){
        int index = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
