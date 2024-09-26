
public abstract class Vehicle {

    private String color;
    private int numberOfDoors;
    private boolean gasPowered;

    public Vehicle (String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle (int numberOfDoors, boolean gasPowered) {
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    @Override
    public String toString(){
        if (color != null) {
            return String.format("Color: %s, Number of doors: %d, Gas Powered: %b", color, numberOfDoors, gasPowered);
        } else {
            return String.format("Number of doors: %d, Gas Powered: %b", numberOfDoors, gasPowered);
        }
    }

    public boolean isEcoFriendly (){
        if (numberOfDoors == 2 && !gasPowered) {
            return true;
        }
        return false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }



}
