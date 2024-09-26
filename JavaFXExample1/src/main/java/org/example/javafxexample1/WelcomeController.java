package org.example.javafxexample1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomeController {
    @FXML
    public Label welcomeLabel;

    //Method to Set text to label
    public void initData(String name, String contact, String country, String gender) {
        //appending all values in one string variable to set on Label
        String welcomeMessage = "Welcome, " + name + "!\n";
        welcomeMessage += "Contact Number: " + contact + "\n";
        welcomeMessage += "Country: " + country + "\n";
        welcomeMessage += "Gender: " + gender + "\n";

        //Set final text to label
        welcomeLabel.setText(welcomeMessage);
    }

}
