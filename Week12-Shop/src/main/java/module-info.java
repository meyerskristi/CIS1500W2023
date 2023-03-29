module com.example.week12shop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week12shop to javafx.fxml;
    exports com.example.week12shop;
}