package week9;

public class ThrowExceptionExample {

//    The IllegalArgumentException is an unchecked exception in Java that is thrown to indicate an illegal or unsuitable
//    argument passed to a method. It is one of the most common exceptions in Java.
//    Used to reject inappropriate or incorrect arguments, ensuring the input meets the required criteria.

//    The ArithmeticException is generally used to indicate exceptional arithmetic conditions, but here it is used to indicate that
//    the person is not eligible to vote.

    public static void validate(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }else if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } 
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        try{
            validate(-13);
            validate(1);
        }
        catch(ArithmeticException|IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
      
    }
}
