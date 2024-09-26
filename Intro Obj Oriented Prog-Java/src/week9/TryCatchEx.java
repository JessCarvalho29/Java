package week9;

public class TryCatchEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 50, num2 = 0;

//        int div1 = num1 / num2; //may throw exception
//        System.out.println("rest of the code");
        
        
        //Example 1: Arithmetic Exception Example
//        System.out.println("Example 1: Arithmetic Exception Example");
//        try {
//            int div = num1 / num2; //may throw exception
//            System.out.println("division: " + div);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            //System.out.println("Can't divided by zero");
//            //System.out.println("Result: "+num1/1);
//            System.out.println(e.getMessage());
//        }
//        int sum = num1+num2;
//        System.out.println("Addition: "+sum);
//        System.out.println("rest of the code after try-catch");

        
        //Example 2: ArrayIndexOutOfBounds Exception Example
//        System.out.println("Example 2: ArrayIndexOutOfBounds Exception Example");
//
//        try {
//            int arr[] = {1, 3, 5, 7};
//            System.out.println(arr[11]); //may throw exception
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
        
        
        //Example 3: Multi-catch block Example (maintain the order of exceptions (i.e. from most specific to most general))
//        System.out.println("Example 3: Multi-catch block Example");
//        try {
//            int a[] = new int[5];
//            a[7] = 30 / 2;
//            a[5] = 20;
//            //a[4] = 30 / 0;
//            String s = null;
//            System.out.println(s.length());

//      //Order is important:
//      //In Java, the order of catch blocks is important because exceptions in Java are checked in a top-down manner.
//      //This means that if a more general exception class is caught before a more specific one, the specific exception block will never be reached.
//      //This is because exceptions are handled based on their inheritance hierarchy, where a superclass exception can catch all its subclass exceptions.

//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBounds Exception occurs: " + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception occurs: " + e.getMessage());
//        } catch(Exception e) {
//            System.out.println("Parent Exception occurs: " + e.getMessage());
//        }
//        //In the provided example, the specific exceptions ArrayIndexOutOfBoundsException and ArithmeticException are caught first,
//        //ensuring that these specific conditions are handled before the more general Exception catch block, which serves as a fallback for any other exceptions.

        
        //Example 4: finally block Example
//        System.out.println("Example 4: finally block Example");
//        try {
//            int div = num1 / 0; //may throw exception
//            System.out.println("division: " + div);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code after try-catch");
    }
}
