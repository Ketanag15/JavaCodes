package DSA;

//https://leetcode.com/problems/missing-number/
//268. Missing Number
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int numSum = 0;
        for(int i=0; i<n; i++){
            numSum += nums[i];
        }
        return sum-numSum;
    }
}
