module org.example.javafxexample1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxexample1 to javafx.fxml;
    exports org.example.javafxexample1;
}