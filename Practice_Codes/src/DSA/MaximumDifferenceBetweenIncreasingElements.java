package DSA;

//https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16

//2016. Maximum Difference Between Increasing Elements

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1, diff = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                diff = nums[i] - min;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            } else {
                min = nums[i];
            }
        }
        return maxDiff;
    }
}
