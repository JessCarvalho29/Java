/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week10.InterfaceExample.src.interfaceexample;

/**
 *
 * @author fagun
 */

/* An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * It is used to achieve abstraction and multiple inheritance in Java.
 * It also represents the IS-A relationship.
 * It is used to achieve abstraction.
*/

public interface Maintenance {
    String maintenanceType = "Regular"; // this will be compiled with public static final String maintenanceType
    void service(); // this will be compiled with public abstract void service()
    void clean(); // this will be compiled with public abstract void clean ()
}
