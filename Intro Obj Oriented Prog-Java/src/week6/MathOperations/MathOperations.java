package week6.MathOperations;

public class MathOperations {

    // These are examples of Compile-time polymorphism (Overloading the method)

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {
        MathOperations O1 = new MathOperations();

        System.out.println("Sum of 5 and 10: " + O1.add(5, 10));
        System.out.println("Sum of 5, 10 and 15: " + O1.add(5, 10, 15));
        System.out.println("Sum of 3.5 and 2.5: " + O1.add(3.5, 2.5));
        System.out.println("Sum of 1 and 2: " + O1.add("1", "2"));
    }
}