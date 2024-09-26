package org.example.finaltestquestion3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Label showInputNumber;
    public TextField textField;


    @FXML
    protected void onButtonClick() {
        showInputNumber.setText("");
        String inputText = textField.getText();

        if(inputText.matches("[0-9]+")){
            showInputNumber.setText(inputText);
        } else if (inputText.isEmpty()) {
            showInputNumber.setText("");
        } else {
            showInputNumber.setText("Please insert only numbers");
        }
    }
}