package week9;

public class ThrowsExceptionExample {

     // Modified validate method with 'throws' declaration for multiple exceptions
    public static void validate(int age) throws ArithmeticException, IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    // main method
    public static void main(String[] args) {
        try {
            validate(13);
            validate(-1); // This will throw IllegalArgumentException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
    
}
