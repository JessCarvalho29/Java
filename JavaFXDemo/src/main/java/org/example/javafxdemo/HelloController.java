package org.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    // Before using it, it is necessary to declare the object (object of Label in this case) - the name should be the same as the id in the HTML
    @FXML
    private Label javaText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onJavaButtonClick() {
        javaText.setText("JavaFX Application!");
    }
}