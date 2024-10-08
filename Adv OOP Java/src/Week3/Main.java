package Week3;

public class Main {

    // Here we change directly the attribute
    // ArrayList we use get and set (encapsulation) - It's safer, and we have more control of the attributes.

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        numbers[2] = 35;
        System.out.println("Updated third element: " + numbers[2]);

        System.out.println("Array length: " + numbers.length);

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
