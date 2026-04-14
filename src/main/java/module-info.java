module com.example.packagelearning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.packagelearning to javafx.fxml;
    exports com.example.packagelearning;
}