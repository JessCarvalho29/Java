package Week5;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

import static java.lang.System.nanoTime;

public class TimeComplexity {
    public static void main(String[] args) {

        DBConnect dbConnect = new DBConnect();
        Connection connection = dbConnect.connect();

        try {
            Statement sqlStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = sqlStatement.executeQuery("SELECT * FROM students");

            ArrayList<String> arrayList = new ArrayList<>();
            LinkedList<String> linkedList = new LinkedList<>();
            HashMap<Integer, String> hashMap = new HashMap<>();
            String[] array = new String[100];
            int index = 0;

            // Populate the data into ArrayList, LinkedList, HashMap, and Array

            long startTimeArrayList = System.nanoTime();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                arrayList.add(name);
            }
            long endTimeArrayList = System.nanoTime();
            long durationArrayListAdd = endTimeArrayList - startTimeArrayList;
            System.out.println("Array List populate items duration: " + durationArrayListAdd);

            resultSet.first();
            long startTimeLinkedList = System.nanoTime();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                linkedList.addLast(name);
            }
            long endTimeLinkedList = System.nanoTime();
            long durationlLinkedListAdd = endTimeLinkedList - startTimeLinkedList;
            System.out.println("Linked List populate items duration: " + durationlLinkedListAdd);

            resultSet.first();
            long startTimeHashMap = System.nanoTime();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                hashMap.put(id, name);
            }
            long endTimeHashMap = System.nanoTime();
            long durationlHashMapAdd = endTimeHashMap - startTimeHashMap;
            System.out.println("Hash Map populate items duration: " + durationlHashMapAdd);

            resultSet.first();
            long startTimeArray = System.nanoTime();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                if (index < array.length) {
                        array[index++] = name;
                    }
                }
            long endTimeArray = System.nanoTime();
            long durationArrayAdd = endTimeArray - startTimeArray;
            System.out.println("Array populate items duration: " + durationArrayAdd);

            // Search the data into ArrayList, LinkedList, HashMap, and Array

            startTimeArrayList = System.nanoTime();
            String arrayListGet = arrayList.get(50);
            endTimeArrayList = System.nanoTime();
            long durationArrayListSearch = endTimeArrayList - startTimeArrayList;
            System.out.println("Array List get item duration: " + durationArrayListSearch);

            startTimeLinkedList = System.nanoTime();
            String linkedListGet  = linkedList.get(6);
            endTimeLinkedList = System.nanoTime();
            long durationlLinkedListSearch = endTimeLinkedList - startTimeLinkedList;
            System.out.println("Linked List get items duration: " + durationlLinkedListSearch);

            startTimeHashMap = System.nanoTime();
            String HashMapGet = hashMap.get(50);
            endTimeHashMap = System.nanoTime();
            long durationlHashMapSearch = endTimeHashMap - startTimeHashMap;
            System.out.println("Hash Map get items duration: " + durationlHashMapSearch);

            startTimeArray = System.nanoTime();
            String ArrayGet = array[50];
            endTimeArray = System.nanoTime();
            long durationArraySearch = endTimeArray - startTimeArray;
            System.out.println("Array get items duration: " + durationArraySearch);

            // Remove the data from ArrayList, LinkedList, HashMap, and Array

            startTimeArrayList = System.nanoTime();
            arrayList.remove(50);
            endTimeArrayList = System.nanoTime();
            long durationArrayListRemove = endTimeArrayList - startTimeArrayList;
            System.out.println("Array List remove item duration: " + durationArrayListRemove);

            startTimeLinkedList = System.nanoTime();
            linkedList.remove(50);
            endTimeLinkedList = System.nanoTime();
            long durationlLinkedListRemove = endTimeLinkedList - startTimeLinkedList;
            System.out.println("Linked List remove items duration: " + durationlLinkedListRemove);

            startTimeHashMap = System.nanoTime();
            hashMap.remove(50);
            endTimeHashMap = System.nanoTime();
            long durationlHashMapRemove = endTimeHashMap - startTimeHashMap;
            System.out.println("Hash Map remove items duration: " + durationlHashMapRemove);

            startTimeArray = System.nanoTime();
            String[] newArray = new String[array.length-1];
            for(int i=0, k=0; i<array.length; i++) {
                if (k < newArray.length) {
                    if (!Objects.equals(array[i], "Student50")) {
                        newArray[k] = array[i];
                        k++;
                    }
                }
            }
            endTimeArray = System.nanoTime();
            long durationArrayRemove = endTimeArray - startTimeArray;
            System.out.println("Array remove items duration: " + durationArrayRemove);

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
