package homeworkweek2java;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 */

import java.util.Scanner;
public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt(); //Input a Decimal Number : 5

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary number is: " + binary);
        sc.close();
    }
}