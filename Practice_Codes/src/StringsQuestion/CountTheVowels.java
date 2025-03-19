package StringsQuestion;

import java.util.Scanner;

//Program to Count the Number of vowels we’re going to check how many vowels are present in a given String
public class CountTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("No of vowels in the String is: "+countVowels(str));
        sc.close();
    }
    private static int countVowels(String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
