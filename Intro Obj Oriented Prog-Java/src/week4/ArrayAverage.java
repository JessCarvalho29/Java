package week4;

import java.util.Arrays;

public class ArrayAverage {
    static void avg(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        float avg = (float) sum / arr.length;
        System.out.println("Addition of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);

    }

    // If the method will return a value and will receive an array as a parameter, the datatype of the method needs to be an array
    static int[] arraySorting(int[] arr){
        Arrays.sort(arr);
        return arr;
    }


}
