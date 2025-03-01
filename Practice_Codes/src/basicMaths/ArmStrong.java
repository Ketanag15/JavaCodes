package basicMaths;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(isArmStrong(n)){
            System.out.println("It is Armstrong");
        } else{
            System.out.println("Not Armstrong.");
        }
    }

    private static boolean isArmStrong(int n){
        int digits = count(n);
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,digits);
            n/=10;
        }
        return temp==sum;
    }

    private static int count(int n){
        int num = 0;
        while(n>0){
            int temp = n%10;
            num++;
            n/=10;
        }
        return num;
    }
}
