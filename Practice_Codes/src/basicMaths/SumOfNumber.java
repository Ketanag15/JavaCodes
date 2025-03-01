package basicMaths;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The sum of digits of number is : " + sum(n));
    }

    private static int sum(int n){
        int sumNum = 0;
        while(n>0){
            int rem = n%10;
            sumNum += rem;
            n/=10;
        }
        return sumNum;
    }
}

