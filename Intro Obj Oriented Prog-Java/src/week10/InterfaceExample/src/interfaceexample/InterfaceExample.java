/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week10.InterfaceExample.src.interfaceexample;

/**
 *
 * @author fagun
 */
public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        
        // Vehicle operations
        car.start();
        car.stop();
        truck1.start();
        truck1.stop();
        
        // Maintenance operations
        car.service();
        car.clean();
        truck1.service();
        truck1.clean();
        
        // Repair operation
        car.repair();
        truck1.repair();

        System.out.println(car.maintenanceType);
        System.out.println(truck1.maintenanceType);
        System.out.println(truck2.maintenanceType);
        
        //truck1.maintenanceType = "Monthly";
    }
    
}
