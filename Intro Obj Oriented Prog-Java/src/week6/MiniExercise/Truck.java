package week6.MiniExercise;

public class Truck extends Vehicle {

    public int seats;
    public double trunkSpace;

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    public Truck(int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Seats: %d, Trunk Space (cubic feet): %.1f", seats, trunkSpace);
    }

    @Override
    public boolean isEcoFriendly (){
        boolean superReturn = super.isEcoFriendly();
        if (superReturn && seats <= 2 && trunkSpace == 0) {
            return true;
        }
        return false;
    }
}
