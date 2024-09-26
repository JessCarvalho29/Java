import java.util.Scanner;

public class MoviesTest {
    public static void main(String[] args) {

        // Creating scanner object to get the input of the user
        Scanner userNameInput = new Scanner(System.in);
        System.out.println("Give me the movie name ");
        String nameEnteredByUser = userNameInput.nextLine();

        Scanner userRatingInput = new Scanner(System.in);
        System.out.println("Give me the movie rating ");
        double ratingEnteredByUser = userRatingInput.nextDouble();

        // Creating the object of class Movies with the input by the user
        Movies Titanic = new Movies(nameEnteredByUser, ratingEnteredByUser);

        // Printing the information of the object
        System.out.printf("Your movie name is %s, and the rating of the movie is %.0f.", Titanic.getName(), Titanic.getRating());
    }
}
