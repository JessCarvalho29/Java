package org.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// extending application class to use the functions
public class HelloApplication extends Application {
    // Abstract method in Application class
    @Override
    public void start(Stage stage) throws IOException {
        // Loading the FXML View in the window/application, adding all the controls that we add in the HTML file
        // The controls were added in the HTML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // With the controls, we have to create a scene (width and height of the window)
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // Stage is the window, setting the title
        stage.setTitle("Hello!");
        // Setting the scene that was created before
        stage.setScene(scene);
        // Display the window
        stage.show();
    }

    public static void main(String[] args) {

        // Calling launch method (in built method) to open the scene builder and run the start method
        // Launch the application
        launch();
    }
}