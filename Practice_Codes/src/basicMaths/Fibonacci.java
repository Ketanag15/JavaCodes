package basicMaths;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the series.");
        int n = sc.nextInt();
        fib_series(n);

        System.out.println("Enter the nth number of the series : ");
        int m = sc.nextInt();
        System.out.println("The "+m+" number of the series is : "+nthFibNumber(m));
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

    //Method 2 : to print the Nth term of the series.
    private static int nthFibNumber(int n){
        int first = 0, second = 1;
        int third = 0;
        if(n==1){
            return first;
        }
        if(n==2){
            return second;
        }
        for(int i=3; i<=n; i++){
            third = first+second;
            first = second;
            second = third;
        }
        return third;
    }
}