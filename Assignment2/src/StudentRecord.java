// The purpose of this class is to define arguments and initialize the object StudentRecord in another class.

public class StudentRecord {

    // Creating the four instance variables:
    String firstName;
    String lastName;
    int studentID;
    double gradeCourseOne;

    // Creating an empty constructor to make possible create an object without passing arguments:
    public StudentRecord() {
    }

    // Creating the constructor of the StudentRecord class that takes four arguments:
    public StudentRecord(String firstName, String lastName, int studentID, double gradeCourseOne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeCourseOne = gradeCourseOne;
    }

    // Creating a getter and setter for the argument firstName:
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Creating a getter and setter for the argument lastName:
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getLastName() {

        return lastName;
    }

    // Creating a getter and setter for the argument studentID:
    public void setStudentID(int studentID) {

        this.studentID = studentID;
    }

    public int getStudentID() {

        return studentID;
    }

    // Creating a getter and setter for the argument gradeCourseOne:
    public void setGradeCourseOne(double gradeCourseOne) {

        this.gradeCourseOne = gradeCourseOne;
    }

    public double getGradeCourseOne() {

        return gradeCourseOne;
    }

    // Method to return a letter grade using the value of gradeCourseOne:
    public String studentGrade() {
        if (gradeCourseOne >= 90 && gradeCourseOne <= 100) {
            return "A";
        } else if (gradeCourseOne >= 80 && gradeCourseOne <= 89) {
            return "B";
        } else if (gradeCourseOne >= 70 && gradeCourseOne <= 79) {
            return "C";
        } else if (gradeCourseOne >= 60 && gradeCourseOne <= 69) {
            return "D";
        } else if (gradeCourseOne >= 50 && gradeCourseOne <= 59) {
            return "E";
        } else {
            return "F";
        }
    }

    // Method to return the number os vowels in the first name if it is at least 5 letters long:
    public Integer firstNameVowelCount(){

        // Turning all letters to lower case
        String name = firstName.toLowerCase();

        // Saving the number of letters in the name
        int totalLettersName = firstName.length();

        // Variable to store the number of vowels in the name
        int countVowels = 0;

        if(totalLettersName >= 5) {
            // for to compare each character of the name with all the vowels
            for (int i = 0; i < totalLettersName; i++) {
                // if the character is equal, it will add 1 to the countVowels variable
                if (name.charAt(i) == 'a'
                        || name.charAt(i) == 'e'
                        || name.charAt(i) == 'i'
                        || name.charAt(i) == 'o'
                        || name.charAt(i) == 'u') {
                    // count increments if there is vowel in char[i]
                    countVowels++;
                }
            }
            // Returning the value of countVowels variable
            return countVowels;
        } else {
            // Returning null to filter the return of the method when calling it.
            // Also showing the message if the first name is less than 5 letters long.
            System.out.println("No checking is required");
            return null;
        }

    }


}
