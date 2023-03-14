package homeworkweek2java;
/**
 *     Write a Java programme using the following steps.
 *     1.1 Declare two instance variables.
 *     1.2 Declare one instance method.
 *     1.3 Call both instance variables into the instance method inside the print statement.
 *     1.4 Declare the Main method.
 *     1.5 Call the above instance method into the Main method and Run the programme
 */

public class InstanceVariables {
    int a = 10; // 1.1 Declare two variable first
    int b = 20;

    // 1.4 call main method
    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables(); //1.5 call instance method
        obj.myMethod();
        //1.5 run the program
    }
    // 1.2  Declare one instance method
    public void myMethod() {
        InstanceVariables r = new InstanceVariables();
        System.out.println(r.a);  // 1.3 call both variable and print statement
        System.out.println(r.b);}
    }
