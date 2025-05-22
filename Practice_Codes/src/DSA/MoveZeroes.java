package DSA;
import java.util.*;

//https://leetcode.com/problems/move-zeroes/description/
//283 Move Zeroes

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,5,0,44,0};
        moveZeroes(nums);
    }
        public static void moveZeroes(int[] nums) {
            int index = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] != 0){
                    nums[index] = nums[i];
                    index++;
                }
            }
            while(index<nums.length){
                nums[index] = 0;
                index++;
            }
            System.out.println(Arrays.toString(nums));
    }
}
