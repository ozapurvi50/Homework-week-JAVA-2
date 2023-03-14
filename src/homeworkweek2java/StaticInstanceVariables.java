package homeworkweek2java;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class StaticInstanceVariables {

    int u = 15; // 3.1 Declare one instance and one static variable.
    static int a = 10;

    public static void main(String[] args) { //3.5 Declare the Main method.
        StaticInstanceVariables obj = new StaticInstanceVariables();
        obj.birthDate();
        age(); //3.6 Call both instance and static methods into the Main method and run the programme.

    }
    public void birthDate() {  //3.2 Declare one instance method.
        StaticInstanceVariables t = new StaticInstanceVariables();
        System.out.println(t.u);
    } //* 3.4 Call both instance and static variables into both instance and static methods inside the

    //print statement.
    public static void age() //3.3 Declare one static method.
    {
        System.out.println(StaticVariables.a); //* 3.4 Call both instance and static variables into both instance and static methods inside the
        // print statement.
    }
}
