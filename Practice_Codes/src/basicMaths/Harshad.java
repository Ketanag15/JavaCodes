package basicMaths;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isHarshad(n)){
            System.out.println("Yes Harshad");
        } else{
            System.out.println("Not Harshad");
        }
    }

    private static boolean isHarshad(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum += rem;
            temp/=10;
        }
        return n%sum==0;
    }
}
