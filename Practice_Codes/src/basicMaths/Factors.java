package basicMaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Enter the number : ");
        long m = sc.nextInt();

        System.out.println(factorOfNumber(n));
        System.out.println(factorOfNumber2(x));
//        System.out.println(factorOfNumber3(m));
    }

    //Method 1 : Normal Iteration method
    private static List<Integer> factorOfNumber(int n) {
        List<Integer> factorlist = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                factorlist.add(i);
            }
        }
        return factorlist;
    }

    //Method 2 : A little optimized - as iteration is reduced by half
    private static List<Integer> factorOfNumber2(int x) {
        List<Integer> factorList = new ArrayList<>();
        for(int i=1; i<=x/2; i++){
            if(x%i==0) {
                factorList.add(i);
            }
        }
        factorList.add(x);
        return factorList;
    }
}
