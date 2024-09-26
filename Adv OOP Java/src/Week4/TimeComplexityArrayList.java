package Week4;

import java.util.ArrayList;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            arrayList.contains(size - 1);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in ArrayList of size " + size + ": " + duration + " nanoseconds");
        }

        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();

            // Searching for the last element by index
            int lastValue = arrayList.get(size - 1);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in ArrayList by index of size " + size + ": " + duration + " nanoseconds");
        }

        // Add
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time to add first
            long startTime = System.nanoTime();

            // Adding the first element
            arrayList.addFirst(0);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to add first in ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Measure time to add middle
            long startTimeMiddle = System.nanoTime();

            // Adding the middle element
            int middleIndex = size /2;
            arrayList.add(middleIndex);

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to add in middle in ArrayList of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to add middle
            long startTimeLast = System.nanoTime();

            // Adding the last element
            int lastIndex = size-1;
            arrayList.addLast(lastIndex);

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to add last in ArrayList of size " + size + ": " + durationLast + " nanoseconds");

        }

        // Remove
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time to remove first
            long startTime = System.nanoTime();

            // Removing the first element
            arrayList.removeFirst();

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to remove first in ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Measure time to remove middle
            long startTimeMiddle = System.nanoTime();

            // Removing the middle element
            int middleIndex = size /2;
            arrayList.remove(middleIndex);

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to remove in middle in ArrayList of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to remove middle
            long startTimeLast = System.nanoTime();

            // Removing the last element
            arrayList.removeLast();

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to remove last in ArrayList of size " + size + ": " + durationLast + " nanoseconds");

        }

    }
}
