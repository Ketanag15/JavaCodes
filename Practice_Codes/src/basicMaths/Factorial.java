package basicMaths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is = "+fact(n));
    }
    private static long fact(int n){
        long factOfN = 1;
        for(int i=1; i<=n; i++){
            factOfN *=i;
        }
        return factOfN;
    }
}
