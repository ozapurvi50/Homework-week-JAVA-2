package homeworkweek2java;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class StaticInstance2 {
    int a = 10; //4.1 Declare two instance and two static variables.
    int b = 15;
    static int T = 20;
    static int I = 25;

    public static void main(String[] args) {  // 4.5 Declare the Main method.
        StaticInstance2 ced = new StaticInstance2();
        ced.Mymethod();
        var(); //4.6 Call both instance and static methods into the Main method and run the programme
    }

    public void Mymethod() {   //4.2 Declare one instance method.
        StaticInstance2 var = new StaticInstance2();
        System.out.println(var.a);
        System.out.println(var.b);
        System.out.println(StaticInstance2.T);
        System.out.println(StaticInstance2.I);
    }

    static public void var() {  //4.3 Declare one static method.
        System.out.println(StaticInstance2.T); //4.4 Call all four instance and static
        // variables into both instance and static methods inside the
        //print st
        System.out.println(StaticInstance2.I);
        StaticInstance2 xyz = new StaticInstance2();
        System.out.println(xyz.a);
        System.out.println(xyz.b);
    }

}
