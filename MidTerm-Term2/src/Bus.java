public class Bus extends Vehicles{

    private int passengerCapacity;
    private double feePerPassenger;
    private int mileageInKm;

    public Bus(int mileageInKm, int passengerCapacity, double feePerPassenger, int numberOfDoors, boolean useOfGas, String size, String color) {
        super(numberOfDoors, useOfGas, size, color);
        this.mileageInKm = mileageInKm;
        this.passengerCapacity = passengerCapacity;
        this.feePerPassenger = feePerPassenger;
    }

    public Bus(int mileageInKm, int passengerCapacity, double feePerPassenger, int numberOfDoors, boolean useOfGas) {
        super(numberOfDoors, useOfGas);
        this.mileageInKm = mileageInKm;
        this.passengerCapacity = passengerCapacity;
        this.feePerPassenger = feePerPassenger;
    }

    @Override
    public double feeCalculationToll() {
        return feePerPassenger * passengerCapacity;
    }

    @Override
    public double checkMileage() {
        return mileageInKm;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Mileage: %d, Passenger capacity: %d, Fee per passenger: %.2f", mileageInKm, passengerCapacity, feePerPassenger);
    }

}
