package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        ReverseNumberReverseTriangle(n);
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
    /*
    1
    23
    456
    78910
     */
    public static void FloydsTriangle(int n){
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    /*
      *
     ***
    *****
     */
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
        A
       ABC
      ABCDE
     */
    public static void character_Pyramid(int n){
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    /*
        1
       121
      12321
     */
    public static void Palindromic_Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(k);
            }
            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    /*
        A
       ABA
      ABCBA
     ABCDCBA
    ABCDEDCBA
     */
    public static void characterPalindromicPyramid(int n){
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(c);
                c++;
            }
            c-=2;
            for(int k=i-1; k>=1; k--){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
    /*
     *********
      *******
       *****
        ***
         *
     */
    public static void invertedPyramid(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=(2*i)-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
     12345
     1234
     123
     12
     1
     */
    public static void ReverseNumberTriangle(int n){
        for(int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
    54321
    5432
    543
    54
    5
     */
    public static void ReverseNumberReverseTriangle(int n){
        for(int i=n; i>=1; i--){
            for(int j=n; j>n-i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
