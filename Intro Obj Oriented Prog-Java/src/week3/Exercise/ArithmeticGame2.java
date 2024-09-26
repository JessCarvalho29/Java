package week3.Exercise;

import java.util.Scanner;

public class ArithmeticGame2 {

    public static void randomNumbers(){
        int firstNumber;
        int secondNumber;
        int randomOperator;
        char [] operators = new char [] {'+' , '-', '*'};
        boolean result;

        firstNumber = (int) (Math.random() * 101);
        secondNumber = (int) (Math.random() * 101);
        randomOperator = (int) (Math.random() * 3);

        do{
            Scanner userAnswer = new Scanner(System.in);
            System.out.printf("What is the result of %d%c%d ?%n",firstNumber, operators[randomOperator], secondNumber);
            int userAnswerInput = userAnswer.nextInt();

            result = validateAnswer(firstNumber,secondNumber,randomOperator,userAnswerInput);
            if(result){
                System.out.println("You're correct!");
                Scanner playAgain = new Scanner(System.in);
                System.out.println("Do you wanna play again? (y or n)");
                char playAgainInput = Character.toUpperCase(playAgain.next().charAt(0));

                    if(playAgainInput != 'Y' && playAgainInput != 'N'){
                        do{
                        Scanner newPlayAgain = new Scanner(System.in);
                        System.out.println("Please insert a valid answer (y or n)");
                        playAgainInput = Character.toUpperCase(newPlayAgain.next().charAt(0));
                    } while (playAgainInput != 'Y' && playAgainInput != 'N');
                    }

                if(playAgainInput == 'Y'){
                    randomNumbers();
                } else{
                    System.out.println("Thank you for playing!");
                }

            } else {
                System.out.printf("You're not right :(%nTry again!%n");
            }


        } while (!result);
    }

    public static boolean validateAnswer(int firstNumber, int secondNumber, int randomOperator, int userAnswerInput){
        int result = 0;
        switch (randomOperator){
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
                break;
        }
        return userAnswerInput == result;
    }



    public static void main(String[] args){
        Scanner startGame = new Scanner(System.in);
        System.out.printf("Welcome to the Arithmetic Solving Game%nPress 's' to start%n");
        char answerStartGame = Character.toUpperCase(startGame.next().charAt(0));

        if(answerStartGame == 'S'){
            randomNumbers();
        }
    }


}
