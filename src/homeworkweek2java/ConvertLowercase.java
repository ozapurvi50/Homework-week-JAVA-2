package homeworkweek2java;
import java.util.*;
/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *
 */
public class ConvertLowercase {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            System.out.print("Input a String: ");
            String line = in.nextLine(); //Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.

            line = line.toLowerCase();
            System.out.println(line);
in.close();
        }

    }



