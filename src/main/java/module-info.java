module com.example.ejerciciotema4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciotema4 to javafx.fxml;
    exports com.example.ejerciciotema4;
}