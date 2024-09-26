
public class Runner {
    public static void main(String[] args) {

        Vehicle Truck1 = new Truck("Black", 2, false, 2, 0);
        System.out.println(Truck1);
        System.out.println(Truck1.isEcoFriendly());

        Vehicle Truck2 = new Truck(4, true, 4, 15.1);
        System.out.println(Truck2);
        System.out.println(Truck2.isEcoFriendly());

        Vehicle Truck3 = new Truck("Gray", 4, true, 2, 10.5);
        System.out.println(Truck3);
        System.out.println(Truck3.isEcoFriendly());

        Vehicle Truck4 = new Truck("Black", 2, false, 1, 0);
        System.out.println(Truck4);
        System.out.println(Truck4.isEcoFriendly());


    }
}
