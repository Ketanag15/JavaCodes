package basicMaths;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the series.");
        int n = sc.nextInt();

        fib_series(n);
    }

    //Method 1 : to print the series upto N numbers.
    private static void fib_series(int n){
        int first = 0, second = 1;
        int third;
        System.out.print(first + " " + second+ " ");
        for(int i=2; i<n;i++){
            third = second+first;
            first = second;
            second = third;
            System.out.print(third+" ");
        }
    }


}
