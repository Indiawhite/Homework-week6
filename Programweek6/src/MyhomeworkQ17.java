public class MyhomeworkQ17 {
    //Write a Java Program using below steps.
    //17.1 Declare your city as instance variables.
    //17.2 Declare your country as static variables.
    //17.3 Declare one instance method and call static variable in print statement
    //17.4 Declare static method and call instance variable in print Statement.
    //17.5 Call both user defined methods into main method.

    //17.1 Declare your city as instance variables.
    String city = "Surat";

    //17.2 Declare your country as static variables.
    static String country = "India";

    //17.3 Declare one instance method and call static variable in print statement
    void PrintCityMethod(){
        System.out.println("static country=" + country);
     }

    //17.4 Declare static method and call instance variable in print Statement.
    static void PrintCountryMethod(){
        MyhomeworkQ17 d = new MyhomeworkQ17();
        System.out.println("String city = " + d.city);
    }

    //17.5 Call both user defined methods into main method.
    public static void main(String[] args){
        MyhomeworkQ17 d = new MyhomeworkQ17();
        d.PrintCityMethod();
        PrintCountryMethod();

    }

}
