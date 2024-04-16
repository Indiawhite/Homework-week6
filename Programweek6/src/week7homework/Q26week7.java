package week7homework;
//26. Write a Java program to reverse a word.Sample Output:Input a word: dsaf Reverse word: fasd

public class Q26week7 {
    public static void main(String[] args) {
        String Name = "Deval";
        for(int i = Name.length()-1; i>=0; i--){
            System.out.print(Name.charAt(i));

        }
    }

}
