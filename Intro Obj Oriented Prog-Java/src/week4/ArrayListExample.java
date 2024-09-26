package week4;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango"); // Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Printing the array list object
        System.out.println("Initial list: " + list);

        for(String fruit : list){
            System.out.println(fruit);
        }
        // Accessing the element
        System.out.println("Accessing element: " + list.get(1));

        // Changing the element
        // Syntax: (index to change the value, new value)
        list.set(1, "Orange");
        System.out.println("After updating: " + list.get(1));

        // Example of contains method
        boolean result = list.contains("Apple");
        System.out.println("Contains 'Apple'? " + result);

        // Example of indexOf method
        int index = list.indexOf("Banana");
        System.out.println("Index of 'Banana' is " + index);

        // Example of remove method
        list.remove("Mango");
        System.out.println("After removing 'Mango': " + list);

        // Example of size method
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Example of clear method
        list.clear();
        System.out.println("After clearing the ArrayList: " + list);

        ArrayList<Integer> intList = new ArrayList<Integer>(20);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);
        // At this point, list has 3 elements but its capacity is 20;
        list.trimToSize(); // Trim the capacity to match the number of elements
        ArrayList<Float> floatList = new ArrayList<Float>();
        ArrayList<Character> charList = new ArrayList<Character>();

    }
}
