module com.example.week12helloworldgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week12helloworldgui to javafx.fxml;
    exports com.example.week12helloworldgui;
}