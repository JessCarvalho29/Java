package org.example.javafxexample1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField contactField;

    @FXML
    private ComboBox<String> countryComboBox;

    @FXML
    private RadioButton maleRadio;

    @FXML
    private RadioButton femaleRadio;

    @FXML
    private ToggleGroup gender;

    @FXML
    private void handleSubmitButtonAction() {
        String name = nameField.getText();
        String contact = contactField.getText();
        String country = countryComboBox.getValue();
        String genderText;
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        if(selectedRadioButton!=null) {
            genderText = selectedRadioButton.getText();
        }
        else {
            genderText = null;
        }

        // calling method to Open new window with welcome message
        //openWelcomeWindow(name, contact, country, genderText);

        //MVC
        //Creating the second window passing the object instead of just the values as we did above.
        UserModel user = new UserModel(name, contact, country, genderText);
        openWelcomeWindow(user);
    }

    //Method to open 2nd window
//    private void openWelcomeWindow(String name, String contact, String country, String gender) {
//        try {
//            //Loading .fxml of 2nd window
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
//            Parent root = loader.load();
//            //Getting controller of 2nd window and creating object of 2nd window controller class
//            WelcomeController controller = loader.getController();
//            //With 2nd window object calling method to pass all fields' values to 2nd window
//            controller.initData(name, contact, country, gender);
//
//            //Displaying 2nd window by setting the title of 2nd window
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//            stage.setTitle("Welcome");
//            stage.show();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    // Create the object of that user once he clicked in submit
    //MVC
   private void openWelcomeWindow(UserModel user) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
            Parent root = loader.load();
            WelcomeController controller = loader.getController();
            controller.initData(user);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Welcome");
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
