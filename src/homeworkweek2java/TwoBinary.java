package homeworkweek2java;
import java.util.Scanner;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 *
 */
public class TwoBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: "); //Input first binary number: 10
        int num1 = sc.nextInt(2); // read binary number as int
        System.out.print("Enter second binary number: "); //second binary number: 11
        int num2 = sc.nextInt(2 ); // read binary number as int

        // add the binary numbers10


        int sum = num1 + num2; //Java program to add two binary numbers.

        // convert the sum to binary and print it
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
   sc.close();
    }
}

