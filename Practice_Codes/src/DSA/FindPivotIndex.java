package DSA;

//https://leetcode.com/problems/find-pivot-index/description/
//724. Find Pivot Index
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,31,3,3,0,1,5};
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
