package week9;
import java.io.*;

// When to Use Each Type of Exception

//Checked Exceptions:
//File operations: Handle IOException when reading from or writing to files.
//Database operations: Handle SQLException when interacting with a database.
//Networking: Handle UnknownHostException or MalformedURLException for network-related operations.

//Unchecked Exceptions:
//Validation: Throw IllegalArgumentException if method arguments are invalid.
//Logical errors: Throw NullPointerException if an operation is performed on a null object reference.

//Errors:
//System-level failures: Generally, you don't handle Error in your application. Instead, design your application to avoid conditions that might lead to an Error.

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            FileReader file = new FileReader("test.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "test.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            // Close file input
            fileInput.close();
        } catch (FileNotFoundException e) {
            // Handle specific exception
            System.out.println("File not found exception: " + e.getMessage());
        } catch (IOException e) {
            // Handle specific exception
            System.out.println("I/O exception: " + e.getMessage());
        } finally {
            // Code to be executed regardless of an exception
            System.out.println("This block is always executed");
        }
    }

}
