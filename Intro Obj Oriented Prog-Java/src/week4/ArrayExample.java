package week4;

import java.util.Arrays;

import static week4.ArrayAverage.arraySorting;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10,20,70,40,50};

        System.out.println("Iterating for a array using for loop: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Iterating for a array using for each: ");
        for (int i : a) {
            System.out.println(i);
        }

        System.out.println("Iterating for a array using for each: ");
        for (int i = 0; i < a.length; i++) {
            if(i == a.length-1) {
                System.out.println(a[i]);
            }
        }

        ArrayAverage.avg(a);

        int[] sortedArray = arraySorting(b);
        for (int i : sortedArray){
            System.out.println(i);
        }

        // Declaring and initializing 2D array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("Printing 2D array using for loop:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Number of rows
        System.out.println("Number of rows: " + arr.length);
        // Number of columns
        System.out.println("Number of columns: " + arr[0].length);

    }

}
