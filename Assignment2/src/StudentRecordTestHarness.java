// The purpose of this class is to create new objects using the class StudentRecord

import java.util.Scanner;

public class StudentRecordTestHarness {
    public static void main(String[] args){

        // Instantiating a new StudentRecord object and passing the appropriate arguments:
        StudentRecord student1 = new StudentRecord("Jessica", "Carvalho", 123456, 90);

        // Printing the state of each argument of the object:
        System.out.println("Student 1");
        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Grade Course: " + student1.getGradeCourseOne());
        System.out.println("Letter Grade: " + student1.studentGrade());

        //Instantiating a new StudentRecord object without passing arguments:
        StudentRecord student2 = new StudentRecord();

        // Asking the user to input the first name:
        Scanner inputFirstName = new Scanner(System.in);
        //System.out.println("Please, insert the student first name.");
        System.out.println("Please, insert the student first name that is 5 letters long.");

        // Saving the information in a variable and using the set method to populate the value in the object:
        String firstNameStudent2 = inputFirstName.nextLine();
        student2.setFirstName(firstNameStudent2);


        // Asking the user to input the last name:
        Scanner inputLastName = new Scanner(System.in);
        System.out.println("Please, insert the student last name.");

        // Saving the information in a variable and using the set method to populate the value in the object:
        String lastNameStudent2 = inputLastName.nextLine();
        student2.setLastName(lastNameStudent2);

        // Asking the user to input the student ID:
        Scanner inputStudentID = new Scanner(System.in);
        System.out.println("Please, insert the student ID.");

        // Saving the information in a variable and using the set method to populate the value in the object:
        int IDStudent2 = inputStudentID.nextInt();
        student2.setStudentID(IDStudent2);

        // Asking the user to input the student grade:
        Scanner inputGrade = new Scanner(System.in);
        System.out.println("Please, insert the student grade.");

        // Saving the information in a variable and using the set method to populate the value in the object:
        double gradeStudent2 = inputGrade.nextDouble();
        student2.setGradeCourseOne(gradeStudent2);

        // Printing all information of the object, including the studentGrade method:
        System.out.println("Student 2");
        System.out.println("First name: " + student2.getFirstName());
        System.out.println("Last name: " + student2.getLastName());
        System.out.println("Student ID: " + student2.getStudentID());
        System.out.println("Grade Course: " + student2.getGradeCourseOne());
        System.out.println("Letter Grade: " + student2.studentGrade());
        // Printing the vowels count with the firstNameVowelCount method:
        if(student2.firstNameVowelCount() != null)
            // Show the return the message if the first name is 5 letters long:
            System.out.println("Vowels Count: " + student2.firstNameVowelCount());
        }
}
