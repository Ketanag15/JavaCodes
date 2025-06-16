package DSA;
import java.util.*;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
//34 - First And Last Position Of Element In Sorted Array

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 10;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    public static int[] searchRange(int[] arr, int target){
        int[] result = new int[2];
        int n = arr.length;
        int start = 0, end = n-1, mid = 0;
        int leftIndex = -1, rightIndex = -1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==target){
               for(int i=mid; i>=0; i--){
                   if(arr[i]==arr[mid]){
                       leftIndex=i;
                   } else{
                       break;
                   }
               }
               for(int i=mid; i<n; i++) {
                   if (arr[mid] == arr[i]) {
                       rightIndex = i;
                   } else {
                       break;
                   }
               }
               break;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(rightIndex==-1){
            rightIndex=leftIndex;
        }
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
}
