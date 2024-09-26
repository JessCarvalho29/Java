package org.example.javafxexample1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField contactNumber;

    @FXML
    private ComboBox<String> countryComboBox;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Label errorName;

    @FXML
    private Label errorContact;

    @FXML
    private Label errorCountry;

    @FXML
    private Label errorGender;

    @FXML
    private Button submitButton;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        // Saving all values in variables
        String name = nameField.getText();
        String contact = contactNumber.getText();
        String country = countryComboBox.getValue();
        String genderText;
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        if(selectedRadioButton != null) {
            genderText = selectedRadioButton.getText();
        } else {
            genderText = null;
        }

        errorName.setText("");
        errorContact.setText("");
        errorCountry.setText("");
        errorGender.setText("");

        //Mini Exercise 4: Adding validations to the inputted values:
        if (name == null || !name.matches("^[a-zA-Z]+$")) {
            errorName.setText("Please fill out name field with letters");
            //https://www.youtube.com/watch?v=59E73wTi_qI
            submitButton.setOnAction(this::handleSubmitButtonAction);
        } else if (Objects.equals(contact, "") || !contact.matches("^[0-9]*$")) {
            errorContact.setText("Please fill out contact field with numbers");
            submitButton.setOnAction(this::handleSubmitButtonAction);
        } else if (contact.length() != 10) {
            errorContact.setText("Contact number should have 10 characters");
            submitButton.setOnAction(this::handleSubmitButtonAction);
        } else if (country == null) {
            errorCountry.setText("Please, select one country");
            submitButton.setOnAction(this::handleSubmitButtonAction);
        } else if (genderText == null) {
            errorGender.setText("Please, select one gender option");
            submitButton.setOnAction(this::handleSubmitButtonAction);
        } else {
            // calling method to Open new window with welcome message
            openWelcomeWindow(name, contact, country, genderText);
        }

//        submitButton.setOnAction(this::handleSubmitButtonAction);

    }


    private void openWelcomeWindow(String name, String contact, String country, String gender){
        try{
            //Loading .fxml of 2nd window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
            Parent root = loader.load();
            //Getting controller of 2nd window and creating object of 2nd window controller class
            WelcomeController controller = loader.getController();
            //With 2nd window object calling method to pass all fields' values to 2nd window
            controller.initData(name, contact, country, gender);

            //Displaying 2nd window by setting the title of 2nd window
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Welcome");
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}