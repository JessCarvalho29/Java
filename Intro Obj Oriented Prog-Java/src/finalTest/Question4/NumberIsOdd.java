package finalTest.Question4;

import java.util.Scanner;

class NumberIsOdd extends Exception {

    public NumberIsOdd(String str){
        super(str);
    }
}

class Number {
    public static void main(String[] args) {
        analyzeNumber();

    }

    public static void analyzeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int inputNumber = scanner.nextInt();

        try {
            if (inputNumber % 2 != 0) {
                throw new NumberIsOdd("Number is Odd");
            } else {
                System.out.println("Inputed number is: " + inputNumber);
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }


}

