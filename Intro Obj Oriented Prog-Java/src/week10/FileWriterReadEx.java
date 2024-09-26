package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterReadEx {
    public static void main(String[] args) {
//        String fileName = "\\Users\\jessicacarvalho\\IdeaProjects\\Intro Obj Oriented Prog-Java\\myFile.txt";
        String fileName = "myFile.txt";

        try {
            // override the previuos content
//            FileWriter myWriter = new FileWriter(fileName);
            // file object to write with append mode (So it will add new lines, do not override)
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write("Good Morning\n");
            myWriter.write("Good Morning\n");
            myWriter.write("Good Morning\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.out.println("Exception Message: " + e.getMessage());
        }

        try {
            File f1 = new File(fileName);
            // Getting line by line
            // For big files, we can use the buffer reader
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println("Successfully read the file.");
                System.out.println(fileData);
            }
            dataReader.close();
//            f1.delete();
        } catch (FileNotFoundException e) {
            System.out.println("unexpected error occurred.");
            e.printStackTrace();
            System.out.println("Exception Message: " + e.getMessage());
        }



    }
}
