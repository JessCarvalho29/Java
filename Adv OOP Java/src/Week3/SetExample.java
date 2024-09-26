package Week3;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {

        // Set: parent - hashset: child
        // you can creat a parent and a child because of inheritance
    
        java.util.Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.add("Alice");

        if (names.contains("Alice")) {
            System.out.println("Alice is in the set!");
        }

        names.remove("Charlie");

        System.out.println("Set size of the set: " + names.size());

        for (String name : names) {
            System.out.println(name);
        }
    }
}

// Its fast, but it's not optimal choose to connect with the database
