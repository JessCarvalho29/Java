package week10;

public class CustomExceptionExample {

    //method to check the age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            // throw an object of user defined exception
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }
}

// Creating a customized exception that inherits from Exception class
class InvalidAgeException extends Exception{

    public InvalidAgeException(String str){
        // calling the constructor of the parent class Exception
        super(str);
    }

}