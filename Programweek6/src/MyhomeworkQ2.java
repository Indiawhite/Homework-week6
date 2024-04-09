public class MyhomeworkQ2 {
//Write a Java programme using the following steps.
//2.1 Declare two static variables.
//2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.

    //1.1 Declare two static variables.
     static int variables01 = 5;
     static int variables02 = 5;

    //1.2 Declare one static method.
    static void printStaticVariables() {


        //1.3 Call both static variables into the static method inside the print statement.
        System.out.println("static variable 01 = " + variables01);
        System.out.println("static variable 02 = " + variables02);

    }
    //1.4 Declare the Main method
    public static void main(String[] args) {
        //1.5 Call the above static method into the Main method and run the programme.
        MyhomeworkQ2 obj = new MyhomeworkQ2();
        printStaticVariables();


    }


}
