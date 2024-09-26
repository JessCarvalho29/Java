package week2.Exercise;

public class BoxRunner {
    public static void main(String[] args){

        Box box1 = new Box("Box", 30, false);
        Box box2 = new Box("Box2", 10, true);
        Box box3 = new Box("Box3", 20, true);

        box1.setBoxName("Box1");
        box2.setBoxSize(15);
        box3.setBoxInUse(false);

        System.out.println("All Boxes");
        System.out.println(box1.getBoxName() + " | Size: " + box1.getBoxSize() + " | In use: " + box1.getBoxInUse());
        System.out.println(box2.getBoxName() + " | Size: " + box2.getBoxSize() + " | In use: " + box2.getBoxInUse());
        System.out.println(box3.getBoxName() + " | Size: " + box3.getBoxSize() + " | In use: " + box3.getBoxInUse());

        box2.increaseBoxSize(10);

        box1.consultBoxInUse();
        box2.consultBoxInUse();


    }
}
