package homeworkweek2java;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class FehrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Farenheit to Celsuis");
        //int result = scan.nextInt();
        {
            System.out.println("Enter Fahrenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value -32) * 5/9;
            System.out.print("Celsius is: ");
            System.out.println(Math.round(valueFinal*10.0/10.0));
scan.close();

        }

    }
}
