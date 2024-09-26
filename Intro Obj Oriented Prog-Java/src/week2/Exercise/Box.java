package week2.Exercise;

public class Box {

    public String boxName;
    public int boxSize;
    private boolean boxInUse;

    public Box(String boxName, int boxSize, boolean boxInUse){
        this.boxName = boxName;

        if(boxSize > 0){
            this.boxSize = boxSize;
        }

        this.boxInUse = boxInUse;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public void setBoxSize(int newBoxSize) {
        if(newBoxSize > 0){
            this.boxSize = newBoxSize;
        }
    }

    public void setBoxInUse(boolean newBoxInUse) {
        if(newBoxInUse == !boxInUse) {
            this.boxInUse = newBoxInUse;
        }
    }

    public String getBoxName(){
        return boxName;
    }

    public int getBoxSize(){
        return boxSize;
    }

    public boolean getBoxInUse(){
        return boxInUse;
    }

    public void increaseBoxSize(int increaseSize){
        if(increaseSize > 0){
            boxSize = boxSize + increaseSize;
            System.out.println("This is our new Box Size for " + this.boxName + ": " + boxSize);
        }
    }

    public void consultBoxInUse(){
        if(boxInUse){
            System.out.println(this.boxName + " is already in use");
        } else {
            System.out.println(this.boxName + " is available");
        }
    }


}
