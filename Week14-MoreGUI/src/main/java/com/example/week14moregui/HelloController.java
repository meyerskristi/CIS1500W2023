package com.example.week14moregui;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    @FXML
    private TextArea receiptTextArea;
    @FXML
    private ImageView javaLogoImageView;

    ArrayList<ArrayList<Room>> maze;
    Room[][] rooms;

    public HelloController(){

        rooms = new Room[10][10];

        for ( int rowIndex = 0; rowIndex < 10; rowIndex++ ){
            for ( int columnIndex = 0; columnIndex < 10; columnIndex++){
                rooms[rowIndex][columnIndex] = new Room();
            }
        }

        maze = new ArrayList<>();

        for ( int rowIndex = 0; rowIndex < 10; rowIndex++ ){
            maze.add( new ArrayList<>());
            for ( int columnIndex = 0; columnIndex < 10; columnIndex++){
                maze.get(rowIndex).add(new Room());
            }
        }
    }

    // sort of like a constructor, but the JavaFX stuff isn't null anymore
    public void initialize(){

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

        if ( beverage == null ){
            drinkLabel.setText("");
        }else {
            drinkLabel.setText(beverage.toString());
        }
    }


    @FXML
    public void beverageTypeRadioButtonClicked(ActionEvent actionEvent) {
        setupBeverage();
    }

    @FXML
    public void addToOrderButtonClicked(ActionEvent actionEvent) {
        setupBeverage();
        receiptTextArea.appendText(beverage.toString() + "\n");
        twoPercentMilkCheckBox.setSelected(false);
        wholeMilkCheckBox.setSelected(false);
        soyMilkCheckBox.setSelected(false);
        beverage = null;
        // https://stackoom.com/en/question/3TtDd
        javaLogoImageView.setImage(new Image(getClass().getResource("coffee.jpg").toExternalForm()));

    }

    @FXML
    public void imageClicked(Event event) {
        receiptTextArea.appendText("You clicked java!\n");
    }
}