package com.example.week12helloworldgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private int clickCount = 0; // eric feels bad about this, should be a constructor
    @FXML
    private Label someLabel;


    @FXML
    private Button clickMeButton;
    @FXML
    private Button dontClickMeButton;
    @FXML
    private TextField numberTextField;

    @FXML
    public void clickMeButtonClicked(ActionEvent actionEvent) {
        clickCount++;

        //if ( actionEvent.getSource() == dontClickMeButton ){
        //    someLabel.setText("I told you not to click this button!");
       // } else {
            someLabel.setText("Hello world from JavaFX! " + clickCount);
       // }
    }

    private void someMethod(){

    }

    @FXML
    public void dontClickMeButtonClicked(ActionEvent actionEvent) {
        int value = Integer.parseInt(numberTextField.getText());
        someLabel.setText(Integer.toString(value*10));
    }
}