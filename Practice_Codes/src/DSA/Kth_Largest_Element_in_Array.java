package DSA;
import java.util.*;

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// 215. Kth Largest Element in an Array
public class Kth_Largest_Element_in_Array {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4,9,10,11};
        int k = 2;
        System.out.println(findKthLargest(arr,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[(nums.length)-k];
    }
}
