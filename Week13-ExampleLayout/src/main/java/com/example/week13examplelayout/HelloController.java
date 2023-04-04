package com.example.week13examplelayout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private Button upButton;
    @FXML
    private Button leftButton;
    @FXML
    private Button downButton;
    @FXML
    private Button rightButton;
    @FXML
    private Label playerStatsLabel;
    @FXML
    private Label npcStatsLabel;
    @FXML
    private TextArea textArea;
    @FXML
    private Label locationLabel;


    @FXML
    public void upButtonClicked(ActionEvent actionEvent) {
        textArea.appendText("You clicked up!\n");
    }

    @FXML
    public void leftButtonClicked(ActionEvent actionEvent) {
        textArea.appendText("You clicked left!\n");
    }

    @FXML
    public void downButtonClicked(ActionEvent actionEvent) {
        textArea.appendText("You clicked down!\n");
    }

    @FXML
    public void rightButtonClicked(ActionEvent actionEvent) {
        textArea.appendText("You clicked right!\n");
    }
}