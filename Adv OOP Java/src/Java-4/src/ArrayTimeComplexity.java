
public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for search operation
            // It is like a stopwatch
            long startTime = System.nanoTime();

            // Searching for the last element
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == size - 1) {
                    found = true;
                    break;
                }
            }

            // Record the current time of the computer
            long endTime = System.nanoTime();
            // Measure the difference of time
            long duration = endTime - startTime;

            System.out.println("Time taken for search in array by index of size " + size + ": " + duration + " nanoseconds");
        }

        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for search operation
            // It is like a stopwatch
            long startTime = System.nanoTime();

            // Searching for the last element
            boolean found = false;
            for (int value : array) {
                if (value == size - 1) {
                    found = true;
                    break;
                }
            }

            // Record the current time of the computer
            long endTime = System.nanoTime();
            // Measure the difference of time
            long duration = endTime - startTime;

            System.out.println("Time taken for search in array by value of size " + size + ": " + duration + " nanoseconds");
        }

        // Add
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time to add first
            long startTime = System.nanoTime();

            // Adding the first element
            int[] newArray = new int[array.length+1];
            newArray[0] = 0;
            for(int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    newArray[k] = array[i];
                    k++;
                }
            }

            // Record the current time of the computer
            long endTime = System.nanoTime();
            // Measure the difference of time
            long duration = endTime - startTime;

            System.out.println("Time taken to add first of array of size " + size + ": " + duration + " nanoseconds");

            // Measure time to add in middle
            long startTimeMiddle = System.nanoTime();

            // Adding the first element
            int[] newArray2 = new int[array.length+1];
            int middleIndex = size /2;
            for(int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != middleIndex) {
                    newArray2[k] = array[i];
                    k++;
                } else if(array[i] == middleIndex){
                    newArray2[middleIndex] = middleIndex;
                }
            }

            // Record the current time of the computer
            long endTimeMiddle = System.nanoTime();
            // Measure the difference of time
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to add in middle of array of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to add last
            long startTimeLast = System.nanoTime();

            // Adding the last element
            int lastIndex = size - 1;
            int[] newArray3 = new int[array.length+1];
            for(int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != lastIndex) {
                    newArray3[k] = array[i];
                    k++;
                } else if(array[i] == lastIndex){
                    newArray3[lastIndex] = lastIndex;
                }
            }

            // Record the current time of the computer
            long endTimeLast = System.nanoTime();
            // Measure the difference of time
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to add in middle of array of size " + size + ": " + durationLast + " nanoseconds");

        }

        // Remove
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time to remove first
            long startTime = System.nanoTime();

            // Removing the first element
            int[] newArray = new int[array.length-1];
            for(int i=0, k=0; i<array.length; i++) {
                if (array[i] != 0) {
                    newArray[k] = array[i];
                    k++;
                }
            }

            // Record the current time of the computer
            long endTime = System.nanoTime();
            // Measure the difference of time
            long duration = endTime - startTime;

            System.out.println("Time taken to remove first of array of size " + size + ": " + duration + " nanoseconds");

            // Measure time to remove in middle
            long startTimeMiddle = System.nanoTime();

            // Removing the middle element
            int[] newArray2 = new int[array.length-1];
            int middleIndex = size /2;
            for(int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != middleIndex) {
                    newArray2[k] = array[i];
                    k++;
                }
            }

            // Record the current time of the computer
            long endTimeMiddle = System.nanoTime();
            // Measure the difference of time
            long durationMiddle = endTimeMiddle - startTimeMiddle;

            System.out.println("Time taken to remove in middle of array of size " + size + ": " + durationMiddle + " nanoseconds");

            // Measure time to remove last
            long startTimeLast = System.nanoTime();

            // Removing the last element
            int lastIndex = size - 1;
            int[] newArray3 = new int[array.length-1];
            for(int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != lastIndex) {
                    newArray3[k] = array[i];
                    k++;
                }
            }

            // Record the current time of the computer
            long endTimeLast = System.nanoTime();
            // Measure the difference of time
            long durationLast = endTimeLast - startTimeLast;

            System.out.println("Time taken to remove last of array of size " + size + ": " + durationLast + " nanoseconds");

        }

    }
}

