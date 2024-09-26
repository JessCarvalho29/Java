import java.util.HashSet;

public class Solution {

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        // Add all positive integers in the array to the set
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Find the smallest missing positive integer
        int smallestMissing = 1;
        while (set.contains(smallestMissing)) {
            smallestMissing++;
        }

        return smallestMissing;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};

        int result = solution(A);
        System.out.println(result);


//        int [] array = new int[10];
//        for ( int i = 0 ; i < array.length ; i++ ) {
//            array[i] = ((int)(Math.random()*100+1));
//        }
//        Arrays.sort( array );
//        for ( int i = 0 ; i < array.length ; i++ ) {
//            System.out.println(array[i]);
//        }


    }

}
