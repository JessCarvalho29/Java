/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.InterfaceExample.src.interfaceexample;

/**
 *
 * @author fagun
 */
public class Truck implements Vehicle, Maintenance{
    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopping...");
    }

    @Override
    public void repair() {
        System.out.println("Truck being repaired...");
    }

    @Override
    public void service() {
        System.out.println("Truck being serviced...");
    }

    @Override
    public void clean() {
        System.out.println("Truck being cleaned...");
    }
}
