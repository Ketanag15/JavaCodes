package DSA;

//https://leetcode.com/problems/find-the-middle-index-in-array/description/
//1991. Find the Middle Index in Array

public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(middleIndex(arr));
    }
    public static int middleIndex(int[] arr){
        int leftSum = 0, totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        for (int i=0; i<arr.length; i++) {
            if(leftSum == totalSum-leftSum-arr[i]){
                return  i;
            }
            leftSum+=arr[i];
        }
        return  -1;
    }
}
