package StringsQuestion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Reverse String is : "+StringReverse(str));
    }

    private static String StringReverse(String str) {
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
