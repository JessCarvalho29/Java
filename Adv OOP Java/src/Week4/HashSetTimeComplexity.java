package Week4;
import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            hashSet.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in HashSet of size " + size + ": " + duration + " nanoseconds");
        }

        // HashSet is an unordered collection and the item access is through the value, it does not have index.
        // So it is not possible to measure the search by index

        // Add
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time to add first
            long startTime = System.nanoTime();

            // Adding the first element
            for (int value : hashSet){
                if (value == 0){
                    hashSet.add(0);
                }
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to add first in HashSet of size " + size + ": " + duration + " nanoseconds");

            // Measure time to add in middle
            long startTimeMiddle = System.nanoTime();

            // Adding the middle element
            int middleValue = size / 2;
            for (int value : hashSet){
                if (value == middleValue){
                    hashSet.add(middleValue);
                }
            }

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to add in middle of HashSet of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to add last
            long startTimeLast = System.nanoTime();

            // Adding the last element
            int lastValue = size - 1;
            for (int value : hashSet){
                if (value == lastValue){
                    hashSet.add(lastValue);
                }
            }

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to add last in HashSet of size " + size + ": " + durationLast + " nanoseconds");

        }

        // Remove
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time to remove first
            long startTime = System.nanoTime();

            // Removing the first element
            hashSet.remove(0);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to remove first of a HashSet of size " + size + ": " + duration + " nanoseconds");

            // Measure time to remove in middle
            long startTimeMiddle = System.nanoTime();

            // Removing the middle element
            int middleValue = size/2;
            hashSet.remove(middleValue);

            long endTimeMiddle = System.nanoTime();
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to remove in middle of a HashSet of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to remove last
            long startTimeLast = System.nanoTime();

            // Removing the last element
            int lastValue = size-1;
            hashSet.remove(lastValue);

            long endTimeLast = System.nanoTime();
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to remove last of a HashSet of size " + size + ": " + durationLast + " nanoseconds");


        }

    }
}
