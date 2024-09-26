package assignment1_200584372;

public class HouseRunner {

    public static void main(String[] args) {

        // Instantiate the House object in 3 unique ways:
        House object1 = new House(4);
        House object2 = new House("Toronto", "Jessica", 1500000, 3);
        House object3 = new House("Vancouver", 1);
        House object4 = new House();

        // Using printf, output the values of all three instance variables of the 3 House objects:
        System.out.printf("Object 1: \n Number of Bedrooms: %d \n", object1.numberOfBedrooms);
        System.out.printf("Object 2: \n Location: %s \n Owner: %s \n Price: %.2f \n Number of Bedrooms: %d \n", object2.location, object2.getOwner(), object2.price, object2.numberOfBedrooms);
        System.out.printf("Object 3: \n Location: %s \n Number of Bedrooms: %d \n", object3.location, object3.numberOfBedrooms);
        System.out.printf("Object 4: \n Location: %s \n Owner: %s \n Price: %.2f \n Number of Bedrooms: %d \n", object4.location, object4.getOwner(), object4.price, object4.numberOfBedrooms);
    }
}
