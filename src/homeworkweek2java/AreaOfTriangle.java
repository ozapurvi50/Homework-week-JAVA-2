package homeworkweek2java;

/**
 *Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        int a,b,c,per; double area;
        System.out.println("Enter value for sides of Triangle: ");
        Scanner h = new Scanner(System.in);
        a = h.nextInt();
        b = h.nextInt();
        c = h.nextInt();
        per = (a+b+c)/2; // finding parameters
        area=Math.sqrt(per *(per-a)*(per-b)*(per-c)); //use number 12,14,20
        System.out.println("Area of Triangle " + area);
 h.close();

    }
}

