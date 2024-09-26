import java.util.LinkedList;

public class Challenge {
    // If a point A wants to reach exactly to point Band the distance between them is 8 DF units and
    // in each step point A moves half the distance to point B (A minimum step is 1 DF unit).
    // After how many steps will A reach B? How many steps will take if the distance was 2048 DF units?
    // What it was 8,388,608 DF units?

    public static void Challenge(int pointB){

        LinkedList<Integer> steps = new LinkedList<>();
        steps.add(0);
        int pointA = 0;

        while (steps.getLast() != pointB){
            int lastValueList = steps.getLast();
            pointA += lastValueList;
            int step = (pointB - pointA)/2;

            if (step <= 1){
                step = 1;
                steps.add(step);
                steps.addFirst(pointB);
                break;
            }

            if (lastValueList == 0){
                steps.removeFirst();
            }

            steps.add(step);
        }

        System.out.printf("%d DF Units = %d steps ", pointB, steps.size());
        System.out.println(steps);

    }

    public static void main(String[] args) {
        Challenge(8);
        Challenge(2048);
        Challenge(8388608);
    }
}
