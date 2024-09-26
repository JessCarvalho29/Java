/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.InterfaceExample.src.interfaceexample;

/**
 *
 * @author fagun
 */
public class Car implements Vehicle, Maintenance {

    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }

    @Override
    public void repair() {
        System.out.println("Car being repaired...");
    }

    @Override
    public void service() {
        System.out.println("Car being serviced...");
    }

    @Override
    public void clean() {
        System.out.println("Car being cleaned...");
    }
}
