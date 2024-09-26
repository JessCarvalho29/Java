package Week4;

import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            linkedList.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in LinkedList of size " + size + ": " + duration + " nanoseconds");
        }

        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();

            // Searching for the last element
            int lastIndex = size - 1;
            int lastValue = linkedList.get(lastIndex);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in LinkedList by index of size " + size + ": " + duration + " nanoseconds");
        }

        // Add
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for Add First operation
            long startTime = System.nanoTime();

            // Adding the first element
            linkedList.addFirst(1);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to add first in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for Add Middle operation
            long startTimeMiddle = System.nanoTime();

            // Adding the middle element
            int middleIndex = size/2;
            linkedList.add(middleIndex);

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to add in the middle in LinkedList of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time for Add Middle operation
            long startTimeLast = System.nanoTime();

            // Adding the last element
            int lastIndex = size/2;
            linkedList.addLast(lastIndex);

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to add last in LinkedList of size " + size + ": " + durationLast + " nanoseconds");
        }

        // Remove
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for Remove First operation
            long startTime = System.nanoTime();

            // Removing the first element
            linkedList.removeFirst();

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to remove first in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // Measure time for remove Middle operation
            long startTimeMiddle = System.nanoTime();

            // Removing the middle element
            int middleIndex = size/2;
            linkedList.remove(middleIndex);

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to remove in the middle in LinkedList of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time for remove last operation
            long startTimeLast = System.nanoTime();

            // Removing the last element
            linkedList.removeLast();

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to remove last in LinkedList of size " + size + ": " + durationLast + " nanoseconds");
        }


    }
}
