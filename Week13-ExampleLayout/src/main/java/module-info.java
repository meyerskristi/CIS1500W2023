module com.example.week13examplelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week13examplelayout to javafx.fxml;
    exports com.example.week13examplelayout;
}