module com.example.week14moregui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week14moregui to javafx.fxml;
    exports com.example.week14moregui;
}