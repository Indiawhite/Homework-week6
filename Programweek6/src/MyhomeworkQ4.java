public class MyhomeworkQ4 {
    //4. Write a Java programme using the following steps.
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.


    //4.1 Declare two instance and two static variables.
    int instantVariable1 = 100;
    int instantVariable2 = 200;

    static int staticVariable1 = 101;
    static int staticVariable2 = 102;

    //4.2 Declare one instance method.
    void  instantMethod() {
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println("Instance Variables = " + instantVariable1);
        System.out.println("Instance Variables = " + instantVariable2);
        System.out.println("static Variables = " + staticVariable1);
        System.out.println("static Variables = " + staticVariable2);
    }
    //4.3 Declare one static method
    static void staticMethod(){
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        MyhomeworkQ4 p = new MyhomeworkQ4();
        MyhomeworkQ4 m = new MyhomeworkQ4();
        System.out.println(" Instance Variables = "+ p.instantVariable1);
        System.out.println("Instance Variables = " + m.instantVariable2);
        System.out.println("static Variables = " + staticVariable1);
        System.out.println("static Variables = " + staticVariable2);

    }
    //4.5 Declare the Main method.
    public static void main(String[] args) {
        //4.6 Call both instance and static methods into the Main method and run the programme.
        MyhomeworkQ4 p = new MyhomeworkQ4();
        MyhomeworkQ4 m = new MyhomeworkQ4();
        p.instantMethod();
        m.instantMethod();
        staticMethod();


    }

}
