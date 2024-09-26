module org.example.finaltestquestion3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.finaltestquestion3 to javafx.fxml;
    exports org.example.finaltestquestion3;
}