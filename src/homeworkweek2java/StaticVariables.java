package homeworkweek2java;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class StaticVariables {
    static int a = 10; //2.1 declare two static method
    static int b = 15;
    public static void main(String[] args) {  //2.4 Declare the Main method.
        myMethod();
      //Call the static method into the Main method and Run the programme
    }
    public static void myMethod() {  //2.2 Declare one static method
        System.out.println(StaticVariables.a); //2.3 Call both static variables into the static method inside the print statement.
        System.out.println(StaticVariables.b);
    }

}
