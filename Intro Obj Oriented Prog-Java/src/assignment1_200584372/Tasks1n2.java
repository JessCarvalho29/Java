package assignment1_200584372;

import java.util.Scanner;

public class Tasks1n2 {
    static void arithmeticOperation(){

        boolean keepPlaying = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any value to do some calculation");

        char startInput = scanner.next().charAt(0);
        if(startInput != '\0'){

            do {
                System.out.println("First number: ");
                int numberOneInput = scanner.nextInt();

                System.out.printf("Press + for addition \nPress - for subtraction%nPress * for multiplication  \nPress / for division \nPress %% for modulus \nPress e for exponentiation \nOperator: ");
                char operatorInput = scanner.next().charAt(0);

                System.out.println("Second number: ");
                int numberTwoInput = scanner.nextInt();

                double calculation = switch (operatorInput) {
                    case '+' -> numberOneInput + numberTwoInput;
                    case '-' -> numberOneInput - numberTwoInput;
                    case '*' -> numberOneInput * numberTwoInput;
                    case '/' -> (double) numberOneInput / numberTwoInput;
                    case '%' -> numberOneInput % numberTwoInput;
                    case 'e' -> Math.pow(numberOneInput, numberTwoInput);
                    default -> 0;
                };

                System.out.println("Result: " + calculation);

                System.out.println("Would you like to do another calculation? (y or n)");
                char continueInput = Character.toUpperCase(scanner.next().charAt(0));
                if (continueInput == 'Y') {
                    keepPlaying = true;
                } else {
                    keepPlaying = false;
                }
            } while (keepPlaying);
        }
    }


    public static void main(String[] args) {

        // Task 1 and 2:
        arithmeticOperation();

    }
}
