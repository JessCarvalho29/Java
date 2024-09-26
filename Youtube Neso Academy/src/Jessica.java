import java.awt.*;
import java.util.Arrays;

public class Jessica {
    public static void main(String[] args) {
        //Calling the method created at this class:
        sayHi();

        int[] array1 = {1, 2, 3, 4, 5};
        //System.out.println(array1[0]);
        //Print the array using toString()
        System.out.println(Arrays.toString(array1));

        change(array1);
        printArray(array1);

        //Point
        Point p = getPoint();
        System.out.println(p);
    }

    //Creating a method:
    public static void sayHi(){
        System.out.println("Hi from Jessica!");
    }

    //Changing an element of array
    public static void change(int[] numbers){
        numbers[0] = 1;
        numbers[1] = 0;
    }

    //Iterating an array
    public static void printArray(int[] numbers){
        //for(int i = 0; i < numbers.length; i++){
        // Normal For replaced with enhanced For
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    //Point:
    public static Point getPoint(){
        return new Point(1, 2);
    }



}

