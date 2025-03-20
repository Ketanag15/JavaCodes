package conversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal: ");
        int decimal = sc.nextInt();

        // Convert the decimal number to binary and print the result
        System.out.println(decimal + " converted into binary will be: " + decToBinConv(decimal));
    }

    // Method to convert a decimal number to binary representation
    private static List<Integer> decToBinConv(int decimal) {
        List<Integer> binary = new ArrayList<>(); // List to store binary digits

        // Convert decimal to binary using repeated division by 2
        while (decimal > 0) {
            int temp = decimal % 2; // Get the remainder (binary digit)
            binary.add(temp); // Add to the list
            decimal /= 2; // Reduce the decimal number by dividing by 2
        }

        // Reverse the list to get the correct binary representation
        for (int i = 0; i < binary.size() / 2; i++) {
            int temp = binary.get(i); // Swap elements
            binary.set(i, binary.get(binary.size() - 1 - i));
            binary.set(binary.size() - 1 - i, temp);
        }

        return binary;
    }
}
