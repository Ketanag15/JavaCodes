package conversion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input
        System.out.println("Enter the binary: ");
        int binary = sc.nextInt(); // Read binary number as an integer

        // Convert binary to decimal and print the result
        System.out.println(binary + " converted into decimal is: " + binToDecConv(binary));
    }

    // Method to convert a binary number (entered as an integer) to decimal
    private static int binToDecConv(int binary) {
        int decimal = 0, n = 0; // Initialize decimal result and power counter

        // Process each digit from right to left
        while (binary > 0) {
            int temp = binary % 10; // Extract the last digit (0 or 1)
            decimal += temp * Math.pow(2, n); // Multiply by the corresponding power of 2
            n++; // Increase the power counter
            binary /= 10; // Remove the last digit
        }

        return decimal;
    }
}
