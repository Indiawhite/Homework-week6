public class MyhomeworkQ20 {
    //20. Write a Java Program using below steps.
    //20.1 Declare your Spain as static variable.
    //20.2 Declare your United Kingdom as instance variable.
    //20.3 Declare instance method name homeCountry()and call static variable.
    //20.4 Declare static method name holidays() and call instance variable
    //20.5 Call both methods in main method.

    //20.1 Declare your Spain as static variable.
    static String CountryName1 = "Spain";

    //20.2 Declare your United Kingdom as instance variable.
    String CountryName2 = "United Kingdom";

    //20.3 Declare instance method name homeCountry()and call static variable.
   public void HomeCountryMethod(){
       System.out.println("Europe Country -" + CountryName1);
   }

    //20.4 Declare static method name holidays() and call instance variable
    static void HolidaysMethod(){
       MyhomeworkQ20 a = new MyhomeworkQ20();
        System.out.println("My CountryName -" + a.CountryName2);

    }
    //20.5 Call both methods in main method.
    public static void main(String[] args) {
        MyhomeworkQ20 a = new MyhomeworkQ20();
        a.HomeCountryMethod();
        HolidaysMethod();
    }
}
