public class Truck extends Vehicles {

    private double feePerKg;
    private double weightInKg;
    private int mileageInKm;

    public Truck(int mileageInKm, double feePerKg, double weightInKg, int numberOfDoors, boolean useOfGas, String size, String color) {
        super(numberOfDoors, useOfGas, size, color);
        this.mileageInKm = mileageInKm;
        this.feePerKg = feePerKg;
        this.weightInKg = weightInKg;

    }

    public Truck(int mileageInKm, double feePerKg, double weightInKg, int numberOfDoors, boolean useOfGas) {
        super(numberOfDoors, useOfGas);
        this.mileageInKm = mileageInKm;
        this.feePerKg = feePerKg;
        this.weightInKg = weightInKg;
    }

    @Override
    public double feeCalculationToll() {
        return feePerKg * weightInKg;
    }

    @Override
    public double checkMileage() {
        return mileageInKm;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Mileage: %d, Weight(Kg): %.1f, Fee per Kg: %.2f", mileageInKm, weightInKg, feePerKg);
    }


}


