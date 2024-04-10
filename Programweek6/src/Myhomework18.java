public class Myhomework18 {
    //18. Write a Java Program using below steps.
    //18.1 Declare your council name as static variables.
    //18.2 Declare your house number as instance variables.
    //18.3 Declare one instance method name borough() and call Static variable
    //18.4 Declare static method name address() and call instance variable
    // 18.5 Call both user defined methods into main method.

    //18.1 Declare your council name as static variables.
    static String council = "Harrow";

    //18.2 Declare your house number as instance variables.
    int HouseNumber =16;

    //18.3 Declare one instance method name borough() and call Static variable
   public void Borough(){
       System.out.println("Belongs to "+ council + "Borough");
   }

    //18.4 Declare static method name address() and call instance variable
     static void Address(){
       Myhomework18 m = new Myhomework18();
        System.out.println("Belongs to" +    m.HouseNumber    + "Address");

    }
    // 18.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        Myhomework18 m = new Myhomework18();
        m.Borough();
        Address();

    }


}
