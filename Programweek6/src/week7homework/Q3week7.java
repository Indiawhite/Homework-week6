package week7homework;
//3. Declare multidimensional array and store 5 countries and their capital and print them in
//console.

public class Q3week7 {
    public static void main(String[] args) {
        String [][]  MyCountries = {{" India,Uk,America,Spain ,Greece "},{"Delhi ,London, NewYork, Madrid, athens "}};
        System.out.println("countries and capital name");
        for (int p = 0; p < MyCountries.length;++p) {
            for (int i = 0; i < MyCountries[p].length; ++i)

            System.out.println(MyCountries[p][i]);
        }
    }
}
