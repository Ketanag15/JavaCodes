package StringsQuestion;

import java.util.Scanner;

//Count Characters in a string
public class CharacterInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        System.out.println("The number of characters in the string :"+str+" is :"+countofChar(str));
        System.out.println("The number of characters in the string :"+str+" is :"+countChar(str));
    }

    //method 1 : inbuilt method
    private static int countofChar(String str){
        return str.length();
    }

    //Method 2 : For loop - iteration
    private static int countChar(String str){
        int n = 0;
        for(int i=0; i<str.length(); i++){
            n++;
        }
        return n;
    }
}
