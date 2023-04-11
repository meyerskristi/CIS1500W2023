package com.example.week14moregui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

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

    Beverage beverage;
    @FXML
    private ToggleGroup beverageType;

    public HelloController(){
        beverage = new Beverage("");
    }


    @FXML
    public void milkCheckBoxChecked(ActionEvent actionEvent) {
        setupBeverage();
    }

    private void setupBeverage(){
        beverage = new Beverage("unknown");

        if ( coffeeRadioButton.isSelected()){
            beverage = new Beverage("Coffee");
        } else if (espressoRadioButton.isSelected()){
            beverage = new Beverage("Espresso");
        } else if (teaRadioButton.isSelected()){
            beverage = new Beverage("Tea");
        }


        if ( twoPercentMilkCheckBox.isSelected() ){
            beverage.addMilk("2% milk");
        }
        if ( wholeMilkCheckBox.isSelected()){
            beverage.addMilk("Whole milk");
        }
        if (soyMilkCheckBox.isSelected()){
            beverage.addMilk("Soy milk");
        }

        drinkLabel.setText("$" + beverage.getCost());
    }


    @FXML
    public void beverageTypeRadioButtonClicked(ActionEvent actionEvent) {
        setupBeverage();
    }

}