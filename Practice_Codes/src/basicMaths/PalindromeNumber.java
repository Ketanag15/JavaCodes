package basicMaths;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 different numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        //method 1
        if(x==isPalindrome1(x)){
            System.out.println("Yes "+x+" is a palindrome");
        } else{
            System.out.println("No "+x+" is not a palindrome.");
        }
        //method 2
        isPalindrome2(y);
        //method 3
        if(isPalindrome3(z)){
            System.out.println("Yes "+z+" is a palindrome");
        } else{
            System.out.println("No "+z+" is not a palindrome.");
        }
    }

    //Method 1 : Returning the reverse of the number and compare it with original number in main method.
    private static int isPalindrome1(int n){
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }

    //Method 2 : Not returning anything and comparing the reverse of the number and original number here itself.
    private static void isPalindrome2(int n){
        int rev = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("Yes "+temp+" is a palindrome.");
        } else{
            System.out.println("No, "+temp+" is not a palindrome.");
        }
    }

    //Method 3 : Returning a boolean
    private static boolean isPalindrome3(int n){
        int rev = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return temp==rev;
    }
}
