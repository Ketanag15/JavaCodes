package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        charRepeat(n);
    }

    /*
     ****
     ****
     ****
     ****
     */
    public static void starSqaure(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *
    **
    ***
    ****
     */
    public static void rightTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
       *
      **
     ***
    ****
     */
    public static void reverseRightTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    *****
    ****
    ***
    **
    *
     */
    public static void upsideRightTriangle(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    *****
     ****
      ***
       **
        *
     */
    public static void reverseUpsideRightTriangle(int n){
        for(int i=n; i>=1; i--){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    1
    22
    333
    4444
    55555
     */
    public static void numbersI(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    /*
    1
    12
    123
    1234
     */
    public static void counts(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
    A
    AB
    ABC
    ABCD
     */
    public static void characterPrint(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    /*
    A
    BB
    CCC
    DDDD
     */
    public static void charRepeat(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
