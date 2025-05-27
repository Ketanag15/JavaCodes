package Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5};
        kadane(arr);
    }

    public static void kadane(int[] arr){
        int sum = 0, n = arr.length, maxSum = 0;
        for(int start=0; start<n; start++){
            for (int end = 0; end < n; end++) {
                for (int i = start; i <=end ; i++) {
                    System.out.print(arr[i]);
                    sum += arr[i];
                    if(maxSum<sum){
                        maxSum = sum;
                    }
                }
                System.out.print(" ");
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("MaxSum is : " + maxSum);
    }
}
