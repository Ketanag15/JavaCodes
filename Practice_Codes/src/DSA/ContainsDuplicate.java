package DSA;

import java.util.*;

//https://leetcode.com/problems/contains-duplicate/description/
//217. Contains Duplicate

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,7};
        int[] arr2 = {1,2,3,4};
        if(haveDuplicates(arr2)){
            System.out.println("Contains Duplicates");
        } else{
            System.out.println("Doesn't Contains Duplicates");
        }

    }
    public static boolean haveDuplicates(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                return  true;
            }
            map.put(arr[i], 1);
        }
        return false;
    }
}
