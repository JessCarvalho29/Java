package Week3;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

//        Creating a two-dimensional arrayList
        ArrayList<ArrayList<Integer>> dimensionalArray = new ArrayList<>();

        int[] valuesRow1 = {5, 3, 7, 1};
        int[] valuesRow2 = {6, 2, 8, 1};
        int[] valuesRow3 = {1, 4, 9, 1};

        // Row:
        for (int i = 0; i < 3; i++) {

            dimensionalArray.add(new ArrayList<>());

            int[] array;
            if(i == 0){
                array = valuesRow1;
            } else if (i == 1) {
                array = valuesRow2;
            } else {
                array = valuesRow3;
            }

            // Column:
            for (int j = 0; j < 4; j++) {
                dimensionalArray.get(i).add(array[j]);
            }
        }

        System.out.println(dimensionalArray);
        System.out.println("Size rows: " + dimensionalArray.size());
        System.out.println("Size columns: " + dimensionalArray.getFirst().size());


    }
}
