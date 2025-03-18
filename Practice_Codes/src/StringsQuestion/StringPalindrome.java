package StringsQuestion;

import java.util.Scanner;

//Check whether the provided string is a palindrome or not.
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter the String : ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("The provided string is a palindrome.");
        } else{
            System.out.println("The provided string is not a palindrome.");
        }
    }
    private static boolean isPalindrome(String str){
        String temp = "";
        String rev = str;
        for(int i = str.length()-1; i>=0; i--){
            temp += str.charAt(i);
        }
        return temp.equals(rev);
    }
}
