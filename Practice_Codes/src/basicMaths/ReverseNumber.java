package basicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The reverse of "+n+" is : "+numberReverse(n));
        sc.close();
    }
    private static int numberReverse(int n){
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }
}
