public class MyhomeworkQ19 {
    //19. Write a Java Program using below steps.
    //19.1 Declare one of your group member names as instance variable.
    //19.2 Declare one of your group member names as static variable.
    //19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    //variables.
    //19.4 Declare static method name agile() and call both variable
    //19.5 Call both user defined methods into main method.
    //Note: Declare 1 local variables in all user defined method and main method and print in to statement


    //19.1 Declare one of your group member names as instance variable.
    String Name1  = "Vaishali";

    //19.2 Declare one of your group member names as static variable.
    static String name2 = "Kinjal";

    //19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    //variables.
    void SeleniumMethod(){
        System.out.println("Group Member Name -" + Name1);
        System.out.println("Group Member Name - " + name2);
    }
    //19.4 Declare static method name agile() and call both variable
     static void AgileMethod(){
        MyhomeworkQ19 b = new MyhomeworkQ19();
        System.out.println("Group Member Name- "+ b.Name1);
        System.out.println("Group Member Name-" + name2);

    }
    //19.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        MyhomeworkQ19 b = new MyhomeworkQ19();
        b.SeleniumMethod();
        AgileMethod();
    }


}
