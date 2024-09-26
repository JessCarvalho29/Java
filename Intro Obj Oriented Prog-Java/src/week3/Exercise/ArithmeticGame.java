package week3.Exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ArithmeticGame {

    enum ArithmeticOperations {
        ADD('+'),
        SUB('-'),
        DIV('/'),
        MUT('*');

        public final char character;

        private ArithmeticOperations(char character) {
            this.character = character;
        }
    }
    public static void runArithmeticGame() {
        int firstNumber;
        int secondNumber;
        ArithmeticOperations randomOperator;
        boolean result;

        firstNumber = (int) (Math.random() * 101);
        secondNumber = (int) (Math.random() * 101);
        var randomNumber = (int) (Math.random() * 4);
        randomOperator = ArithmeticOperations.values()[randomNumber];

        if (randomOperator == ArithmeticOperations.DIV && secondNumber == 0) {
            secondNumber = 1;
        }

        do {
            Scanner userAnswer = new Scanner(System.in);
            System.out.printf("What is the result of %d%c%d ?%n", firstNumber, randomOperator.character, secondNumber);
            BigDecimal userAnswerInput = userAnswer.nextBigDecimal();
            userAnswerInput = userAnswerInput.setScale(1,RoundingMode.CEILING);
            result = validateAnswer(firstNumber, secondNumber, randomOperator, userAnswerInput);
            if (result) {
                System.out.println("You're correct!");
                Scanner playAgain = new Scanner(System.in);
                System.out.println("Do you wanna play again? (y or n)");
                char playAgainInput = Character.toUpperCase(playAgain.next().charAt(0));

                if (playAgainInput != 'Y' && playAgainInput != 'N') {
                    do {
                        Scanner newPlayAgain = new Scanner(System.in);
                        System.out.println("Please insert a valid answer (y or n)");
                        playAgainInput = Character.toUpperCase(newPlayAgain.next().charAt(0));
                    } while (playAgainInput != 'Y' && playAgainInput != 'N');
                }

                if (playAgainInput == 'Y') {
                    runArithmeticGame();
                } else {
                    System.out.println("Thank you for playing!");
                }

            } else {
                System.out.printf("You're not right :(%nTry again!%n");
            }


        } while (!result);
    }


    public static boolean validateAnswer(int firstNumber, int secondNumber, ArithmeticOperations randomOperator, BigDecimal userAnswerInput) {
        BigDecimal result = switch (randomOperator) {
            case ADD -> BigDecimal.valueOf(firstNumber + secondNumber).setScale(1,RoundingMode.CEILING);
            case SUB -> BigDecimal.valueOf(firstNumber - secondNumber).setScale(1,RoundingMode.CEILING);
            case MUT -> BigDecimal.valueOf((long) firstNumber * secondNumber).setScale(1,RoundingMode.CEILING);
            case DIV -> BigDecimal.valueOf((float) firstNumber / (float) secondNumber).setScale(1, RoundingMode.CEILING);
        };
        return userAnswerInput.equals(result);
    }

    public static void main(String[] args) {
        Scanner startGame = new Scanner(System.in);
        System.out.printf("Welcome to the Arithmetic Solving Game%nPress 's' to start%n");
        char answerStartGame = Character.toUpperCase(startGame.next().charAt(0));

        if (answerStartGame == 'S') {
            runArithmeticGame();
        }
    }
}