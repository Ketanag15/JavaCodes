package basicMaths;

import java.util.Scanner;

//A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPerfect(n)){
            System.out.println("Yes Perfect.");
        } else{
            System.out.println("Not Perfect.");
        }
    }

    private static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}
