package week3.Exercise;

import java.util.Scanner;

public class CoinTossing {

    //screenshot of the output and copy of the code in the document. Submit this by today
    public static boolean randomCoinTossing() {
        double random;
        random = Math.random();
        return random >= 0.5;
    }

    public static void coinTossingGame() {
        int headsCount = 0;
        int tailsCount = 0;
        boolean keepPlaying = true;

        do {
            Scanner shouldPlayAgain = new Scanner(System.in);
            System.out.println("Do you wanna toss the coin? (Y or N)");
            char userAnswer = Character.toUpperCase(shouldPlayAgain.next().charAt(0));

            if (userAnswer == 'Y') {
                boolean coinResult = randomCoinTossing();
                if (coinResult) {
                    headsCount++;
                    System.out.println("Head");
                } else {
                    tailsCount++;
                    System.out.println("Tail");
                }
            } else if (userAnswer == 'N') {
                keepPlaying = false;
                if (headsCount == 0 && tailsCount == 0) {
                    System.out.println("Game did not played.");
                    return;
                }
                System.out.println("Heads appeared " + headsCount + " times.");
                System.out.println("Tails appeared " + tailsCount + " times.");
            } else {
                System.out.println("Please insert Y or N");
            }

        } while (keepPlaying);

    }


    public static void main(String[] args) {
        coinTossingGame();

    }


}
