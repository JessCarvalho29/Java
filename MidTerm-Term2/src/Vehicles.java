public abstract class Vehicles {

    private int numberOfDoors;
    private boolean useOfGas;
    private String size;
    private String color;

    public Vehicles(int numberOfDoors, boolean useOfGas, String size, String color){
        this.numberOfDoors = numberOfDoors;
        this.useOfGas = useOfGas;
        this.size = size;
        this.color = color;
    }

    public Vehicles(int numberOfDoors, boolean useOfGas){
        this.numberOfDoors = numberOfDoors;
        this.useOfGas = useOfGas;
    }

    @Override
    public String toString(){
        if(color != null) {
            return String.format("Number of Doors: %d, Use of Gas: %b, Size: %s, Color: %s", numberOfDoors, useOfGas, size, color);
        } else {
            return String.format("Number of Doors: %d, Use of Gas: %b", numberOfDoors, useOfGas);
        }
    }

    public abstract double checkMileage();

    public abstract double feeCalculationToll();

    public boolean maintenance(boolean airbagServiceIsDue){
        return airbagServiceIsDue;
    }

    public String maintenance(String regularMaintenanceIsDue){
        if(regularMaintenanceIsDue == "Yes") {
            return "The regular maintenance needs to be done";
        } else {
            return "The regular maintenance does not needs to be done";
        }
    }

}
