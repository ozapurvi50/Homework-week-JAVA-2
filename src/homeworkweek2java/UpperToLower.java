package homeworkweek2java;

/**
 *
 * Write a program to convert the upper case to lower case in java
 */

import java.util.Scanner;
public class UpperToLower {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter word in Capital: ");
            String txt = scanner.nextLine();
            System.out.println(txt.toLowerCase()); //convert the upper case to lower case in java

        }
    }


