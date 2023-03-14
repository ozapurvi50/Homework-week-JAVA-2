package homeworkweek2java;

import java.util.Scanner;
/**
 * . Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number:");
        int A = scanner.nextInt();
        System.out.println("Enter Second number:");
        int AB = scanner.nextInt();
        System.out.println("Third number:");
        int AA = scanner.nextInt();
        System.out.println("Fourth number:");
        int AAB = scanner.nextInt();
        Calculator t = new Calculator();
        t.pluss();
        t.plusss();
        add();
        addi();
        int ans = (A + AB + AA + AAB); //addition,
        int ans1 = (A * AB * AA * AAB); //subtraction,
        int ans2 = (A / AB / AA / AAB); //multiplication
        int ans3 = (A - AB - AA - AAB); // division
        System.out.println("Addition is: " + ans); //use string concatenation method
        System.out.println("Multiplication is: " + ans1);
        System.out.println("Division is:  " + ans2);
        System.out.println("Subtraction is : " + ans3);
        scanner.close();
    }
    public static void add() {
        int A;
    }  //Two static methods
    public static void addi() {
        int AB;
    }
    public void pluss() {int AA;} //Two instance methods.
    public void plusss() {
        int AAB;
    }
}


