package com.example.week14moregui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {

    @FXML
    private CheckBox twoPercentMilkCheckBox;
    @FXML
    private CheckBox wholeMilkCheckBox;
    @FXML
    private CheckBox soyMilkCheckBox;
    @FXML
    private RadioButton coffeeRadioButton;
    @FXML
    private RadioButton espressoRadioButton;
    @FXML
    private RadioButton teaRadioButton;
    @FXML
    private Button checkoutButton;
    @FXML
    private Label drinkLabel;


    @FXML
    public void milkCheckBoxChecked(ActionEvent actionEvent) {
    }


    @FXML
    public void beverageTypeRadioButtonClicked(ActionEvent actionEvent) {
    }

}