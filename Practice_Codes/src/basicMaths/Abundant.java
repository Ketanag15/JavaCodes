package basicMaths;

import java.util.Scanner;

//A Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant number.
public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAbundant(n)){
            System.out.println("Yes Abundant");
        } else{
            System.out.println("Not abundant number");
        }
    }
    private static boolean isAbundant(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum>n;
    }
}
