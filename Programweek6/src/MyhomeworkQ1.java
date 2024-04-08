public class MyhomeworkQ1 {
    //Write a Java programme using the following steps.
    //1.1 Declare two instance variables.
    //1.2 Declare one instance method.
    //1.3 Call both instance variables into the instance method inside the print statement.
    //1.4 Declare the Main method.
    //1.5 Call the above instance method into the Main method and run the programme.


    //1.1 Declare two instance variables.

    int variables1 = 10;
    int variables2 = 15;

    //1.2 Declare one instance method.
    void printVariables() {


   //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println("Instance variable 1 = " + variables1);
        System.out.println("Instance variable 2 = " + variables2);

    }
    //1.4 Declare the Main method
    public static void main(String[] args) {
        //1.5 Call the above instance method into the Main method and run the programme.
        MyhomeworkQ1 obj = new MyhomeworkQ1();
        obj.printVariables();


    }
}








