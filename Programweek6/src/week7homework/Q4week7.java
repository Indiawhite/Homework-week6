package week7homework;
//4. Write if else condition and print your group name in console else others group name.

public class Q4week7 {
    public static void main(String[] args) {
        String myGroupName = "software tester ";
        String userGroupName = "YourGroup";

        if (userGroupName.equals(myGroupName)) {
            System.out.println("Welcome to the " + myGroupName + " group!");
        } else {
            System.out.println("Welcome to the " + userGroupName + " group!");
        }
    }
}






