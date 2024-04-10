public class MyhomeworkQ5 {
    //Write a program for a calculator with addition, subtraction, multiplication, and division
    //methods all with parameters and use string concatenation methods. (Note: Two static
    //and Two instance methods.)


        public static String add(double a, double b) {
            return a + " + " + b + " = " + (a + b);
        }

        public static String subtract(double a, double b) {
            return a + " - " + b + " = " + (a - b);
        }

        public String multiply(double a, double b) {
            return a + " * " + b + " = " + (a * b);
        }

        public String divide(double a, double b) {
            if (b == 0) {
                return "Error: Division by zero!";
            }
            return a + " / " + b + " = " + (a / b);
        }

        public static void main(String[] args) {
            MyhomeworkQ5 calc = new MyhomeworkQ5();

            System.out.println(MyhomeworkQ5.add(5, 3));        // Static method usage for addition
            System.out.println(MyhomeworkQ5.subtract(10, 7)); // Static method usage for subtraction
            System.out.println(calc.multiply(4, 6));        // Instance method usage for multiplication
            System.out.println(calc.divide(8, 2));          // Instance method usage for division
        }
    }


