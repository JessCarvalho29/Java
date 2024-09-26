public class VehicleInfo {

    public static void main(String[] args) {

        Bus mercedes1 = new Bus(20000,55, 2.25, 2, true);
        Truck volvo1 = new Truck(150000, 0.15, 5000, 2, true, "XXL", "Black");


        System.out.println(mercedes1);
        System.out.println("Bus fee: " + mercedes1.feeCalculationToll());
        boolean BusMaintenance = mercedes1.maintenance(true);
        System.out.println(BusMaintenance);
        System.out.println("Bus Mileage: " + mercedes1.checkMileage());

        System.out.println(volvo1);
        System.out.println("Truck fee: " + volvo1.feeCalculationToll());
        String TruckMaintenance = volvo1.maintenance("No");
        System.out.println(TruckMaintenance);
        System.out.println("Truck Mileage: " + volvo1.checkMileage());


    }
}
