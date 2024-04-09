public class MyhomeworkQ3 {
    //3. Write a Java programme using the following steps.
    //3.1 Declare one instance and one static variable.
    //3.2 Declare one instance method.
    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.

    //3.1 Declare one instance and one static variable.
    int instantVariable = 12;
    static int staticVariable = 10;

    //3.2 Declare one instance method.
    void  instantMethod() {
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.

        System.out.println("Instance Variables = " + instantVariable);
        System.out.println("static Variables = " + staticVariable);
     }
    //3.3 Declare one static method.
    static void staticMethod(){
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        MyhomeworkQ3 d = new MyhomeworkQ3();
        System.out.println(" Instance Variables = "+ d.instantVariable);
        System.out.println("static Variables = " + staticVariable);

    }
   //3.5 Declare the Main method.
   public static void main(String[] args) {
       //3.6 Call both instance and static methods into the Main method and run the programme.
       MyhomeworkQ3 d = new MyhomeworkQ3();
       d.instantMethod();
       staticMethod();

   }
}





















