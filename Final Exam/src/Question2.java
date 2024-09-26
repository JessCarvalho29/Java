public class Question2 {
    public static void main(String[] args){

        int [] grade = {70, -2, 40, -1};

        // Using the For Loop tp iterate in the array
        System.out.println("The positive values of array divided by two are: ");
        for(int i = 0; i < grade.length; i++){
            if(grade[i] > 0){
                System.out.println(grade[i]/2);
            }
        }
    }
}
