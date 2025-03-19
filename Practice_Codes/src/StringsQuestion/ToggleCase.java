package StringsQuestion;

import java.util.Scanner;

//If the letter is in uppercase we will convert it to lowercase and if it is in uppercase we will convert it to lowercase.
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mixed string: ");
        String str = sc.nextLine();
        System.out.println("The Toggled String is : " + toggledString(str));
    }
    private static String toggledString(String str){
        String s1 = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                s1 = s1+Character.toLowerCase(str.charAt(i));
            } else{
                s1 = s1+Character.toUpperCase(str.charAt(i));
            }
        }
        return s1;
    }
}
