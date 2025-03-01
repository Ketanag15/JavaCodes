package basicMaths;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table : ");
        int n = sc.nextInt();
        System.out.println("Enter the value till which you want to print the table : ");
        int x = sc.nextInt();
        table(n,x);
    }

    private static void table(int n, int x) {
        for (int i = 1; i <= x; i++) {
            int res = n*i;
            System.out.println(n+" * "+i+" = "+res);
        }
    }
}
