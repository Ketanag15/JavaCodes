package basicMaths;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Enter the number : ");
        int y = sc.nextInt();
        System.out.println("Enter the number : ");
        long z = sc.nextLong();

        System.out.println(factorOfNumber(x));
        System.out.println(factorOfNumber2(y));
        System.out.println(factorOfNumber3(z));
    }

    //Method 1 : Normal Iteration method
    private static List<Integer> factorOfNumber(int x) {
        List<Integer> factorlist = new ArrayList<>();
        for(int i=1; i<=x; i++){
            if(x%i==0){
                factorlist.add(i);
            }
        }
        return factorlist;
    }

    //Method 2 : A little optimized - as iteration is reduced by half
    private static List<Integer> factorOfNumber2(int y) {
        List<Integer> factorList = new ArrayList<>();
        for(int i=1; i<=y/2; i++){
            if(y%i==0) {
                factorList.add(i);
            }
        }
        factorList.add(y);
        return factorList;
    }

    private static List<Long> factorOfNumber3(long z){
        List<Long> factorsList = new ArrayList<>();
        double sqrt = Math.sqrt(z);
        for(long i =1; i<=sqrt; i++){
            if(z%i==0){
                if(z/i==i){
                    factorsList.add(i);
                } else{
                    factorsList.add(i);
                    factorsList.add(z/i);
                }
            }
        }
        return factorsList;
    }
}
