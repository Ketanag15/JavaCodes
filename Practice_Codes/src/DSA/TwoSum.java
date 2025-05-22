package DSA;

import java.util.*;

//https://leetcode.com/problems/two-sum/description/
// 1 Two Sum

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2};
        int target = 17;
        twoSum(arr, target);
    }
    public static void twoSum(int[] arr, int target){
        int[] res = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                } else{
                    res[0] = -1;
                    res[1] = -1;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
