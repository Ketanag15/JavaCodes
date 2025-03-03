package basicMaths;

import java.util.Scanner;

public class SqaureOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the Sqaure and cube : ");
        int n = sc.nextInt();
        Sqaure_Cal sq = new Sqaure_Cal();
        Cube_Cal cc = new Cube_Cal();
        System.out.println("The square of the entered number is : " + sq.sq(n));
        System.out.println("The cube of the entered number is : " + cc.cube(n));

    }
}

class Sqaure_Cal{
    public static int sq(int n){
        int sqaure_result = n*n;
        return sqaure_result;
    }
}

class Cube_Cal{
    public static int cube(int n){
        int cube_result = n*n*n;
        return cube_result;
    }
}
