package assignment1_200584372;

import java.util.Scanner;

public class Tasks5_8 {
    static void creatingArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you'd like to add in your array?");
        int userInputArrayLength = scanner.nextInt();

        int[] userArray = new int[userInputArrayLength];

        populatingArray(userArray);

        displayingArray(userArray);
    }

    static void populatingArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Choose a number to insert at index " + i + " of the array: ");
            int userInputArrayIndex = scanner.nextInt();
            array[i] = userInputArrayIndex;
        }
    }

    static void displayingArray(int[] array){
        System.out.println("The values of your array are: ");
        for(int i : array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        creatingArray();
    }

}
