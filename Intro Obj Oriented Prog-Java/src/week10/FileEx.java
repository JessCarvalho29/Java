package week10;

import java.io.File;
import java.io.IOException;

public class FileEx {
    // File is a class
    // File class is inside java.io package

    public static void main(String[] args) throws IOException {
    try {
        // documents\\myFile.doc -> \\ == \

        File myObj = new File("myFile.docx");
        // Built in method to create new file, that return true or false
        if(myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        // set file to be only read:
//         myObj.setReadOnly();

        if(myObj.exists()){
            System.out.println("The name of the file is: " + myObj.getName());
            System.out.println("The absolute path of the file is: " + myObj.getAbsolutePath());
            System.out.println("Is file writable?: " + myObj.canWrite());
            System.out.println("Is file readable?: " + myObj.canRead());
            System.out.println("The size of the file is: " + myObj.length());
        } else {
            System.out.println("The file do not exists");
        }


    } catch (IOException e) {
        System.out.println("An error occurred");
        // printing all details why the system is getting exception:
        e.printStackTrace();
    }


    }
}
